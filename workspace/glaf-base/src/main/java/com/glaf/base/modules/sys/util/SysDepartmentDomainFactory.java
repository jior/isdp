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
public class SysDepartmentDomainFactory {

	public static final String TABLENAME = "SYS_DEPARTMENT";

	public static final ConcurrentMap<String, String> columnMap = new ConcurrentHashMap<String, String>();

	public static final ConcurrentMap<String, String> javaTypeMap = new ConcurrentHashMap<String, String>();

	static {
		columnMap.put("id", "ID");
		columnMap.put("code", "CODE");
		columnMap.put("code2", "CODE2");
		columnMap.put("createBy", "CREATEBY");
		columnMap.put("createTime", "CREATETIME");
		columnMap.put("desc", "DEPTDESC");
		columnMap.put("fincode", "FINCODE");
		columnMap.put("level", "DEPTLEVEL");
		columnMap.put("name", "NAME");
		columnMap.put("no", "DEPTNO");
		columnMap.put("nodeId", "NODEID");
		columnMap.put("sort", "SORT");
		columnMap.put("status", "STATUS");
		columnMap.put("updateBy", "UPDATEBY");
		columnMap.put("updateDate", "UPDATEDATE");

		javaTypeMap.put("id", "Long");
		javaTypeMap.put("code", "String");
		javaTypeMap.put("code2", "String");
		javaTypeMap.put("createBy", "String");
		javaTypeMap.put("createTime", "Date");
		javaTypeMap.put("desc", "String");
		javaTypeMap.put("fincode", "String");
		javaTypeMap.put("level", "Integer");
		javaTypeMap.put("name", "String");
		javaTypeMap.put("no", "String");
		javaTypeMap.put("nodeId", "Long");
		javaTypeMap.put("sort", "Integer");
		javaTypeMap.put("status", "Integer");
		javaTypeMap.put("updateBy", "String");
		javaTypeMap.put("updateDate", "Date");
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
		tableDefinition.setName("SysDepartment");

		ColumnDefinition idColumn = new ColumnDefinition();
		idColumn.setName("id");
		idColumn.setColumnName("ID");
		idColumn.setJavaType("Long");
		tableDefinition.setIdColumn(idColumn);

		ColumnDefinition code = new ColumnDefinition();
		code.setName("code");
		code.setColumnName("CODE");
		code.setJavaType("String");
		code.setLength(250);
		tableDefinition.addColumn(code);

		ColumnDefinition code2 = new ColumnDefinition();
		code2.setName("code2");
		code2.setColumnName("CODE2");
		code2.setJavaType("String");
		code2.setLength(250);
		tableDefinition.addColumn(code2);

		ColumnDefinition createBy = new ColumnDefinition();
		createBy.setName("createBy");
		createBy.setColumnName("CREATEBY");
		createBy.setJavaType("String");
		createBy.setLength(50);
		tableDefinition.addColumn(createBy);

		ColumnDefinition createTime = new ColumnDefinition();
		createTime.setName("createTime");
		createTime.setColumnName("CREATETIME");
		createTime.setJavaType("Date");
		tableDefinition.addColumn(createTime);

		ColumnDefinition desc = new ColumnDefinition();
		desc.setName("desc");
		desc.setColumnName("DEPTDESC");
		desc.setJavaType("String");
		desc.setLength(500);
		tableDefinition.addColumn(desc);

		ColumnDefinition fincode = new ColumnDefinition();
		fincode.setName("fincode");
		fincode.setColumnName("FINCODE");
		fincode.setJavaType("String");
		fincode.setLength(250);
		tableDefinition.addColumn(fincode);

		ColumnDefinition level = new ColumnDefinition();
		level.setName("level");
		level.setColumnName("DEPTLEVEL");
		level.setJavaType("Integer");
		tableDefinition.addColumn(level);

		ColumnDefinition name = new ColumnDefinition();
		name.setName("name");
		name.setColumnName("NAME");
		name.setJavaType("String");
		name.setLength(200);
		tableDefinition.addColumn(name);

		ColumnDefinition no = new ColumnDefinition();
		no.setName("no");
		no.setColumnName("DEPTNO");
		no.setJavaType("String");
		no.setLength(255);
		tableDefinition.addColumn(no);

		ColumnDefinition nodeId = new ColumnDefinition();
		nodeId.setName("nodeId");
		nodeId.setColumnName("NODEID");
		nodeId.setJavaType("Long");
		tableDefinition.addColumn(nodeId);

		ColumnDefinition sort = new ColumnDefinition();
		sort.setName("sort");
		sort.setColumnName("SORT");
		sort.setJavaType("Integer");
		tableDefinition.addColumn(sort);

		ColumnDefinition status = new ColumnDefinition();
		status.setName("status");
		status.setColumnName("STATUS");
		status.setJavaType("Integer");
		tableDefinition.addColumn(status);

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
		if (dataRequest.getFilter() != null) {
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

	private SysDepartmentDomainFactory() {

	}

}
