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
public class DictoryDomainFactory {

	public static final String TABLENAME = "SYS_DICTORY";

	public static final ConcurrentMap<String, String> columnMap = new ConcurrentHashMap<String, String>();

	public static final ConcurrentMap<String, String> javaTypeMap = new ConcurrentHashMap<String, String>();

	static {
		columnMap.put("id", "ID");
		columnMap.put("blocked", "BLOCKED");
		columnMap.put("code", "CODE");
		columnMap.put("createBy", "CREATEBY");
		columnMap.put("createDate", "CREATEDATE");
		columnMap.put("desc", "DICTDESC");
		columnMap.put("ext1", "EXT1");
		columnMap.put("ext10", "EXT10");
		columnMap.put("ext11", "EXT11");
		columnMap.put("ext12", "EXT12");
		columnMap.put("ext13", "EXT13");
		columnMap.put("ext14", "EXT14");
		columnMap.put("ext15", "EXT15");
		columnMap.put("ext16", "EXT16");
		columnMap.put("ext17", "EXT17");
		columnMap.put("ext18", "EXT18");
		columnMap.put("ext19", "EXT19");
		columnMap.put("ext2", "EXT2");
		columnMap.put("ext20", "EXT20");
		columnMap.put("ext3", "EXT3");
		columnMap.put("ext4", "EXT4");
		columnMap.put("ext5", "EXT5");
		columnMap.put("ext6", "EXT6");
		columnMap.put("ext7", "EXT7");
		columnMap.put("ext8", "EXT8");
		columnMap.put("ext9", "EXT9");
		columnMap.put("name", "NAME");
		columnMap.put("nodeId", "TYPEID");
		columnMap.put("sort", "SORT");
		columnMap.put("updateBy", "UPDATEBY");
		columnMap.put("updateDate", "UPDATEDATE");
		columnMap.put("value", "VALUE_");

		javaTypeMap.put("id", "Long");
		javaTypeMap.put("blocked", "Integer");
		javaTypeMap.put("code", "String");
		javaTypeMap.put("createBy", "String");
		javaTypeMap.put("createDate", "Date");
		javaTypeMap.put("desc", "String");
		javaTypeMap.put("ext1", "String");
		javaTypeMap.put("ext10", "Date");
		javaTypeMap.put("ext11", "Long");
		javaTypeMap.put("ext12", "Long");
		javaTypeMap.put("ext13", "Long");
		javaTypeMap.put("ext14", "Long");
		javaTypeMap.put("ext15", "Long");
		javaTypeMap.put("ext16", "Double");
		javaTypeMap.put("ext17", "Double");
		javaTypeMap.put("ext18", "Double");
		javaTypeMap.put("ext19", "Double");
		javaTypeMap.put("ext2", "String");
		javaTypeMap.put("ext20", "Double");
		javaTypeMap.put("ext3", "String");
		javaTypeMap.put("ext4", "String");
		javaTypeMap.put("ext5", "Date");
		javaTypeMap.put("ext6", "Date");
		javaTypeMap.put("ext7", "Date");
		javaTypeMap.put("ext8", "Date");
		javaTypeMap.put("ext9", "Date");
		javaTypeMap.put("name", "String");
		javaTypeMap.put("nodeId", "Long");
		javaTypeMap.put("sort", "Integer");
		javaTypeMap.put("updateBy", "String");
		javaTypeMap.put("updateDate", "Date");
		javaTypeMap.put("value", "String");
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
		tableDefinition.setName("Dictory");

		ColumnDefinition idColumn = new ColumnDefinition();
		idColumn.setName("id");
		idColumn.setColumnName("ID");
		idColumn.setJavaType("Long");
		tableDefinition.setIdColumn(idColumn);

		ColumnDefinition blocked = new ColumnDefinition();
		blocked.setName("blocked");
		blocked.setColumnName("BLOCKED");
		blocked.setJavaType("Integer");
		tableDefinition.addColumn(blocked);

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
		desc.setColumnName("DICTDESC");
		desc.setJavaType("String");
		desc.setLength(500);
		tableDefinition.addColumn(desc);

		ColumnDefinition ext1 = new ColumnDefinition();
		ext1.setName("ext1");
		ext1.setColumnName("EXT1");
		ext1.setJavaType("String");
		ext1.setLength(200);
		tableDefinition.addColumn(ext1);

		ColumnDefinition ext10 = new ColumnDefinition();
		ext10.setName("ext10");
		ext10.setColumnName("EXT10");
		ext10.setJavaType("Date");
		tableDefinition.addColumn(ext10);

		ColumnDefinition ext11 = new ColumnDefinition();
		ext11.setName("ext11");
		ext11.setColumnName("EXT11");
		ext11.setJavaType("Long");
		tableDefinition.addColumn(ext11);

		ColumnDefinition ext12 = new ColumnDefinition();
		ext12.setName("ext12");
		ext12.setColumnName("EXT12");
		ext12.setJavaType("Long");
		tableDefinition.addColumn(ext12);

		ColumnDefinition ext13 = new ColumnDefinition();
		ext13.setName("ext13");
		ext13.setColumnName("EXT13");
		ext13.setJavaType("Long");
		tableDefinition.addColumn(ext13);

		ColumnDefinition ext14 = new ColumnDefinition();
		ext14.setName("ext14");
		ext14.setColumnName("EXT14");
		ext14.setJavaType("Long");
		tableDefinition.addColumn(ext14);

		ColumnDefinition ext15 = new ColumnDefinition();
		ext15.setName("ext15");
		ext15.setColumnName("EXT15");
		ext15.setJavaType("Long");
		tableDefinition.addColumn(ext15);

		ColumnDefinition ext16 = new ColumnDefinition();
		ext16.setName("ext16");
		ext16.setColumnName("EXT16");
		ext16.setJavaType("Double");
		tableDefinition.addColumn(ext16);

		ColumnDefinition ext17 = new ColumnDefinition();
		ext17.setName("ext17");
		ext17.setColumnName("EXT17");
		ext17.setJavaType("Double");
		tableDefinition.addColumn(ext17);

		ColumnDefinition ext18 = new ColumnDefinition();
		ext18.setName("ext18");
		ext18.setColumnName("EXT18");
		ext18.setJavaType("Double");
		tableDefinition.addColumn(ext18);

		ColumnDefinition ext19 = new ColumnDefinition();
		ext19.setName("ext19");
		ext19.setColumnName("EXT19");
		ext19.setJavaType("Double");
		tableDefinition.addColumn(ext19);

		ColumnDefinition ext2 = new ColumnDefinition();
		ext2.setName("ext2");
		ext2.setColumnName("EXT2");
		ext2.setJavaType("String");
		ext2.setLength(200);
		tableDefinition.addColumn(ext2);

		ColumnDefinition ext20 = new ColumnDefinition();
		ext20.setName("ext20");
		ext20.setColumnName("EXT20");
		ext20.setJavaType("Double");
		tableDefinition.addColumn(ext20);

		ColumnDefinition ext3 = new ColumnDefinition();
		ext3.setName("ext3");
		ext3.setColumnName("EXT3");
		ext3.setJavaType("String");
		ext3.setLength(200);
		tableDefinition.addColumn(ext3);

		ColumnDefinition ext4 = new ColumnDefinition();
		ext4.setName("ext4");
		ext4.setColumnName("EXT4");
		ext4.setJavaType("String");
		ext4.setLength(200);
		tableDefinition.addColumn(ext4);

		ColumnDefinition ext5 = new ColumnDefinition();
		ext5.setName("ext5");
		ext5.setColumnName("EXT5");
		ext5.setJavaType("Date");
		tableDefinition.addColumn(ext5);

		ColumnDefinition ext6 = new ColumnDefinition();
		ext6.setName("ext6");
		ext6.setColumnName("EXT6");
		ext6.setJavaType("Date");
		tableDefinition.addColumn(ext6);

		ColumnDefinition ext7 = new ColumnDefinition();
		ext7.setName("ext7");
		ext7.setColumnName("EXT7");
		ext7.setJavaType("Date");
		tableDefinition.addColumn(ext7);

		ColumnDefinition ext8 = new ColumnDefinition();
		ext8.setName("ext8");
		ext8.setColumnName("EXT8");
		ext8.setJavaType("Date");
		tableDefinition.addColumn(ext8);

		ColumnDefinition ext9 = new ColumnDefinition();
		ext9.setName("ext9");
		ext9.setColumnName("EXT9");
		ext9.setJavaType("Date");
		tableDefinition.addColumn(ext9);

		ColumnDefinition name = new ColumnDefinition();
		name.setName("name");
		name.setColumnName("NAME");
		name.setJavaType("String");
		name.setLength(50);
		tableDefinition.addColumn(name);

		ColumnDefinition nodeId = new ColumnDefinition();
		nodeId.setName("nodeId");
		nodeId.setColumnName("TYPEID");
		nodeId.setJavaType("Long");
		tableDefinition.addColumn(nodeId);

		ColumnDefinition sort = new ColumnDefinition();
		sort.setName("sort");
		sort.setColumnName("SORT");
		sort.setJavaType("Integer");
		tableDefinition.addColumn(sort);

		ColumnDefinition updateBy = new ColumnDefinition();
		updateBy.setName("updateBy");
		updateBy.setColumnName("UPDATEBY");
		updateBy.setJavaType("String");
		updateBy.setLength(255);
		tableDefinition.addColumn(updateBy);

		ColumnDefinition updateDate = new ColumnDefinition();
		updateDate.setName("updateDate");
		updateDate.setColumnName("UPDATEDATE");
		updateDate.setJavaType("Date");
		tableDefinition.addColumn(updateDate);

		ColumnDefinition value = new ColumnDefinition();
		value.setName("value");
		value.setColumnName("VALUE_");
		value.setJavaType("String");
		value.setLength(2000);
		tableDefinition.addColumn(value);

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

	private DictoryDomainFactory() {

	}

}
