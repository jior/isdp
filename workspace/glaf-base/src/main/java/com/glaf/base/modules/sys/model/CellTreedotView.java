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

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.base.modules.sys.util.CellTreedotViewJsonFactory;

/**
 * 分类属性（工程视图）
 */
@Entity
@Table(name = "cell_treedot_view")
public class CellTreedotView implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * tablename
	 */
	@Column(name = "tablename", length = 50)
	protected String tablename;

	/**
	 * tablename_s
	 */
	@Column(name = "tablename_s", length = 50)
	protected String tablenameS;

	/**
	 * alldname
	 */
	@Lob
	@Column(name = "alldname")
	protected String alldname;

	/**
	 * allfname
	 */
	@Lob
	@Column(name = "allfname")
	protected String allfname;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * intrad
	 */
	@Column(name = "intrad")
	protected int intrad;

	/**
	 * intwbslevel
	 */
	@Column(name = "intwbslevel")
	protected int intwbslevel;

	public CellTreedotView() {

	}

	public String getAlldname() {
		return this.alldname;
	}

	public String getAllfname() {
		return this.allfname;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntrad() {
		return this.intrad;
	}

	public int getIntwbslevel() {
		return this.intwbslevel;
	}

	public int getListno() {
		return this.listno;
	}

	public String getTablename() {
		return this.tablename;
	}

	public String getTablenameS() {
		return this.tablenameS;
	}

	public void setAlldname(String alldname) {
		this.alldname = alldname;
	}

	public void setAllfname(String allfname) {
		this.allfname = allfname;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntrad(int intrad) {
		this.intrad = intrad;
	}

	public void setIntwbslevel(int intwbslevel) {
		this.intwbslevel = intwbslevel;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setTablenameS(String tablenameS) {
		this.tablenameS = tablenameS;
	}

	public CellTreedotView jsonToObject(JSONObject jsonObject) {
		return CellTreedotViewJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellTreedotViewJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellTreedotViewJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
