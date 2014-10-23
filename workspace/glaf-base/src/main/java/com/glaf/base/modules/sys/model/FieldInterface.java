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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.glaf.core.base.JSONable;
import com.glaf.base.modules.sys.util.FieldInterfaceJsonFactory;

@Entity
@Table(name = "interface")
public class FieldInterface implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "listId", length = 50, nullable = false)
	protected String listId;

	/**
	 * index_id
	 */
	@Column(name = "index_id", length = 100)
	protected String indexId;

	/**
	 * frmtype
	 */
	@Column(name = "frmtype", length = 30)
	protected String frmtype;

	/**
	 * issystem
	 */
	@Column(name = "issystem", length = 1)
	protected String issystem;

	/**
	 * fname
	 */
	@Column(name = "fname", length = 255)
	protected String fname;

	/**
	 * dname
	 */
	@Column(name = "dname", length = 100)
	protected String dname;

	/**
	 * dtype
	 */
	@Column(name = "dtype", length = 50)
	protected String dtype;

	/**
	 * showtype
	 */
	@Column(name = "showtype", length = 50)
	protected String showtype;

	/**
	 * strlen
	 */
	@Column(name = "strlen")
	protected int strlen;

	/**
	 * form
	 */
	@Column(name = "form", length = 50)
	protected String form;

	/**
	 * intype
	 */
	@Column(name = "intype", length = 10)
	protected String intype;

	/**
	 * hintID
	 */
	@Column(name = "hintID", length = 50)
	protected String hintID;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * ztype
	 */
	@Column(name = "ztype", length = 1)
	protected String ztype;

	/**
	 * ismustfill
	 */
	@Column(name = "ismustfill", length = 1)
	protected String ismustfill;

	/**
	 * isListShow
	 */
	@Column(name = "isListShow", length = 1)
	protected String isListShow;

	/**
	 * listweigth
	 */
	@Column(name = "listweigth")
	protected int listweigth;

	/**
	 * isallwidth
	 */
	@Column(name = "isallwidth", length = 1)
	protected String isallwidth;

	/**
	 * istname
	 */
	@Column(name = "istname", length = 1)
	protected String istname;

	/**
	 * import_type
	 */
	@Column(name = "import_type")
	protected int importType;

	/**
	 * datapoint
	 */
	@Column(name = "datapoint")
	protected int datapoint;

	@javax.persistence.Transient
	protected String align;

	@javax.persistence.Transient
	protected String stringValue;

	@javax.persistence.Transient
	protected int intValue;

	@javax.persistence.Transient
	protected long longValue;

	@javax.persistence.Transient
	protected double doubleValue;

	@javax.persistence.Transient
	protected Date dateValue;

	@javax.persistence.Transient
	protected Object value;

	public FieldInterface() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FieldInterface other = (FieldInterface) obj;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		return true;
	}

	public String getAlign() {
		return align;
	}

	public int getDatapoint() {
		return this.datapoint;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public String getDname() {
		return this.dname;
	}

	public double getDoubleValue() {
		return doubleValue;
	}

	public String getDtype() {
		return this.dtype;
	}

	public String getFname() {
		return this.fname;
	}

	public String getForm() {
		return this.form;
	}

	public String getFrmtype() {
		return this.frmtype;
	}

	public String getHintID() {
		return this.hintID;
	}

	public int getImportType() {
		return this.importType;
	}

	public String getIndexId() {
		return this.indexId;
	}

	public int getIntValue() {
		return intValue;
	}

	public String getIntype() {
		return this.intype;
	}

	public String getIsallwidth() {
		return this.isallwidth;
	}

	public String getIsListShow() {
		return this.isListShow;
	}

	public String getIsmustfill() {
		return this.ismustfill;
	}

	public String getIssystem() {
		return this.issystem;
	}

	public String getIstname() {
		return this.istname;
	}

	public String getListId() {
		return this.listId;
	}

	public int getListno() {
		return this.listno;
	}

	public int getListweigth() {
		return this.listweigth;
	}

	public long getLongValue() {
		return longValue;
	}

	public String getShowtype() {
		return this.showtype;
	}

	public String getStringValue() {
		return stringValue;
	}

	public int getStrlen() {
		return this.strlen;
	}

	public Object getValue() {
		return value;
	}

	public String getZtype() {
		return this.ztype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		return result;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public void setDatapoint(int datapoint) {
		this.datapoint = datapoint;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public void setFrmtype(String frmtype) {
		this.frmtype = frmtype;
	}

	public void setHintID(String hintID) {
		this.hintID = hintID;
	}

	public void setImportType(int importType) {
		this.importType = importType;
	}

	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public void setIntype(String intype) {
		this.intype = intype;
	}

	public void setIsallwidth(String isallwidth) {
		this.isallwidth = isallwidth;
	}

	public void setIsListShow(String isListShow) {
		this.isListShow = isListShow;
	}

	public void setIsmustfill(String ismustfill) {
		this.ismustfill = ismustfill;
	}

	public void setIssystem(String issystem) {
		this.issystem = issystem;
	}

	public void setIstname(String istname) {
		this.istname = istname;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setListweigth(int listweigth) {
		this.listweigth = listweigth;
	}

	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}

	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public void setStrlen(int strlen) {
		this.strlen = strlen;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public void setZtype(String ztype) {
		this.ztype = ztype;
	}

	public FieldInterface jsonToObject(JSONObject jsonObject) {
		return FieldInterfaceJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FieldInterfaceJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FieldInterfaceJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
