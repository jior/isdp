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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.mapper.SysDepartmentMapper;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.query.SysDepartmentQuery;
import com.glaf.base.modules.sys.query.SysTreeQuery;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysRoleService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.util.PageResult;

@Service("sysDepartmentService")
@Transactional(readOnly = true)
public class SysDepartmentServiceImpl implements SysDepartmentService {
	protected final static Log logger = LogFactory
			.getLog(SysDepartmentServiceImpl.class);

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected SysDepartmentMapper sysDepartmentMapper;

	protected SysRoleService sysRoleService;

	protected SysTreeService sysTreeService;

	public SysDepartmentServiceImpl() {

	}

	public int count(SysDepartmentQuery query) {
		return sysDepartmentMapper.getSysDepartmentCount(query);
	}

	@Transactional
	public boolean create(SysDepartment bean) {
		if (bean.getNode() != null) {

			bean.setSort((int) bean.getId());

			bean.getNode().setDescription("D");
			sysTreeService.create(bean.getNode());
			bean.setNodeId(bean.getNode().getId());

			bean.setId(bean.getNode().getId());
			bean.setCreateTime(new Date());
			sysDepartmentMapper.insertSysDepartment(bean);
			return true;
		}
		return false;
	}

	@Transactional
	public boolean delete(long id) {
		this.deleteById(id);
		return true;
	}

	@Transactional
	public boolean delete(SysDepartment bean) {
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
	public void deleteById(Long id) {
		if (id != null && id > 0) {
			SysDepartment department = this.getSysDepartment(id);
			if (department != null) {
				SysTree tree = sysTreeService.findById(department.getNodeId());
				if (tree != null) {
					List<SysTree> treeList = sysTreeService.getSysTreeList(tree
							.getId());
					if (treeList != null && !treeList.isEmpty()) {
						throw new RuntimeException(
								"tree node has children exist");
					}
					sysDepartmentMapper.deleteSysDepartmentById(id);
					sysTreeService.delete(tree.getId());
				}
			}
		}
	}

	/**
	 * 通过节点编号获取部门信息
	 * 
	 * @param nodeId
	 * @return
	 */
	public SysDepartment getSysDepartmentByNodeId(long nodeId) {
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.nodeId(nodeId);
		query.setOrderBy(" E.ID asc ");

		List<SysDepartment> list = this.list(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	public SysDepartment findByCode(String code) {
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.code(code);
		query.setOrderBy(" E.ID asc ");

		List<SysDepartment> list = this.list(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	public SysDepartment findById(long id) {
		return this.getSysDepartment(id);
	}

	public SysDepartment findByName(String name) {
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.name(name);
		query.setOrderBy(" E.ID asc ");

		List<SysDepartment> list = this.list(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	public SysDepartment findByNo(String deptno) {
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.no(deptno);
		query.setOrderBy(" E.ID asc ");

		List<SysDepartment> list = this.list(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	public void findNestingDepartment(List<SysDepartment> list, long deptId) {
		SysDepartment node = this.findById(deptId);
		if (node != null) {
			this.findNestingDepartment(list, node);
		}
	}

	/**
	 * 获取用户部门列表
	 * 
	 * @param list
	 * @param node
	 */
	public void findNestingDepartment(List<SysDepartment> list,
			SysDepartment node) {
		if (node == null) {
			return;
		}
		SysTree tree = node.getNode();
		if (tree.getParentId() == 0) {// 找到根节点
			logger.debug("findFirstNode:" + node.getId());
			list.add(node);
		} else {
			SysTree treeParent = sysTreeService.findById(tree.getParentId());
			SysDepartment parent = treeParent.getDepartment();
			findNestingDepartment(list, parent);
		}
		list.add(node);
	}

	public SysDepartment getSysDepartment(long id) {
		if (id <= 0) {
			return null;
		}
		SysDepartment sysDepartment = sysDepartmentMapper
				.getSysDepartmentById(id);
		if (sysDepartment != null) {
			SysTree node = sysTreeService.findById(sysDepartment.getNodeId());
			sysDepartment.setNode(node);
			if (node != null) {
				SysDepartment parent = this.getSysDepartmentByNodeId(node
						.getParentId());
				sysDepartment.setParent(parent);
			}
		}
		return sysDepartment;
	}

	public int getSysDepartmentCountByQueryCriteria(SysDepartmentQuery query) {
		return sysDepartmentMapper.getSysDepartmentCount(query);
	}

	public List<SysDepartment> getSysDepartmentList() {
		SysDepartmentQuery query = new SysDepartmentQuery();
		return this.list(query);
	}

	public List<SysDepartment> getSysDepartmentList(long parent) {
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.parentId(Long.valueOf(parent));
		return this.list(query);
	}

	@Override
	public PageResult getSysDepartmentList(long parent, int pageNo, int pageSize) {
		// 计算总数
		PageResult pager = new PageResult();
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.parentId(Long.valueOf(parent));
		int count = this.count(query);
		if (count == 0) {// 结果集为空
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.SORT asc");

		int start = pageSize * (pageNo - 1);
		List<SysDepartment> list = this.getSysDepartmentsByQueryCriteria(start,
				pageSize, query);
		pager.setResults(list);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	@Override
	public PageResult getSysDepartmentList(int pageNo, int pageSize,
			SysDepartmentQuery query) {
		// 计算总数
		PageResult pager = new PageResult();

		int count = this.count(query);
		if (count == 0) {// 结果集为空
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.SORT asc");

		int start = pageSize * (pageNo - 1);
		List<SysDepartment> list = this.getSysDepartmentsByQueryCriteria(start,
				pageSize, query);
		pager.setResults(list);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	public List<SysDepartment> getSysDepartmentsByQueryCriteria(int start,
			int pageSize, SysDepartmentQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<SysDepartment> list = sqlSessionTemplate.selectList(
				"getSysDepartments", query, rowBounds);
		if (list != null && !list.isEmpty()) {
			this.initTrees(list);
		}
		return list;
	}

	protected void initTrees(List<SysDepartment> list) {
		if (list != null && !list.isEmpty()) {
			SysTreeQuery query = new SysTreeQuery();
			List<SysTree> trees = sysTreeService.getDepartmentSysTrees(query);
			Map<Long, SysTree> treeMap = new HashMap<Long, SysTree>();
			if (trees != null && !trees.isEmpty()) {
				for (SysTree tree : trees) {
					treeMap.put(tree.getId(), tree);
				}
			}
			for (SysDepartment bean : list) {
				bean.setNode(treeMap.get(bean.getNodeId()));
				if (bean.getNode() != null) {
					bean.setNodeParentId(bean.getNode().getParentId());
				}
			}
		}
	}

	public List<SysDepartment> list(SysDepartmentQuery query) {
		List<SysDepartment> list = sysDepartmentMapper.getSysDepartments(query);
		if (list != null && !list.isEmpty()) {
			this.initTrees(list);
		}
		return list;
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
	public void setSysDepartmentMapper(SysDepartmentMapper sysDepartmentMapper) {
		this.sysDepartmentMapper = sysDepartmentMapper;
	}

	@Resource
	public void setSysRoleService(SysRoleService sysRoleService) {
		this.sysRoleService = sysRoleService;
	}

	@Resource
	public void setSysTreeService(SysTreeService sysTreeService) {
		this.sysTreeService = sysTreeService;
	}

	/**
	 * 排序
	 * 
	 * @param bean
	 *            SysDepartment
	 * @param operate
	 *            int 操作
	 */
	@Transactional
	public void sort(long parent, SysDepartment bean, int operate) {
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
	private void sortByForward(long parent, SysDepartment bean) {
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.parentId(Long.valueOf(parent));
		query.setSortLessThan(bean.getSort());
		query.setOrderBy(" E.SORT desc ");

		// 查找后一个对象

		List<SysDepartment> list = this.list(query);
		if (list != null && list.size() > 0) {// 有记录
			SysDepartment temp = (SysDepartment) list.get(0);
			int i = bean.getSort();
			bean.setSort(temp.getSort());
			this.update(bean);// 更新bean
			SysTree node = bean.getNode();
			node.setSort(bean.getSort());
			sysTreeService.update(node);

			temp.setSort(i);
			this.update(temp);// 更新temp
			node = temp.getNode();
			node.setSort(temp.getSort());
			sysTreeService.update(node);
		}
	}

	/**
	 * 向前移动排序
	 * 
	 * @param bean
	 */
	private void sortByPrevious(long parent, SysDepartment bean) {
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.parentId(Long.valueOf(parent));
		query.setSortGreaterThan(bean.getSort());
		query.setOrderBy(" E.SORT asc ");

		// 查找后一个对象

		List<SysDepartment> list = this.list(query);
		if (list != null && list.size() > 0) {// 有记录
			SysDepartment temp = (SysDepartment) list.get(0);
			int i = bean.getSort();
			bean.setSort(temp.getSort());
			this.update(bean);// 更新bean
			SysTree node = bean.getNode();
			node.setSort(bean.getSort());
			sysTreeService.update(node);

			temp.setSort(i);
			this.update(temp);// 更新temp
			node = temp.getNode();
			node.setSort(temp.getSort());
			sysTreeService.update(node);
		}
	}

	@Transactional
	public boolean update(SysDepartment bean) {
		if (bean.getNode() != null) {
			List<SysTree> sts = sysTreeService.getSysTreeList((int) bean
					.getNode().getId());
			if (sts != null && sts.size() > 0) {
				this.updateSubStatus(sts, bean.getStatus());
			}
			sysTreeService.update(bean.getNode());
		}
		bean.setUpdateDate(new Date());
		sysDepartmentMapper.updateSysDepartment(bean);
		return true;
	}

	/**
	 * 修改子部门的状态
	 * 
	 * @param list
	 * @param status
	 * @return
	 */
	private boolean updateSubStatus(List<SysTree> list, Integer status) {
		List<SysTree> sts = null;
		SysDepartment sdp = null;
		for (SysTree st : list) {
			sts = (List<SysTree>) this.sysTreeService.getSysTreeList((int) st
					.getId());
			if (sts != null && sts.size() > 0) {
				this.updateSubStatus(sts, status);
			}
			sdp = st.getDepartment();
			if (sdp != null) {
				sdp.setStatus(status);
				this.update(sdp);
			}
		}
		return true;
	}

}
