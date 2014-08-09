package com.glaf.isdp.domain;

import java.io.*;
import java.util.*;

import javax.persistence.*;

import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.glaf.base.modules.sys.model.ITree;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.ProjectOrganizationJsonFactory;

@Entity
@Table(name = "proj_muiprojlist")
public class ProjectOrganization implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id", length = 50, nullable = false)
	protected int indexId;

	/**
	 * id
	 */
	@Column(name = "id", length = 100)
	protected String id;

	/**
	 * intflag
	 */
	@Column(name = "intflag")
	protected int flag;

	/**
	 * sysId
	 */
	@Column(name = "sys_id", length = 50)
	protected String sysId;

	/**
	 * projname
	 */
	@Column(name = "projname", length = 250)
	protected String projectName;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * content
	 */
	@Column(name = "content", length = 200)
	protected String content;

	/**
	 * dbname
	 */
	@Column(name = "sdbname", length = 100)
	protected String dbname;

	/**
	 * serverName
	 */
	@Column(name = "sServerName", length = 150)
	protected String serverName;

	/**
	 * user
	 */
	@Column(name = "sUser", length = 100)
	protected String user;

	/**
	 * password
	 */
	@Column(name = "sPassword", length = 50)
	protected String password;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * email
	 */
	@Column(name = "email", length = 100)
	protected String email;

	/**
	 * parentId
	 */
	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	/**
	 * intLine
	 */
	@Column(name = "intLine")
	protected int line;

	/**
	 * domainIndex
	 */
	@Column(name = "domain_index")
	protected int domainIndex;

	/**
	 * intLocal
	 */
	@Column(name = "intLocal")
	protected int intLocal;

	/**
	 * emailPsw
	 */
	@Column(name = "email_psw")
	protected String emailPsw;

	/**
	 * intConnected
	 */
	@Column(name = "intConnected")
	protected int connected;

	/**
	 * emailS
	 */
	@Column(name = "email_s", length = 100)
	protected String emailS;

	/**
	 * orgLevel
	 */
	@Column(name = "intorglevel")
	protected int orgLevel;

	/**
	 * sendType
	 */
	@Column(name = "intsendtype")
	protected int sendType;

	/**
	 * emailBackup
	 */
	@Column(name = "email_backup", length = 50)
	protected String emailBackup;

	/**
	 * emailImplement
	 */
	@Column(name = "email_implement", length = 50)
	protected String emailImplement;

	@javax.persistence.Transient
	protected boolean checked;

	public ProjectOrganization() {

	}

	public int getConnected() {
		return this.connected;
	}

	public String getContent() {
		return this.content;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public String getDbname() {
		return this.dbname;
	}

	public int getDomainIndex() {
		return this.domainIndex;
	}

	public String getEmail() {
		return this.email;
	}

	public String getEmailBackup() {
		return emailBackup;
	}

	public String getEmailImplement() {
		return emailImplement;
	}

	public String getEmailPsw() {
		return this.emailPsw;
	}

	public String getEmailS() {
		return this.emailS;
	}

	public int getFlag() {
		return this.flag;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public String getIndexName() {
		return projectName;
	}

	public int getIntLocal() {
		return this.intLocal;
	}

	public int getLevel() {
		return this.orgLevel;
	}

	public int getLine() {
		return this.line;
	}

	public int getListno() {
		return this.listno;
	}

	public int getNodeico() {
		return this.nodeico;
	}

	public String getNum() {
		return this.num;
	}

	public int getOrgLevel() {
		return this.orgLevel;
	}

	public int getParentId() {
		return this.parentId;
	}

	public String getPassword() {
		return this.password;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public int getSendType() {
		return this.sendType;
	}

	public String getServerName() {
		return this.serverName;
	}

	public String getSysId() {
		return this.sysId;
	}

	public String getUser() {
		return this.user;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setConnected(int connected) {
		this.connected = connected;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public void setDomainIndex(int domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmailBackup(String emailBackup) {
		this.emailBackup = emailBackup;
	}

	public void setEmailImplement(String emailImplement) {
		this.emailImplement = emailImplement;
	}

	public void setEmailPsw(String emailPsw) {
		this.emailPsw = emailPsw;
	}

	public void setEmailS(String emailS) {
		this.emailS = emailS;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIndexName(String indexName) {
		this.projectName = indexName;
	}

	public void setIntLocal(int intLocal) {
		this.intLocal = intLocal;
	}

	public void setLevel(int orgLevel) {
		this.orgLevel = orgLevel;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setNodeico(int nodeico) {
		this.nodeico = nodeico;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setOrgLevel(int orgLevel) {
		this.orgLevel = orgLevel;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setSendType(int sendType) {
		this.sendType = sendType;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public ProjectOrganization jsonToObject(JSONObject jsonObject) {
		return ProjectOrganizationJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return ProjectOrganizationJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return ProjectOrganizationJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
