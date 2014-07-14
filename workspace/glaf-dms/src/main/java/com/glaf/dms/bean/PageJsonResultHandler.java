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

public class PageJsonResultHandler implements ResultHandler {

	protected final static Log logger = LogFactory
			.getLog(PageJsonResultHandler.class);

	protected String rootDir;

	protected String groupByField;

	protected String subFolderField;

	protected String group;

	protected String subFolder;

	protected List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

	protected List<String> tmpList = new ArrayList<String>();

	protected Map<String, String> tokenMap = new HashMap<String, String>();

	protected Map<String, Integer> pageMap = new HashMap<String, Integer>();

	public PageJsonResultHandler() {

	}

	public PageJsonResultHandler(String rootDir, String groupByField,
			String subFolderField) {
		this.rootDir = rootDir;
		this.groupByField = groupByField;
		this.subFolderField = subFolderField;
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
				String content = this.toJson(null, list);
				String groupx = tmpList.get(0);
				String folderx = tokenMap.get(groupx);
				Integer pageNo = pageMap.get(folderx);
				if (pageNo == null) {
					pageNo = new Integer(0);
				}
				pageNo = new Integer(pageNo.intValue() + 1);
				pageMap.put(folderx, pageNo);
				// groupx = FileUtils.replaceWin32FileName(groupx);
				try {
					FileUtils.mkdirs(rootDir + FileUtils.sp + folderx);
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				String filename = rootDir + FileUtils.sp + folderx
						+ FileUtils.sp + pageNo + ".json";
				logger.debug("save json file:" + filename);
				logger.debug(tokenMap);
				boolean success = false;
				int retry = 0;
				while (retry <= 2 && !success) {
					try {
						retry++;
						FileUtils.save(filename, content.getBytes("utf-8"));
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

	public void saveFiles() {
		if (!list.isEmpty()) {
			Integer pageNo = pageMap.get(subFolder);
			if (pageNo == null) {
				pageNo = new Integer(0);
			}
			pageNo = new Integer(pageNo.intValue() + 1);
			String content = this.toJson(null, list);
			try {
				FileUtils.mkdirs(rootDir + FileUtils.sp + subFolder);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			group = FileUtils.replaceWin32FileName(group);
			String filename = rootDir + FileUtils.sp + subFolder + FileUtils.sp
					+ pageNo + ".json";
			logger.debug("save json file:" + filename);
			boolean success = false;
			int retry = 0;
			while (retry <= 2 && !success) {
				try {
					retry++;
					FileUtils.save(filename, content.getBytes("utf-8"));
					success = true;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			list.clear();
			tmpList.clear();
			tokenMap.clear();
		}
	}

	public String toJson(JSONObject root, List<Map<String, Object>> rows) {
		JSONArray array = new JSONArray();
		if (root != null) {
			array.add(root);
		}
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

				if (value instanceof java.util.Date) {
					String time = DateUtils.getDateTime((java.util.Date) value);
					row.put(propertyName + "_datetime", time);
				}
				row.put(propertyName, value + "");
			}
			array.add(row);
		}

		return array.toJSONString();
	}

}
