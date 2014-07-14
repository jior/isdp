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

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.FileUtils;
import com.glaf.core.util.ParamUtils;

public class VolumeJsonResultHandler implements ResultHandler {

	protected final static Log logger = LogFactory
			.getLog(VolumeJsonResultHandler.class);

	protected String rootDir;

	protected String groupByField;

	protected String subFolderField;

	protected int pageSize;

	protected String group;

	protected String subFolder;

	protected List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

	protected List<String> tmpList = new ArrayList<String>();

	protected Map<String, String> tokenMap = new HashMap<String, String>();

	protected Map<String, Integer> pageMap = new HashMap<String, Integer>();

	public VolumeJsonResultHandler() {

	}

	public VolumeJsonResultHandler(String rootDir, String groupByField,
			String subFolderField, int pageSize) {
		this.rootDir = rootDir;
		this.groupByField = groupByField;
		this.subFolderField = subFolderField;
		this.pageSize = pageSize;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void handleResult(ResultContext context) {
		Object object = context.getResultObject();
		if (object instanceof Map) {
			Map dataMap = (Map) object;
			group = ParamUtils.getString(dataMap, groupByField);
			subFolder = ParamUtils.getString(dataMap, subFolderField);
			tokenMap.put(group, subFolder);

			// ////////////////////////////////////////

			tmpList.add(group);
			tokenMap.put(group, subFolder);

			if (tokenMap.size() > 1) {

				String groupx = tmpList.get(0);
				String folderx = tokenMap.get(groupx);

				boolean success = false;
				int retry = 0;
				while (retry <= 2 && !success) {
					try {
						retry++;
						String targetDir = rootDir + FileUtils.sp + folderx;
						FileUtils.mkdirs(targetDir);
						this.saveJson(targetDir, list, pageSize);
						success = true;
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}

				tmpList.clear();
				tokenMap.clear();
				list.clear();
				tmpList.add(group);
				tokenMap.put(group, subFolder);
			}
			list.add(dataMap);

		}
	}

	public void saveJson(String targetDir, List<Map<String, Object>> rows,
			int pageSize) throws IOException {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		logger.debug("rows size:" + rows.size());
		int index = 0;
		int j = 0;
		for (int i = 0; i < rows.size(); i++) {
			index++;
			Map<String, Object> dataMap = rows.get(i);
			dataMap.put("ordinal", Integer.valueOf(i + 1));
			list.add(dataMap);
			if (index % pageSize == 0 && index > 0) {
				j = j + 1;
				String content = this.toJson(list, rows.size());
				boolean success = false;
				int retry = 0;
				while (retry <= 2 && !success) {
					try {
						retry++;
						FileUtils.save(targetDir + "/datagrid_data_" + j
								+ ".json", content.getBytes("utf-8"));
						success = true;
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				list.clear();
			}
		}
		if (!list.isEmpty()) {
			if (j == 0) {
				j = 1;
			}
			String content = this.toJson(list, rows.size());
			boolean success = false;
			int retry = 0;
			while (retry <= 2 && !success) {
				try {
					retry++;
					FileUtils.save(targetDir + "/datagrid_data_" + j + ".json",
							content.getBytes("utf-8"));
					success = true;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			list.clear();
		}
	}

	public String toJson(List<Map<String, Object>> rows, int total) {
		JSONObject object = new JSONObject();
		JSONArray array = new JSONArray();
		Iterator<Map<String, Object>> iterator = rows.iterator();
		while (iterator.hasNext()) {
			Map<String, Object> dataMap = iterator.next();
			JSONObject row = new JSONObject();
			Set<Entry<String, Object>> entrySet = dataMap.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				String propertyName = entry.getKey();
				Object value = entry.getValue();
				if (propertyName.equalsIgnoreCase("class")) {
					continue;
				}
				if (propertyName.equalsIgnoreCase("context")) {
					continue;
				}
				if (propertyName.equalsIgnoreCase("properties")) {
					continue;
				}
				if (value != null) {
					if (value instanceof java.util.Date) {
						String time = DateUtils
								.getDateTime((java.util.Date) value);
						row.put(propertyName + "_date",
								DateUtils.getDate((java.util.Date) value));
						row.put(propertyName + "_datetime", time);
						row.put(propertyName, time);
					} else {
						row.put(propertyName, value);
					}
				}
			}
			array.add(row);
		}

		object.put("total", total);

		object.put("rows", array);

		return object.toJSONString();
	}

	public void saveFiles() {
		if (!list.isEmpty()) {
			try {
				String targetDir = rootDir + FileUtils.sp + subFolder;
				FileUtils.mkdirs(targetDir);
				this.saveJson(targetDir, list, pageSize);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			list.clear();
			tmpList.clear();
			tokenMap.clear();
		}
	}

}
