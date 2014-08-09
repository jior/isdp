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

package com.glaf.base.modules.sys.model;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;

public interface ITree extends JSONable {

	/**
	 * 是否处于选中状态
	 * 
	 * @return
	 */
	boolean isChecked();

	/**
	 * 编号，包含父子关系，例如：19756|19852|20076|20151|20155|20158|
	 * 
	 * @return
	 */
	String getId();

	/**
	 * 主键
	 * 
	 * @return
	 */
	int getIndexId();

	/**
	 * 名称
	 * 
	 * @return
	 */
	String getIndexName();

	/**
	 * 层级，从0开始，0为第一级，1为第二级，依次类推
	 * 
	 * @return
	 */
	int getLevel();

	/**
	 * 顺序号
	 * 
	 * @return
	 */
	int getListno();

	/**
	 * 父节点编号
	 * 
	 * @return
	 */
	int getParentId();

	/**
	 * 设置选中状态
	 * 
	 * @param checked
	 */
	void setChecked(boolean checked);

	void setId(String id);

	void setIndexId(int indexId);

	void setIndexName(String indexName);

	void setLevel(int level);

	void setListno(int listno);

	void setParentId(int parentId);

	ObjectNode toObjectNode();

}
