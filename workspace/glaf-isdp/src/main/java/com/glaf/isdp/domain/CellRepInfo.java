package com.glaf.isdp.domain;

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
import com.glaf.isdp.util.CellRepInfoJsonFactory;

/**
 * 表格定义信息
 */
@Entity
@Table(name = "cell_repinfo")
public class CellRepInfo implements Serializable, JSONable {
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
	@Column(name = "frmtype", length = 50)
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
	@Column(name = "dname", length = 50)
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
	 * panid
	 */
	@Column(name = "panid", length = 50)
	protected String panid;

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
	 * filedot_fileid 表格文件定义编号
	 */
	@Column(name = "filedot_fileid", length = 50)
	protected String filedotFileid;

	/**
	 * datapoint
	 */
	@Column(name = "datapoint")
	protected int datapoint;

	/**
	 * defaultvalue
	 */
	@Column(name = "defaultvalue", length = 50)
	protected String defaultvalue;

	/**
	 * issubtable
	 */
	@Column(name = "issubtable", length = 1)
	protected String issubtable;

	/**
	 * isdataonly
	 */
	@Column(name = "isdataonly", length = 1)
	protected String isdataonly;

	/**
	 * checktype
	 */
	@Column(name = "checktype")
	protected int checktype;

	/**
	 * orderid
	 */
	@Column(name = "orderid", length = 50)
	protected String orderid;

	/**
	 * celltype
	 */
	@Column(name = "celltype")
	protected int celltype;

	/**
	 * ost_tablename
	 */
	@Column(name = "ost_tablename", length = 50)
	protected String ostTablename;

	/**
	 * ost_row
	 */
	@Column(name = "ost_row")
	protected int ostRow;

	/**
	 * ost_col
	 */
	@Column(name = "ost_col")
	protected int ostCol;

	/**
	 * hintlist
	 */
	@Column(name = "hintlist", length = 250)
	protected String hintlist;

	/**
	 * ost_cellid
	 */
	@Column(name = "ost_cellid", length = 20)
	protected String ostCellid;

	/**
	 * olddname
	 */
	@Column(name = "olddname", length = 50)
	protected String olddname;

	/**
	 * ost_cellname
	 */
	@Column(name = "ost_cellname", length = 20)
	protected String ostCellname;

	/**
	 * ost_formula
	 */
	@Lob
	@Column(name = "ost_formula")
	protected String ostFormula;

	/**
	 * ost_color
	 */
	@Column(name = "ost_color")
	protected int ostColor;

	/**
	 * ost_sumtype
	 */
	@Column(name = "ost_sumtype")
	protected int ostSumtype;

	/**
	 * data_tablename
	 */
	@Column(name = "data_tablename", length = 50)
	protected String dataTablename;

	/**
	 * data_fieldname
	 */
	@Column(name = "data_fieldname", length = 50)
	protected String dataFieldname;

	/**
	 * order_con
	 */
	@Column(name = "order_con")
	protected int orderCon;

	/**
	 * connum
	 */
	@Column(name = "connum")
	protected int connum;

	/**
	 * node_index
	 */
	@Column(name = "node_index")
	protected int nodeIndex;

	/**
	 * type_id
	 */
	@Column(name = "type_id", length = 50)
	protected String typeId;

	/**
	 * userindex
	 */
	@Column(name = "userindex", length = 50)
	protected String userindex;

	/**
	 * order_index
	 */
	@Column(name = "order_index")
	protected int orderIndex;

	/**
	 * parent_dname
	 */
	@Column(name = "parent_dname", length = 50)
	protected String parentDname;

	/**
	 * sysauto
	 */
	@Column(name = "sysauto")
	protected int sysauto;

	/**
	 * order_index_F
	 */
	@Column(name = "order_index_F")
	protected int orderIndexF;

	/**
	 * orderid_F
	 */
	@Column(name = "orderid_F", length = 50)
	protected String orderidF;

	/**
	 * order_con_F
	 */
	@Column(name = "order_con_F")
	protected int orderConF;

	/**
	 * isprintvalue
	 */
	@Column(name = "isprintvalue")
	protected int isprintvalue;

	@Column(name = "isshowvalueonlast")
	protected int isshowvalueonlast;

	@Column(name = "isBankRoundType")
	protected int isBankRoundType;

	public CellRepInfo() {

	}

	public int getCelltype() {
		return this.celltype;
	}

	public int getChecktype() {
		return this.checktype;
	}

	public int getConnum() {
		return this.connum;
	}

	public String getDataFieldname() {
		return this.dataFieldname;
	}

	public int getDatapoint() {
		return this.datapoint;
	}

	public String getDataTablename() {
		return this.dataTablename;
	}

	public String getDefaultvalue() {
		return this.defaultvalue;
	}

	public String getDname() {
		return this.dname;
	}

	public String getDtype() {
		return this.dtype;
	}

	public String getFiledotFileid() {
		return this.filedotFileid;
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

	public String getHintlist() {
		return this.hintlist;
	}

	public String getIndexId() {
		return this.indexId;
	}

	public String getIntype() {
		return this.intype;
	}

	public String getIsallwidth() {
		return this.isallwidth;
	}

	public int getIsBankRoundType() {
		return isBankRoundType;
	}

	public String getIsdataonly() {
		return this.isdataonly;
	}

	public String getIsListShow() {
		return this.isListShow;
	}

	public String getIsmustfill() {
		return this.ismustfill;
	}

	public int getIsprintvalue() {
		return this.isprintvalue;
	}

	public int getIsshowvalueonlast() {
		return isshowvalueonlast;
	}

	public String getIssubtable() {
		return this.issubtable;
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

	public int getNodeIndex() {
		return this.nodeIndex;
	}

	public String getOlddname() {
		return this.olddname;
	}

	public int getOrderCon() {
		return this.orderCon;
	}

	public int getOrderConF() {
		return this.orderConF;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public String getOrderidF() {
		return this.orderidF;
	}

	public int getOrderIndex() {
		return this.orderIndex;
	}

	public int getOrderIndexF() {
		return this.orderIndexF;
	}

	public String getOstCellid() {
		return this.ostCellid;
	}

	public String getOstCellname() {
		return this.ostCellname;
	}

	public int getOstCol() {
		return this.ostCol;
	}

	public int getOstColor() {
		return this.ostColor;
	}

	public String getOstFormula() {
		return this.ostFormula;
	}

	public int getOstRow() {
		return this.ostRow;
	}

	public int getOstSumtype() {
		return this.ostSumtype;
	}

	public String getOstTablename() {
		return this.ostTablename;
	}

	public String getPanid() {
		return this.panid;
	}

	public String getParentDname() {
		return this.parentDname;
	}

	public String getShowtype() {
		return this.showtype;
	}

	public int getStrlen() {
		return this.strlen;
	}

	public int getSysauto() {
		return this.sysauto;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public String getUserindex() {
		return this.userindex;
	}

	public String getZtype() {
		return this.ztype;
	}

	public void setCelltype(int celltype) {
		this.celltype = celltype;
	}

	public void setChecktype(int checktype) {
		this.checktype = checktype;
	}

	public void setConnum(int connum) {
		this.connum = connum;
	}

	public void setDataFieldname(String dataFieldname) {
		this.dataFieldname = dataFieldname;
	}

	public void setDatapoint(int datapoint) {
		this.datapoint = datapoint;
	}

	public void setDataTablename(String dataTablename) {
		this.dataTablename = dataTablename;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
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

	public void setHintlist(String hintlist) {
		this.hintlist = hintlist;
	}

	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}

	public void setIntype(String intype) {
		this.intype = intype;
	}

	public void setIsallwidth(String isallwidth) {
		this.isallwidth = isallwidth;
	}

	public void setIsBankRoundType(int isBankRoundType) {
		this.isBankRoundType = isBankRoundType;
	}

	public void setIsdataonly(String isdataonly) {
		this.isdataonly = isdataonly;
	}

	public void setIsListShow(String isListShow) {
		this.isListShow = isListShow;
	}

	public void setIsmustfill(String ismustfill) {
		this.ismustfill = ismustfill;
	}

	public void setIsprintvalue(int isprintvalue) {
		this.isprintvalue = isprintvalue;
	}

	public void setIsshowvalueonlast(int isshowvalueonlast) {
		this.isshowvalueonlast = isshowvalueonlast;
	}

	public void setIssubtable(String issubtable) {
		this.issubtable = issubtable;
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

	public void setNodeIndex(int nodeIndex) {
		this.nodeIndex = nodeIndex;
	}

	public void setOlddname(String olddname) {
		this.olddname = olddname;
	}

	public void setOrderCon(int orderCon) {
		this.orderCon = orderCon;
	}

	public void setOrderConF(int orderConF) {
		this.orderConF = orderConF;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public void setOrderidF(String orderidF) {
		this.orderidF = orderidF;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public void setOrderIndexF(int orderIndexF) {
		this.orderIndexF = orderIndexF;
	}

	public void setOstCellid(String ostCellid) {
		this.ostCellid = ostCellid;
	}

	public void setOstCellname(String ostCellname) {
		this.ostCellname = ostCellname;
	}

	public void setOstCol(int ostCol) {
		this.ostCol = ostCol;
	}

	public void setOstColor(int ostColor) {
		this.ostColor = ostColor;
	}

	public void setOstFormula(String ostFormula) {
		this.ostFormula = ostFormula;
	}

	public void setOstRow(int ostRow) {
		this.ostRow = ostRow;
	}

	public void setOstSumtype(int ostSumtype) {
		this.ostSumtype = ostSumtype;
	}

	public void setOstTablename(String ostTablename) {
		this.ostTablename = ostTablename;
	}

	public void setPanid(String panid) {
		this.panid = panid;
	}

	public void setParentDname(String parentDname) {
		this.parentDname = parentDname;
	}

	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}

	public void setStrlen(int strlen) {
		this.strlen = strlen;
	}

	public void setSysauto(int sysauto) {
		this.sysauto = sysauto;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setUserindex(String userindex) {
		this.userindex = userindex;
	}

	public void setZtype(String ztype) {
		this.ztype = ztype;
	}

	public CellRepInfo jsonToObject(JSONObject jsonObject) {
		return CellRepInfoJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellRepInfoJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellRepInfoJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
