package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class FlowForwardSqlDefQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String processId;
	protected String processIdLike;
	protected List<String> processIds;
	protected String flowForwardD;
	protected String flowForwardDLike;
	protected List<String> flowForwardDs;
	protected Integer intandor;
	protected Integer intandorGreaterThanOrEqual;
	protected Integer intandorLessThanOrEqual;
	protected List<Integer> intandors;
	protected Integer sqlconType;
	protected Integer sqlconTypeGreaterThanOrEqual;
	protected Integer sqlconTypeLessThanOrEqual;
	protected List<Integer> sqlconTypes;
	protected String sqlconDtype;
	protected String sqlconDtypeLike;
	protected List<String> sqlconDtypes;
	protected String sqlconField;
	protected String sqlconFieldLike;
	protected List<String> sqlconFields;
	protected String strsp;
	protected String strspLike;
	protected List<String> strsps;
	protected String sqlconValue;
	protected String sqlconValueLike;
	protected List<String> sqlconValues;
	protected String sqlconshow;
	protected String sqlconshowLike;
	protected List<String> sqlconshows;
	protected Integer issave;
	protected Integer issaveGreaterThanOrEqual;
	protected Integer issaveLessThanOrEqual;
	protected List<Integer> issaves;
	

	public FlowForwardSqlDefQuery() {

	}

	public FlowForwardSqlDefQuery flowForwardD(String flowForwardD) {
		if (flowForwardD == null) {
			throw new RuntimeException("flowForwardD is null");
		}
		this.flowForwardD = flowForwardD;
		return this;
	}

	public FlowForwardSqlDefQuery flowForwardDLike(String flowForwardDLike) {
		if (flowForwardDLike == null) {
			throw new RuntimeException("flowForwardD is null");
		}
		this.flowForwardDLike = flowForwardDLike;
		return this;
	}

	public FlowForwardSqlDefQuery flowForwardDs(List<String> flowForwardDs) {
		if (flowForwardDs == null) {
			throw new RuntimeException("flowForwardDs is empty ");
		}
		this.flowForwardDs = flowForwardDs;
		return this;
	}

	public String getFlowForwardD() {
		return flowForwardD;
	}

	public String getFlowForwardDLike() {
		if (flowForwardDLike != null && flowForwardDLike.trim().length() > 0) {
			if (!flowForwardDLike.startsWith("%")) {
				flowForwardDLike = "%" + flowForwardDLike;
			}
			if (!flowForwardDLike.endsWith("%")) {
				flowForwardDLike = flowForwardDLike + "%";
			}
		}
		return flowForwardDLike;
	}

	public List<String> getFlowForwardDs() {
		return flowForwardDs;
	}

	public Integer getIntandor() {
		return intandor;
	}

	public Integer getIntandorGreaterThanOrEqual() {
		return intandorGreaterThanOrEqual;
	}

	public Integer getIntandorLessThanOrEqual() {
		return intandorLessThanOrEqual;
	}

	public List<Integer> getIntandors() {
		return intandors;
	}

	public Integer getIssave() {
		return issave;
	}

	public Integer getIssaveGreaterThanOrEqual() {
		return issaveGreaterThanOrEqual;
	}

	public Integer getIssaveLessThanOrEqual() {
		return issaveLessThanOrEqual;
	}

	public List<Integer> getIssaves() {
		return issaves;
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

	public String getProcessId() {
		return processId;
	}

	public String getProcessIdLike() {
		if (processIdLike != null && processIdLike.trim().length() > 0) {
			if (!processIdLike.startsWith("%")) {
				processIdLike = "%" + processIdLike;
			}
			if (!processIdLike.endsWith("%")) {
				processIdLike = processIdLike + "%";
			}
		}
		return processIdLike;
	}

	public List<String> getProcessIds() {
		return processIds;
	}

	public String getSqlconDtype() {
		return sqlconDtype;
	}

	public String getSqlconDtypeLike() {
		if (sqlconDtypeLike != null && sqlconDtypeLike.trim().length() > 0) {
			if (!sqlconDtypeLike.startsWith("%")) {
				sqlconDtypeLike = "%" + sqlconDtypeLike;
			}
			if (!sqlconDtypeLike.endsWith("%")) {
				sqlconDtypeLike = sqlconDtypeLike + "%";
			}
		}
		return sqlconDtypeLike;
	}

	public List<String> getSqlconDtypes() {
		return sqlconDtypes;
	}

	public String getSqlconField() {
		return sqlconField;
	}

	public String getSqlconFieldLike() {
		if (sqlconFieldLike != null && sqlconFieldLike.trim().length() > 0) {
			if (!sqlconFieldLike.startsWith("%")) {
				sqlconFieldLike = "%" + sqlconFieldLike;
			}
			if (!sqlconFieldLike.endsWith("%")) {
				sqlconFieldLike = sqlconFieldLike + "%";
			}
		}
		return sqlconFieldLike;
	}

	public List<String> getSqlconFields() {
		return sqlconFields;
	}

	public String getSqlconshow() {
		return sqlconshow;
	}

	public String getSqlconshowLike() {
		if (sqlconshowLike != null && sqlconshowLike.trim().length() > 0) {
			if (!sqlconshowLike.startsWith("%")) {
				sqlconshowLike = "%" + sqlconshowLike;
			}
			if (!sqlconshowLike.endsWith("%")) {
				sqlconshowLike = sqlconshowLike + "%";
			}
		}
		return sqlconshowLike;
	}

	public List<String> getSqlconshows() {
		return sqlconshows;
	}

	public Integer getSqlconType() {
		return sqlconType;
	}

	public Integer getSqlconTypeGreaterThanOrEqual() {
		return sqlconTypeGreaterThanOrEqual;
	}

	public Integer getSqlconTypeLessThanOrEqual() {
		return sqlconTypeLessThanOrEqual;
	}

	public List<Integer> getSqlconTypes() {
		return sqlconTypes;
	}

	public String getSqlconValue() {
		return sqlconValue;
	}

	public String getSqlconValueLike() {
		if (sqlconValueLike != null && sqlconValueLike.trim().length() > 0) {
			if (!sqlconValueLike.startsWith("%")) {
				sqlconValueLike = "%" + sqlconValueLike;
			}
			if (!sqlconValueLike.endsWith("%")) {
				sqlconValueLike = sqlconValueLike + "%";
			}
		}
		return sqlconValueLike;
	}

	public List<String> getSqlconValues() {
		return sqlconValues;
	}

	public String getStrsp() {
		return strsp;
	}

	public String getStrspLike() {
		if (strspLike != null && strspLike.trim().length() > 0) {
			if (!strspLike.startsWith("%")) {
				strspLike = "%" + strspLike;
			}
			if (!strspLike.endsWith("%")) {
				strspLike = strspLike + "%";
			}
		}
		return strspLike;
	}

	public List<String> getStrsps() {
		return strsps;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("processId", "process_id");
		addColumn("flowForwardD", "flow_forward_d");
		addColumn("intandor", "intandor");
		addColumn("sqlconType", "sqlcon_type");
		addColumn("sqlconDtype", "sqlcon_dtype");
		addColumn("sqlconField", "sqlcon_field");
		addColumn("strsp", "strsp");
		addColumn("sqlconValue", "sqlcon_value");
		addColumn("sqlconshow", "sqlconshow");
		addColumn("issave", "issave");
	}

	public FlowForwardSqlDefQuery intandor(Integer intandor) {
		if (intandor == null) {
			throw new RuntimeException("intandor is null");
		}
		this.intandor = intandor;
		return this;
	}

	public FlowForwardSqlDefQuery intandorGreaterThanOrEqual(
			Integer intandorGreaterThanOrEqual) {
		if (intandorGreaterThanOrEqual == null) {
			throw new RuntimeException("intandor is null");
		}
		this.intandorGreaterThanOrEqual = intandorGreaterThanOrEqual;
		return this;
	}

	public FlowForwardSqlDefQuery intandorLessThanOrEqual(
			Integer intandorLessThanOrEqual) {
		if (intandorLessThanOrEqual == null) {
			throw new RuntimeException("intandor is null");
		}
		this.intandorLessThanOrEqual = intandorLessThanOrEqual;
		return this;
	}

	public FlowForwardSqlDefQuery intandors(List<Integer> intandors) {
		if (intandors == null) {
			throw new RuntimeException("intandors is empty ");
		}
		this.intandors = intandors;
		return this;
	}

	public FlowForwardSqlDefQuery issave(Integer issave) {
		if (issave == null) {
			throw new RuntimeException("issave is null");
		}
		this.issave = issave;
		return this;
	}

	public FlowForwardSqlDefQuery issaveGreaterThanOrEqual(
			Integer issaveGreaterThanOrEqual) {
		if (issaveGreaterThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveGreaterThanOrEqual = issaveGreaterThanOrEqual;
		return this;
	}

	public FlowForwardSqlDefQuery issaveLessThanOrEqual(
			Integer issaveLessThanOrEqual) {
		if (issaveLessThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveLessThanOrEqual = issaveLessThanOrEqual;
		return this;
	}

	public FlowForwardSqlDefQuery issaves(List<Integer> issaves) {
		if (issaves == null) {
			throw new RuntimeException("issaves is empty ");
		}
		this.issaves = issaves;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FlowForwardSqlDefQuery processId(String processId) {
		if (processId == null) {
			throw new RuntimeException("processId is null");
		}
		this.processId = processId;
		return this;
	}

	public FlowForwardSqlDefQuery processIdLike(String processIdLike) {
		if (processIdLike == null) {
			throw new RuntimeException("processId is null");
		}
		this.processIdLike = processIdLike;
		return this;
	}

	public FlowForwardSqlDefQuery processIds(List<String> processIds) {
		if (processIds == null) {
			throw new RuntimeException("processIds is empty ");
		}
		this.processIds = processIds;
		return this;
	}

	public void setFlowForwardD(String flowForwardD) {
		this.flowForwardD = flowForwardD;
	}

	public void setFlowForwardDLike(String flowForwardDLike) {
		this.flowForwardDLike = flowForwardDLike;
	}

	public void setFlowForwardDs(List<String> flowForwardDs) {
		this.flowForwardDs = flowForwardDs;
	}

	public void setIntandor(Integer intandor) {
		this.intandor = intandor;
	}

	public void setIntandorGreaterThanOrEqual(Integer intandorGreaterThanOrEqual) {
		this.intandorGreaterThanOrEqual = intandorGreaterThanOrEqual;
	}

	public void setIntandorLessThanOrEqual(Integer intandorLessThanOrEqual) {
		this.intandorLessThanOrEqual = intandorLessThanOrEqual;
	}

	public void setIntandors(List<Integer> intandors) {
		this.intandors = intandors;
	}

	public void setIssave(Integer issave) {
		this.issave = issave;
	}

	public void setIssaveGreaterThanOrEqual(Integer issaveGreaterThanOrEqual) {
		this.issaveGreaterThanOrEqual = issaveGreaterThanOrEqual;
	}

	public void setIssaveLessThanOrEqual(Integer issaveLessThanOrEqual) {
		this.issaveLessThanOrEqual = issaveLessThanOrEqual;
	}

	public void setIssaves(List<Integer> issaves) {
		this.issaves = issaves;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public void setProcessIdLike(String processIdLike) {
		this.processIdLike = processIdLike;
	}

	public void setProcessIds(List<String> processIds) {
		this.processIds = processIds;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setSqlconDtype(String sqlconDtype) {
		this.sqlconDtype = sqlconDtype;
	}

	public void setSqlconDtypeLike(String sqlconDtypeLike) {
		this.sqlconDtypeLike = sqlconDtypeLike;
	}

	public void setSqlconDtypes(List<String> sqlconDtypes) {
		this.sqlconDtypes = sqlconDtypes;
	}

	public void setSqlconField(String sqlconField) {
		this.sqlconField = sqlconField;
	}

	public void setSqlconFieldLike(String sqlconFieldLike) {
		this.sqlconFieldLike = sqlconFieldLike;
	}

	public void setSqlconFields(List<String> sqlconFields) {
		this.sqlconFields = sqlconFields;
	}

	public void setSqlconshow(String sqlconshow) {
		this.sqlconshow = sqlconshow;
	}

	public void setSqlconshowLike(String sqlconshowLike) {
		this.sqlconshowLike = sqlconshowLike;
	}

	public void setSqlconshows(List<String> sqlconshows) {
		this.sqlconshows = sqlconshows;
	}

	public void setSqlconType(Integer sqlconType) {
		this.sqlconType = sqlconType;
	}

	public void setSqlconTypeGreaterThanOrEqual(
			Integer sqlconTypeGreaterThanOrEqual) {
		this.sqlconTypeGreaterThanOrEqual = sqlconTypeGreaterThanOrEqual;
	}

	public void setSqlconTypeLessThanOrEqual(Integer sqlconTypeLessThanOrEqual) {
		this.sqlconTypeLessThanOrEqual = sqlconTypeLessThanOrEqual;
	}

	public void setSqlconTypes(List<Integer> sqlconTypes) {
		this.sqlconTypes = sqlconTypes;
	}

	public void setSqlconValue(String sqlconValue) {
		this.sqlconValue = sqlconValue;
	}

	public void setSqlconValueLike(String sqlconValueLike) {
		this.sqlconValueLike = sqlconValueLike;
	}

	public void setSqlconValues(List<String> sqlconValues) {
		this.sqlconValues = sqlconValues;
	}

	public void setStrsp(String strsp) {
		this.strsp = strsp;
	}

	public void setStrspLike(String strspLike) {
		this.strspLike = strspLike;
	}

	public void setStrsps(List<String> strsps) {
		this.strsps = strsps;
	}

	public FlowForwardSqlDefQuery sqlconDtype(String sqlconDtype) {
		if (sqlconDtype == null) {
			throw new RuntimeException("sqlconDtype is null");
		}
		this.sqlconDtype = sqlconDtype;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconDtypeLike(String sqlconDtypeLike) {
		if (sqlconDtypeLike == null) {
			throw new RuntimeException("sqlconDtype is null");
		}
		this.sqlconDtypeLike = sqlconDtypeLike;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconDtypes(List<String> sqlconDtypes) {
		if (sqlconDtypes == null) {
			throw new RuntimeException("sqlconDtypes is empty ");
		}
		this.sqlconDtypes = sqlconDtypes;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconField(String sqlconField) {
		if (sqlconField == null) {
			throw new RuntimeException("sqlconField is null");
		}
		this.sqlconField = sqlconField;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconFieldLike(String sqlconFieldLike) {
		if (sqlconFieldLike == null) {
			throw new RuntimeException("sqlconField is null");
		}
		this.sqlconFieldLike = sqlconFieldLike;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconFields(List<String> sqlconFields) {
		if (sqlconFields == null) {
			throw new RuntimeException("sqlconFields is empty ");
		}
		this.sqlconFields = sqlconFields;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconshow(String sqlconshow) {
		if (sqlconshow == null) {
			throw new RuntimeException("sqlconshow is null");
		}
		this.sqlconshow = sqlconshow;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconshowLike(String sqlconshowLike) {
		if (sqlconshowLike == null) {
			throw new RuntimeException("sqlconshow is null");
		}
		this.sqlconshowLike = sqlconshowLike;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconshows(List<String> sqlconshows) {
		if (sqlconshows == null) {
			throw new RuntimeException("sqlconshows is empty ");
		}
		this.sqlconshows = sqlconshows;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconType(Integer sqlconType) {
		if (sqlconType == null) {
			throw new RuntimeException("sqlconType is null");
		}
		this.sqlconType = sqlconType;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconTypeGreaterThanOrEqual(
			Integer sqlconTypeGreaterThanOrEqual) {
		if (sqlconTypeGreaterThanOrEqual == null) {
			throw new RuntimeException("sqlconType is null");
		}
		this.sqlconTypeGreaterThanOrEqual = sqlconTypeGreaterThanOrEqual;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconTypeLessThanOrEqual(
			Integer sqlconTypeLessThanOrEqual) {
		if (sqlconTypeLessThanOrEqual == null) {
			throw new RuntimeException("sqlconType is null");
		}
		this.sqlconTypeLessThanOrEqual = sqlconTypeLessThanOrEqual;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconTypes(List<Integer> sqlconTypes) {
		if (sqlconTypes == null) {
			throw new RuntimeException("sqlconTypes is empty ");
		}
		this.sqlconTypes = sqlconTypes;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconValue(String sqlconValue) {
		if (sqlconValue == null) {
			throw new RuntimeException("sqlconValue is null");
		}
		this.sqlconValue = sqlconValue;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconValueLike(String sqlconValueLike) {
		if (sqlconValueLike == null) {
			throw new RuntimeException("sqlconValue is null");
		}
		this.sqlconValueLike = sqlconValueLike;
		return this;
	}

	public FlowForwardSqlDefQuery sqlconValues(List<String> sqlconValues) {
		if (sqlconValues == null) {
			throw new RuntimeException("sqlconValues is empty ");
		}
		this.sqlconValues = sqlconValues;
		return this;
	}

	public FlowForwardSqlDefQuery strsp(String strsp) {
		if (strsp == null) {
			throw new RuntimeException("strsp is null");
		}
		this.strsp = strsp;
		return this;
	}

	public FlowForwardSqlDefQuery strspLike(String strspLike) {
		if (strspLike == null) {
			throw new RuntimeException("strsp is null");
		}
		this.strspLike = strspLike;
		return this;
	}

	public FlowForwardSqlDefQuery strsps(List<String> strsps) {
		if (strsps == null) {
			throw new RuntimeException("strsps is empty ");
		}
		this.strsps = strsps;
		return this;
	}

}