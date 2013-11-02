package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellDataFieldQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String tableid;
	protected String tableidLike;
	protected List<String> tableids;
	protected String fieldname;
	protected String fieldnameLike;
	protected List<String> fieldnames;
	protected String userid;
	protected String useridLike;
	protected List<String> userids;
	protected Integer maxuser;
	protected Integer maxuserGreaterThanOrEqual;
	protected Integer maxuserLessThanOrEqual;
	protected List<Integer> maxusers;
	protected Integer maxsys;
	protected Integer maxsysGreaterThanOrEqual;
	protected Integer maxsysLessThanOrEqual;
	protected List<Integer> maxsyss;
	protected Date ctime;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected List<Date> ctimes;
	protected String sysnum;
	protected String sysnumLike;
	protected List<String> sysnums;
	protected String tablename;
	protected String tablenameLike;
	protected List<String> tablenames;
	protected String dname;
	protected String dnameLike;
	protected List<String> dnames;
	protected String userindex;
	protected String userindexLike;
	protected List<String> userindexs;
	protected String treetablenameB;
	protected String treetablenameBLike;
	protected List<String> treetablenameBs;
	

	public CellDataFieldQuery() {

	}

	public CellDataFieldQuery ctime(Date ctime) {
		if (ctime == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctime = ctime;
		return this;
	}

	public CellDataFieldQuery ctimeGreaterThanOrEqual(
			Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public CellDataFieldQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public CellDataFieldQuery ctimes(List<Date> ctimes) {
		if (ctimes == null) {
			throw new RuntimeException("ctimes is empty ");
		}
		this.ctimes = ctimes;
		return this;
	}

	public CellDataFieldQuery dname(String dname) {
		if (dname == null) {
			throw new RuntimeException("dname is null");
		}
		this.dname = dname;
		return this;
	}

	public CellDataFieldQuery dnameLike(String dnameLike) {
		if (dnameLike == null) {
			throw new RuntimeException("dname is null");
		}
		this.dnameLike = dnameLike;
		return this;
	}

	public CellDataFieldQuery dnames(List<String> dnames) {
		if (dnames == null) {
			throw new RuntimeException("dnames is empty ");
		}
		this.dnames = dnames;
		return this;
	}

	public CellDataFieldQuery fieldname(String fieldname) {
		if (fieldname == null) {
			throw new RuntimeException("fieldname is null");
		}
		this.fieldname = fieldname;
		return this;
	}

	public CellDataFieldQuery fieldnameLike(String fieldnameLike) {
		if (fieldnameLike == null) {
			throw new RuntimeException("fieldname is null");
		}
		this.fieldnameLike = fieldnameLike;
		return this;
	}

	public CellDataFieldQuery fieldnames(List<String> fieldnames) {
		if (fieldnames == null) {
			throw new RuntimeException("fieldnames is empty ");
		}
		this.fieldnames = fieldnames;
		return this;
	}

	public Date getCtime() {
		return ctime;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public List<Date> getCtimes() {
		return ctimes;
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

	public String getFieldname() {
		return fieldname;
	}

	public String getFieldnameLike() {
		if (fieldnameLike != null && fieldnameLike.trim().length() > 0) {
			if (!fieldnameLike.startsWith("%")) {
				fieldnameLike = "%" + fieldnameLike;
			}
			if (!fieldnameLike.endsWith("%")) {
				fieldnameLike = fieldnameLike + "%";
			}
		}
		return fieldnameLike;
	}

	public List<String> getFieldnames() {
		return fieldnames;
	}

	public Integer getMaxsys() {
		return maxsys;
	}

	public Integer getMaxsysGreaterThanOrEqual() {
		return maxsysGreaterThanOrEqual;
	}

	public Integer getMaxsysLessThanOrEqual() {
		return maxsysLessThanOrEqual;
	}

	public List<Integer> getMaxsyss() {
		return maxsyss;
	}

	public Integer getMaxuser() {
		return maxuser;
	}

	public Integer getMaxuserGreaterThanOrEqual() {
		return maxuserGreaterThanOrEqual;
	}

	public Integer getMaxuserLessThanOrEqual() {
		return maxuserLessThanOrEqual;
	}

	public List<Integer> getMaxusers() {
		return maxusers;
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

	public String getSysnum() {
		return sysnum;
	}

	public String getSysnumLike() {
		if (sysnumLike != null && sysnumLike.trim().length() > 0) {
			if (!sysnumLike.startsWith("%")) {
				sysnumLike = "%" + sysnumLike;
			}
			if (!sysnumLike.endsWith("%")) {
				sysnumLike = sysnumLike + "%";
			}
		}
		return sysnumLike;
	}

	public List<String> getSysnums() {
		return sysnums;
	}

	public String getTableid() {
		return tableid;
	}

	public String getTableidLike() {
		if (tableidLike != null && tableidLike.trim().length() > 0) {
			if (!tableidLike.startsWith("%")) {
				tableidLike = "%" + tableidLike;
			}
			if (!tableidLike.endsWith("%")) {
				tableidLike = tableidLike + "%";
			}
		}
		return tableidLike;
	}

	public List<String> getTableids() {
		return tableids;
	}

	public String getTablename() {
		return tablename;
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

	public String getTreetablenameB() {
		return treetablenameB;
	}

	public String getTreetablenameBLike() {
		if (treetablenameBLike != null
				&& treetablenameBLike.trim().length() > 0) {
			if (!treetablenameBLike.startsWith("%")) {
				treetablenameBLike = "%" + treetablenameBLike;
			}
			if (!treetablenameBLike.endsWith("%")) {
				treetablenameBLike = treetablenameBLike + "%";
			}
		}
		return treetablenameBLike;
	}

	public List<String> getTreetablenameBs() {
		return treetablenameBs;
	}

	public String getUserid() {
		return userid;
	}

	public String getUseridLike() {
		if (useridLike != null && useridLike.trim().length() > 0) {
			if (!useridLike.startsWith("%")) {
				useridLike = "%" + useridLike;
			}
			if (!useridLike.endsWith("%")) {
				useridLike = useridLike + "%";
			}
		}
		return useridLike;
	}

	public List<String> getUserids() {
		return userids;
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

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("tableid", "tableid");
		addColumn("fieldname", "fieldname");
		addColumn("userid", "userid");
		addColumn("maxuser", "maxuser");
		addColumn("maxsys", "maxsys");
		addColumn("ctime", "ctime");
		addColumn("sysnum", "sysnum");
		addColumn("tablename", "tablename");
		addColumn("dname", "dname");
		addColumn("userindex", "userindex");
		addColumn("treetablenameB", "treetablename_b");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellDataFieldQuery maxsys(Integer maxsys) {
		if (maxsys == null) {
			throw new RuntimeException("maxsys is null");
		}
		this.maxsys = maxsys;
		return this;
	}

	public CellDataFieldQuery maxsysGreaterThanOrEqual(
			Integer maxsysGreaterThanOrEqual) {
		if (maxsysGreaterThanOrEqual == null) {
			throw new RuntimeException("maxsys is null");
		}
		this.maxsysGreaterThanOrEqual = maxsysGreaterThanOrEqual;
		return this;
	}

	public CellDataFieldQuery maxsysLessThanOrEqual(
			Integer maxsysLessThanOrEqual) {
		if (maxsysLessThanOrEqual == null) {
			throw new RuntimeException("maxsys is null");
		}
		this.maxsysLessThanOrEqual = maxsysLessThanOrEqual;
		return this;
	}

	public CellDataFieldQuery maxsyss(List<Integer> maxsyss) {
		if (maxsyss == null) {
			throw new RuntimeException("maxsyss is empty ");
		}
		this.maxsyss = maxsyss;
		return this;
	}

	public CellDataFieldQuery maxuser(Integer maxuser) {
		if (maxuser == null) {
			throw new RuntimeException("maxuser is null");
		}
		this.maxuser = maxuser;
		return this;
	}

	public CellDataFieldQuery maxuserGreaterThanOrEqual(
			Integer maxuserGreaterThanOrEqual) {
		if (maxuserGreaterThanOrEqual == null) {
			throw new RuntimeException("maxuser is null");
		}
		this.maxuserGreaterThanOrEqual = maxuserGreaterThanOrEqual;
		return this;
	}

	public CellDataFieldQuery maxuserLessThanOrEqual(
			Integer maxuserLessThanOrEqual) {
		if (maxuserLessThanOrEqual == null) {
			throw new RuntimeException("maxuser is null");
		}
		this.maxuserLessThanOrEqual = maxuserLessThanOrEqual;
		return this;
	}

	public CellDataFieldQuery maxusers(List<Integer> maxusers) {
		if (maxusers == null) {
			throw new RuntimeException("maxusers is empty ");
		}
		this.maxusers = maxusers;
		return this;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setCtimes(List<Date> ctimes) {
		this.ctimes = ctimes;
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

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public void setFieldnameLike(String fieldnameLike) {
		this.fieldnameLike = fieldnameLike;
	}

	public void setFieldnames(List<String> fieldnames) {
		this.fieldnames = fieldnames;
	}

	public void setMaxsys(Integer maxsys) {
		this.maxsys = maxsys;
	}

	public void setMaxsysGreaterThanOrEqual(Integer maxsysGreaterThanOrEqual) {
		this.maxsysGreaterThanOrEqual = maxsysGreaterThanOrEqual;
	}

	public void setMaxsysLessThanOrEqual(Integer maxsysLessThanOrEqual) {
		this.maxsysLessThanOrEqual = maxsysLessThanOrEqual;
	}

	public void setMaxsyss(List<Integer> maxsyss) {
		this.maxsyss = maxsyss;
	}

	public void setMaxuser(Integer maxuser) {
		this.maxuser = maxuser;
	}

	public void setMaxuserGreaterThanOrEqual(Integer maxuserGreaterThanOrEqual) {
		this.maxuserGreaterThanOrEqual = maxuserGreaterThanOrEqual;
	}

	public void setMaxuserLessThanOrEqual(Integer maxuserLessThanOrEqual) {
		this.maxuserLessThanOrEqual = maxuserLessThanOrEqual;
	}

	public void setMaxusers(List<Integer> maxusers) {
		this.maxusers = maxusers;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setSysnum(String sysnum) {
		this.sysnum = sysnum;
	}

	public void setSysnumLike(String sysnumLike) {
		this.sysnumLike = sysnumLike;
	}

	public void setSysnums(List<String> sysnums) {
		this.sysnums = sysnums;
	}

	public void setTableid(String tableid) {
		this.tableid = tableid;
	}

	public void setTableidLike(String tableidLike) {
		this.tableidLike = tableidLike;
	}

	public void setTableids(List<String> tableids) {
		this.tableids = tableids;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setTablenameLike(String tablenameLike) {
		this.tablenameLike = tablenameLike;
	}

	public void setTablenames(List<String> tablenames) {
		this.tablenames = tablenames;
	}

	public void setTreetablenameB(String treetablenameB) {
		this.treetablenameB = treetablenameB;
	}

	public void setTreetablenameBLike(String treetablenameBLike) {
		this.treetablenameBLike = treetablenameBLike;
	}

	public void setTreetablenameBs(List<String> treetablenameBs) {
		this.treetablenameBs = treetablenameBs;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUseridLike(String useridLike) {
		this.useridLike = useridLike;
	}

	public void setUserids(List<String> userids) {
		this.userids = userids;
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

	public CellDataFieldQuery sysnum(String sysnum) {
		if (sysnum == null) {
			throw new RuntimeException("sysnum is null");
		}
		this.sysnum = sysnum;
		return this;
	}

	public CellDataFieldQuery sysnumLike(String sysnumLike) {
		if (sysnumLike == null) {
			throw new RuntimeException("sysnum is null");
		}
		this.sysnumLike = sysnumLike;
		return this;
	}

	public CellDataFieldQuery sysnums(List<String> sysnums) {
		if (sysnums == null) {
			throw new RuntimeException("sysnums is empty ");
		}
		this.sysnums = sysnums;
		return this;
	}

	public CellDataFieldQuery tableid(String tableid) {
		if (tableid == null) {
			throw new RuntimeException("tableid is null");
		}
		this.tableid = tableid;
		return this;
	}

	public CellDataFieldQuery tableidLike(String tableidLike) {
		if (tableidLike == null) {
			throw new RuntimeException("tableid is null");
		}
		this.tableidLike = tableidLike;
		return this;
	}

	public CellDataFieldQuery tableids(List<String> tableids) {
		if (tableids == null) {
			throw new RuntimeException("tableids is empty ");
		}
		this.tableids = tableids;
		return this;
	}

	public CellDataFieldQuery tablename(String tablename) {
		if (tablename == null) {
			throw new RuntimeException("tablename is null");
		}
		this.tablename = tablename;
		return this;
	}

	public CellDataFieldQuery tablenameLike(String tablenameLike) {
		if (tablenameLike == null) {
			throw new RuntimeException("tablename is null");
		}
		this.tablenameLike = tablenameLike;
		return this;
	}

	public CellDataFieldQuery tablenames(List<String> tablenames) {
		if (tablenames == null) {
			throw new RuntimeException("tablenames is empty ");
		}
		this.tablenames = tablenames;
		return this;
	}

	public CellDataFieldQuery treetablenameB(String treetablenameB) {
		if (treetablenameB == null) {
			throw new RuntimeException("treetablenameB is null");
		}
		this.treetablenameB = treetablenameB;
		return this;
	}

	public CellDataFieldQuery treetablenameBLike(String treetablenameBLike) {
		if (treetablenameBLike == null) {
			throw new RuntimeException("treetablenameB is null");
		}
		this.treetablenameBLike = treetablenameBLike;
		return this;
	}

	public CellDataFieldQuery treetablenameBs(List<String> treetablenameBs) {
		if (treetablenameBs == null) {
			throw new RuntimeException("treetablenameBs is empty ");
		}
		this.treetablenameBs = treetablenameBs;
		return this;
	}

	public CellDataFieldQuery userid(String userid) {
		if (userid == null) {
			throw new RuntimeException("userid is null");
		}
		this.userid = userid;
		return this;
	}

	public CellDataFieldQuery useridLike(String useridLike) {
		if (useridLike == null) {
			throw new RuntimeException("userid is null");
		}
		this.useridLike = useridLike;
		return this;
	}

	public CellDataFieldQuery userids(List<String> userids) {
		if (userids == null) {
			throw new RuntimeException("userids is empty ");
		}
		this.userids = userids;
		return this;
	}

	public CellDataFieldQuery userindex(String userindex) {
		if (userindex == null) {
			throw new RuntimeException("userindex is null");
		}
		this.userindex = userindex;
		return this;
	}

	public CellDataFieldQuery userindexLike(String userindexLike) {
		if (userindexLike == null) {
			throw new RuntimeException("userindex is null");
		}
		this.userindexLike = userindexLike;
		return this;
	}

	public CellDataFieldQuery userindexs(List<String> userindexs) {
		if (userindexs == null) {
			throw new RuntimeException("userindexs is empty ");
		}
		this.userindexs = userindexs;
		return this;
	}

}