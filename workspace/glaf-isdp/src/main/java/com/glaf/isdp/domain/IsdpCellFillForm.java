package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellFillformJsonFactory;

@Entity
@Table(name = "cell_fillform")
public class IsdpCellFillForm implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * topid
	 */
	@Column(name = "topid", length = 50)
	protected String topid;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * Task_id
	 */
	@Column(name = "task_id", length = 50)
	protected String taskId;

	/**
	 * pfileflag
	 */
	@Column(name = "pfileflag")
	protected int pfileflag;

	/**
	 * filedot_fileid
	 */
	@Column(name = "filedot_fileid", length = 50)
	protected String filedotFileid;

	/**
	 * name
	 */
	@Column(name = "name", length = 250)
	protected String name;

	/**
	 * chknum
	 */
	@Column(name = "chknum", length = 50)
	protected String chknum;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * chktotal
	 */
	@Column(name = "chktotal")
	protected int chktotal;

	/**
	 * chkresult
	 */
	@Column(name = "chkresult")
	protected int chkresult;

	/**
	 * pfile_id
	 */
	@Column(name = "pfile_id", length = 50)
	protected String pfileId;

	/**
	 * tempsave
	 */
	@Column(name = "tempsave")
	protected int tempsave;

	/**
	 * userid
	 */
	@Column(name = "userid", length = 20)
	protected String userid;

	/**
	 * refillflag
	 */
	@Column(name = "refillflag")
	protected int refillflag;

	/**
	 * groupid
	 */
	@Column(name = "groupid")
	protected int groupid;

	/**
	 * old_id
	 */
	@Column(name = "old_id", length = 50)
	protected String oldId;

	/**
	 * role_id
	 */
	@Column(name = "role_id")
	protected int roleId;

	/**
	 * isfinish
	 */
	@Column(name = "isfinish")
	protected int isfinish;

	/**
	 * type_tablename
	 */
	@Column(name = "type_tablename", length = 50)
	protected String typeTablename;

	/**
	 * type_id
	 */
	@Column(name = "type_id", length = 50)
	protected String typeId;

	/**
	 * type_index_id
	 */
	@Column(name = "type_index_id")
	protected int typeIndexId;

	/**
	 * main_id
	 */
	@Column(name = "main_id", length = 50)
	protected String mainId;

	/**
	 * intlastpage
	 */
	@Column(name = "intlastpage")
	protected int intlastpage;

	@Column(name = "intsheets")
	protected int intsheets;

	@javax.persistence.Transient
	protected List<CellRepInfo> repInfos = new ArrayList<CellRepInfo>();

	@javax.persistence.Transient
	protected List<CellDataTable> dataTables = new ArrayList<CellDataTable>();

	public IsdpCellFillForm() {

	}

	public void addDataTable(CellDataTable dataTable) {
		if (dataTables == null) {
			dataTables = new ArrayList<CellDataTable>();
		}
		dataTables.add(dataTable);
	}

	public void addRepInfo(CellRepInfo repInfo) {
		if (repInfos == null) {
			repInfos = new ArrayList<CellRepInfo>();
		}
		repInfos.add(repInfo);
	}

	public String getChknum() {
		return this.chknum;
	}

	public int getChkresult() {
		return this.chkresult;
	}

	public int getChktotal() {
		return this.chktotal;
	}

	public List<CellDataTable> getDataTables() {
		return dataTables;
	}

	public String getFiledotFileid() {
		return this.filedotFileid;
	}

	public int getGroupid() {
		return this.groupid;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntlastpage() {
		return this.intlastpage;
	}

	public int getIntsheets() {
		return intsheets;
	}

	public int getIsfinish() {
		return this.isfinish;
	}

	public int getListno() {
		return this.listno;
	}

	public String getMainId() {
		return this.mainId;
	}

	public String getName() {
		return this.name;
	}

	public String getOldId() {
		return this.oldId;
	}

	public int getPfileflag() {
		return this.pfileflag;
	}

	public String getPfileId() {
		return this.pfileId;
	}

	public int getRefillflag() {
		return this.refillflag;
	}

	public List<CellRepInfo> getRepInfos() {
		return repInfos;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public int getTempsave() {
		return this.tempsave;
	}

	public String getTopid() {
		return this.topid;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public int getTypeIndexId() {
		return this.typeIndexId;
	}

	public String getTypeTablename() {
		return this.typeTablename;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setChknum(String chknum) {
		this.chknum = chknum;
	}

	public void setChkresult(int chkresult) {
		this.chkresult = chkresult;
	}

	public void setChktotal(int chktotal) {
		this.chktotal = chktotal;
	}

	public void setDataTables(List<CellDataTable> dataTables) {
		this.dataTables = dataTables;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntlastpage(int intlastpage) {
		this.intlastpage = intlastpage;
	}

	public void setIntsheets(int intsheets) {
		this.intsheets = intsheets;
	}

	public void setIsfinish(int isfinish) {
		this.isfinish = isfinish;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public void setPfileflag(int pfileflag) {
		this.pfileflag = pfileflag;
	}

	public void setPfileId(String pfileId) {
		this.pfileId = pfileId;
	}

	public void setRefillflag(int refillflag) {
		this.refillflag = refillflag;
	}

	public void setRepInfos(List<CellRepInfo> repInfos) {
		this.repInfos = repInfos;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTempsave(int tempsave) {
		this.tempsave = tempsave;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIndexId(int typeIndexId) {
		this.typeIndexId = typeIndexId;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public IsdpCellFillForm jsonToObject(JSONObject jsonObject) {
		return CellFillformJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellFillformJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellFillformJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
