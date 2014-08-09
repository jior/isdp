package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.Filedot;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellCriterionJsonFactory;

@Entity
@Table(name = "cell_criterion")
public class CellCriterion implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * typeint
	 */
	@Column(name = "typeint")
	protected int typeint;

	/**
	 * type
	 */
	@Column(name = "type", length = 100)
	protected String type;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * content
	 */
	@Column(name = "content", length = 1000)
	protected String content;

	/**
	 * unit
	 */
	@Column(name = "unit", length = 50)
	protected String unit;

	/**
	 * alltext
	 */
	@Column(name = "alltext", length = 200)
	protected String alltext;

	/**
	 * chkway
	 */
	@Column(name = "chkway", length = 250)
	protected String chkway;

	/**
	 * scale
	 */
	@Column(name = "scale")
	protected int scale;

	/**
	 * point
	 */
	@Column(name = "point")
	protected Double point;

	/**
	 * usetypeint
	 */
	@Column(name = "usetypeint")
	protected int usetypeint;

	/**
	 * checktype
	 */
	@Column(name = "checktype")
	protected int checktype;

	/**
	 * keytext
	 */
	@Column(name = "keytext", length = 100)
	protected String keytext;

	/**
	 * minallow
	 */
	@Lob
	@Column(name = "minallow")
	protected String minallow;

	/**
	 * minallow_s
	 */
	@Lob
	@Column(name = "minallow_s")
	protected String minallowS;

	/**
	 * maxallow
	 */
	@Lob
	@Column(name = "maxallow")
	protected String maxallow;

	/**
	 * maxallow_s
	 */
	@Lob
	@Column(name = "maxallow_s")
	protected String maxallowS;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * conint
	 */
	@Column(name = "conint")
	protected int conint;

	/**
	 * conmin
	 */
	@Lob
	@Column(name = "conmin")
	protected String conmin;

	/**
	 * conmin_s
	 */
	@Lob
	@Column(name = "conmin_s")
	protected String conminS;

	/**
	 * conmax
	 */
	@Lob
	@Column(name = "conmax")
	protected String conmax;

	/**
	 * conmax_s
	 */
	@Lob
	@Column(name = "conmax_s")
	protected String conmaxS;

	/**
	 * constr
	 */
	@Column(name = "constr", length = 250)
	protected String constr;

	/**
	 * usingstr
	 */
	@Column(name = "usingstr", length = 250)
	protected String usingstr;

	/**
	 * subnum
	 */
	@Column(name = "subnum", length = 50)
	protected String subnum;

	/**
	 * chkvalueint
	 */
	@Column(name = "chkvalueint")
	protected int chkvalueint;

	/**
	 * strposc
	 */
	@Column(name = "strposc", length = 2)
	protected String strposc;

	/**
	 * strposc2
	 */
	@Column(name = "strposc2", length = 2)
	protected String strposc2;

	/**
	 * strpos
	 */
	@Column(name = "strpos", length = 2)
	protected String strpos;

	/**
	 * strpos2
	 */
	@Column(name = "strpos2", length = 2)
	protected String strpos2;

	/**
	 * chkfield
	 */
	@Column(name = "chkfield", length = 100)
	protected String chkfield;

	/**
	 * chkunit
	 */
	@Column(name = "chkunit", length = 50)
	protected String chkunit;

	/**
	 * chkfield_id
	 */
	@Column(name = "chkfield_id", length = 50)
	protected String chkfieldId;

	/**
	 * chkformual
	 */
	@Lob
	@Column(name = "chkformual")
	protected String chkformual;

	/**
	 * chkformualD
	 */
	@Lob
	@Column(name = "chkformualD")
	protected String chkformualD;

	/**
	 * ichecknum
	 */
	@Column(name = "ichecknum")
	protected Double ichecknum;

	/**
	 * Toolsname
	 */
	@Column(name = "toolsname", length = 200)
	protected String toolsname;

	/**
	 * constr1
	 */
	@Column(name = "constr1", length = 250)
	protected String constr1;

	/**
	 * constr2
	 */
	@Column(name = "constr2", length = 250)
	protected String constr2;

	/**
	 * ichecknum_less
	 */
	@Column(name = "ichecknum_less", length = 100)
	protected String ichecknumLess;

	/**
	 * clevel
	 */
	@Column(name = "clevel", length = 50)
	protected String clevel;

	@javax.persistence.Transient
	protected List<Filedot> filedots = new ArrayList<Filedot>();

	public CellCriterion() {

	}

	public String getAlltext() {
		return this.alltext;
	}

	public int getChecktype() {
		return this.checktype;
	}

	public String getChkfield() {
		return this.chkfield;
	}

	public String getChkfieldId() {
		return this.chkfieldId;
	}

	public String getChkformual() {
		return this.chkformual;
	}

	public String getChkformualD() {
		return this.chkformualD;
	}

	public String getChkunit() {
		return this.chkunit;
	}

	public int getChkvalueint() {
		return this.chkvalueint;
	}

	public String getChkway() {
		return this.chkway;
	}

	public String getClevel() {
		return this.clevel;
	}

	public int getConint() {
		return this.conint;
	}

	public String getConmax() {
		return this.conmax;
	}

	public String getConmaxS() {
		return this.conmaxS;
	}

	public String getConmin() {
		return this.conmin;
	}

	public String getConminS() {
		return this.conminS;
	}

	public String getConstr() {
		return this.constr;
	}

	public String getConstr1() {
		return this.constr1;
	}

	public String getConstr2() {
		return this.constr2;
	}

	public String getContent() {
		return this.content;
	}

	public List<Filedot> getFiledots() {
		return filedots;
	}

	public Double getIchecknum() {
		return this.ichecknum;
	}

	public String getIchecknumLess() {
		return this.ichecknumLess;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public String getKeytext() {
		return this.keytext;
	}

	public int getListno() {
		return this.listno;
	}

	public String getMaxallow() {
		return this.maxallow;
	}

	public String getMaxallowS() {
		return this.maxallowS;
	}

	public String getMinallow() {
		return this.minallow;
	}

	public String getMinallowS() {
		return this.minallowS;
	}

	public String getNum() {
		return this.num;
	}

	public Double getPoint() {
		return this.point;
	}

	public int getScale() {
		return this.scale;
	}

	public String getStrpos() {
		return this.strpos;
	}

	public String getStrpos2() {
		return this.strpos2;
	}

	public String getStrposc() {
		return this.strposc;
	}

	public String getStrposc2() {
		return this.strposc2;
	}

	public String getSubnum() {
		return this.subnum;
	}

	public String getToolsname() {
		return this.toolsname;
	}

	public String getType() {
		return this.type;
	}

	public int getTypeint() {
		return this.typeint;
	}

	public String getUnit() {
		return this.unit;
	}

	public int getUsetypeint() {
		return this.usetypeint;
	}

	public String getUsingstr() {
		return this.usingstr;
	}

	public void setAlltext(String alltext) {
		this.alltext = alltext;
	}

	public void setChecktype(int checktype) {
		this.checktype = checktype;
	}

	public void setChkfield(String chkfield) {
		this.chkfield = chkfield;
	}

	public void setChkfieldId(String chkfieldId) {
		this.chkfieldId = chkfieldId;
	}

	public void setChkformual(String chkformual) {
		this.chkformual = chkformual;
	}

	public void setChkformualD(String chkformualD) {
		this.chkformualD = chkformualD;
	}

	public void setChkunit(String chkunit) {
		this.chkunit = chkunit;
	}

	public void setChkvalueint(int chkvalueint) {
		this.chkvalueint = chkvalueint;
	}

	public void setChkway(String chkway) {
		this.chkway = chkway;
	}

	public void setClevel(String clevel) {
		this.clevel = clevel;
	}

	public void setConint(int conint) {
		this.conint = conint;
	}

	public void setConmax(String conmax) {
		this.conmax = conmax;
	}

	public void setConmaxS(String conmaxS) {
		this.conmaxS = conmaxS;
	}

	public void setConmin(String conmin) {
		this.conmin = conmin;
	}

	public void setConminS(String conminS) {
		this.conminS = conminS;
	}

	public void setConstr(String constr) {
		this.constr = constr;
	}

	public void setConstr1(String constr1) {
		this.constr1 = constr1;
	}

	public void setConstr2(String constr2) {
		this.constr2 = constr2;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setFiledots(List<Filedot> filedots) {
		this.filedots = filedots;
	}

	public void setIchecknum(Double ichecknum) {
		this.ichecknum = ichecknum;
	}

	public void setIchecknumLess(String ichecknumLess) {
		this.ichecknumLess = ichecknumLess;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setKeytext(String keytext) {
		this.keytext = keytext;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMaxallow(String maxallow) {
		this.maxallow = maxallow;
	}

	public void setMaxallowS(String maxallowS) {
		this.maxallowS = maxallowS;
	}

	public void setMinallow(String minallow) {
		this.minallow = minallow;
	}

	public void setMinallowS(String minallowS) {
		this.minallowS = minallowS;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public void setStrpos(String strpos) {
		this.strpos = strpos;
	}

	public void setStrpos2(String strpos2) {
		this.strpos2 = strpos2;
	}

	public void setStrposc(String strposc) {
		this.strposc = strposc;
	}

	public void setStrposc2(String strposc2) {
		this.strposc2 = strposc2;
	}

	public void setSubnum(String subnum) {
		this.subnum = subnum;
	}

	public void setToolsname(String toolsname) {
		this.toolsname = toolsname;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTypeint(int typeint) {
		this.typeint = typeint;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setUsetypeint(int usetypeint) {
		this.usetypeint = usetypeint;
	}

	public void setUsingstr(String usingstr) {
		this.usingstr = usingstr;
	}

	public CellCriterion jsonToObject(JSONObject jsonObject) {
		return CellCriterionJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellCriterionJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellCriterionJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
