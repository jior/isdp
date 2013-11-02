package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellRepInfo2Query extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String frmtype;
	protected String frmtypeLike;
	protected List<String> frmtypes;
	protected Integer type;
	protected Integer typeGreaterThanOrEqual;
	protected Integer typeLessThanOrEqual;
	protected List<Integer> types;
	protected String contentLike;
	protected String formulaLike;
	protected String filedotFileid;
	protected String filedotFileidLike;
	protected List<String> filedotFileids;

	protected Integer roleId;
	protected Integer roleIdGreaterThanOrEqual;
	protected Integer roleIdLessThanOrEqual;
	protected List<Integer> roleIds;
	protected String tablename;
	protected String tablenameLike;
	protected List<String> tablenames;
	protected String fname;
	protected String fnameLike;
	protected List<String> fnames;
	protected String dname;
	protected String dnameLike;
	protected List<String> dnames;
	protected String issubtable;
	protected String issubtableLike;
	protected List<String> issubtables;
	protected String tablename2;
	protected String tablename2Like;
	protected List<String> tablename2s;
	protected Integer intautoinvalue;
	protected Integer intautoinvalueGreaterThanOrEqual;
	protected Integer intautoinvalueLessThanOrEqual;
	protected List<Integer> intautoinvalues;
	

	public CellRepInfo2Query() {

	}

	public CellRepInfo2Query contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public CellRepInfo2Query dname(String dname) {
		if (dname == null) {
			throw new RuntimeException("dname is null");
		}
		this.dname = dname;
		return this;
	}

	public CellRepInfo2Query dnameLike(String dnameLike) {
		if (dnameLike == null) {
			throw new RuntimeException("dname is null");
		}
		this.dnameLike = dnameLike;
		return this;
	}

	public CellRepInfo2Query dnames(List<String> dnames) {
		if (dnames == null) {
			throw new RuntimeException("dnames is empty ");
		}
		this.dnames = dnames;
		return this;
	}

	public CellRepInfo2Query filedotFileid(String filedotFileid) {
		if (filedotFileid == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileid = filedotFileid;
		return this;
	}

	public CellRepInfo2Query filedotFileidLike(String filedotFileidLike) {
		if (filedotFileidLike == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileidLike = filedotFileidLike;
		return this;
	}

	public CellRepInfo2Query filedotFileids(List<String> filedotFileids) {
		if (filedotFileids == null) {
			throw new RuntimeException("filedotFileids is empty ");
		}
		this.filedotFileids = filedotFileids;
		return this;
	}

	public CellRepInfo2Query fname(String fname) {
		if (fname == null) {
			throw new RuntimeException("fname is null");
		}
		this.fname = fname;
		return this;
	}

	public CellRepInfo2Query fnameLike(String fnameLike) {
		if (fnameLike == null) {
			throw new RuntimeException("fname is null");
		}
		this.fnameLike = fnameLike;
		return this;
	}

	public CellRepInfo2Query fnames(List<String> fnames) {
		if (fnames == null) {
			throw new RuntimeException("fnames is empty ");
		}
		this.fnames = fnames;
		return this;
	}

	public CellRepInfo2Query formulaLike(String formulaLike) {
		if (formulaLike == null) {
			throw new RuntimeException("formula is null");
		}
		this.formulaLike = formulaLike;
		return this;
	}

	public CellRepInfo2Query frmtype(String frmtype) {
		if (frmtype == null) {
			throw new RuntimeException("frmtype is null");
		}
		this.frmtype = frmtype;
		return this;
	}

	public CellRepInfo2Query frmtypeLike(String frmtypeLike) {
		if (frmtypeLike == null) {
			throw new RuntimeException("frmtype is null");
		}
		this.frmtypeLike = frmtypeLike;
		return this;
	}

	public CellRepInfo2Query frmtypes(List<String> frmtypes) {
		if (frmtypes == null) {
			throw new RuntimeException("frmtypes is empty ");
		}
		this.frmtypes = frmtypes;
		return this;
	}

	public String getContentLike() {
		if (contentLike != null && contentLike.trim().length() > 0) {
			if (!contentLike.startsWith("%")) {
				contentLike = "%" + contentLike;
			}
			if (!contentLike.endsWith("%")) {
				contentLike = contentLike + "%";
			}
		}
		return contentLike;
	}

	public String getDname() {
		return dname;
	}

	public String getDnameLike() {
		if (dnameLike != null && dnameLike.trim().length() > 0) {
			if (!dnameLike.startsWith("%")) {
				dnameLike = "%" + dnameLike;
			}
			if (!dnameLike.endsWith("%")) {
				dnameLike = dnameLike + "%";
			}
		}
		return dnameLike;
	}

	public List<String> getDnames() {
		return dnames;
	}

	public String getFiledotFileid() {
		return filedotFileid;
	}

	public String getFiledotFileidLike() {
		if (filedotFileidLike != null && filedotFileidLike.trim().length() > 0) {
			if (!filedotFileidLike.startsWith("%")) {
				filedotFileidLike = "%" + filedotFileidLike;
			}
			if (!filedotFileidLike.endsWith("%")) {
				filedotFileidLike = filedotFileidLike + "%";
			}
		}
		return filedotFileidLike;
	}

	public List<String> getFiledotFileids() {
		return filedotFileids;
	}

	public String getFname() {
		return fname;
	}

	public String getFnameLike() {
		if (fnameLike != null && fnameLike.trim().length() > 0) {
			if (!fnameLike.startsWith("%")) {
				fnameLike = "%" + fnameLike;
			}
			if (!fnameLike.endsWith("%")) {
				fnameLike = fnameLike + "%";
			}
		}
		return fnameLike;
	}

	public List<String> getFnames() {
		return fnames;
	}

	public String getFormulaLike() {
		if (formulaLike != null && formulaLike.trim().length() > 0) {
			if (!formulaLike.startsWith("%")) {
				formulaLike = "%" + formulaLike;
			}
			if (!formulaLike.endsWith("%")) {
				formulaLike = formulaLike + "%";
			}
		}
		return formulaLike;
	}

	public String getFrmtype() {
		return frmtype;
	}

	public String getFrmtypeLike() {
		if (frmtypeLike != null && frmtypeLike.trim().length() > 0) {
			if (!frmtypeLike.startsWith("%")) {
				frmtypeLike = "%" + frmtypeLike;
			}
			if (!frmtypeLike.endsWith("%")) {
				frmtypeLike = frmtypeLike + "%";
			}
		}
		return frmtypeLike;
	}

	public List<String> getFrmtypes() {
		return frmtypes;
	}

	public Integer getIntautoinvalue() {
		return intautoinvalue;
	}

	public Integer getIntautoinvalueGreaterThanOrEqual() {
		return intautoinvalueGreaterThanOrEqual;
	}

	public Integer getIntautoinvalueLessThanOrEqual() {
		return intautoinvalueLessThanOrEqual;
	}

	public List<Integer> getIntautoinvalues() {
		return intautoinvalues;
	}

	public String getIssubtable() {
		return issubtable;
	}

	public String getIssubtableLike() {
		if (issubtableLike != null && issubtableLike.trim().length() > 0) {
			if (!issubtableLike.startsWith("%")) {
				issubtableLike = "%" + issubtableLike;
			}
			if (!issubtableLike.endsWith("%")) {
				issubtableLike = issubtableLike + "%";
			}
		}
		return issubtableLike;
	}

	public List<String> getIssubtables() {
		return issubtables;
	}

	public String getOrderBy() {
		if (sortField != null) {
			String a_x = " asc ";
			if (getSortOrder()!= null) {
				a_x = " desc ";
			}

			if (columns.get(sortField) != null) {
				orderBy = " E." + columns.get(sortField) + a_x;
			}
		}
		return orderBy;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public Integer getRoleIdGreaterThanOrEqual() {
		return roleIdGreaterThanOrEqual;
	}

	public Integer getRoleIdLessThanOrEqual() {
		return roleIdLessThanOrEqual;
	}

	public List<Integer> getRoleIds() {
		return roleIds;
	}

	public String getTablename() {
		return tablename;
	}

	public String getTablename2() {
		return tablename2;
	}

	public String getTablename2Like() {
		if (tablename2Like != null && tablename2Like.trim().length() > 0) {
			if (!tablename2Like.startsWith("%")) {
				tablename2Like = "%" + tablename2Like;
			}
			if (!tablename2Like.endsWith("%")) {
				tablename2Like = tablename2Like + "%";
			}
		}
		return tablename2Like;
	}

	public List<String> getTablename2s() {
		return tablename2s;
	}

	public String getTablenameLike() {
		if (tablenameLike != null && tablenameLike.trim().length() > 0) {
			if (!tablenameLike.startsWith("%")) {
				tablenameLike = "%" + tablenameLike;
			}
			if (!tablenameLike.endsWith("%")) {
				tablenameLike = tablenameLike + "%";
			}
		}
		return tablenameLike;
	}

	public List<String> getTablenames() {
		return tablenames;
	}

	public Integer getType() {
		return type;
	}

	public Integer getTypeGreaterThanOrEqual() {
		return typeGreaterThanOrEqual;
	}

	public Integer getTypeLessThanOrEqual() {
		return typeLessThanOrEqual;
	}

	public List<Integer> getTypes() {
		return types;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("frmtype", "frmtype");
		addColumn("type", "type");
		addColumn("content", "content");
		addColumn("formula", "formula");
		addColumn("ostTablename", "ost_tablename");
		addColumn("ostRow", "ost_row");
		addColumn("ostCol", "ost_col");
		addColumn("ostRowend", "ost_rowend");
		addColumn("ostColend", "ost_colend");
		addColumn("ostCellid", "ost_cellid");
		addColumn("filedotFileid", "filedot_fileid");
		addColumn("ostColor", "ost_color");
		addColumn("ostWay", "ost_way");
		addColumn("roleId", "role_id");
		addColumn("tablename", "tablename");
		addColumn("fname", "fname");
		addColumn("dname", "dname");
		addColumn("issubtable", "issubtable");
		addColumn("tablename2", "tablename2");
		addColumn("intautoinvalue", "intautoinvalue");
	}

	public CellRepInfo2Query intautoinvalue(Integer intautoinvalue) {
		if (intautoinvalue == null) {
			throw new RuntimeException("intautoinvalue is null");
		}
		this.intautoinvalue = intautoinvalue;
		return this;
	}

	public CellRepInfo2Query intautoinvalueGreaterThanOrEqual(
			Integer intautoinvalueGreaterThanOrEqual) {
		if (intautoinvalueGreaterThanOrEqual == null) {
			throw new RuntimeException("intautoinvalue is null");
		}
		this.intautoinvalueGreaterThanOrEqual = intautoinvalueGreaterThanOrEqual;
		return this;
	}

	public CellRepInfo2Query intautoinvalueLessThanOrEqual(
			Integer intautoinvalueLessThanOrEqual) {
		if (intautoinvalueLessThanOrEqual == null) {
			throw new RuntimeException("intautoinvalue is null");
		}
		this.intautoinvalueLessThanOrEqual = intautoinvalueLessThanOrEqual;
		return this;
	}

	public CellRepInfo2Query intautoinvalues(List<Integer> intautoinvalues) {
		if (intautoinvalues == null) {
			throw new RuntimeException("intautoinvalues is empty ");
		}
		this.intautoinvalues = intautoinvalues;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellRepInfo2Query issubtable(String issubtable) {
		if (issubtable == null) {
			throw new RuntimeException("issubtable is null");
		}
		this.issubtable = issubtable;
		return this;
	}

	public CellRepInfo2Query issubtableLike(String issubtableLike) {
		if (issubtableLike == null) {
			throw new RuntimeException("issubtable is null");
		}
		this.issubtableLike = issubtableLike;
		return this;
	}

	public CellRepInfo2Query issubtables(List<String> issubtables) {
		if (issubtables == null) {
			throw new RuntimeException("issubtables is empty ");
		}
		this.issubtables = issubtables;
		return this;
	}

	public CellRepInfo2Query roleId(Integer roleId) {
		if (roleId == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleId = roleId;
		return this;
	}

	public CellRepInfo2Query roleIdGreaterThanOrEqual(
			Integer roleIdGreaterThanOrEqual) {
		if (roleIdGreaterThanOrEqual == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleIdGreaterThanOrEqual = roleIdGreaterThanOrEqual;
		return this;
	}

	public CellRepInfo2Query roleIdLessThanOrEqual(Integer roleIdLessThanOrEqual) {
		if (roleIdLessThanOrEqual == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleIdLessThanOrEqual = roleIdLessThanOrEqual;
		return this;
	}

	public CellRepInfo2Query roleIds(List<Integer> roleIds) {
		if (roleIds == null) {
			throw new RuntimeException("roleIds is empty ");
		}
		this.roleIds = roleIds;
		return this;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setDnameLike(String dnameLike) {
		this.dnameLike = dnameLike;
	}

	public void setDnames(List<String> dnames) {
		this.dnames = dnames;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFiledotFileidLike(String filedotFileidLike) {
		this.filedotFileidLike = filedotFileidLike;
	}

	public void setFiledotFileids(List<String> filedotFileids) {
		this.filedotFileids = filedotFileids;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setFnameLike(String fnameLike) {
		this.fnameLike = fnameLike;
	}

	public void setFnames(List<String> fnames) {
		this.fnames = fnames;
	}

	public void setFormulaLike(String formulaLike) {
		this.formulaLike = formulaLike;
	}

	public void setFrmtype(String frmtype) {
		this.frmtype = frmtype;
	}

	public void setFrmtypeLike(String frmtypeLike) {
		this.frmtypeLike = frmtypeLike;
	}

	public void setFrmtypes(List<String> frmtypes) {
		this.frmtypes = frmtypes;
	}

	public void setIntautoinvalue(Integer intautoinvalue) {
		this.intautoinvalue = intautoinvalue;
	}

	public void setIntautoinvalueGreaterThanOrEqual(
			Integer intautoinvalueGreaterThanOrEqual) {
		this.intautoinvalueGreaterThanOrEqual = intautoinvalueGreaterThanOrEqual;
	}

	public void setIntautoinvalueLessThanOrEqual(
			Integer intautoinvalueLessThanOrEqual) {
		this.intautoinvalueLessThanOrEqual = intautoinvalueLessThanOrEqual;
	}

	public void setIntautoinvalues(List<Integer> intautoinvalues) {
		this.intautoinvalues = intautoinvalues;
	}

	public void setIssubtable(String issubtable) {
		this.issubtable = issubtable;
	}

	public void setIssubtableLike(String issubtableLike) {
		this.issubtableLike = issubtableLike;
	}

	public void setIssubtables(List<String> issubtables) {
		this.issubtables = issubtables;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public void setRoleIdGreaterThanOrEqual(Integer roleIdGreaterThanOrEqual) {
		this.roleIdGreaterThanOrEqual = roleIdGreaterThanOrEqual;
	}

	public void setRoleIdLessThanOrEqual(Integer roleIdLessThanOrEqual) {
		this.roleIdLessThanOrEqual = roleIdLessThanOrEqual;
	}

	public void setRoleIds(List<Integer> roleIds) {
		this.roleIds = roleIds;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setTablename2(String tablename2) {
		this.tablename2 = tablename2;
	}

	public void setTablename2Like(String tablename2Like) {
		this.tablename2Like = tablename2Like;
	}

	public void setTablename2s(List<String> tablename2s) {
		this.tablename2s = tablename2s;
	}

	public void setTablenameLike(String tablenameLike) {
		this.tablenameLike = tablenameLike;
	}

	public void setTablenames(List<String> tablenames) {
		this.tablenames = tablenames;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void setTypeGreaterThanOrEqual(Integer typeGreaterThanOrEqual) {
		this.typeGreaterThanOrEqual = typeGreaterThanOrEqual;
	}

	public void setTypeLessThanOrEqual(Integer typeLessThanOrEqual) {
		this.typeLessThanOrEqual = typeLessThanOrEqual;
	}

	public void setTypes(List<Integer> types) {
		this.types = types;
	}

	public CellRepInfo2Query tablename(String tablename) {
		if (tablename == null) {
			throw new RuntimeException("tablename is null");
		}
		this.tablename = tablename;
		return this;
	}

	public CellRepInfo2Query tablename2(String tablename2) {
		if (tablename2 == null) {
			throw new RuntimeException("tablename2 is null");
		}
		this.tablename2 = tablename2;
		return this;
	}

	public CellRepInfo2Query tablename2Like(String tablename2Like) {
		if (tablename2Like == null) {
			throw new RuntimeException("tablename2 is null");
		}
		this.tablename2Like = tablename2Like;
		return this;
	}

	public CellRepInfo2Query tablename2s(List<String> tablename2s) {
		if (tablename2s == null) {
			throw new RuntimeException("tablename2s is empty ");
		}
		this.tablename2s = tablename2s;
		return this;
	}

	public CellRepInfo2Query tablenameLike(String tablenameLike) {
		if (tablenameLike == null) {
			throw new RuntimeException("tablename is null");
		}
		this.tablenameLike = tablenameLike;
		return this;
	}

	public CellRepInfo2Query tablenames(List<String> tablenames) {
		if (tablenames == null) {
			throw new RuntimeException("tablenames is empty ");
		}
		this.tablenames = tablenames;
		return this;
	}

	public CellRepInfo2Query type(Integer type) {
		if (type == null) {
			throw new RuntimeException("type is null");
		}
		this.type = type;
		return this;
	}

	public CellRepInfo2Query typeGreaterThanOrEqual(
			Integer typeGreaterThanOrEqual) {
		if (typeGreaterThanOrEqual == null) {
			throw new RuntimeException("type is null");
		}
		this.typeGreaterThanOrEqual = typeGreaterThanOrEqual;
		return this;
	}

	public CellRepInfo2Query typeLessThanOrEqual(Integer typeLessThanOrEqual) {
		if (typeLessThanOrEqual == null) {
			throw new RuntimeException("type is null");
		}
		this.typeLessThanOrEqual = typeLessThanOrEqual;
		return this;
	}

	public CellRepInfo2Query types(List<Integer> types) {
		if (types == null) {
			throw new RuntimeException("types is empty ");
		}
		this.types = types;
		return this;
	}

}