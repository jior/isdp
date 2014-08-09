package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.ProjectTreeAllwbsJsonFactory;

/**
 * WBS任务情况表(临时表)
 * 
 */
@Entity
@Table(name = "proj_treeallwbs")
public class ProjectTreeAllwbs implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id", nullable = false)
	protected int indexId;

	@Column(name = "parent_id")
	protected int parentId;

	@Column(name = "cellTaskIndexId")
	protected int cellTaskIndexId;

	/**
	 * id
	 */
	@Column(name = "id", length = 100)
	protected String id;

	/**
	 * num
	 */
	@Column(name = "num", length = 20)
	protected String num;

	/**
	 * index_name
	 */
	@Column(name = "index_name", length = 255)
	protected String indexName;

	/**
	 * nlevel
	 */
	@Column(name = "nlevel")
	protected int nlevel;

	/**
	 * content
	 */
	@Column(name = "content", length = 255)
	protected String content;

	/**
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * 类型: 2-任务,3-流程,4-人工活动
	 */
	@Column(name = "type")
	protected int type;

	/**
	 * roleid
	 */
	@Column(name = "roleid")
	protected int roleid;

	/**
	 * rolename
	 */
	@Column(name = "rolename", length = 200)
	protected String rolename;

	/**
	 * limtime
	 */
	@Column(name = "limtime")
	protected int limtime;

	/**
	 * userid
	 */
	@Column(name = "userid", length = 20)
	protected String userid;

	/**
	 * username
	 */
	@Column(name = "username", length = 100)
	protected String username;

	/**
	 * starttime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "starttime")
	protected Date starttime;

	/**
	 * endtime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "endtime")
	protected Date endtime;

	/**
	 * useday
	 */
	@Column(name = "useday")
	protected Double useday;

	/**
	 * intfinish
	 */
	@Column(name = "intfinish")
	protected int intfinish;

	/**
	 * main_id
	 */
	@Column(name = "main_id", length = 50)
	protected String mainId;

	@javax.persistence.Transient
	protected boolean checked;

	public ProjectTreeAllwbs() {

	}

	public int getCellTaskIndexId() {
		return cellTaskIndexId;
	}

	public String getContent() {
		return this.content;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public String getIndexName() {
		return this.indexName;
	}

	public int getIntfinish() {
		return this.intfinish;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public int getLimtime() {
		return this.limtime;
	}

	public int getListno() {
		return this.listno;
	}

	public String getMainId() {
		return this.mainId;
	}

	public int getNlevel() {
		return this.nlevel;
	}

	public int getNodeico() {
		return this.nodeico;
	}

	public String getNum() {
		return this.num;
	}

	public int getParentId() {
		return parentId;
	}

	public int getRoleid() {
		return this.roleid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public Date getStarttime() {
		return this.starttime;
	}

	public int getType() {
		return this.type;
	}

	public Double getUseday() {
		return this.useday;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getUsername() {
		return this.username;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setCellTaskIndexId(int cellTaskIndexId) {
		this.cellTaskIndexId = cellTaskIndexId;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void setIntfinish(int intfinish) {
		this.intfinish = intfinish;
	}

	public void setLevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setLimtime(int limtime) {
		this.limtime = limtime;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public void setNlevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setNodeico(int nodeico) {
		this.nodeico = nodeico;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setUseday(Double useday) {
		this.useday = useday;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ProjectTreeAllwbs jsonToObject(JSONObject jsonObject) {
		return ProjectTreeAllwbsJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return ProjectTreeAllwbsJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return ProjectTreeAllwbsJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
