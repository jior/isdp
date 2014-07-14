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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.core.config.Configuration;
import com.glaf.core.context.ContextFactory;

import com.glaf.core.entity.SqlExecutor;
import com.glaf.core.service.EntityService;
import com.glaf.core.service.ITablePageService;
import com.glaf.core.query.QueryCondition;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.ParamUtils;

import com.glaf.dms.config.DmsConfiguration;

public class PfileBean {

	protected final static Log logger = LogFactory.getLog(PfileBean.class);

	protected static Configuration cfg = DmsConfiguration.create();

	protected EntityService entityService;

	protected ITablePageService tablePageService;

	public PfileBean() {
		entityService = ContextFactory.getBean("entityService");
		tablePageService = ContextFactory.getBean("tablePageService");
	}

	public List<DisplayField> getPfileDisplayFields() {
		Map<String, Object> params = new HashMap<String, Object>();
		return this.getPfileDisplayFields(params);
	}

	public List<DisplayField> getPfileListDisplayFields() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("isListShow", "1");
		return this.getPfileDisplayFields(params);
	}

	public List<DisplayField> getPfileListDisplayFields(
			Map<String, Object> params) {
		return this.getPfileDisplayFields(params);
	}

	public Map<String, String> getPfileFieldMap() {
		Map<String, Object> params = new HashMap<String, Object>();
		return this.getPfileFieldMap(params);
	}

	public Map<String, String> getPfileFieldMap(Map<String, Object> params) {
		Map<String, String> fieldMap = new HashMap<String, String>();
		List<DisplayField> fields = this.getPfileListDisplayFields(params);
		for (DisplayField field : fields) {
			String type = field.getType();
			String name = field.getName();
			fieldMap.put(name, type);
		}
		return fieldMap;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DisplayField> getPfileDisplayFields(Map<String, Object> params) {
		List<DisplayField> fields = new ArrayList<DisplayField>();
		List<Object> rows = entityService.getList("selectPfileDisplayFields",
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JSONObject getMyBatisLoopPfileDatagridJson(int pageNo, int pageSize,
			List<QueryCondition> conditions, Map<String, Object> params) {
		JSONObject rootJSON = new JSONObject();
		if (pageNo <= 0) {
			pageNo = 1;
		}
		if (pageSize <= 0) {
			pageSize = 20;
		}

		if (conditions != null && !conditions.isEmpty()) {
			for (QueryCondition c : conditions) {
				c.setAlias("p");
			}
		}

		int begin = (pageNo - 1) * pageSize;

		int total = tablePageService
				.getQueryCount(
						" select count(*) as cnt from pfile p inner join fileatt a on p.id = a.topid ",
						conditions);
		if (total > 0) {
			logger.debug("total:" + total);
			List<Object> rows = tablePageService
					.getQueryList(
							"select a.fileid, a.file_name, p.*, v.vnum as volumenum from pfile p inner join volume v on p.vid = v.id inner join fileatt a on p.id = a.topid ",
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
		return entityService.getCount("selectPfileCount", params);
	}

	public int getPfileCount(Map<String, Object> params) {
		return entityService.getCount("selectPfileCount", params);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JSONObject getPfileDatagridJson(int pageNo, int pageSize,
			Map<String, Object> params) {
		JSONObject rootJSON = new JSONObject();
		int count = entityService.getCount("selectPfileCount", params);

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
			queryExecutor.setStatementId("selectPfiles");
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
									json.put(name, DateUtils.getDateTime(date));
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

}
