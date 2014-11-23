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
package com.glaf.base.modules.sys.util;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import com.glaf.core.base.DataRequest;
import com.glaf.core.base.DataRequest.FilterDescriptor;
import com.glaf.core.domain.ColumnDefinition;
import com.glaf.core.domain.TableDefinition;
import com.glaf.core.util.DBUtils;

/**
 * 
 * 实体数据工厂类
 *
 */
public class SysApplicationDomainFactory {

	public static final String TABLENAME = "SYS_APPLICATION";

	public static final ConcurrentMap<String, String> columnMap = new ConcurrentHashMap<String, String>();

	public static final ConcurrentMap<String, String> javaTypeMap = new ConcurrentHashMap<String, String>();

	static {
		columnMap.put("id", "ID");
		columnMap.put("code", "CODE");
		columnMap.put("createBy", "CREATEBY");
		columnMap.put("createDate", "CREATEDATE");
		columnMap.put("desc", "APPDESC");
		columnMap.put("locked", "LOCKED");
		columnMap.put("name", "NAME");
		columnMap.put("nodeId", "NODEID");
		columnMap.put("showMenu", "SHOWMENU");
		columnMap.put("sort", "SORT");
		columnMap.put("updateBy", "UPDATEBY");
		columnMap.put("updateDate", "UPDATEDATE");
		columnMap.put("url", "URL");
		columnMap.put("linkType", "LINKTYPE");
		columnMap.put("linkFileId", "LINKFILEID");
		columnMap.put("linkFileName", "LINKFILENAME");
		columnMap.put("linkParam", "LINKPARAM");
		columnMap.put("printType", "PRINTTYPE");
		columnMap.put("printFileId", "PRINTFILEID");
		columnMap.put("printFileName", "PRINTFILENAME");
		columnMap.put("printParam", "PRINTPARAM");
		columnMap.put("refId1", "REFID1");
		columnMap.put("refName1", "REFNAME1");
		columnMap.put("refId2", "REFID2");
		columnMap.put("refName2", "REFNAME2");
		columnMap.put("refId3", "REFID3");
		columnMap.put("refName3", "REFNAME3");
		columnMap.put("refId4", "REFID4");
		columnMap.put("refName4", "REFNAME4");
		columnMap.put("refId5", "REFID5");
		columnMap.put("refName5", "REFNAME5");

		javaTypeMap.put("id", "Long");
		javaTypeMap.put("code", "String");
		javaTypeMap.put("createBy", "String");
		javaTypeMap.put("createDate", "Date");
		javaTypeMap.put("desc", "String");
		javaTypeMap.put("locked", "Integer");
		javaTypeMap.put("name", "String");
		javaTypeMap.put("nodeId", "Long");
		javaTypeMap.put("showMenu", "Integer");
		javaTypeMap.put("sort", "Integer");
		javaTypeMap.put("updateBy", "String");
		javaTypeMap.put("updateDate", "Date");
		javaTypeMap.put("url", "String");
		javaTypeMap.put("linkType", "String");
		javaTypeMap.put("linkFileId", "String");
		javaTypeMap.put("linkFileName", "String");
		javaTypeMap.put("linkParam", "String");
		javaTypeMap.put("printType", "String");
		javaTypeMap.put("printFileId", "String");
		javaTypeMap.put("printFileName", "String");
		javaTypeMap.put("printParam", "String");
		javaTypeMap.put("refId1", "Integer");
		javaTypeMap.put("refName1", "String");
		javaTypeMap.put("refId2", "Integer");
		javaTypeMap.put("refName2", "String");
		javaTypeMap.put("refId3", "Integer");
		javaTypeMap.put("refName3", "String");
		javaTypeMap.put("refId4", "Integer");
		javaTypeMap.put("refName4", "String");
		javaTypeMap.put("refId5", "Integer");
		javaTypeMap.put("refName5", "String");
	}

	public static Map<String, String> getColumnMap() {
		return columnMap;
	}

	public static Map<String, String> getJavaTypeMap() {
		return javaTypeMap;
	}

	public static TableDefinition getTableDefinition() {
		return getTableDefinition(TABLENAME);
	}

	public static TableDefinition getTableDefinition(String tableName) {
		tableName = tableName.toUpperCase();
		TableDefinition tableDefinition = new TableDefinition();
		tableDefinition.setTableName(tableName);
		tableDefinition.setName("SysApplication");

		ColumnDefinition idColumn = new ColumnDefinition();
		idColumn.setName("id");
		idColumn.setColumnName("ID");
		idColumn.setJavaType("Long");
		tableDefinition.setIdColumn(idColumn);

		ColumnDefinition code = new ColumnDefinition();
		code.setName("code");
		code.setColumnName("CODE");
		code.setJavaType("String");
		code.setLength(50);
		tableDefinition.addColumn(code);

		ColumnDefinition createBy = new ColumnDefinition();
		createBy.setName("createBy");
		createBy.setColumnName("CREATEBY");
		createBy.setJavaType("String");
		createBy.setLength(50);
		tableDefinition.addColumn(createBy);

		ColumnDefinition createDate = new ColumnDefinition();
		createDate.setName("createDate");
		createDate.setColumnName("CREATEDATE");
		createDate.setJavaType("Date");
		tableDefinition.addColumn(createDate);

		ColumnDefinition desc = new ColumnDefinition();
		desc.setName("desc");
		desc.setColumnName("APPDESC");
		desc.setJavaType("String");
		desc.setLength(500);
		tableDefinition.addColumn(desc);

		ColumnDefinition locked = new ColumnDefinition();
		locked.setName("locked");
		locked.setColumnName("LOCKED");
		locked.setJavaType("Integer");
		tableDefinition.addColumn(locked);

		ColumnDefinition name = new ColumnDefinition();
		name.setName("name");
		name.setColumnName("NAME");
		name.setJavaType("String");
		name.setLength(250);
		tableDefinition.addColumn(name);

		ColumnDefinition nodeId = new ColumnDefinition();
		nodeId.setName("nodeId");
		nodeId.setColumnName("NODEID");
		nodeId.setJavaType("Long");
		tableDefinition.addColumn(nodeId);

		ColumnDefinition showMenu = new ColumnDefinition();
		showMenu.setName("showMenu");
		showMenu.setColumnName("SHOWMENU");
		showMenu.setJavaType("Integer");
		tableDefinition.addColumn(showMenu);

		ColumnDefinition sort = new ColumnDefinition();
		sort.setName("sort");
		sort.setColumnName("SORT");
		sort.setJavaType("Integer");
		tableDefinition.addColumn(sort);

		ColumnDefinition updateBy = new ColumnDefinition();
		updateBy.setName("updateBy");
		updateBy.setColumnName("UPDATEBY");
		updateBy.setJavaType("String");
		updateBy.setLength(50);
		tableDefinition.addColumn(updateBy);

		ColumnDefinition updateDate = new ColumnDefinition();
		updateDate.setName("updateDate");
		updateDate.setColumnName("UPDATEDATE");
		updateDate.setJavaType("Date");
		tableDefinition.addColumn(updateDate);

		ColumnDefinition url = new ColumnDefinition();
		url.setName("url");
		url.setColumnName("URL");
		url.setJavaType("String");
		url.setLength(500);
		tableDefinition.addColumn(url);

		ColumnDefinition linkType = new ColumnDefinition();
		linkType.setName("linkType");
		linkType.setColumnName("LINKTYPE");
		linkType.setJavaType("String");
		linkType.setLength(50);
		tableDefinition.addColumn(linkType);

		ColumnDefinition linkFileId = new ColumnDefinition();
		linkFileId.setName("linkFileId");
		linkFileId.setColumnName("LINKFILEID");
		linkFileId.setJavaType("String");
		linkFileId.setLength(200);
		tableDefinition.addColumn(linkFileId);

		ColumnDefinition linkFileName = new ColumnDefinition();
		linkFileName.setName("linkFileName");
		linkFileName.setColumnName("LINKFILENAME");
		linkFileName.setJavaType("String");
		linkFileName.setLength(200);
		tableDefinition.addColumn(linkFileName);

		ColumnDefinition linkParam = new ColumnDefinition();
		linkParam.setName("linkParam");
		linkParam.setColumnName("LINKPARAM");
		linkParam.setJavaType("String");
		linkParam.setLength(500);
		tableDefinition.addColumn(linkParam);

		ColumnDefinition printType = new ColumnDefinition();
		printType.setName("printType");
		printType.setColumnName("PRINTTYPE");
		printType.setJavaType("String");
		printType.setLength(50);
		tableDefinition.addColumn(printType);

		ColumnDefinition printFileId = new ColumnDefinition();
		printFileId.setName("printFileId");
		printFileId.setColumnName("PRINTFILEID");
		printFileId.setJavaType("String");
		printFileId.setLength(200);
		tableDefinition.addColumn(printFileId);

		ColumnDefinition printFileName = new ColumnDefinition();
		printFileName.setName("printFileName");
		printFileName.setColumnName("PRINTFILENAME");
		printFileName.setJavaType("String");
		printFileName.setLength(200);
		tableDefinition.addColumn(printFileName);

		ColumnDefinition printParam = new ColumnDefinition();
		printParam.setName("printParam");
		printParam.setColumnName("PRINTPARAM");
		printParam.setJavaType("String");
		printParam.setLength(500);
		tableDefinition.addColumn(printParam);

		ColumnDefinition refId1 = new ColumnDefinition();
		refId1.setName("refId1");
		refId1.setColumnName("REFID1");
		refId1.setJavaType("Integer");
		tableDefinition.addColumn(refId1);

		ColumnDefinition refName1 = new ColumnDefinition();
		refName1.setName("refName1");
		refName1.setColumnName("REFNAME1");
		refName1.setJavaType("String");
		refName1.setLength(255);
		tableDefinition.addColumn(refName1);

		ColumnDefinition refId2 = new ColumnDefinition();
		refId2.setName("refId2");
		refId2.setColumnName("REFID2");
		refId2.setJavaType("Integer");
		tableDefinition.addColumn(refId2);

		ColumnDefinition refName2 = new ColumnDefinition();
		refName2.setName("refName2");
		refName2.setColumnName("REFNAME2");
		refName2.setJavaType("String");
		refName2.setLength(255);
		tableDefinition.addColumn(refName2);

		ColumnDefinition refId3 = new ColumnDefinition();
		refId3.setName("refId3");
		refId3.setColumnName("REFID3");
		refId3.setJavaType("Integer");
		tableDefinition.addColumn(refId3);

		ColumnDefinition refName3 = new ColumnDefinition();
		refName3.setName("refName3");
		refName3.setColumnName("REFNAME3");
		refName3.setJavaType("String");
		refName3.setLength(255);
		tableDefinition.addColumn(refName3);

		ColumnDefinition refId4 = new ColumnDefinition();
		refId4.setName("refId4");
		refId4.setColumnName("REFID4");
		refId4.setJavaType("Integer");
		tableDefinition.addColumn(refId4);

		ColumnDefinition refName4 = new ColumnDefinition();
		refName4.setName("refName4");
		refName4.setColumnName("REFNAME4");
		refName4.setJavaType("String");
		refName4.setLength(255);
		tableDefinition.addColumn(refName4);

		ColumnDefinition refId5 = new ColumnDefinition();
		refId5.setName("refId5");
		refId5.setColumnName("REFID5");
		refId5.setJavaType("Integer");
		tableDefinition.addColumn(refId5);

		ColumnDefinition refName5 = new ColumnDefinition();
		refName5.setName("refName5");
		refName5.setColumnName("REFNAME5");
		refName5.setJavaType("String");
		refName5.setLength(255);
		tableDefinition.addColumn(refName5);

		return tableDefinition;
	}

	public static TableDefinition createTable() {
		TableDefinition tableDefinition = getTableDefinition(TABLENAME);
		if (!DBUtils.tableExists(TABLENAME)) {
			DBUtils.createTable(tableDefinition);
		} else {
			DBUtils.alterTable(tableDefinition);
		}
		return tableDefinition;
	}

	public static TableDefinition createTable(String tableName) {
		TableDefinition tableDefinition = getTableDefinition(tableName);
		if (!DBUtils.tableExists(tableName)) {
			DBUtils.createTable(tableDefinition);
		} else {
			DBUtils.alterTable(tableDefinition);
		}
		return tableDefinition;
	}

	public static void processDataRequest(DataRequest dataRequest) {
		if (dataRequest != null && dataRequest.getFilter() != null) {
			if (dataRequest.getFilter().getField() != null) {
				dataRequest.getFilter().setColumn(
						columnMap.get(dataRequest.getFilter().getField()));
				dataRequest.getFilter().setJavaType(
						javaTypeMap.get(dataRequest.getFilter().getField()));
			}

			List<FilterDescriptor> filters = dataRequest.getFilter()
					.getFilters();
			for (FilterDescriptor filter : filters) {
				filter.setParent(dataRequest.getFilter());
				if (filter.getField() != null) {
					filter.setColumn(columnMap.get(filter.getField()));
					filter.setJavaType(javaTypeMap.get(filter.getField()));
				}

				List<FilterDescriptor> subFilters = filter.getFilters();
				for (FilterDescriptor f : subFilters) {
					f.setColumn(columnMap.get(f.getField()));
					f.setJavaType(javaTypeMap.get(f.getField()));
					f.setParent(filter);
				}
			}
		}
	}

	private SysApplicationDomainFactory() {

	}

}
