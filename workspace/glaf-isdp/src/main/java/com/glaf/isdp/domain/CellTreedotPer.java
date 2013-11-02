package com.glaf.isdp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;

/**
 * 系统定义的按钮（默认模板）
 */
@Entity
@Table(name = "cell_treedot_per")
public class CellTreedotPer implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	@Column(name = "parent_id")
	protected int parentId;

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
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	/**
	 * fromid
	 */
	@Column(name = "fromid", length = 50)
	protected String fromid;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * intuserper
	 */
	@Column(name = "intuserper")
	protected int intuserper;

	/**
	 * menu_index
	 */
	@Column(name = "menu_index")
	protected int menuIndex;

	@javax.persistence.Transient
	protected boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public CellTreedotPer() {

	}

	public String getFromid() {
		return this.fromid;
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

	public int getIntuserper() {
		return this.intuserper;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public int getListno() {
		return this.listno;
	}

	public int getMenuIndex() {
		return this.menuIndex;
	}

	public int getNlevel() {
		return this.nlevel;
	}

	public int getNodeico() {
		return this.nodeico;
	}

	public int getParentId() {
		return parentId;
	}

	public void setFromid(String fromid) {
		this.fromid = fromid;
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

	public void setIntuserper(int intuserper) {
		this.intuserper = intuserper;
	}

	public void setLevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMenuIndex(int menuIndex) {
		this.menuIndex = menuIndex;
	}

	public void setNlevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setNodeico(int nodeico) {
		this.nodeico = nodeico;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public CellTreedotPer jsonToObject(JSONObject jsonObject) {
		CellTreedotPer model = new CellTreedotPer();
		model.setId(jsonObject.getString("id"));
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("nlevel")) {
			model.setNlevel(jsonObject.getInteger("nlevel"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("fromid")) {
			model.setFromid(jsonObject.getString("fromid"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("intuserper")) {
			model.setIntuserper(jsonObject.getInteger("intuserper"));
		}
		if (jsonObject.containsKey("menuIndex")) {
			model.setMenuIndex(jsonObject.getInteger("menuIndex"));
		}
		return model;
	}

	public JSONObject toJsonObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", id);
		jsonObject.put("_id_", id);
		jsonObject.put("_oid_", id);
		jsonObject.put("indexId", indexId);
		jsonObject.put("parentId", parentId);
		if (indexName != null) {
			jsonObject.put("indexName", indexName);
		}
		jsonObject.put("nlevel", nlevel);
		jsonObject.put("nodeico", nodeico);
		if (fromid != null) {
			jsonObject.put("fromid", fromid);
		}
		jsonObject.put("listno", listno);
		jsonObject.put("intuserper", intuserper);
		jsonObject.put("menuIndex", menuIndex);
		return jsonObject;
	}

	public ObjectNode toObjectNode() {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", id);
		jsonObject.put("_id_", id);
		jsonObject.put("_oid_", id);
		jsonObject.put("indexId", indexId);
		jsonObject.put("parentId", parentId);
		if (indexName != null) {
			jsonObject.put("indexName", indexName);
		}
		jsonObject.put("nlevel", nlevel);
		jsonObject.put("nodeico", nodeico);
		if (fromid != null) {
			jsonObject.put("fromid", fromid);
		}
		jsonObject.put("listno", listno);
		jsonObject.put("intuserper", intuserper);
		jsonObject.put("menuIndex", menuIndex);
		return jsonObject;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
