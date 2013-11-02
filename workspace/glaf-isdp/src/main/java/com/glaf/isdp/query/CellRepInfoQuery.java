package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellRepInfoQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String indexId;
	protected String indexIdLike;
	protected List<String> indexIds;
	protected String frmtype;
	protected String frmtypeLike;
	protected List<String> frmtypes;
	protected String issystem;
	protected String issystemLike;
	protected List<String> issystems;
	protected String fname;
	protected String fnameLike;
	protected List<String> fnames;
	protected String dname;
	protected String dnameLike;
	protected List<String> dnames;
	protected String dtype;
	protected String dtypeLike;
	protected List<String> dtypes;
	protected String showtype;
	protected String showtypeLike;
	protected List<String> showtypes;
	protected Integer strlen;
	protected Integer strlenGreaterThanOrEqual;
	protected Integer strlenLessThanOrEqual;
	protected List<Integer> strlens;
	protected String form;
	protected String formLike;
	protected List<String> forms;
	protected String intype;
	protected String intypeLike;
	protected List<String> intypes;
	protected String hintID;
	protected String hintIDLike;
	protected List<String> hintIDs;
	protected String ztype;
	protected String ztypeLike;
	protected List<String> ztypes;
	protected String ismustfill;
	protected String ismustfillLike;
	protected List<String> ismustfills;
	protected String isListShow;
	protected String isListShowLike;
	protected List<String> isListShows;
	protected String panid;
	protected String panidLike;
	protected List<String> panids;
	protected String isallwidth;
	protected String istname;
	protected List<String> istnames;
	protected String filedotFileid;
	protected String filedotFileidLike;
	protected List<String> filedotFileids;
	protected Integer datapoint;
	protected Integer datapointGreaterThanOrEqual;
	protected Integer datapointLessThanOrEqual;
	protected List<Integer> datapoints;
	protected String issubtable;
	protected String isdataonly;
	protected String isdataonlyLike;
	protected List<String> isdataonlys;
	protected Integer checktype;
	protected Integer checktypeGreaterThanOrEqual;
	protected Integer checktypeLessThanOrEqual;
	protected List<Integer> checktypes;
	protected String orderid;
	protected String orderidLike;
	protected List<String> orderids;
	protected Integer celltype;
	protected Integer celltypeGreaterThanOrEqual;
	protected Integer celltypeLessThanOrEqual;
	protected List<Integer> celltypes;
	protected String hintlist;
	protected String hintlistLike;
	protected List<String> hintlists;
	protected String olddname;
	protected String olddnameLike;
	protected List<String> olddnames;
	protected String dataTablename;
	protected String dataTablenameLike;
	protected List<String> dataTablenames;
	protected String dataFieldname;
	protected String dataFieldnameLike;
	protected List<String> dataFieldnames;
	protected Integer orderCon;
	protected Integer orderConGreaterThanOrEqual;
	protected Integer orderConLessThanOrEqual;
	protected List<Integer> orderCons;
	protected Integer connum;
	protected Integer connumGreaterThanOrEqual;
	protected Integer connumLessThanOrEqual;
	protected List<Integer> connums;
	protected Integer nodeIndex;
	protected Integer nodeIndexGreaterThanOrEqual;
	protected Integer nodeIndexLessThanOrEqual;
	protected List<Integer> nodeIndexs;
	protected String typeId;
	protected String typeIdLike;
	protected List<String> typeIds;
	protected String userindex;
	protected String userindexLike;
	protected List<String> userindexs;
	protected Integer orderIndex;
	protected Integer orderIndexGreaterThanOrEqual;
	protected Integer orderIndexLessThanOrEqual;
	protected List<Integer> orderIndexs;
	protected String parentDname;
	protected String parentDnameLike;
	protected List<String> parentDnames;
	protected Integer sysauto;
	protected Integer sysautoGreaterThanOrEqual;
	protected Integer sysautoLessThanOrEqual;
	protected List<Integer> sysautos;
	protected Integer orderIndexF;
	protected Integer orderIndexFGreaterThanOrEqual;
	protected Integer orderIndexFLessThanOrEqual;
	protected List<Integer> orderIndexFs;
	protected String orderidF;
	protected String orderidFLike;
	protected List<String> orderidFs;
	protected Integer orderConF;
	protected Integer orderConFGreaterThanOrEqual;
	protected Integer orderConFLessThanOrEqual;
	protected List<Integer> orderConFs;
	protected Integer isprintvalue;
	protected Integer isprintvalueGreaterThanOrEqual;
	protected Integer isprintvalueLessThanOrEqual;
	protected List<Integer> isprintvalues;
	

	public CellRepInfoQuery() {

	}

	public CellRepInfoQuery celltype(Integer celltype) {
		if (celltype == null) {
			throw new RuntimeException("celltype is null");
		}
		this.celltype = celltype;
		return this;
	}

	public CellRepInfoQuery celltypeGreaterThanOrEqual(
			Integer celltypeGreaterThanOrEqual) {
		if (celltypeGreaterThanOrEqual == null) {
			throw new RuntimeException("celltype is null");
		}
		this.celltypeGreaterThanOrEqual = celltypeGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery celltypeLessThanOrEqual(
			Integer celltypeLessThanOrEqual) {
		if (celltypeLessThanOrEqual == null) {
			throw new RuntimeException("celltype is null");
		}
		this.celltypeLessThanOrEqual = celltypeLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery celltypes(List<Integer> celltypes) {
		if (celltypes == null) {
			throw new RuntimeException("celltypes is empty ");
		}
		this.celltypes = celltypes;
		return this;
	}

	public CellRepInfoQuery checktype(Integer checktype) {
		if (checktype == null) {
			throw new RuntimeException("checktype is null");
		}
		this.checktype = checktype;
		return this;
	}

	public CellRepInfoQuery checktypeGreaterThanOrEqual(
			Integer checktypeGreaterThanOrEqual) {
		if (checktypeGreaterThanOrEqual == null) {
			throw new RuntimeException("checktype is null");
		}
		this.checktypeGreaterThanOrEqual = checktypeGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery checktypeLessThanOrEqual(
			Integer checktypeLessThanOrEqual) {
		if (checktypeLessThanOrEqual == null) {
			throw new RuntimeException("checktype is null");
		}
		this.checktypeLessThanOrEqual = checktypeLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery checktypes(List<Integer> checktypes) {
		if (checktypes == null) {
			throw new RuntimeException("checktypes is empty ");
		}
		this.checktypes = checktypes;
		return this;
	}

	public CellRepInfoQuery connum(Integer connum) {
		if (connum == null) {
			throw new RuntimeException("connum is null");
		}
		this.connum = connum;
		return this;
	}

	public CellRepInfoQuery connumGreaterThanOrEqual(
			Integer connumGreaterThanOrEqual) {
		if (connumGreaterThanOrEqual == null) {
			throw new RuntimeException("connum is null");
		}
		this.connumGreaterThanOrEqual = connumGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery connumLessThanOrEqual(Integer connumLessThanOrEqual) {
		if (connumLessThanOrEqual == null) {
			throw new RuntimeException("connum is null");
		}
		this.connumLessThanOrEqual = connumLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery connums(List<Integer> connums) {
		if (connums == null) {
			throw new RuntimeException("connums is empty ");
		}
		this.connums = connums;
		return this;
	}

	public CellRepInfoQuery dataFieldname(String dataFieldname) {
		if (dataFieldname == null) {
			throw new RuntimeException("dataFieldname is null");
		}
		this.dataFieldname = dataFieldname;
		return this;
	}

	public CellRepInfoQuery dataFieldnameLike(String dataFieldnameLike) {
		if (dataFieldnameLike == null) {
			throw new RuntimeException("dataFieldname is null");
		}
		this.dataFieldnameLike = dataFieldnameLike;
		return this;
	}

	public CellRepInfoQuery dataFieldnames(List<String> dataFieldnames) {
		if (dataFieldnames == null) {
			throw new RuntimeException("dataFieldnames is empty ");
		}
		this.dataFieldnames = dataFieldnames;
		return this;
	}

	public CellRepInfoQuery datapoint(Integer datapoint) {
		if (datapoint == null) {
			throw new RuntimeException("datapoint is null");
		}
		this.datapoint = datapoint;
		return this;
	}

	public CellRepInfoQuery datapointGreaterThanOrEqual(
			Integer datapointGreaterThanOrEqual) {
		if (datapointGreaterThanOrEqual == null) {
			throw new RuntimeException("datapoint is null");
		}
		this.datapointGreaterThanOrEqual = datapointGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery datapointLessThanOrEqual(
			Integer datapointLessThanOrEqual) {
		if (datapointLessThanOrEqual == null) {
			throw new RuntimeException("datapoint is null");
		}
		this.datapointLessThanOrEqual = datapointLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery datapoints(List<Integer> datapoints) {
		if (datapoints == null) {
			throw new RuntimeException("datapoints is empty ");
		}
		this.datapoints = datapoints;
		return this;
	}

	public CellRepInfoQuery dataTablename(String dataTablename) {
		if (dataTablename == null) {
			throw new RuntimeException("dataTablename is null");
		}
		this.dataTablename = dataTablename;
		return this;
	}

	public CellRepInfoQuery dataTablenameLike(String dataTablenameLike) {
		if (dataTablenameLike == null) {
			throw new RuntimeException("dataTablename is null");
		}
		this.dataTablenameLike = dataTablenameLike;
		return this;
	}

	public CellRepInfoQuery dataTablenames(List<String> dataTablenames) {
		if (dataTablenames == null) {
			throw new RuntimeException("dataTablenames is empty ");
		}
		this.dataTablenames = dataTablenames;
		return this;
	}

	public CellRepInfoQuery dname(String dname) {
		if (dname == null) {
			throw new RuntimeException("dname is null");
		}
		this.dname = dname;
		return this;
	}

	public CellRepInfoQuery dnameLike(String dnameLike) {
		if (dnameLike == null) {
			throw new RuntimeException("dname is null");
		}
		this.dnameLike = dnameLike;
		return this;
	}

	public CellRepInfoQuery dnames(List<String> dnames) {
		if (dnames == null) {
			throw new RuntimeException("dnames is empty ");
		}
		this.dnames = dnames;
		return this;
	}

	public CellRepInfoQuery dtype(String dtype) {
		if (dtype == null) {
			throw new RuntimeException("dtype is null");
		}
		this.dtype = dtype;
		return this;
	}

	public CellRepInfoQuery dtypeLike(String dtypeLike) {
		if (dtypeLike == null) {
			throw new RuntimeException("dtype is null");
		}
		this.dtypeLike = dtypeLike;
		return this;
	}

	public CellRepInfoQuery dtypes(List<String> dtypes) {
		if (dtypes == null) {
			throw new RuntimeException("dtypes is empty ");
		}
		this.dtypes = dtypes;
		return this;
	}

	public CellRepInfoQuery filedotFileid(String filedotFileid) {
		if (filedotFileid == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileid = filedotFileid;
		return this;
	}

	public CellRepInfoQuery filedotFileidLike(String filedotFileidLike) {
		if (filedotFileidLike == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileidLike = filedotFileidLike;
		return this;
	}

	public CellRepInfoQuery filedotFileids(List<String> filedotFileids) {
		if (filedotFileids == null) {
			throw new RuntimeException("filedotFileids is empty ");
		}
		this.filedotFileids = filedotFileids;
		return this;
	}

	public CellRepInfoQuery fname(String fname) {
		if (fname == null) {
			throw new RuntimeException("fname is null");
		}
		this.fname = fname;
		return this;
	}

	public CellRepInfoQuery fnameLike(String fnameLike) {
		if (fnameLike == null) {
			throw new RuntimeException("fname is null");
		}
		this.fnameLike = fnameLike;
		return this;
	}

	public CellRepInfoQuery fnames(List<String> fnames) {
		if (fnames == null) {
			throw new RuntimeException("fnames is empty ");
		}
		this.fnames = fnames;
		return this;
	}

	public CellRepInfoQuery form(String form) {
		if (form == null) {
			throw new RuntimeException("form is null");
		}
		this.form = form;
		return this;
	}

	public CellRepInfoQuery formLike(String formLike) {
		if (formLike == null) {
			throw new RuntimeException("form is null");
		}
		this.formLike = formLike;
		return this;
	}

	public CellRepInfoQuery forms(List<String> forms) {
		if (forms == null) {
			throw new RuntimeException("forms is empty ");
		}
		this.forms = forms;
		return this;
	}

	public CellRepInfoQuery frmtype(String frmtype) {
		if (frmtype == null) {
			throw new RuntimeException("frmtype is null");
		}
		this.frmtype = frmtype;
		return this;
	}

	public CellRepInfoQuery frmtypeLike(String frmtypeLike) {
		if (frmtypeLike == null) {
			throw new RuntimeException("frmtype is null");
		}
		this.frmtypeLike = frmtypeLike;
		return this;
	}

	public CellRepInfoQuery frmtypes(List<String> frmtypes) {
		if (frmtypes == null) {
			throw new RuntimeException("frmtypes is empty ");
		}
		this.frmtypes = frmtypes;
		return this;
	}

	public Integer getCelltype() {
		return celltype;
	}

	public Integer getCelltypeGreaterThanOrEqual() {
		return celltypeGreaterThanOrEqual;
	}

	public Integer getCelltypeLessThanOrEqual() {
		return celltypeLessThanOrEqual;
	}

	public List<Integer> getCelltypes() {
		return celltypes;
	}

	public Integer getChecktype() {
		return checktype;
	}

	public Integer getChecktypeGreaterThanOrEqual() {
		return checktypeGreaterThanOrEqual;
	}

	public Integer getChecktypeLessThanOrEqual() {
		return checktypeLessThanOrEqual;
	}

	public List<Integer> getChecktypes() {
		return checktypes;
	}

	public Integer getConnum() {
		return connum;
	}

	public Integer getConnumGreaterThanOrEqual() {
		return connumGreaterThanOrEqual;
	}

	public Integer getConnumLessThanOrEqual() {
		return connumLessThanOrEqual;
	}

	public List<Integer> getConnums() {
		return connums;
	}

	public String getDataFieldname() {
		return dataFieldname;
	}

	public String getDataFieldnameLike() {
		if (dataFieldnameLike != null && dataFieldnameLike.trim().length() > 0) {
			if (!dataFieldnameLike.startsWith("%")) {
				dataFieldnameLike = "%" + dataFieldnameLike;
			}
			if (!dataFieldnameLike.endsWith("%")) {
				dataFieldnameLike = dataFieldnameLike + "%";
			}
		}
		return dataFieldnameLike;
	}

	public List<String> getDataFieldnames() {
		return dataFieldnames;
	}

	public Integer getDatapoint() {
		return datapoint;
	}

	public Integer getDatapointGreaterThanOrEqual() {
		return datapointGreaterThanOrEqual;
	}

	public Integer getDatapointLessThanOrEqual() {
		return datapointLessThanOrEqual;
	}

	public List<Integer> getDatapoints() {
		return datapoints;
	}

	public String getDataTablename() {
		return dataTablename;
	}

	public String getDataTablenameLike() {
		if (dataTablenameLike != null && dataTablenameLike.trim().length() > 0) {
			if (!dataTablenameLike.startsWith("%")) {
				dataTablenameLike = "%" + dataTablenameLike;
			}
			if (!dataTablenameLike.endsWith("%")) {
				dataTablenameLike = dataTablenameLike + "%";
			}
		}
		return dataTablenameLike;
	}

	public List<String> getDataTablenames() {
		return dataTablenames;
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

	public String getDtype() {
		return dtype;
	}

	public String getDtypeLike() {
		if (dtypeLike != null && dtypeLike.trim().length() > 0) {
			if (!dtypeLike.startsWith("%")) {
				dtypeLike = "%" + dtypeLike;
			}
			if (!dtypeLike.endsWith("%")) {
				dtypeLike = dtypeLike + "%";
			}
		}
		return dtypeLike;
	}

	public List<String> getDtypes() {
		return dtypes;
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

	public String getForm() {
		return form;
	}

	public String getFormLike() {
		if (formLike != null && formLike.trim().length() > 0) {
			if (!formLike.startsWith("%")) {
				formLike = "%" + formLike;
			}
			if (!formLike.endsWith("%")) {
				formLike = formLike + "%";
			}
		}
		return formLike;
	}

	public List<String> getForms() {
		return forms;
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

	public String getHintID() {
		return hintID;
	}

	public String getHintIDLike() {
		if (hintIDLike != null && hintIDLike.trim().length() > 0) {
			if (!hintIDLike.startsWith("%")) {
				hintIDLike = "%" + hintIDLike;
			}
			if (!hintIDLike.endsWith("%")) {
				hintIDLike = hintIDLike + "%";
			}
		}
		return hintIDLike;
	}

	public List<String> getHintIDs() {
		return hintIDs;
	}

	public String getHintlist() {
		return hintlist;
	}

	public String getHintlistLike() {
		if (hintlistLike != null && hintlistLike.trim().length() > 0) {
			if (!hintlistLike.startsWith("%")) {
				hintlistLike = "%" + hintlistLike;
			}
			if (!hintlistLike.endsWith("%")) {
				hintlistLike = hintlistLike + "%";
			}
		}
		return hintlistLike;
	}

	public List<String> getHintlists() {
		return hintlists;
	}

	public String getIndexId() {
		return indexId;
	}

	public String getIndexIdLike() {
		if (indexIdLike != null && indexIdLike.trim().length() > 0) {
			if (!indexIdLike.startsWith("%")) {
				indexIdLike = "%" + indexIdLike;
			}
			if (!indexIdLike.endsWith("%")) {
				indexIdLike = indexIdLike + "%";
			}
		}
		return indexIdLike;
	}

	public List<String> getIndexIds() {
		return indexIds;
	}

	public String getIntype() {
		return intype;
	}

	public String getIntypeLike() {
		if (intypeLike != null && intypeLike.trim().length() > 0) {
			if (!intypeLike.startsWith("%")) {
				intypeLike = "%" + intypeLike;
			}
			if (!intypeLike.endsWith("%")) {
				intypeLike = intypeLike + "%";
			}
		}
		return intypeLike;
	}

	public List<String> getIntypes() {
		return intypes;
	}

	public String getIsallwidth() {
		return isallwidth;
	}

	public String getIsdataonly() {
		return isdataonly;
	}

	public String getIsdataonlyLike() {
		if (isdataonlyLike != null && isdataonlyLike.trim().length() > 0) {
			if (!isdataonlyLike.startsWith("%")) {
				isdataonlyLike = "%" + isdataonlyLike;
			}
			if (!isdataonlyLike.endsWith("%")) {
				isdataonlyLike = isdataonlyLike + "%";
			}
		}
		return isdataonlyLike;
	}

	public List<String> getIsdataonlys() {
		return isdataonlys;
	}

	public String getIsListShow() {
		return isListShow;
	}

	public String getIsListShowLike() {
		if (isListShowLike != null && isListShowLike.trim().length() > 0) {
			if (!isListShowLike.startsWith("%")) {
				isListShowLike = "%" + isListShowLike;
			}
			if (!isListShowLike.endsWith("%")) {
				isListShowLike = isListShowLike + "%";
			}
		}
		return isListShowLike;
	}

	public List<String> getIsListShows() {
		return isListShows;
	}

	public String getIsmustfill() {
		return ismustfill;
	}

	public String getIsmustfillLike() {
		if (ismustfillLike != null && ismustfillLike.trim().length() > 0) {
			if (!ismustfillLike.startsWith("%")) {
				ismustfillLike = "%" + ismustfillLike;
			}
			if (!ismustfillLike.endsWith("%")) {
				ismustfillLike = ismustfillLike + "%";
			}
		}
		return ismustfillLike;
	}

	public List<String> getIsmustfills() {
		return ismustfills;
	}

	public Integer getIsprintvalue() {
		return isprintvalue;
	}

	public Integer getIsprintvalueGreaterThanOrEqual() {
		return isprintvalueGreaterThanOrEqual;
	}

	public Integer getIsprintvalueLessThanOrEqual() {
		return isprintvalueLessThanOrEqual;
	}

	public List<Integer> getIsprintvalues() {
		return isprintvalues;
	}

	public String getIssubtable() {
		return issubtable;
	}

	public String getIssystem() {
		return issystem;
	}

	public String getIssystemLike() {
		if (issystemLike != null && issystemLike.trim().length() > 0) {
			if (!issystemLike.startsWith("%")) {
				issystemLike = "%" + issystemLike;
			}
			if (!issystemLike.endsWith("%")) {
				issystemLike = issystemLike + "%";
			}
		}
		return issystemLike;
	}

	public List<String> getIssystems() {
		return issystems;
	}

	public String getIstname() {
		return istname;
	}

	public List<String> getIstnames() {
		return istnames;
	}

	public Integer getNodeIndex() {
		return nodeIndex;
	}

	public Integer getNodeIndexGreaterThanOrEqual() {
		return nodeIndexGreaterThanOrEqual;
	}

	public Integer getNodeIndexLessThanOrEqual() {
		return nodeIndexLessThanOrEqual;
	}

	public List<Integer> getNodeIndexs() {
		return nodeIndexs;
	}

	public String getOlddname() {
		return olddname;
	}

	public String getOlddnameLike() {
		if (olddnameLike != null && olddnameLike.trim().length() > 0) {
			if (!olddnameLike.startsWith("%")) {
				olddnameLike = "%" + olddnameLike;
			}
			if (!olddnameLike.endsWith("%")) {
				olddnameLike = olddnameLike + "%";
			}
		}
		return olddnameLike;
	}

	public List<String> getOlddnames() {
		return olddnames;
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

	public Integer getOrderCon() {
		return orderCon;
	}

	public Integer getOrderConF() {
		return orderConF;
	}

	public Integer getOrderConFGreaterThanOrEqual() {
		return orderConFGreaterThanOrEqual;
	}

	public Integer getOrderConFLessThanOrEqual() {
		return orderConFLessThanOrEqual;
	}

	public List<Integer> getOrderConFs() {
		return orderConFs;
	}

	public Integer getOrderConGreaterThanOrEqual() {
		return orderConGreaterThanOrEqual;
	}

	public Integer getOrderConLessThanOrEqual() {
		return orderConLessThanOrEqual;
	}

	public List<Integer> getOrderCons() {
		return orderCons;
	}

	public String getOrderid() {
		return orderid;
	}

	public String getOrderidF() {
		return orderidF;
	}

	public String getOrderidFLike() {
		if (orderidFLike != null && orderidFLike.trim().length() > 0) {
			if (!orderidFLike.startsWith("%")) {
				orderidFLike = "%" + orderidFLike;
			}
			if (!orderidFLike.endsWith("%")) {
				orderidFLike = orderidFLike + "%";
			}
		}
		return orderidFLike;
	}

	public List<String> getOrderidFs() {
		return orderidFs;
	}

	public String getOrderidLike() {
		if (orderidLike != null && orderidLike.trim().length() > 0) {
			if (!orderidLike.startsWith("%")) {
				orderidLike = "%" + orderidLike;
			}
			if (!orderidLike.endsWith("%")) {
				orderidLike = orderidLike + "%";
			}
		}
		return orderidLike;
	}

	public List<String> getOrderids() {
		return orderids;
	}

	public Integer getOrderIndex() {
		return orderIndex;
	}

	public Integer getOrderIndexF() {
		return orderIndexF;
	}

	public Integer getOrderIndexFGreaterThanOrEqual() {
		return orderIndexFGreaterThanOrEqual;
	}

	public Integer getOrderIndexFLessThanOrEqual() {
		return orderIndexFLessThanOrEqual;
	}

	public List<Integer> getOrderIndexFs() {
		return orderIndexFs;
	}

	public Integer getOrderIndexGreaterThanOrEqual() {
		return orderIndexGreaterThanOrEqual;
	}

	public Integer getOrderIndexLessThanOrEqual() {
		return orderIndexLessThanOrEqual;
	}

	public List<Integer> getOrderIndexs() {
		return orderIndexs;
	}

	public String getPanid() {
		return panid;
	}

	public String getPanidLike() {
		if (panidLike != null && panidLike.trim().length() > 0) {
			if (!panidLike.startsWith("%")) {
				panidLike = "%" + panidLike;
			}
			if (!panidLike.endsWith("%")) {
				panidLike = panidLike + "%";
			}
		}
		return panidLike;
	}

	public List<String> getPanids() {
		return panids;
	}

	public String getParentDname() {
		return parentDname;
	}

	public String getParentDnameLike() {
		if (parentDnameLike != null && parentDnameLike.trim().length() > 0) {
			if (!parentDnameLike.startsWith("%")) {
				parentDnameLike = "%" + parentDnameLike;
			}
			if (!parentDnameLike.endsWith("%")) {
				parentDnameLike = parentDnameLike + "%";
			}
		}
		return parentDnameLike;
	}

	public List<String> getParentDnames() {
		return parentDnames;
	}

	public String getShowtype() {
		return showtype;
	}

	public String getShowtypeLike() {
		if (showtypeLike != null && showtypeLike.trim().length() > 0) {
			if (!showtypeLike.startsWith("%")) {
				showtypeLike = "%" + showtypeLike;
			}
			if (!showtypeLike.endsWith("%")) {
				showtypeLike = showtypeLike + "%";
			}
		}
		return showtypeLike;
	}

	public List<String> getShowtypes() {
		return showtypes;
	}

	public Integer getStrlen() {
		return strlen;
	}

	public Integer getStrlenGreaterThanOrEqual() {
		return strlenGreaterThanOrEqual;
	}

	public Integer getStrlenLessThanOrEqual() {
		return strlenLessThanOrEqual;
	}

	public List<Integer> getStrlens() {
		return strlens;
	}

	public Integer getSysauto() {
		return sysauto;
	}

	public Integer getSysautoGreaterThanOrEqual() {
		return sysautoGreaterThanOrEqual;
	}

	public Integer getSysautoLessThanOrEqual() {
		return sysautoLessThanOrEqual;
	}

	public List<Integer> getSysautos() {
		return sysautos;
	}

	public String getTypeId() {
		return typeId;
	}

	public String getTypeIdLike() {
		if (typeIdLike != null && typeIdLike.trim().length() > 0) {
			if (!typeIdLike.startsWith("%")) {
				typeIdLike = "%" + typeIdLike;
			}
			if (!typeIdLike.endsWith("%")) {
				typeIdLike = typeIdLike + "%";
			}
		}
		return typeIdLike;
	}

	public List<String> getTypeIds() {
		return typeIds;
	}

	public String getUserindex() {
		return userindex;
	}

	public String getUserindexLike() {
		if (userindexLike != null && userindexLike.trim().length() > 0) {
			if (!userindexLike.startsWith("%")) {
				userindexLike = "%" + userindexLike;
			}
			if (!userindexLike.endsWith("%")) {
				userindexLike = userindexLike + "%";
			}
		}
		return userindexLike;
	}

	public List<String> getUserindexs() {
		return userindexs;
	}

	public String getZtype() {
		return ztype;
	}

	public String getZtypeLike() {
		if (ztypeLike != null && ztypeLike.trim().length() > 0) {
			if (!ztypeLike.startsWith("%")) {
				ztypeLike = "%" + ztypeLike;
			}
			if (!ztypeLike.endsWith("%")) {
				ztypeLike = ztypeLike + "%";
			}
		}
		return ztypeLike;
	}

	public List<String> getZtypes() {
		return ztypes;
	}

	public CellRepInfoQuery hintID(String hintID) {
		if (hintID == null) {
			throw new RuntimeException("hintID is null");
		}
		this.hintID = hintID;
		return this;
	}

	public CellRepInfoQuery hintIDLike(String hintIDLike) {
		if (hintIDLike == null) {
			throw new RuntimeException("hintID is null");
		}
		this.hintIDLike = hintIDLike;
		return this;
	}

	public CellRepInfoQuery hintIDs(List<String> hintIDs) {
		if (hintIDs == null) {
			throw new RuntimeException("hintIDs is empty ");
		}
		this.hintIDs = hintIDs;
		return this;
	}

	public CellRepInfoQuery hintlist(String hintlist) {
		if (hintlist == null) {
			throw new RuntimeException("hintlist is null");
		}
		this.hintlist = hintlist;
		return this;
	}

	public CellRepInfoQuery hintlistLike(String hintlistLike) {
		if (hintlistLike == null) {
			throw new RuntimeException("hintlist is null");
		}
		this.hintlistLike = hintlistLike;
		return this;
	}

	public CellRepInfoQuery hintlists(List<String> hintlists) {
		if (hintlists == null) {
			throw new RuntimeException("hintlists is empty ");
		}
		this.hintlists = hintlists;
		return this;
	}

	public CellRepInfoQuery indexId(String indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellRepInfoQuery indexIdLike(String indexIdLike) {
		if (indexIdLike == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLike = indexIdLike;
		return this;
	}

	public CellRepInfoQuery indexIds(List<String> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("listId", "listId");
		addColumn("indexId", "index_id");
		addColumn("frmtype", "frmtype");
		addColumn("issystem", "issystem");
		addColumn("fname", "fname");
		addColumn("dname", "dname");
		addColumn("dtype", "dtype");
		addColumn("showtype", "showtype");
		addColumn("strlen", "strlen");
		addColumn("form", "form");
		addColumn("intype", "intype");
		addColumn("hintID", "hintID");
		addColumn("listno", "listno");
		addColumn("ztype", "ztype");
		addColumn("ismustfill", "ismustfill");
		addColumn("isListShow", "isListShow");
		addColumn("listweigth", "listweigth");
		addColumn("panid", "panid");
		addColumn("isallwidth", "isallwidth");
		addColumn("istname", "istname");
		addColumn("filedotFileid", "filedot_fileid");
		addColumn("datapoint", "datapoint");
		addColumn("defaultvalue", "defaultvalue");
		addColumn("issubtable", "issubtable");
		addColumn("isdataonly", "isdataonly");
		addColumn("checktype", "checktype");
		addColumn("orderid", "orderid");
		addColumn("celltype", "celltype");
		addColumn("ostTablename", "ost_tablename");
		addColumn("ostRow", "ost_row");
		addColumn("ostCol", "ost_col");
		addColumn("hintlist", "hintlist");
		addColumn("ostCellid", "ost_cellid");
		addColumn("olddname", "olddname");
		addColumn("ostCellname", "ost_cellname");
		addColumn("ostFormula", "ost_formula");
		addColumn("ostColor", "ost_color");
		addColumn("ostSumtype", "ost_sumtype");
		addColumn("dataTablename", "data_tablename");
		addColumn("dataFieldname", "data_fieldname");
		addColumn("orderCon", "order_con");
		addColumn("connum", "connum");
		addColumn("nodeIndex", "node_index");
		addColumn("typeId", "type_id");
		addColumn("userindex", "userindex");
		addColumn("orderIndex", "order_index");
		addColumn("parentDname", "parent_dname");
		addColumn("sysauto", "sysauto");
		addColumn("orderIndexF", "order_index_F");
		addColumn("orderidF", "orderid_F");
		addColumn("orderConF", "order_con_F");
		addColumn("isprintvalue", "isprintvalue");
	}

	public CellRepInfoQuery intype(String intype) {
		if (intype == null) {
			throw new RuntimeException("intype is null");
		}
		this.intype = intype;
		return this;
	}

	public CellRepInfoQuery intypeLike(String intypeLike) {
		if (intypeLike == null) {
			throw new RuntimeException("intype is null");
		}
		this.intypeLike = intypeLike;
		return this;
	}

	public CellRepInfoQuery intypes(List<String> intypes) {
		if (intypes == null) {
			throw new RuntimeException("intypes is empty ");
		}
		this.intypes = intypes;
		return this;
	}

	public CellRepInfoQuery isallwidth(String isallwidth) {
		if (isallwidth == null) {
			throw new RuntimeException("isallwidth is null");
		}
		this.isallwidth = isallwidth;
		return this;
	}

	public CellRepInfoQuery isdataonly(String isdataonly) {
		if (isdataonly == null) {
			throw new RuntimeException("isdataonly is null");
		}
		this.isdataonly = isdataonly;
		return this;
	}

	public CellRepInfoQuery isdataonlyLike(String isdataonlyLike) {
		if (isdataonlyLike == null) {
			throw new RuntimeException("isdataonly is null");
		}
		this.isdataonlyLike = isdataonlyLike;
		return this;
	}

	public CellRepInfoQuery isdataonlys(List<String> isdataonlys) {
		if (isdataonlys == null) {
			throw new RuntimeException("isdataonlys is empty ");
		}
		this.isdataonlys = isdataonlys;
		return this;
	}

	public CellRepInfoQuery isListShow(String isListShow) {
		if (isListShow == null) {
			throw new RuntimeException("isListShow is null");
		}
		this.isListShow = isListShow;
		return this;
	}

	public CellRepInfoQuery isListShowLike(String isListShowLike) {
		if (isListShowLike == null) {
			throw new RuntimeException("isListShow is null");
		}
		this.isListShowLike = isListShowLike;
		return this;
	}

	public CellRepInfoQuery isListShows(List<String> isListShows) {
		if (isListShows == null) {
			throw new RuntimeException("isListShows is empty ");
		}
		this.isListShows = isListShows;
		return this;
	}

	public CellRepInfoQuery ismustfill(String ismustfill) {
		if (ismustfill == null) {
			throw new RuntimeException("ismustfill is null");
		}
		this.ismustfill = ismustfill;
		return this;
	}

	public CellRepInfoQuery ismustfillLike(String ismustfillLike) {
		if (ismustfillLike == null) {
			throw new RuntimeException("ismustfill is null");
		}
		this.ismustfillLike = ismustfillLike;
		return this;
	}

	public CellRepInfoQuery ismustfills(List<String> ismustfills) {
		if (ismustfills == null) {
			throw new RuntimeException("ismustfills is empty ");
		}
		this.ismustfills = ismustfills;
		return this;
	}

	public CellRepInfoQuery isprintvalue(Integer isprintvalue) {
		if (isprintvalue == null) {
			throw new RuntimeException("isprintvalue is null");
		}
		this.isprintvalue = isprintvalue;
		return this;
	}

	public CellRepInfoQuery isprintvalueGreaterThanOrEqual(
			Integer isprintvalueGreaterThanOrEqual) {
		if (isprintvalueGreaterThanOrEqual == null) {
			throw new RuntimeException("isprintvalue is null");
		}
		this.isprintvalueGreaterThanOrEqual = isprintvalueGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery isprintvalueLessThanOrEqual(
			Integer isprintvalueLessThanOrEqual) {
		if (isprintvalueLessThanOrEqual == null) {
			throw new RuntimeException("isprintvalue is null");
		}
		this.isprintvalueLessThanOrEqual = isprintvalueLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery isprintvalues(List<Integer> isprintvalues) {
		if (isprintvalues == null) {
			throw new RuntimeException("isprintvalues is empty ");
		}
		this.isprintvalues = isprintvalues;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellRepInfoQuery issubtable(String issubtable) {
		if (issubtable == null) {
			throw new RuntimeException("issubtable is null");
		}
		this.issubtable = issubtable;
		return this;
	}

	public CellRepInfoQuery issystem(String issystem) {
		if (issystem == null) {
			throw new RuntimeException("issystem is null");
		}
		this.issystem = issystem;
		return this;
	}

	public CellRepInfoQuery issystemLike(String issystemLike) {
		if (issystemLike == null) {
			throw new RuntimeException("issystem is null");
		}
		this.issystemLike = issystemLike;
		return this;
	}

	public CellRepInfoQuery issystems(List<String> issystems) {
		if (issystems == null) {
			throw new RuntimeException("issystems is empty ");
		}
		this.issystems = issystems;
		return this;
	}

	public CellRepInfoQuery istname(String istname) {
		if (istname == null) {
			throw new RuntimeException("istname is null");
		}
		this.istname = istname;
		return this;
	}

	public CellRepInfoQuery istnames(List<String> istnames) {
		if (istnames == null) {
			throw new RuntimeException("istnames is empty ");
		}
		this.istnames = istnames;
		return this;
	}

	public CellRepInfoQuery nodeIndex(Integer nodeIndex) {
		if (nodeIndex == null) {
			throw new RuntimeException("nodeIndex is null");
		}
		this.nodeIndex = nodeIndex;
		return this;
	}

	public CellRepInfoQuery nodeIndexGreaterThanOrEqual(
			Integer nodeIndexGreaterThanOrEqual) {
		if (nodeIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("nodeIndex is null");
		}
		this.nodeIndexGreaterThanOrEqual = nodeIndexGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery nodeIndexLessThanOrEqual(
			Integer nodeIndexLessThanOrEqual) {
		if (nodeIndexLessThanOrEqual == null) {
			throw new RuntimeException("nodeIndex is null");
		}
		this.nodeIndexLessThanOrEqual = nodeIndexLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery nodeIndexs(List<Integer> nodeIndexs) {
		if (nodeIndexs == null) {
			throw new RuntimeException("nodeIndexs is empty ");
		}
		this.nodeIndexs = nodeIndexs;
		return this;
	}

	public CellRepInfoQuery olddname(String olddname) {
		if (olddname == null) {
			throw new RuntimeException("olddname is null");
		}
		this.olddname = olddname;
		return this;
	}

	public CellRepInfoQuery olddnameLike(String olddnameLike) {
		if (olddnameLike == null) {
			throw new RuntimeException("olddname is null");
		}
		this.olddnameLike = olddnameLike;
		return this;
	}

	public CellRepInfoQuery olddnames(List<String> olddnames) {
		if (olddnames == null) {
			throw new RuntimeException("olddnames is empty ");
		}
		this.olddnames = olddnames;
		return this;
	}

	public CellRepInfoQuery orderCon(Integer orderCon) {
		if (orderCon == null) {
			throw new RuntimeException("orderCon is null");
		}
		this.orderCon = orderCon;
		return this;
	}

	public CellRepInfoQuery orderConF(Integer orderConF) {
		if (orderConF == null) {
			throw new RuntimeException("orderConF is null");
		}
		this.orderConF = orderConF;
		return this;
	}

	public CellRepInfoQuery orderConFGreaterThanOrEqual(
			Integer orderConFGreaterThanOrEqual) {
		if (orderConFGreaterThanOrEqual == null) {
			throw new RuntimeException("orderConF is null");
		}
		this.orderConFGreaterThanOrEqual = orderConFGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery orderConFLessThanOrEqual(
			Integer orderConFLessThanOrEqual) {
		if (orderConFLessThanOrEqual == null) {
			throw new RuntimeException("orderConF is null");
		}
		this.orderConFLessThanOrEqual = orderConFLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery orderConFs(List<Integer> orderConFs) {
		if (orderConFs == null) {
			throw new RuntimeException("orderConFs is empty ");
		}
		this.orderConFs = orderConFs;
		return this;
	}

	public CellRepInfoQuery orderConGreaterThanOrEqual(
			Integer orderConGreaterThanOrEqual) {
		if (orderConGreaterThanOrEqual == null) {
			throw new RuntimeException("orderCon is null");
		}
		this.orderConGreaterThanOrEqual = orderConGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery orderConLessThanOrEqual(
			Integer orderConLessThanOrEqual) {
		if (orderConLessThanOrEqual == null) {
			throw new RuntimeException("orderCon is null");
		}
		this.orderConLessThanOrEqual = orderConLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery orderCons(List<Integer> orderCons) {
		if (orderCons == null) {
			throw new RuntimeException("orderCons is empty ");
		}
		this.orderCons = orderCons;
		return this;
	}

	public CellRepInfoQuery orderid(String orderid) {
		if (orderid == null) {
			throw new RuntimeException("orderid is null");
		}
		this.orderid = orderid;
		return this;
	}

	public CellRepInfoQuery orderidF(String orderidF) {
		if (orderidF == null) {
			throw new RuntimeException("orderidF is null");
		}
		this.orderidF = orderidF;
		return this;
	}

	public CellRepInfoQuery orderidFLike(String orderidFLike) {
		if (orderidFLike == null) {
			throw new RuntimeException("orderidF is null");
		}
		this.orderidFLike = orderidFLike;
		return this;
	}

	public CellRepInfoQuery orderidFs(List<String> orderidFs) {
		if (orderidFs == null) {
			throw new RuntimeException("orderidFs is empty ");
		}
		this.orderidFs = orderidFs;
		return this;
	}

	public CellRepInfoQuery orderidLike(String orderidLike) {
		if (orderidLike == null) {
			throw new RuntimeException("orderid is null");
		}
		this.orderidLike = orderidLike;
		return this;
	}

	public CellRepInfoQuery orderids(List<String> orderids) {
		if (orderids == null) {
			throw new RuntimeException("orderids is empty ");
		}
		this.orderids = orderids;
		return this;
	}

	public CellRepInfoQuery orderIndex(Integer orderIndex) {
		if (orderIndex == null) {
			throw new RuntimeException("orderIndex is null");
		}
		this.orderIndex = orderIndex;
		return this;
	}

	public CellRepInfoQuery orderIndexF(Integer orderIndexF) {
		if (orderIndexF == null) {
			throw new RuntimeException("orderIndexF is null");
		}
		this.orderIndexF = orderIndexF;
		return this;
	}

	public CellRepInfoQuery orderIndexFGreaterThanOrEqual(
			Integer orderIndexFGreaterThanOrEqual) {
		if (orderIndexFGreaterThanOrEqual == null) {
			throw new RuntimeException("orderIndexF is null");
		}
		this.orderIndexFGreaterThanOrEqual = orderIndexFGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery orderIndexFLessThanOrEqual(
			Integer orderIndexFLessThanOrEqual) {
		if (orderIndexFLessThanOrEqual == null) {
			throw new RuntimeException("orderIndexF is null");
		}
		this.orderIndexFLessThanOrEqual = orderIndexFLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery orderIndexFs(List<Integer> orderIndexFs) {
		if (orderIndexFs == null) {
			throw new RuntimeException("orderIndexFs is empty ");
		}
		this.orderIndexFs = orderIndexFs;
		return this;
	}

	public CellRepInfoQuery orderIndexGreaterThanOrEqual(
			Integer orderIndexGreaterThanOrEqual) {
		if (orderIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("orderIndex is null");
		}
		this.orderIndexGreaterThanOrEqual = orderIndexGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery orderIndexLessThanOrEqual(
			Integer orderIndexLessThanOrEqual) {
		if (orderIndexLessThanOrEqual == null) {
			throw new RuntimeException("orderIndex is null");
		}
		this.orderIndexLessThanOrEqual = orderIndexLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery orderIndexs(List<Integer> orderIndexs) {
		if (orderIndexs == null) {
			throw new RuntimeException("orderIndexs is empty ");
		}
		this.orderIndexs = orderIndexs;
		return this;
	}

	public CellRepInfoQuery panid(String panid) {
		if (panid == null) {
			throw new RuntimeException("panid is null");
		}
		this.panid = panid;
		return this;
	}

	public CellRepInfoQuery panidLike(String panidLike) {
		if (panidLike == null) {
			throw new RuntimeException("panid is null");
		}
		this.panidLike = panidLike;
		return this;
	}

	public CellRepInfoQuery panids(List<String> panids) {
		if (panids == null) {
			throw new RuntimeException("panids is empty ");
		}
		this.panids = panids;
		return this;
	}

	public CellRepInfoQuery parentDname(String parentDname) {
		if (parentDname == null) {
			throw new RuntimeException("parentDname is null");
		}
		this.parentDname = parentDname;
		return this;
	}

	public CellRepInfoQuery parentDnameLike(String parentDnameLike) {
		if (parentDnameLike == null) {
			throw new RuntimeException("parentDname is null");
		}
		this.parentDnameLike = parentDnameLike;
		return this;
	}

	public CellRepInfoQuery parentDnames(List<String> parentDnames) {
		if (parentDnames == null) {
			throw new RuntimeException("parentDnames is empty ");
		}
		this.parentDnames = parentDnames;
		return this;
	}

	public void setCelltype(Integer celltype) {
		this.celltype = celltype;
	}

	public void setCelltypeGreaterThanOrEqual(Integer celltypeGreaterThanOrEqual) {
		this.celltypeGreaterThanOrEqual = celltypeGreaterThanOrEqual;
	}

	public void setCelltypeLessThanOrEqual(Integer celltypeLessThanOrEqual) {
		this.celltypeLessThanOrEqual = celltypeLessThanOrEqual;
	}

	public void setCelltypes(List<Integer> celltypes) {
		this.celltypes = celltypes;
	}

	public void setChecktype(Integer checktype) {
		this.checktype = checktype;
	}

	public void setChecktypeGreaterThanOrEqual(
			Integer checktypeGreaterThanOrEqual) {
		this.checktypeGreaterThanOrEqual = checktypeGreaterThanOrEqual;
	}

	public void setChecktypeLessThanOrEqual(Integer checktypeLessThanOrEqual) {
		this.checktypeLessThanOrEqual = checktypeLessThanOrEqual;
	}

	public void setChecktypes(List<Integer> checktypes) {
		this.checktypes = checktypes;
	}

	public void setConnum(Integer connum) {
		this.connum = connum;
	}

	public void setConnumGreaterThanOrEqual(Integer connumGreaterThanOrEqual) {
		this.connumGreaterThanOrEqual = connumGreaterThanOrEqual;
	}

	public void setConnumLessThanOrEqual(Integer connumLessThanOrEqual) {
		this.connumLessThanOrEqual = connumLessThanOrEqual;
	}

	public void setConnums(List<Integer> connums) {
		this.connums = connums;
	}

	public void setDataFieldname(String dataFieldname) {
		this.dataFieldname = dataFieldname;
	}

	public void setDataFieldnameLike(String dataFieldnameLike) {
		this.dataFieldnameLike = dataFieldnameLike;
	}

	public void setDataFieldnames(List<String> dataFieldnames) {
		this.dataFieldnames = dataFieldnames;
	}

	public void setDatapoint(Integer datapoint) {
		this.datapoint = datapoint;
	}

	public void setDatapointGreaterThanOrEqual(
			Integer datapointGreaterThanOrEqual) {
		this.datapointGreaterThanOrEqual = datapointGreaterThanOrEqual;
	}

	public void setDatapointLessThanOrEqual(Integer datapointLessThanOrEqual) {
		this.datapointLessThanOrEqual = datapointLessThanOrEqual;
	}

	public void setDatapoints(List<Integer> datapoints) {
		this.datapoints = datapoints;
	}

	public void setDataTablename(String dataTablename) {
		this.dataTablename = dataTablename;
	}

	public void setDataTablenameLike(String dataTablenameLike) {
		this.dataTablenameLike = dataTablenameLike;
	}

	public void setDataTablenames(List<String> dataTablenames) {
		this.dataTablenames = dataTablenames;
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

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public void setDtypeLike(String dtypeLike) {
		this.dtypeLike = dtypeLike;
	}

	public void setDtypes(List<String> dtypes) {
		this.dtypes = dtypes;
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

	public void setForm(String form) {
		this.form = form;
	}

	public void setFormLike(String formLike) {
		this.formLike = formLike;
	}

	public void setForms(List<String> forms) {
		this.forms = forms;
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

	public void setHintID(String hintID) {
		this.hintID = hintID;
	}

	public void setHintIDLike(String hintIDLike) {
		this.hintIDLike = hintIDLike;
	}

	public void setHintIDs(List<String> hintIDs) {
		this.hintIDs = hintIDs;
	}

	public void setHintlist(String hintlist) {
		this.hintlist = hintlist;
	}

	public void setHintlistLike(String hintlistLike) {
		this.hintlistLike = hintlistLike;
	}

	public void setHintlists(List<String> hintlists) {
		this.hintlists = hintlists;
	}

	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}

	public void setIndexIdLike(String indexIdLike) {
		this.indexIdLike = indexIdLike;
	}

	public void setIndexIds(List<String> indexIds) {
		this.indexIds = indexIds;
	}

	public void setIntype(String intype) {
		this.intype = intype;
	}

	public void setIntypeLike(String intypeLike) {
		this.intypeLike = intypeLike;
	}

	public void setIntypes(List<String> intypes) {
		this.intypes = intypes;
	}

	public void setIsallwidth(String isallwidth) {
		this.isallwidth = isallwidth;
	}

	public void setIsdataonly(String isdataonly) {
		this.isdataonly = isdataonly;
	}

	public void setIsdataonlyLike(String isdataonlyLike) {
		this.isdataonlyLike = isdataonlyLike;
	}

	public void setIsdataonlys(List<String> isdataonlys) {
		this.isdataonlys = isdataonlys;
	}

	public void setIsListShow(String isListShow) {
		this.isListShow = isListShow;
	}

	public void setIsListShowLike(String isListShowLike) {
		this.isListShowLike = isListShowLike;
	}

	public void setIsListShows(List<String> isListShows) {
		this.isListShows = isListShows;
	}

	public void setIsmustfill(String ismustfill) {
		this.ismustfill = ismustfill;
	}

	public void setIsmustfillLike(String ismustfillLike) {
		this.ismustfillLike = ismustfillLike;
	}

	public void setIsmustfills(List<String> ismustfills) {
		this.ismustfills = ismustfills;
	}

	public void setIsprintvalue(Integer isprintvalue) {
		this.isprintvalue = isprintvalue;
	}

	public void setIsprintvalueGreaterThanOrEqual(
			Integer isprintvalueGreaterThanOrEqual) {
		this.isprintvalueGreaterThanOrEqual = isprintvalueGreaterThanOrEqual;
	}

	public void setIsprintvalueLessThanOrEqual(
			Integer isprintvalueLessThanOrEqual) {
		this.isprintvalueLessThanOrEqual = isprintvalueLessThanOrEqual;
	}

	public void setIsprintvalues(List<Integer> isprintvalues) {
		this.isprintvalues = isprintvalues;
	}

	public void setIssubtable(String issubtable) {
		this.issubtable = issubtable;
	}

	public void setIssystem(String issystem) {
		this.issystem = issystem;
	}

	public void setIssystemLike(String issystemLike) {
		this.issystemLike = issystemLike;
	}

	public void setIssystems(List<String> issystems) {
		this.issystems = issystems;
	}

	public void setIstname(String istname) {
		this.istname = istname;
	}

	public void setIstnames(List<String> istnames) {
		this.istnames = istnames;
	}

	public void setNodeIndex(Integer nodeIndex) {
		this.nodeIndex = nodeIndex;
	}

	public void setNodeIndexGreaterThanOrEqual(
			Integer nodeIndexGreaterThanOrEqual) {
		this.nodeIndexGreaterThanOrEqual = nodeIndexGreaterThanOrEqual;
	}

	public void setNodeIndexLessThanOrEqual(Integer nodeIndexLessThanOrEqual) {
		this.nodeIndexLessThanOrEqual = nodeIndexLessThanOrEqual;
	}

	public void setNodeIndexs(List<Integer> nodeIndexs) {
		this.nodeIndexs = nodeIndexs;
	}

	public void setOlddname(String olddname) {
		this.olddname = olddname;
	}

	public void setOlddnameLike(String olddnameLike) {
		this.olddnameLike = olddnameLike;
	}

	public void setOlddnames(List<String> olddnames) {
		this.olddnames = olddnames;
	}

	public void setOrderCon(Integer orderCon) {
		this.orderCon = orderCon;
	}

	public void setOrderConF(Integer orderConF) {
		this.orderConF = orderConF;
	}

	public void setOrderConFGreaterThanOrEqual(
			Integer orderConFGreaterThanOrEqual) {
		this.orderConFGreaterThanOrEqual = orderConFGreaterThanOrEqual;
	}

	public void setOrderConFLessThanOrEqual(Integer orderConFLessThanOrEqual) {
		this.orderConFLessThanOrEqual = orderConFLessThanOrEqual;
	}

	public void setOrderConFs(List<Integer> orderConFs) {
		this.orderConFs = orderConFs;
	}

	public void setOrderConGreaterThanOrEqual(Integer orderConGreaterThanOrEqual) {
		this.orderConGreaterThanOrEqual = orderConGreaterThanOrEqual;
	}

	public void setOrderConLessThanOrEqual(Integer orderConLessThanOrEqual) {
		this.orderConLessThanOrEqual = orderConLessThanOrEqual;
	}

	public void setOrderCons(List<Integer> orderCons) {
		this.orderCons = orderCons;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public void setOrderidF(String orderidF) {
		this.orderidF = orderidF;
	}

	public void setOrderidFLike(String orderidFLike) {
		this.orderidFLike = orderidFLike;
	}

	public void setOrderidFs(List<String> orderidFs) {
		this.orderidFs = orderidFs;
	}

	public void setOrderidLike(String orderidLike) {
		this.orderidLike = orderidLike;
	}

	public void setOrderids(List<String> orderids) {
		this.orderids = orderids;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}

	public void setOrderIndexF(Integer orderIndexF) {
		this.orderIndexF = orderIndexF;
	}

	public void setOrderIndexFGreaterThanOrEqual(
			Integer orderIndexFGreaterThanOrEqual) {
		this.orderIndexFGreaterThanOrEqual = orderIndexFGreaterThanOrEqual;
	}

	public void setOrderIndexFLessThanOrEqual(Integer orderIndexFLessThanOrEqual) {
		this.orderIndexFLessThanOrEqual = orderIndexFLessThanOrEqual;
	}

	public void setOrderIndexFs(List<Integer> orderIndexFs) {
		this.orderIndexFs = orderIndexFs;
	}

	public void setOrderIndexGreaterThanOrEqual(
			Integer orderIndexGreaterThanOrEqual) {
		this.orderIndexGreaterThanOrEqual = orderIndexGreaterThanOrEqual;
	}

	public void setOrderIndexLessThanOrEqual(Integer orderIndexLessThanOrEqual) {
		this.orderIndexLessThanOrEqual = orderIndexLessThanOrEqual;
	}

	public void setOrderIndexs(List<Integer> orderIndexs) {
		this.orderIndexs = orderIndexs;
	}

	public void setPanid(String panid) {
		this.panid = panid;
	}

	public void setPanidLike(String panidLike) {
		this.panidLike = panidLike;
	}

	public void setPanids(List<String> panids) {
		this.panids = panids;
	}

	public void setParentDname(String parentDname) {
		this.parentDname = parentDname;
	}

	public void setParentDnameLike(String parentDnameLike) {
		this.parentDnameLike = parentDnameLike;
	}

	public void setParentDnames(List<String> parentDnames) {
		this.parentDnames = parentDnames;
	}

	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}

	public void setShowtypeLike(String showtypeLike) {
		this.showtypeLike = showtypeLike;
	}

	public void setShowtypes(List<String> showtypes) {
		this.showtypes = showtypes;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStrlen(Integer strlen) {
		this.strlen = strlen;
	}

	public void setStrlenGreaterThanOrEqual(Integer strlenGreaterThanOrEqual) {
		this.strlenGreaterThanOrEqual = strlenGreaterThanOrEqual;
	}

	public void setStrlenLessThanOrEqual(Integer strlenLessThanOrEqual) {
		this.strlenLessThanOrEqual = strlenLessThanOrEqual;
	}

	public void setStrlens(List<Integer> strlens) {
		this.strlens = strlens;
	}

	public void setSysauto(Integer sysauto) {
		this.sysauto = sysauto;
	}

	public void setSysautoGreaterThanOrEqual(Integer sysautoGreaterThanOrEqual) {
		this.sysautoGreaterThanOrEqual = sysautoGreaterThanOrEqual;
	}

	public void setSysautoLessThanOrEqual(Integer sysautoLessThanOrEqual) {
		this.sysautoLessThanOrEqual = sysautoLessThanOrEqual;
	}

	public void setSysautos(List<Integer> sysautos) {
		this.sysautos = sysautos;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIdLike(String typeIdLike) {
		this.typeIdLike = typeIdLike;
	}

	public void setTypeIds(List<String> typeIds) {
		this.typeIds = typeIds;
	}

	public void setUserindex(String userindex) {
		this.userindex = userindex;
	}

	public void setUserindexLike(String userindexLike) {
		this.userindexLike = userindexLike;
	}

	public void setUserindexs(List<String> userindexs) {
		this.userindexs = userindexs;
	}

	public void setZtype(String ztype) {
		this.ztype = ztype;
	}

	public void setZtypeLike(String ztypeLike) {
		this.ztypeLike = ztypeLike;
	}

	public void setZtypes(List<String> ztypes) {
		this.ztypes = ztypes;
	}

	public CellRepInfoQuery showtype(String showtype) {
		if (showtype == null) {
			throw new RuntimeException("showtype is null");
		}
		this.showtype = showtype;
		return this;
	}

	public CellRepInfoQuery showtypeLike(String showtypeLike) {
		if (showtypeLike == null) {
			throw new RuntimeException("showtype is null");
		}
		this.showtypeLike = showtypeLike;
		return this;
	}

	public CellRepInfoQuery showtypes(List<String> showtypes) {
		if (showtypes == null) {
			throw new RuntimeException("showtypes is empty ");
		}
		this.showtypes = showtypes;
		return this;
	}

	public CellRepInfoQuery strlen(Integer strlen) {
		if (strlen == null) {
			throw new RuntimeException("strlen is null");
		}
		this.strlen = strlen;
		return this;
	}

	public CellRepInfoQuery strlenGreaterThanOrEqual(
			Integer strlenGreaterThanOrEqual) {
		if (strlenGreaterThanOrEqual == null) {
			throw new RuntimeException("strlen is null");
		}
		this.strlenGreaterThanOrEqual = strlenGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery strlenLessThanOrEqual(Integer strlenLessThanOrEqual) {
		if (strlenLessThanOrEqual == null) {
			throw new RuntimeException("strlen is null");
		}
		this.strlenLessThanOrEqual = strlenLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery strlens(List<Integer> strlens) {
		if (strlens == null) {
			throw new RuntimeException("strlens is empty ");
		}
		this.strlens = strlens;
		return this;
	}

	public CellRepInfoQuery sysauto(Integer sysauto) {
		if (sysauto == null) {
			throw new RuntimeException("sysauto is null");
		}
		this.sysauto = sysauto;
		return this;
	}

	public CellRepInfoQuery sysautoGreaterThanOrEqual(
			Integer sysautoGreaterThanOrEqual) {
		if (sysautoGreaterThanOrEqual == null) {
			throw new RuntimeException("sysauto is null");
		}
		this.sysautoGreaterThanOrEqual = sysautoGreaterThanOrEqual;
		return this;
	}

	public CellRepInfoQuery sysautoLessThanOrEqual(
			Integer sysautoLessThanOrEqual) {
		if (sysautoLessThanOrEqual == null) {
			throw new RuntimeException("sysauto is null");
		}
		this.sysautoLessThanOrEqual = sysautoLessThanOrEqual;
		return this;
	}

	public CellRepInfoQuery sysautos(List<Integer> sysautos) {
		if (sysautos == null) {
			throw new RuntimeException("sysautos is empty ");
		}
		this.sysautos = sysautos;
		return this;
	}

	public CellRepInfoQuery typeId(String typeId) {
		if (typeId == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeId = typeId;
		return this;
	}

	public CellRepInfoQuery typeIdLike(String typeIdLike) {
		if (typeIdLike == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeIdLike = typeIdLike;
		return this;
	}

	public CellRepInfoQuery typeIds(List<String> typeIds) {
		if (typeIds == null) {
			throw new RuntimeException("typeIds is empty ");
		}
		this.typeIds = typeIds;
		return this;
	}

	public CellRepInfoQuery userindex(String userindex) {
		if (userindex == null) {
			throw new RuntimeException("userindex is null");
		}
		this.userindex = userindex;
		return this;
	}

	public CellRepInfoQuery userindexLike(String userindexLike) {
		if (userindexLike == null) {
			throw new RuntimeException("userindex is null");
		}
		this.userindexLike = userindexLike;
		return this;
	}

	public CellRepInfoQuery userindexs(List<String> userindexs) {
		if (userindexs == null) {
			throw new RuntimeException("userindexs is empty ");
		}
		this.userindexs = userindexs;
		return this;
	}

	public CellRepInfoQuery ztype(String ztype) {
		if (ztype == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztype = ztype;
		return this;
	}

	public CellRepInfoQuery ztypeLike(String ztypeLike) {
		if (ztypeLike == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeLike = ztypeLike;
		return this;
	}

	public CellRepInfoQuery ztypes(List<String> ztypes) {
		if (ztypes == null) {
			throw new RuntimeException("ztypes is empty ");
		}
		this.ztypes = ztypes;
		return this;
	}

}