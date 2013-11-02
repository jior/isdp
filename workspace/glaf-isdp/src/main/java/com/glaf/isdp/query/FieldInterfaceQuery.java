package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class FieldInterfaceQuery extends DataQuery {
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
	protected String isallwidth;
	protected Integer importType;
	protected Integer importTypeGreaterThanOrEqual;
	protected Integer importTypeLessThanOrEqual;
	protected List<Integer> importTypes;
	protected Integer datapoint;
	protected Integer datapointGreaterThanOrEqual;
	protected Integer datapointLessThanOrEqual;
	protected List<Integer> datapoints;
	

	public FieldInterfaceQuery() {

	}

	public FieldInterfaceQuery datapoint(Integer datapoint) {
		if (datapoint == null) {
			throw new RuntimeException("datapoint is null");
		}
		this.datapoint = datapoint;
		return this;
	}

	public FieldInterfaceQuery datapointGreaterThanOrEqual(
			Integer datapointGreaterThanOrEqual) {
		if (datapointGreaterThanOrEqual == null) {
			throw new RuntimeException("datapoint is null");
		}
		this.datapointGreaterThanOrEqual = datapointGreaterThanOrEqual;
		return this;
	}

	public FieldInterfaceQuery datapointLessThanOrEqual(
			Integer datapointLessThanOrEqual) {
		if (datapointLessThanOrEqual == null) {
			throw new RuntimeException("datapoint is null");
		}
		this.datapointLessThanOrEqual = datapointLessThanOrEqual;
		return this;
	}

	public FieldInterfaceQuery datapoints(List<Integer> datapoints) {
		if (datapoints == null) {
			throw new RuntimeException("datapoints is empty ");
		}
		this.datapoints = datapoints;
		return this;
	}

	public FieldInterfaceQuery dname(String dname) {
		if (dname == null) {
			throw new RuntimeException("dname is null");
		}
		this.dname = dname;
		return this;
	}

	public FieldInterfaceQuery dnameLike(String dnameLike) {
		if (dnameLike == null) {
			throw new RuntimeException("dname is null");
		}
		this.dnameLike = dnameLike;
		return this;
	}

	public FieldInterfaceQuery dnames(List<String> dnames) {
		if (dnames == null) {
			throw new RuntimeException("dnames is empty ");
		}
		this.dnames = dnames;
		return this;
	}

	public FieldInterfaceQuery dtype(String dtype) {
		if (dtype == null) {
			throw new RuntimeException("dtype is null");
		}
		this.dtype = dtype;
		return this;
	}

	public FieldInterfaceQuery dtypeLike(String dtypeLike) {
		if (dtypeLike == null) {
			throw new RuntimeException("dtype is null");
		}
		this.dtypeLike = dtypeLike;
		return this;
	}

	public FieldInterfaceQuery dtypes(List<String> dtypes) {
		if (dtypes == null) {
			throw new RuntimeException("dtypes is empty ");
		}
		this.dtypes = dtypes;
		return this;
	}

	public FieldInterfaceQuery fname(String fname) {
		if (fname == null) {
			throw new RuntimeException("fname is null");
		}
		this.fname = fname;
		return this;
	}

	public FieldInterfaceQuery fnameLike(String fnameLike) {
		if (fnameLike == null) {
			throw new RuntimeException("fname is null");
		}
		this.fnameLike = fnameLike;
		return this;
	}

	public FieldInterfaceQuery fnames(List<String> fnames) {
		if (fnames == null) {
			throw new RuntimeException("fnames is empty ");
		}
		this.fnames = fnames;
		return this;
	}

	public FieldInterfaceQuery form(String form) {
		if (form == null) {
			throw new RuntimeException("form is null");
		}
		this.form = form;
		return this;
	}

	public FieldInterfaceQuery formLike(String formLike) {
		if (formLike == null) {
			throw new RuntimeException("form is null");
		}
		this.formLike = formLike;
		return this;
	}

	public FieldInterfaceQuery forms(List<String> forms) {
		if (forms == null) {
			throw new RuntimeException("forms is empty ");
		}
		this.forms = forms;
		return this;
	}

	public FieldInterfaceQuery frmtype(String frmtype) {
		if (frmtype == null) {
			throw new RuntimeException("frmtype is null");
		}
		this.frmtype = frmtype;
		return this;
	}

	public FieldInterfaceQuery frmtypeLike(String frmtypeLike) {
		if (frmtypeLike == null) {
			throw new RuntimeException("frmtype is null");
		}
		this.frmtypeLike = frmtypeLike;
		return this;
	}

	public FieldInterfaceQuery frmtypes(List<String> frmtypes) {
		if (frmtypes == null) {
			throw new RuntimeException("frmtypes is empty ");
		}
		this.frmtypes = frmtypes;
		return this;
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

	public Integer getImportType() {
		return importType;
	}

	public Integer getImportTypeGreaterThanOrEqual() {
		return importTypeGreaterThanOrEqual;
	}

	public Integer getImportTypeLessThanOrEqual() {
		return importTypeLessThanOrEqual;
	}

	public List<Integer> getImportTypes() {
		return importTypes;
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

	public FieldInterfaceQuery hintID(String hintID) {
		if (hintID == null) {
			throw new RuntimeException("hintID is null");
		}
		this.hintID = hintID;
		return this;
	}

	public FieldInterfaceQuery hintIDLike(String hintIDLike) {
		if (hintIDLike == null) {
			throw new RuntimeException("hintID is null");
		}
		this.hintIDLike = hintIDLike;
		return this;
	}

	public FieldInterfaceQuery hintIDs(List<String> hintIDs) {
		if (hintIDs == null) {
			throw new RuntimeException("hintIDs is empty ");
		}
		this.hintIDs = hintIDs;
		return this;
	}

	public FieldInterfaceQuery importType(Integer importType) {
		if (importType == null) {
			throw new RuntimeException("importType is null");
		}
		this.importType = importType;
		return this;
	}

	public FieldInterfaceQuery importTypeGreaterThanOrEqual(
			Integer importTypeGreaterThanOrEqual) {
		if (importTypeGreaterThanOrEqual == null) {
			throw new RuntimeException("importType is null");
		}
		this.importTypeGreaterThanOrEqual = importTypeGreaterThanOrEqual;
		return this;
	}

	public FieldInterfaceQuery importTypeLessThanOrEqual(
			Integer importTypeLessThanOrEqual) {
		if (importTypeLessThanOrEqual == null) {
			throw new RuntimeException("importType is null");
		}
		this.importTypeLessThanOrEqual = importTypeLessThanOrEqual;
		return this;
	}

	public FieldInterfaceQuery importTypes(List<Integer> importTypes) {
		if (importTypes == null) {
			throw new RuntimeException("importTypes is empty ");
		}
		this.importTypes = importTypes;
		return this;
	}

	public FieldInterfaceQuery indexId(String indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public FieldInterfaceQuery indexIdLike(String indexIdLike) {
		if (indexIdLike == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLike = indexIdLike;
		return this;
	}

	public FieldInterfaceQuery indexIds(List<String> indexIds) {
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
		addColumn("isallwidth", "isallwidth");
		addColumn("istname", "istname");
		addColumn("importType", "import_type");
		addColumn("datapoint", "datapoint");
	}

	public FieldInterfaceQuery intype(String intype) {
		if (intype == null) {
			throw new RuntimeException("intype is null");
		}
		this.intype = intype;
		return this;
	}

	public FieldInterfaceQuery intypeLike(String intypeLike) {
		if (intypeLike == null) {
			throw new RuntimeException("intype is null");
		}
		this.intypeLike = intypeLike;
		return this;
	}

	public FieldInterfaceQuery intypes(List<String> intypes) {
		if (intypes == null) {
			throw new RuntimeException("intypes is empty ");
		}
		this.intypes = intypes;
		return this;
	}

	public FieldInterfaceQuery isallwidth(String isallwidth) {
		if (isallwidth == null) {
			throw new RuntimeException("isallwidth is null");
		}
		this.isallwidth = isallwidth;
		return this;
	}

	public FieldInterfaceQuery isListShow(String isListShow) {
		if (isListShow == null) {
			throw new RuntimeException("isListShow is null");
		}
		this.isListShow = isListShow;
		return this;
	}

	public FieldInterfaceQuery isListShowLike(String isListShowLike) {
		if (isListShowLike == null) {
			throw new RuntimeException("isListShow is null");
		}
		this.isListShowLike = isListShowLike;
		return this;
	}

	public FieldInterfaceQuery isListShows(List<String> isListShows) {
		if (isListShows == null) {
			throw new RuntimeException("isListShows is empty ");
		}
		this.isListShows = isListShows;
		return this;
	}

	public FieldInterfaceQuery ismustfill(String ismustfill) {
		if (ismustfill == null) {
			throw new RuntimeException("ismustfill is null");
		}
		this.ismustfill = ismustfill;
		return this;
	}

	public FieldInterfaceQuery ismustfillLike(String ismustfillLike) {
		if (ismustfillLike == null) {
			throw new RuntimeException("ismustfill is null");
		}
		this.ismustfillLike = ismustfillLike;
		return this;
	}

	public FieldInterfaceQuery ismustfills(List<String> ismustfills) {
		if (ismustfills == null) {
			throw new RuntimeException("ismustfills is empty ");
		}
		this.ismustfills = ismustfills;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FieldInterfaceQuery issystem(String issystem) {
		if (issystem == null) {
			throw new RuntimeException("issystem is null");
		}
		this.issystem = issystem;
		return this;
	}

	public FieldInterfaceQuery issystemLike(String issystemLike) {
		if (issystemLike == null) {
			throw new RuntimeException("issystem is null");
		}
		this.issystemLike = issystemLike;
		return this;
	}

	public FieldInterfaceQuery issystems(List<String> issystems) {
		if (issystems == null) {
			throw new RuntimeException("issystems is empty ");
		}
		this.issystems = issystems;
		return this;
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

	public void setImportType(Integer importType) {
		this.importType = importType;
	}

	public void setImportTypeGreaterThanOrEqual(
			Integer importTypeGreaterThanOrEqual) {
		this.importTypeGreaterThanOrEqual = importTypeGreaterThanOrEqual;
	}

	public void setImportTypeLessThanOrEqual(Integer importTypeLessThanOrEqual) {
		this.importTypeLessThanOrEqual = importTypeLessThanOrEqual;
	}

	public void setImportTypes(List<Integer> importTypes) {
		this.importTypes = importTypes;
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

	public void setIssystem(String issystem) {
		this.issystem = issystem;
	}

	public void setIssystemLike(String issystemLike) {
		this.issystemLike = issystemLike;
	}

	public void setIssystems(List<String> issystems) {
		this.issystems = issystems;
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

	public void setZtype(String ztype) {
		this.ztype = ztype;
	}

	public void setZtypeLike(String ztypeLike) {
		this.ztypeLike = ztypeLike;
	}

	public void setZtypes(List<String> ztypes) {
		this.ztypes = ztypes;
	}

	public FieldInterfaceQuery showtype(String showtype) {
		if (showtype == null) {
			throw new RuntimeException("showtype is null");
		}
		this.showtype = showtype;
		return this;
	}

	public FieldInterfaceQuery showtypeLike(String showtypeLike) {
		if (showtypeLike == null) {
			throw new RuntimeException("showtype is null");
		}
		this.showtypeLike = showtypeLike;
		return this;
	}

	public FieldInterfaceQuery showtypes(List<String> showtypes) {
		if (showtypes == null) {
			throw new RuntimeException("showtypes is empty ");
		}
		this.showtypes = showtypes;
		return this;
	}

	public FieldInterfaceQuery ztype(String ztype) {
		if (ztype == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztype = ztype;
		return this;
	}

	public FieldInterfaceQuery ztypeLike(String ztypeLike) {
		if (ztypeLike == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeLike = ztypeLike;
		return this;
	}

	public FieldInterfaceQuery ztypes(List<String> ztypes) {
		if (ztypes == null) {
			throw new RuntimeException("ztypes is empty ");
		}
		this.ztypes = ztypes;
		return this;
	}

}