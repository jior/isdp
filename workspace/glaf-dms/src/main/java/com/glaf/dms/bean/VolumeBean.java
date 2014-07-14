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
package com.glaf.dms.bean;

import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.*;

import com.glaf.core.base.BaseTree;
import com.glaf.core.base.TreeModel;
import com.glaf.core.config.Configuration;
import com.glaf.core.config.Environment;
import com.glaf.core.context.ContextFactory;
import com.glaf.core.entity.SqlExecutor;
import com.glaf.core.domain.ColumnDefinition;
import com.glaf.core.service.EntityService;
import com.glaf.core.service.ITablePageService;
import com.glaf.core.tree.helper.TreeHelper;
import com.glaf.core.query.QueryCondition;

import com.glaf.core.util.DBUtils;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.ParamUtils;
import com.glaf.dms.config.DmsConfiguration;

public class VolumeBean {

	protected final static Log logger = LogFactory.getLog(VolumeBean.class);

	protected static Configuration cfg = DmsConfiguration.create();

	protected EntityService entityService;

	protected ITablePageService tablePageService;

	public VolumeBean() {
		entityService = ContextFactory.getBean("entityService");
		tablePageService = ContextFactory.getBean("tablePageService");
	}

	public void checkPublishFields() {
		List<ColumnDefinition> columns = new ArrayList<ColumnDefinition>();
		ColumnDefinition c1 = new ColumnDefinition();
		c1.setColumnName("choosepublishflag");
		c1.setLength(1);
		c1.setJavaType("String");
		columns.add(c1);

		ColumnDefinition c2 = new ColumnDefinition();
		c2.setColumnName("choosepublishtime");
		c2.setJavaType("Long");
		columns.add(c2);

		ColumnDefinition c3 = new ColumnDefinition();
		c3.setColumnName("publishdiskid");
		c3.setJavaType("Integer");
		columns.add(c3);

		try {
			DBUtils.alterTable(Environment.getCurrentSystemName(), "volume",
					columns);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			DBUtils.alterTable(Environment.getCurrentSystemName(), "pfile",
					columns);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			DBUtils.alterTable(Environment.getCurrentSystemName(), "treevmain",
					columns);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			DBUtils.alterTable(Environment.getCurrentSystemName(),
					"treevmain_u", columns);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public int getFileAttCount() {
		Map<String, Object> params = new HashMap<String, Object>();
		return entityService.getCount("dms_query_9903", params);
	}

	public int getFileAttCount(Map<String, Object> params) {
		return entityService.getCount("dms_query_9903", params);
	}

	public long getFileAttSize() {
		Map<String, Object> params = new HashMap<String, Object>();
		return this.getFileAttSize(params);
	}

	public long getFileAttSize(Map<String, Object> params) {
		return (Long) entityService.getSingleObject("dms_query_9904", params);
	}

	public int getMaxDiskId() {
		Map<String, Object> params = new HashMap<String, Object>();
		Object object = entityService
				.getSingleObject("selectMaxDiskId", params);
		if (object != null && object instanceof Integer) {
			return (Integer) object;
		}
		return 1;
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> getSingleVolume(String vid) {
		return (Map<String, Object>) entityService.getSingleObject(
				"selectSingleVolume", vid);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JSONObject getMyBatisLoopVolumeDatagridJson(int pageNo,
			int pageSize, List<QueryCondition> conditions,
			Map<String, Object> params) {
		// logger.debug("conditions:" + conditions);
		JSONObject rootJSON = new JSONObject();
		if (pageNo <= 0) {
			pageNo = 1;
		}
		if (pageSize <= 0) {
			pageSize = 20;
		}

		int begin = (pageNo - 1) * pageSize;

		int total = tablePageService.getTableCount("volume", "id", conditions);
		if (total > 0) {
			logger.debug("total:" + total);
			List<Object> rows = tablePageService.getTableList("volume", "id",
					begin, pageSize, conditions);
			if (rows != null && !rows.isEmpty()) {
				logger.debug(">>####size:" + rows.size());
				JSONArray array = new JSONArray();
				for (Object object : rows) {
					if (object instanceof Map) {
						Map<String, Object> dataMap = (Map) object;
						JSONObject json = new JSONObject();
						json.put("ordinal", ++begin);
						Set<Entry<String, Object>> entrySet = dataMap
								.entrySet();
						for (Entry<String, Object> entry : entrySet) {
							String name = entry.getKey();
							Object value = entry.getValue();
							if (value != null) {
								if (value instanceof java.util.Date) {
									Date date = (Date) value;
									json.put(name, DateUtils.getDateTime(date));
								} else {
									json.put(name, value);
								}
							}
						}
						array.add(json);
					}
				}
				rootJSON.put("rows", array);
			}
		} else {
			JSONArray array = new JSONArray();
			rootJSON.put("rows", array);
		}
		rootJSON.put("total", total);
		return rootJSON;
	}

	public int getPfileCount() {
		Map<String, Object> params = new HashMap<String, Object>();
		return entityService.getCount("dms_query_9902", params);
	}

	public int getPfileCount(Map<String, Object> params) {
		return entityService.getCount("dms_query_9902", params);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> getTreevmain(String index_id) {
		Map<String, Object> dataMap = (Map<String, Object>) entityService
				.getSingleObject("selectSingleTreevmain", index_id);
		return dataMap;
	}

	public JSONArray getTreevmainJson() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("nodetype", "0");
		return this.getTreevmainJson(params);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JSONArray getTreevmainJson(Map<String, Object> params) {
		JSONArray array = null;
		List<Object> rows = entityService.getList("selectTreevmain_u", params);
		if (rows != null && !rows.isEmpty()) {
			List<TreeModel> list = new ArrayList<TreeModel>();
			Map<Long, TreeModel> treeMap = new HashMap<Long, TreeModel>();
			for (Object object : rows) {
				if (object instanceof Map) {
					Map dataMap = (Map) object;
					TreeModel tree = new BaseTree();
					tree.setId(ParamUtils.getInt(dataMap, "id"));
					tree.setParentId(ParamUtils.getInt(dataMap, "parentId"));
					tree.setName(ParamUtils.getString(dataMap, "text"));
					treeMap.put(tree.getId(), tree);
					list.add(tree);
				}
			}

			TreeModel root = new BaseTree();
			root.setId(-1);
			root.setName("/");
			list.add(root);

			TreeHelper helper = new TreeHelper();
			array = helper.getTreeJSONArray(list);

		}

		return array;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JSONArray getTreevmainJson(TreeModel root, Map<String, Object> params) {
		JSONArray array = null;
		List<Object> rows = entityService.getList("selectTreevmain_u", params);
		if (rows != null && !rows.isEmpty()) {
			List<TreeModel> list = new ArrayList<TreeModel>();
			Map<Long, TreeModel> treeMap = new HashMap<Long, TreeModel>();
			for (Object object : rows) {
				if (object instanceof Map) {
					Map dataMap = (Map) object;
					TreeModel tree = new BaseTree();
					tree.setId(ParamUtils.getInt(dataMap, "id"));
					tree.setParentId(ParamUtils.getInt(dataMap, "parentId"));
					tree.setName(ParamUtils.getString(dataMap, "text"));
					treeMap.put(tree.getId(), tree);
					list.add(tree);
				}
			}

			if (root != null) {
				list.add(root);
			}

			TreeHelper helper = new TreeHelper();
			array = helper.getTreeJSONArray(list);

		}

		return array;
	}

	public int getVolumeCount() {
		Map<String, Object> params = new HashMap<String, Object>();
		return entityService.getCount("dms_query_9901", params);
	}

	public int getVolumeCount(Map<String, Object> params) {
		return entityService.getCount("dms_query_9901", params);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JSONObject getVolumeDatagridJson(int pageNo, int pageSize,
			Map<String, Object> params) {
		JSONObject rootJSON = new JSONObject();
		int count = entityService.getCount("selectVolumeCount", params);

		rootJSON.put("total", count);

		if (count > 0) {
			if (pageNo <= 0) {
				pageNo = 1;
			}
			if (pageSize <= 0) {
				pageSize = 20;
			}

			int begin = (pageNo - 1) * pageSize;

			logger.debug("pageNo:" + pageNo);
			logger.debug("pageSize:" + pageSize);

			SqlExecutor queryExecutor = new SqlExecutor();
			queryExecutor.setStatementId("selectVolumes");
			queryExecutor.setParameter(params);
			List<Object> rows = entityService.getList(pageNo, pageSize,
					queryExecutor);
			if (rows != null && !rows.isEmpty()) {
				logger.debug("####size:" + rows.size());
				JSONArray array = new JSONArray();
				for (Object object : rows) {
					JSONObject json = new JSONObject();
					json.put("ordinal", ++begin);
					if (object instanceof Map) {
						Map dataMap = (Map) object;
						Set<Entry<String, Object>> entrySet = dataMap
								.entrySet();
						for (Entry<String, Object> entry : entrySet) {
							String name = entry.getKey();
							Object value = entry.getValue();
							if (value != null) {
								if (value instanceof java.util.Date) {
									Date date = (Date) value;
									json.put(name, DateUtils.getDate(date));
								} else {
									json.put(name, value);
								}
							}
						}
					}
					array.add(json);
				}
				rootJSON.put("rows", array);
			}
		} else {
			JSONArray array = new JSONArray();
			rootJSON.put("rows", array);
		}

		return rootJSON;
	}

	public List<DisplayField> getVolumeDisplayFields() {
		Map<String, Object> params = new HashMap<String, Object>();
		return this.getVolumeDisplayFields(params);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DisplayField> getVolumeDisplayFields(Map<String, Object> params) {
		List<DisplayField> fields = new ArrayList<DisplayField>();
		List<Object> rows = entityService.getList("selectVolumeDisplayFields",
				params);
		if (rows != null && !rows.isEmpty()) {
			for (Object object : rows) {
				if (object instanceof Map) {
					Map dataMap = (Map) object;
					DisplayField field = new DisplayField();
					field.setName(ParamUtils.getString(dataMap, "dname"));
					field.setType(ParamUtils.getString(dataMap, "dtype"));
					field.setTitle(ParamUtils.getString(dataMap, "fname"));
					field.setSystemFlag(ParamUtils.getString(dataMap,
							"issystem"));
					field.setListShowFlag(ParamUtils.getString(dataMap,
							"isListShow"));
					fields.add(field);
				}
			}
		}
		return fields;
	}

	public Map<String, String> getVolumeFieldMap() {
		Map<String, Object> params = new HashMap<String, Object>();
		return this.getVolumeFieldMap(params);
	}

	public Map<String, String> getVolumeFieldMap(Map<String, Object> params) {
		Map<String, String> fieldMap = new HashMap<String, String>();
		List<DisplayField> fields = this.getVolumeDisplayFields(params);
		for (DisplayField field : fields) {
			String type = field.getType();
			String name = field.getName();
			fieldMap.put(name, type);
		}
		return fieldMap;
	}

	public List<DisplayField> getVolumeListDisplayFields() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("isListShow", "1");
		return this.getVolumeDisplayFields(params);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JSONArray getZTreevmainJson(TreeModel root,
			Map<String, Object> params) {
		JSONArray array = new JSONArray();
		if (root != null) {
			JSONObject rootJson = new JSONObject();
			rootJson.put("id", root.getId());
			rootJson.put("name", root.getName());
			rootJson.put("text", root.getName());
			array.add(rootJson);
		}
		List<Object> rows = entityService.getList("selectTreevmain_u", params);
		if (rows != null && !rows.isEmpty()) {
			Collection pids = new HashSet();
			if (root != null) {
				pids.add(root.getId());
			}
			for (Object object : rows) {
				if (object instanceof Map) {
					Map dataMap = (Map) object;
					String parentId = ParamUtils.getString(dataMap, "parentId");
					if (parentId != null) {
						pids.add(parentId);
					}
				}
			}

			for (Object object : rows) {
				if (object instanceof Map) {
					Map dataMap = (Map) object;
					String id = ParamUtils.getString(dataMap, "id");
					String parentId = ParamUtils.getString(dataMap, "parentId");
					String name = ParamUtils.getString(dataMap, "text");
					JSONObject json = new JSONObject();
					json.put("id", id);
					json.put("name", name);
					json.put("text", name);
					if (parentId != null) {
						json.put("pId", parentId);
						json.put("parentId", parentId);
					}
					if (pids.contains(id)) {
						json.put("isParent", true);
					} else {
						json.put("isParent", false);
					}
					array.add(json);
				}
			}
		}

		return array;
	}

}
