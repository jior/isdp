/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.glaf.base.modules.sys.service.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.json.JSONArray;
import org.json.JSONObject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.glaf.base.business.TreeHelper;
import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.mapper.SysAccessMapper;
import com.glaf.base.modules.sys.mapper.SysApplicationMapper;
import com.glaf.base.modules.sys.mapper.SysTreeMapper;
import com.glaf.base.modules.sys.model.RealmInfo;
import com.glaf.base.modules.sys.model.SysAccess;
import com.glaf.base.modules.sys.model.SysApplication;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.query.SysApplicationQuery;
import com.glaf.base.modules.sys.query.SysTreeQuery;
import com.glaf.base.modules.sys.service.SysApplicationService;
import com.glaf.base.modules.sys.service.SysRoleService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.modules.sys.util.SysApplicationJsonFactory;
import com.glaf.core.base.BaseTree;
import com.glaf.core.base.BlobItem;
import com.glaf.core.base.TreeModel;
import com.glaf.core.context.ApplicationContext;
import com.glaf.core.cache.CacheFactory;
import com.glaf.core.config.SystemConfig;
import com.glaf.core.config.SystemProperties;
import com.glaf.core.domain.BlobItemEntity;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.identity.Agent;
import com.glaf.core.service.EntityService;
import com.glaf.core.service.IBlobService;
import com.glaf.core.util.FileUtils;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.UUID32;

@Service("sysApplicationService")
@Transactional(readOnly = true)
public class SysApplicationServiceImpl implements SysApplicationService {
	protected final static Log logger = LogFactory
			.getLog(SysApplicationServiceImpl.class);

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected SysApplicationMapper sysApplicationMapper;

	protected SysAccessMapper sysAccessMapper;

	protected SysTreeMapper sysTreeMapper;

	protected SysTreeService sysTreeService;

	protected SysRoleService sysRoleService;

	protected SysUserService sysUserService;

	protected EntityService entityService;

	protected IBlobService blobService;

	public SysApplicationServiceImpl() {

	}

	public int count(SysApplicationQuery query) {
		return sysApplicationMapper.getSysApplicationCount(query);
	}

	@Transactional
	public boolean create(SysApplication bean) {
		boolean ret = false;
		if (bean.getId() == 0) {
			bean.setId(idGenerator.nextId());
		}
		if (StringUtils.isEmpty(bean.getCode())) {
			bean.setCode("app_" + bean.getId());
		}
		if (bean.getNode() != null) {
			bean.getNode().setCode(bean.getCode());
			bean.getNode().setDiscriminator("A");
			bean.getNode().setCreateBy(bean.getCreateBy());
			bean.getNode().setUrl(bean.getUrl());
			sysTreeService.create(bean.getNode());
			bean.setNodeId(bean.getNode().getId());
		}
		bean.setSort((int) bean.getId());// 设置排序号为刚插入的id值
		bean.setCreateDate(new Date());
		if (bean.getLinkFileContent() != null) {
			bean.setLinkFileId("sys_app_" + UUID32.getUUID());
		}
		if (bean.getPrintFileContent() != null) {
			bean.setPrintFileId("sys_app_print_" + UUID32.getUUID());
		}
		if (StringUtils.endsWithIgnoreCase(bean.getLinkFileName(), ".cpt")) {
			bean.setUrl("/mx/menu/jump?menuId="
					+ RequestUtils.encodeString(bean.getId() + ""));
		}

		sysApplicationMapper.insertSysApplication(bean);

		if (bean.getLinkFileContent() != null) {
			BlobItem dataFile = new BlobItemEntity();
			dataFile.setLastModified(System.currentTimeMillis());
			dataFile.setCreateBy(bean.getCreateBy());
			dataFile.setFileId(bean.getLinkFileId());
			dataFile.setData(bean.getLinkFileContent());
			dataFile.setFilename(bean.getLinkFileName());
			dataFile.setName(bean.getLinkFileName());
			dataFile.setSize(bean.getLinkFileContent().length);
			dataFile.setType(bean.getLinkType());
			dataFile.setStatus(9);
			dataFile.setObjectId("sys_app");
			dataFile.setObjectValue("sys_app_" + bean.getId());
			dataFile.setServiceKey("sys_app_file");
			blobService.insertBlob(dataFile);

			if (StringUtils.endsWithIgnoreCase(bean.getLinkFileName(), ".cpt")) {
				String path = SystemProperties.getConfigRootPath()
						+ "/reportlets/";
				if (SystemProperties.getDeploymentSystemName() != null) {
					path = path + SystemProperties.getDeploymentSystemName()
							+ "/";
				}
				path = path + bean.getId() + ".cpt";
				FileUtils.save(path, bean.getLinkFileContent());
			}
		}

		if (bean.getPrintFileContent() != null) {
			BlobItem dataFile = new BlobItemEntity();
			dataFile.setLastModified(System.currentTimeMillis());
			dataFile.setCreateBy(bean.getCreateBy());
			dataFile.setFileId(bean.getPrintFileId());
			dataFile.setData(bean.getPrintFileContent());
			dataFile.setFilename(bean.getPrintFileName());
			dataFile.setName(bean.getPrintFileName());
			dataFile.setSize(bean.getPrintFileContent().length);
			dataFile.setType(bean.getPrintType());
			dataFile.setStatus(9);
			dataFile.setObjectId("sys_app_print");
			dataFile.setObjectValue("sys_app_print_" + bean.getId());
			dataFile.setServiceKey("sys_app_print_file");
			blobService.insertBlob(dataFile);

			if (StringUtils.endsWithIgnoreCase(bean.getPrintFileName(), ".cpt")) {
				String path = SystemProperties.getConfigRootPath()
						+ "/reportlets/";
				if (SystemProperties.getDeploymentSystemName() != null) {
					path = path + SystemProperties.getDeploymentSystemName()
							+ "/";
				}
				path = path + bean.getId() + ".cpt";
				FileUtils.save(path, bean.getPrintFileContent());
			}
		}
		ret = true;
		return ret;
	}

	@Transactional
	public boolean delete(long id) {
		this.deleteById(id);
		return true;
	}

	@Transactional
	public boolean delete(SysApplication bean) {
		this.deleteById(bean.getId());
		return true;
	}

	@Transactional
	public boolean deleteAll(long[] ids) {
		if (ids != null && ids.length > 0) {
			for (long id : ids) {
				this.deleteById(id);
			}
		}
		return true;
	}

	@Transactional
	public void deleteById(Long appId) {
		if (appId != null && appId > 0) {
			sysAccessMapper.deleteSysAccessByAppId(appId);
			sysApplicationMapper.deleteSysApplicationById(appId);
			SysApplication app = this.getSysApplication(appId);
			if (app != null) {
				sysTreeMapper.deleteSysTreeById(app.getNodeId());
			}
		}
	}

	@Transactional
	public void deleteByIds(List<Long> rowIds) {
		if (rowIds != null && !rowIds.isEmpty()) {
			for (Long appId : rowIds) {
				this.deleteById(appId);
			}
		}
	}

	/**
	 * 按编码查找对象
	 * 
	 * @param code
	 *            String
	 * @return SysApplication
	 */
	public SysApplication findByCode(String code) {
		SysApplicationQuery query = new SysApplicationQuery();
		query.code(code);

		List<SysApplication> list = this.list(query);
		if (list != null && !list.isEmpty()) {
			SysApplication sysApplication = list.get(0);
			SysTree node = sysTreeService.findById(sysApplication.getNodeId());
			sysApplication.setNode(node);
			return sysApplication;
		}

		return null;
	}

	public SysApplication findById(long id) {
		String cacheKey = "sys_app_" + id;

		if (SystemConfig.getBoolean("use_query_cache")
				&& CacheFactory.getString(cacheKey) != null) {
			String text = CacheFactory.getString(cacheKey);
			com.alibaba.fastjson.JSONObject json = JSON.parseObject(text);
			SysApplication app = SysApplicationJsonFactory.jsonToObject(json);
			if (app != null && app.getNodeId() > 0) {
				SysTree node = sysTreeService.findById(app.getNodeId());
				app.setNode(node);
			}
			return app;
		}

		SysApplication app = sysApplicationMapper.getSysApplicationById(id);
		if (app != null && app.getNodeId() > 0) {
			SysTree node = sysTreeService.findById(app.getNodeId());
			app.setNode(node);
		}

		if (app != null && SystemConfig.getBoolean("use_query_cache")) {
			com.alibaba.fastjson.JSONObject json = app.toJsonObject();
			CacheFactory.put(cacheKey, json.toJSONString());
		}

		return app;
	}

	public SysApplication findByName(String name) {
		SysApplicationQuery query = new SysApplicationQuery();
		query.name(name);

		List<SysApplication> list = this.list(query);
		if (list != null && !list.isEmpty()) {
			SysApplication sysApplication = list.get(0);
			SysTree node = sysTreeService.findById(sysApplication.getNodeId());
			sysApplication.setNode(node);
			return sysApplication;
		}

		return null;
	}

	public SysApplication findByNodeId(long nodeId) {
		SysApplicationQuery query = new SysApplicationQuery();
		query.nodeId(nodeId);

		List<SysApplication> list = this.list(query);
		if (list != null && !list.isEmpty()) {
			SysApplication sysApplication = list.get(0);
			SysTree node = sysTreeService.findById(sysApplication.getNodeId());
			sysApplication.setNode(node);
			return sysApplication;
		}

		return null;
	}

	public List<SysApplication> getAccessAppList(long parentId, SysUser user) {
		long parentAppId = parentId;
		SysApplication parentApp = findById(parentId);
		if (parentApp != null) {
			parentAppId = parentApp.getNode().getId();
		}

		logger.info("parent node:" + parentAppId);

		SysApplicationQuery query = new SysApplicationQuery();
		query.parentId(parentAppId);
		query.setOrderBy(" E.SORT asc ");
		query.setLocked(0);
		List<Long> nodeIds = new ArrayList<Long>();
		nodeIds.add(-1L);

		List<SysApplication> apps = sysApplicationMapper
				.getSysApplicationByUserId(user.getActorId());
		if (apps != null && !apps.isEmpty()) {
			for (SysApplication app : apps) {
				nodeIds.add(app.getNodeId());
			}
		}
		query.nodeIds(nodeIds);

		return this.list(query);
	}

	public List<SysApplication> getApplicationList() {
		SysApplicationQuery query = new SysApplicationQuery();
		query.setOrderBy(" E.SORT asc ");
		return this.list(query);
	}

	public List<SysApplication> getApplicationList(long parentId) {
		long parentAppId = parentId;
		SysApplication parentApp = findById(parentId);
		if (parentApp != null) {
			parentAppId = parentApp.getNode().getId();
		}

		logger.info("parent node:" + parentAppId);

		SysApplicationQuery query = new SysApplicationQuery();
		query.parentId(Long.valueOf(parentAppId));
		query.setLocked(0);
		query.setOrderBy(" E.SORT asc ");
		List<SysApplication> apps = this.list(query);
		logger.debug("----------------apps size:" + apps.size());
		return apps;
	}

	public PageResult getApplicationList(long parentId, int pageNo, int pageSize) {
		// 计算总数
		PageResult pager = new PageResult();
		SysApplicationQuery query = new SysApplicationQuery();
		query.parentId(Long.valueOf(parentId));
		int count = this.count(query);
		if (count == 0) {// 结果集为空
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.SORT asc");

		int start = pageSize * (pageNo - 1);
		List<SysApplication> list = this.getSysApplicationsByQueryCriteria(
				start, pageSize, query);
		pager.setResults(list);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	/**
	 * 获取某个模块的角色及用户
	 * 
	 * @param appId
	 * @return
	 */
	public List<SysRole> getApplicationRoleWithUsers(long appId) {
		List<SysRole> roles = sysRoleService.getSysRolesByAppId(appId);
		if (roles != null && !roles.isEmpty()) {
			for (SysRole role : roles) {
				List<SysUser> users = sysUserService.getSysUsersByRoleId(role
						.getId());
				role.setUsers(users);
			}
		}
		return roles;
	}

	public String getMenu(long parent, SysUser user) {
		StringBuffer menu = new StringBuffer("");
		List<SysApplication> list = getAccessAppList(parent, user);
		if (list == null || list.isEmpty()) {
			if (user.isSystemAdmin()) {
				list = getApplicationList((int) parent);
			}
		}
		if (list != null && list.size() > 0) {
			Iterator<SysApplication> iter = list.iterator();
			while (iter.hasNext()) {
				SysApplication bean = (SysApplication) iter.next();
				menu.append("<li>");
				menu.append("<a href=\"javascript:jump('");
				// System.out.println("ContextUtil.getContextPath():"+ContextUtil.getContextPath());
				if (bean.getUrl() != null && bean.getUrl().startsWith("/")) {
					if (ApplicationContext.getContextPath() != null) {
						menu.append(ApplicationContext.getContextPath());
					}
				}
				menu.append(bean.getUrl());
				menu.append("',");
				menu.append(bean.getShowMenu());
				menu.append(");\">");
				menu.append(bean.getName()).append("</a>\n");

				List<SysApplication> sonNode = getAccessAppList(bean.getId(),
						user);
				if (sonNode == null || sonNode.isEmpty()) {
					if (user.isSystemAdmin()) {
						sonNode = getApplicationList((int) bean.getId());
					}
				}
				if (sonNode != null && sonNode.size() > 0) {// 有子菜单
					menu.append("<ul>");
					menu.append(getMenu(bean.getId(), user));
					menu.append("</ul>");
				}
				menu.append("</li>").append("<li></li>\n");
			}
		}
		return menu.toString();
	}

	public List<RealmInfo> getRealmInfos() {
		Map<String, Object> params = new HashMap<String, Object>();
		return sysApplicationMapper.getRealmInfos(params);
	}

	public List<SysApplication> getRoleApplications(long roleId) {
		return sysApplicationMapper.getSysApplicationByRoleId(roleId);
	}

	public JSONArray getRoleMenu(String roleCode) {
		JSONArray array = new JSONArray();
		List<SysApplication> apps = this.getSysApplicationByRoleCode(roleCode);
		if (apps != null && !apps.isEmpty()) {
			List<Long> nodeIds = new ArrayList<Long>();
			for (SysApplication app : apps) {
				nodeIds.add(app.getNodeId());
			}
			SysTreeQuery query = new SysTreeQuery();
			query.nodeIds(nodeIds);
			List<SysTree> treeList = sysTreeService
					.getApplicationSysTrees(query);
			List<TreeModel> treeModels = new ArrayList<TreeModel>();
			for (SysTree tree : treeList) {
				tree.setLocked(0);
				treeModels.add(tree);
			}
			TreeHelper treeHelper = new TreeHelper();
			array = treeHelper.getTreeJSONArray(treeModels);
		}
		return array;
	}

	/**
	 * 获取角色菜单之json对象
	 * 
	 * @param serviceUrl
	 * @param roleCode
	 * @return
	 */
	public JSONArray getRoleMenu(String serviceUrl, String roleCode) {
		JSONArray array = new JSONArray();
		List<SysApplication> apps = this.getSysApplicationByRoleCode(roleCode);
		if (apps != null && !apps.isEmpty()) {
			Map<Long, String> urlMap = new HashMap<Long, String>();
			List<Long> nodeIds = new ArrayList<Long>();
			for (SysApplication app : apps) {
				nodeIds.add(app.getNodeId());
				if (StringUtils.isNotEmpty(app.getUrl())) {
					if (StringUtils.startsWith(app.getUrl(), "http://")
							|| StringUtils.startsWith(app.getUrl(), "https://")) {
						urlMap.put(app.getNodeId(), app.getUrl());
					} else {
						if (StringUtils.startsWith(app.getUrl(), "/")) {
							urlMap.put(app.getNodeId(),
									serviceUrl + app.getUrl());
						} else {
							urlMap.put(app.getNodeId(),
									serviceUrl + "/" + app.getUrl());
						}
					}
				}
			}

			logger.debug("urlMap:" + urlMap);

			SysTreeQuery query = new SysTreeQuery();
			query.nodeIds(nodeIds);
			List<SysTree> treeList = sysTreeService
					.getApplicationSysTrees(query);
			List<TreeModel> treeModels = new ArrayList<TreeModel>();
			for (SysTree tree : treeList) {
				tree.setLocked(0);
				tree.setUrl(urlMap.get(tree.getId()));
				logger.debug(tree.getUrl());
				treeModels.add(tree);
			}
			logger.debug("treeModels:" + treeModels.size());
			TreeHelper treeHelper = new TreeHelper();
			array = treeHelper.getTreeJSONArray(treeModels);
		}
		return array;
	}

	public SysApplication getSysApplication(Long id) {
		if (id == null) {
			return null;
		}
		SysApplication sysApplication = sysApplicationMapper
				.getSysApplicationById(id);
		if (sysApplication != null) {
			SysTree node = sysTreeService.findById(sysApplication.getNodeId());
			sysApplication.setNode(node);
		}
		return sysApplication;
	}

	public List<SysApplication> getSysApplicationByRoleCode(String roleCode) {
		return sysApplicationMapper.getSysApplicationByRoleCode(roleCode);
	}

	public int getSysApplicationCountByQueryCriteria(SysApplicationQuery query) {
		return sysApplicationMapper.getSysApplicationCount(query);
	}

	public List<SysApplication> getSysApplicationsByQueryCriteria(int start,
			int pageSize, SysApplicationQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<SysApplication> rows = sqlSessionTemplate.selectList(
				"getSysApplications", query, rowBounds);
		return rows;
	}

	/**
	 * 获取用户某个分类下的全部分类节点
	 * 
	 * @param parent
	 *            父节点编号
	 * @param actorId
	 *            用户登录账号
	 * @return
	 */
	public List<TreeModel> getTopLevelTreeModels(long parentId, String actorId) {
		List<TreeModel> treeModels = new ArrayList<TreeModel>();
		SysUser user = sysUserService.findByAccountWithAll(actorId);
		if (user != null) {
			this.loadTreeModels(treeModels, parentId, user);
		}
		return treeModels;
	}

	/**
	 * 获取用户某个分类下的顶级菜单节点
	 * 
	 * @param appCode
	 *            应用编码
	 * @param userId
	 *            用户登录账号
	 * @return
	 */
	public List<TreeModel> getTopLevelTreeModels(String appCode, String actorId) {
		List<TreeModel> treeModels = new ArrayList<TreeModel>();
		SysApplication sysApplication = this.findByCode(appCode);
		long parentId = sysApplication.getId();
		SysUser user = sysUserService.findByAccountWithAll(actorId);
		if (user != null) {
			this.loadTreeModels(treeModels, parentId, user);
		}
		return treeModels;
	}

	public TreeModel getTreeModelByAppId(long appId) {
		SysApplication bean = this.findById(appId);
		if (bean != null) {
			TreeModel treeModel = sysTreeService.findById(bean.getNodeId());
			treeModel.setCode(bean.getCode());
			treeModel.setName(bean.getName());
			treeModel.setLocked(bean.getLocked());
			treeModel.setDescription(bean.getDesc());
			treeModel.setUrl(bean.getUrl());
			treeModel.setSortNo(bean.getSort());
			return treeModel;
		}
		return null;
	}

	/**
	 * 获取用户某个分类下的全部分类节点
	 * 
	 * @param parent
	 *            父节点编号
	 * @param actorId
	 *            用户登录账号
	 * @return
	 */
	public List<TreeModel> getTreeModels(long parentId, String actorId) {
		List<TreeModel> treeModels = new ArrayList<TreeModel>();
		SysUser user = sysUserService.findByAccountWithAll(actorId);
		if (user != null) {
			this.loadChildrenTreeModels(treeModels, parentId, user);
		}
		return treeModels;
	}

	/**
	 * 获取某个角色编码的全部分类节点（包含已经失效的菜单）
	 * 
	 * @param roleCode
	 *            角色编码
	 * @return
	 */
	public List<TreeModel> getTreeModels(String roleCode) {
		List<TreeModel> treeModels = new ArrayList<TreeModel>();
		List<SysApplication> apps = this.getSysApplicationByRoleCode(roleCode);
		if (apps != null && !apps.isEmpty()) {
			List<Long> nodeIds = new ArrayList<Long>();
			for (SysApplication app : apps) {
				nodeIds.add(app.getNodeId());
			}
			SysTreeQuery query = new SysTreeQuery();
			query.nodeIds(nodeIds);
			List<SysTree> treeList = sysTreeService
					.getApplicationSysTrees(query);
			for (SysTree tree : treeList) {
				treeModels.add(tree);
			}
		}
		return treeModels;
	}

	public List<SysTree> getTreeWithApplicationList(long parentId) {
		List<SysApplication> apps = this.getApplicationList();
		Map<Long, SysApplication> appMap = new HashMap<Long, SysApplication>();
		if (apps != null && !apps.isEmpty()) {
			for (SysApplication app : apps) {
				appMap.put(app.getNodeId(), app);
			}
		}

		List<SysTree> trees = new ArrayList<SysTree>();
		SysTree node = sysTreeService.findById(parentId);
		SysTreeQuery query = new SysTreeQuery();
		query.treeIdLike(node.getTreeId());
		List<SysTree> list = sysTreeMapper.getSysTrees(query);
		if (list != null && !list.isEmpty()) {
			for (SysTree tree : list) {
				if (tree.getParentId() == parentId) {
					// tree.setParentId(0);
				}
				SysApplication app = appMap.get(tree.getId());
				if (app != null) {
					tree.setApp(app);
					trees.add(tree);
				}
			}
		}

		return trees;
	}

	public JSONArray getUserMenu(long parent, String actorId) {
		JSONArray array = new JSONArray();
		SysUser user = sysUserService.findByAccountWithAll(actorId);
		if (user != null) {
			List<SysTree> treeList = null;
			SysApplication app = this.findById(parent);
			SysTreeQuery query = new SysTreeQuery();
			String treeId = app.getNode().getTreeId();
			logger.debug("treeId=" + treeId);
			query.treeId(treeId);
			query.treeIdLike(treeId + "%");
			if (!user.isSystemAdmin()) {
				List<String> actorIds = new ArrayList<String>();
				List<Object> rows = entityService.getList("getAgents", actorId);
				if (rows != null && !rows.isEmpty()) {
					for (Object object : rows) {
						if (object instanceof Agent) {
							Agent agent = (Agent) object;
							if (!agent.isValid()) {
								continue;
							}
							switch (agent.getAgentType()) {
							case 0:// 全局代理
								actorIds.add(agent.getAssignFrom());
								break;
							default:
								break;
							}
						}
					}
				}
				if (!actorIds.isEmpty()) {
					actorIds.add(actorId);
					query.setActorIds(actorIds);
				} else {
					query.setActorId(actorId);
				}
				logger.debug("treeId=" + query.getTreeId());
				logger.debug("treeIdLike=" + query.getTreeIdLike());
				treeList = sysTreeMapper.getTreeListByUsers(query);
			} else {
				treeList = sysTreeMapper.getTreeList(query);
			}

			List<TreeModel> treeModels = new ArrayList<TreeModel>();
			for (SysTree tree : treeList) {
				treeModels.add(tree);
			}
			TreeHelper treeHelper = new TreeHelper();
			array = treeHelper.getTreeJSONArray(treeModels);
			// logger.debug("-------------------user menu-----------------------");
			// logger.debug(array.toString('\n'));
		}
		return array;
	}

	protected JSONArray getUserMenu(long parent, SysUser user) {
		JSONArray array = new JSONArray();
		if (user != null) {
			List<SysApplication> list = null;
			if (user.isSystemAdmin()) {
				logger.debug("#admin user=" + user.getName());
				list = getApplicationList((int) parent);
			} else {
				logger.debug("#user=" + user.getName());
				list = getAccessAppList(parent, user);
				logger.debug("#app list=" + list);
			}
			if (list != null && list.size() > 0) {
				Iterator<SysApplication> iter = list.iterator();
				while (iter.hasNext()) {
					SysApplication bean = (SysApplication) iter.next();
					if (bean.getLocked() == 1) {
						continue;
					}
					JSONObject item = new JSONObject();
					item.put("id", String.valueOf(bean.getId()));
					item.put("nodeId", bean.getNodeId());
					item.put("showMenu", bean.getShowMenu());
					item.put("sort", bean.getSort());
					item.put("description", bean.getDesc());
					item.put("name", bean.getName());
					item.put("icon", "icon-sys");
					item.put("url", bean.getUrl());

					List<SysApplication> childrenNodes = null;
					if (user.isSystemAdmin()) {
						childrenNodes = getApplicationList((int) bean.getId());
					} else {
						childrenNodes = getAccessAppList(bean.getId(), user);
					}
					if (childrenNodes != null && childrenNodes.size() > 0) {// 有子菜单
						JSONArray children = this.getUserMenu(bean.getId(),
								user);
						item.put("children", children);
					}

					array.put(item);

				}
			}
		}
		return array;
	}

	public JSONArray getUserMenu2(long parent, String actorId) {
		JSONArray array = new JSONArray();
		SysUser user = sysUserService.findByAccountWithAll(actorId);
		if (user != null) {
			List<SysApplication> list = null;
			if (user.isSystemAdmin()) {
				logger.debug("#admin user=" + user.getName());
				list = getApplicationList((int) parent);
			} else {
				logger.debug("#user=" + user.getName());
				list = getAccessAppList(parent, user);
				logger.debug("#app list=" + list);
			}
			if (list != null && list.size() > 0) {
				Iterator<SysApplication> iter = list.iterator();
				while (iter.hasNext()) {
					SysApplication bean = (SysApplication) iter.next();
					if (bean.getLocked() == 1) {
						continue;
					}
					JSONObject item = new JSONObject();
					item.put("id", String.valueOf(bean.getId()));
					item.put("nodeId", bean.getNodeId());
					item.put("showMenu", bean.getShowMenu());
					item.put("sort", bean.getSort());
					item.put("description", bean.getDesc());
					item.put("name", bean.getName());
					item.put("icon", "icon-sys");
					item.put("url", bean.getUrl());

					List<SysApplication> childrenNodes = null;
					if (user.isSystemAdmin()) {
						childrenNodes = getApplicationList((int) bean.getId());
					} else {
						childrenNodes = getAccessAppList(bean.getId(), user);
					}
					if (childrenNodes != null && childrenNodes.size() > 0) {// 有子菜单
						JSONArray children = this.getUserMenu(bean.getId(),
								user);
						item.put("children", children);
					}

					array.put(item);

				}
			}
		}
		return array;
	}

	public List<SysApplication> list(SysApplicationQuery query) {
		List<SysApplication> list = sysApplicationMapper
				.getSysApplications(query);
		return list;
	}

	protected void loadChildrenTreeModels(List<TreeModel> treeModels,
			long parentId, SysUser user) {
		List<SysApplication> list = null;
		if (user.isSystemAdmin()) {
			logger.debug("#admin user=" + user.getName());
			list = getApplicationList((int) parentId);
		} else {
			logger.debug("#user=" + user.getName());
			list = getAccessAppList(parentId, user);
			logger.debug("#app list=" + list);
		}
		if (list != null && list.size() > 0) {
			Iterator<SysApplication> iter = list.iterator();
			while (iter.hasNext()) {
				SysApplication bean = (SysApplication) iter.next();
				if (bean.getLocked() == 1) {
					continue;
				}
				TreeModel treeModel = new BaseTree();
				treeModel.setCode(bean.getCode());
				treeModel.setId(bean.getId());
				treeModel.setParentId(parentId);
				treeModel.setName(bean.getName());
				treeModel.setLocked(bean.getLocked());
				treeModel.setDescription(bean.getDesc());
				treeModel.setUrl(bean.getUrl());
				treeModel.setSortNo(bean.getSort());

				List<SysApplication> childrenNodes = null;
				if (user.isSystemAdmin()) {
					childrenNodes = getApplicationList((int) bean.getId());
				} else {
					childrenNodes = getAccessAppList(bean.getId(), user);
				}
				if (childrenNodes != null && childrenNodes.size() > 0) {// 有子菜单
					this.loadChildrenTreeModels(treeModels, bean.getId(), user);
				}
				treeModels.add(treeModel);
			}
		}
	}

	protected void loadTreeModels(List<TreeModel> treeModels, long parentId,
			SysUser user) {
		List<SysApplication> list = null;
		if (user.isSystemAdmin()) {
			logger.debug("#admin user=" + user.getName());
			list = getApplicationList((int) parentId);
		} else {
			logger.debug("#user=" + user.getName());
			list = getAccessAppList(parentId, user);
			logger.debug("#app list=" + list);
		}
		if (list != null && list.size() > 0) {
			Iterator<SysApplication> iter = list.iterator();
			while (iter.hasNext()) {
				SysApplication bean = (SysApplication) iter.next();
				if (bean.getLocked() == 1) {
					continue;
				}
				TreeModel treeModel = new BaseTree();
				treeModel.setCode(bean.getCode());
				treeModel.setId(bean.getId());
				treeModel.setParentId(parentId);
				treeModel.setName(bean.getName());
				treeModel.setLocked(bean.getLocked());
				treeModel.setDescription(bean.getDesc());
				treeModel.setUrl(bean.getUrl());
				treeModel.setSortNo(bean.getSort());
				treeModels.add(treeModel);
			}
		}
	}

	@Transactional
	public void saveRoleApplications(long roleId, List<Long> appIds) {
		sysAccessMapper.deleteSysAccessByRoleId(roleId);
		for (Long appId : appIds) {
			SysAccess model = new SysAccess();
			model.setRoleId(roleId);
			model.setAppId(appId);
			sysAccessMapper.insertSysAccess(model);
		}
	}

	@javax.annotation.Resource
	public void setBlobService(IBlobService blobService) {
		this.blobService = blobService;
	}

	@Resource
	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}

	@Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Resource
	public void setSysAccessMapper(SysAccessMapper sysAccessMapper) {
		this.sysAccessMapper = sysAccessMapper;
	}

	@Resource
	public void setSysApplicationMapper(
			SysApplicationMapper sysApplicationMapper) {
		this.sysApplicationMapper = sysApplicationMapper;
	}

	@javax.annotation.Resource
	public void setSysRoleService(SysRoleService sysRoleService) {
		this.sysRoleService = sysRoleService;
	}

	@Resource
	public void setSysTreeMapper(SysTreeMapper sysTreeMapper) {
		this.sysTreeMapper = sysTreeMapper;
	}

	@Resource
	public void setSysTreeService(SysTreeService sysTreeService) {
		this.sysTreeService = sysTreeService;
	}

	@Resource
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

	@Transactional
	public void sort(long parent, SysApplication bean, int operate) {
		if (bean == null)
			return;
		if (operate == SysConstants.SORT_PREVIOUS) {// 前移
			sortByPrevious(parent, bean);
		} else if (operate == SysConstants.SORT_FORWARD) {// 后移
			sortByForward(parent, bean);
		}
	}

	/**
	 * 向后移动排序
	 * 
	 * @param bean
	 */
	private void sortByForward(long parentId, SysApplication bean) {
		SysApplicationQuery query = new SysApplicationQuery();
		query.parentId(Long.valueOf(parentId));
		query.setSortLessThan(bean.getSort());
		query.setOrderBy(" E.SORT desc ");
		List<SysApplication> list = this.list(query);
		if (list != null && list.size() > 0) {// 有记录
			SysApplication temp = (SysApplication) list.get(0);
			int i = bean.getSort();
			bean.setSort(temp.getSort());
			this.update(bean);// 更新bean
			SysTree node = sysTreeService.findById(bean.getNodeId());
			node.setSort(bean.getSort());
			sysTreeService.update(node);

			temp.setSort(i);
			this.update(temp);// 更新temp
			node = sysTreeService.findById(temp.getNodeId());
			node.setSort(temp.getSort());
			sysTreeService.update(node);
		}
	}

	/**
	 * 向前移动排序
	 * 
	 * @param bean
	 */
	private void sortByPrevious(long parentId, SysApplication bean) {
		// 查找前一个对象

		SysApplicationQuery query = new SysApplicationQuery();
		query.parentId(Long.valueOf(parentId));
		query.setSortGreaterThan(bean.getSort());
		query.setOrderBy(" E.SORT asc ");

		List<SysApplication> list = this.list(query);
		if (list != null && list.size() > 0) {// 有记录
			SysApplication temp = (SysApplication) list.get(0);
			int i = bean.getSort();
			bean.setSort(temp.getSort());
			this.update(bean);// 更新bean
			SysTree node = sysTreeService.findById(bean.getNodeId());
			node.setSort(bean.getSort());
			sysTreeService.update(node);

			temp.setSort(i);
			this.update(temp);// 更新temp
			node = sysTreeService.findById(temp.getNodeId());
			node.setSort(temp.getSort());
			sysTreeService.update(node);
		}
	}

	@Transactional
	public boolean update(SysApplication bean) {
		bean.setUpdateDate(new Date());
		if (StringUtils.isEmpty(bean.getCode())) {
			bean.setCode("app_" + bean.getId());
		}
		if (bean.getLinkFileContent() != null) {
			bean.setLinkFileId("sys_app_" + UUID32.getUUID());
		}
		if (bean.getPrintFileContent() != null) {
			bean.setPrintFileId("sys_app_print_" + UUID32.getUUID());
		}
		if (StringUtils.endsWithIgnoreCase(bean.getLinkFileName(), ".cpt")) {
			bean.setUrl("/mx/menu/jump?menuId="
					+ RequestUtils.encodeString(bean.getId() + ""));
		}
		this.sysApplicationMapper.updateSysApplication(bean);
		String cacheKey = "sys_app_" + bean.getId();
		CacheFactory.remove(cacheKey);
		if (bean.getNode() != null) {
			bean.getNode().setCode(bean.getCode());
			bean.getNode().setLocked(bean.getLocked());
			bean.getNode().setUpdateBy(bean.getUpdateBy());
			bean.getNode().setUrl(bean.getUrl());
			sysTreeService.update(bean.getNode());
			cacheKey = "sys_tree_" + bean.getNode().getId();
			CacheFactory.remove(cacheKey);
		}

		if (bean.getLinkFileContent() != null) {
			BlobItem dataFile = new BlobItemEntity();
			dataFile.setLastModified(System.currentTimeMillis());
			dataFile.setCreateBy(bean.getUpdateBy());
			dataFile.setFileId(bean.getLinkFileId());
			dataFile.setData(bean.getLinkFileContent());
			dataFile.setFilename(bean.getLinkFileName());
			dataFile.setName(bean.getLinkFileName());
			dataFile.setSize(bean.getLinkFileContent().length);
			dataFile.setType(bean.getLinkType());
			dataFile.setStatus(9);
			dataFile.setObjectId("sys_app");
			dataFile.setObjectValue("sys_app_" + bean.getId());
			dataFile.setServiceKey("sys_app_file");
			blobService.insertBlob(dataFile);

			if (StringUtils.endsWithIgnoreCase(bean.getLinkFileName(), ".cpt")) {
				String path = SystemProperties.getConfigRootPath()
						+ "/reportlets/";
				if (SystemProperties.getDeploymentSystemName() != null) {
					path = path + SystemProperties.getDeploymentSystemName()
							+ "/";
				}
				path = path + bean.getId() + ".cpt";
				FileUtils.save(path, bean.getLinkFileContent());
			}
		}

		if (bean.getPrintFileContent() != null) {
			BlobItem dataFile = new BlobItemEntity();
			dataFile.setLastModified(System.currentTimeMillis());
			dataFile.setCreateBy(bean.getUpdateBy());
			dataFile.setFileId(bean.getPrintFileId());
			dataFile.setData(bean.getPrintFileContent());
			dataFile.setFilename(bean.getPrintFileName());
			dataFile.setName(bean.getPrintFileName());
			dataFile.setSize(bean.getPrintFileContent().length);
			dataFile.setType(bean.getPrintType());
			dataFile.setStatus(9);
			dataFile.setObjectId("sys_app_print");
			dataFile.setObjectValue("sys_app_print_" + bean.getId());
			dataFile.setServiceKey("sys_app_print_file");
			blobService.insertBlob(dataFile);

			if (StringUtils.endsWithIgnoreCase(bean.getPrintFileName(), ".cpt")) {
				String path = SystemProperties.getConfigRootPath()
						+ "/reportlets/";
				if (SystemProperties.getDeploymentSystemName() != null) {
					path = path + SystemProperties.getDeploymentSystemName()
							+ "/";
				}
				path = path + bean.getId() + ".cpt";
				FileUtils.save(path, bean.getPrintFileContent());
			}
		}
		return true;
	}

}
