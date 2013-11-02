package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellDataTableQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String id;
	protected String idLike;
	protected String tablename;
	protected String tablenameLike;
	protected List<String> tablenames;
	protected String name;
	protected String nameLike;
	protected List<String> names;
	protected Integer addtype;
	protected Integer addtypeGreaterThanOrEqual;
	protected Integer addtypeLessThanOrEqual;
	protected List<Integer> addtypes;
	protected Integer maxuser;
	protected Integer maxuserGreaterThanOrEqual;
	protected Integer maxuserLessThanOrEqual;
	protected List<Integer> maxusers;
	protected Integer maxsys;
	protected Integer maxsysGreaterThanOrEqual;
	protected Integer maxsysLessThanOrEqual;
	protected List<Integer> maxsyss;
	protected String userid;
	protected String useridLike;
	protected List<String> userids;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected String contentLike;
	protected String sysnum;
	protected String sysnumLike;
	protected List<String> sysnums;
	protected String issubtable;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected String filedotFileid;
	protected String filedotFileidLike;
	protected List<String> filedotFileids;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	

	public CellDataTableQuery() {

	}

	public String getIdLike() {
		if (idLike != null && idLike.trim().length() > 0) {
			if (!idLike.startsWith("%")) {
				idLike = "%" + idLike;
			}
			if (!idLike.endsWith("%")) {
				idLike = idLike + "%";
			}
		}
		return idLike;
	}

	public void setIdLike(String idLike) {
		this.idLike = idLike;
	}

	public CellDataTableQuery addtype(Integer addtype) {
		if (addtype == null) {
			throw new RuntimeException("addtype is null");
		}
		this.addtype = addtype;
		return this;
	}

	public CellDataTableQuery addtypeGreaterThanOrEqual(
			Integer addtypeGreaterThanOrEqual) {
		if (addtypeGreaterThanOrEqual == null) {
			throw new RuntimeException("addtype is null");
		}
		this.addtypeGreaterThanOrEqual = addtypeGreaterThanOrEqual;
		return this;
	}

	public CellDataTableQuery addtypeLessThanOrEqual(
			Integer addtypeLessThanOrEqual) {
		if (addtypeLessThanOrEqual == null) {
			throw new RuntimeException("addtype is null");
		}
		this.addtypeLessThanOrEqual = addtypeLessThanOrEqual;
		return this;
	}

	public CellDataTableQuery addtypes(List<Integer> addtypes) {
		if (addtypes == null) {
			throw new RuntimeException("addtypes is empty ");
		}
		this.addtypes = addtypes;
		return this;
	}

	public CellDataTableQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public CellDataTableQuery ctimeGreaterThanOrEqual(
			Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public CellDataTableQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public CellDataTableQuery filedotFileid(String filedotFileid) {
		if (filedotFileid == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileid = filedotFileid;
		return this;
	}

	public CellDataTableQuery filedotFileidLike(String filedotFileidLike) {
		if (filedotFileidLike == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileidLike = filedotFileidLike;
		return this;
	}

	public CellDataTableQuery filedotFileids(List<String> filedotFileids) {
		if (filedotFileids == null) {
			throw new RuntimeException("filedotFileids is empty ");
		}
		this.filedotFileids = filedotFileids;
		return this;
	}

	public Integer getAddtype() {
		return addtype;
	}

	public Integer getAddtypeGreaterThanOrEqual() {
		return addtypeGreaterThanOrEqual;
	}

	public Integer getAddtypeLessThanOrEqual() {
		return addtypeLessThanOrEqual;
	}

	public List<Integer> getAddtypes() {
		return addtypes;
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

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
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

	public String getId() {
		return id;
	}

	public Integer getIndexId() {
		return indexId;
	}

	public Integer getIndexIdGreaterThanOrEqual() {
		return indexIdGreaterThanOrEqual;
	}

	public Integer getIndexIdLessThanOrEqual() {
		return indexIdLessThanOrEqual;
	}

	public List<Integer> getIndexIds() {
		return indexIds;
	}

	public String getIssubtable() {
		return issubtable;
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

	public String getName() {
		return name;
	}

	public String getNameLike() {
		if (nameLike != null && nameLike.trim().length() > 0) {
			if (!nameLike.startsWith("%")) {
				nameLike = "%" + nameLike;
			}
			if (!nameLike.endsWith("%")) {
				nameLike = nameLike + "%";
			}
		}
		return nameLike;
	}

	public List<String> getNames() {
		return names;
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

	public String getTopid() {
		return topid;
	}

	public String getTopidLike() {
		if (topidLike != null && topidLike.trim().length() > 0) {
			if (!topidLike.startsWith("%")) {
				topidLike = "%" + topidLike;
			}
			if (!topidLike.endsWith("%")) {
				topidLike = topidLike + "%";
			}
		}
		return topidLike;
	}

	public List<String> getTopids() {
		return topids;
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

	public CellDataTableQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellDataTableQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public CellDataTableQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public CellDataTableQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("tablename", "tablename");
		addColumn("name", "name");
		addColumn("addtype", "addtype");
		addColumn("maxuser", "maxuser");
		addColumn("maxsys", "maxsys");
		addColumn("userid", "userid");
		addColumn("ctime", "ctime");
		addColumn("content", "content");
		addColumn("sysnum", "sysnum");
		addColumn("issubtable", "issubtable");
		addColumn("topid", "topid");
		addColumn("filedotFileid", "filedot_fileid");
		addColumn("indexId", "index_id");
		addColumn("winWidth", "win_width");
		addColumn("winHeight", "win_height");
		addColumn("intQuote", "intQuote");
		addColumn("intLineEdit", "intLineEdit");
		addColumn("printfileid", "printfileid");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellDataTableQuery issubtable(String issubtable) {
		if (issubtable == null) {
			throw new RuntimeException("issubtable is null");
		}
		this.issubtable = issubtable;
		return this;
	}

	public CellDataTableQuery maxsys(Integer maxsys) {
		if (maxsys == null) {
			throw new RuntimeException("maxsys is null");
		}
		this.maxsys = maxsys;
		return this;
	}

	public CellDataTableQuery maxsysGreaterThanOrEqual(
			Integer maxsysGreaterThanOrEqual) {
		if (maxsysGreaterThanOrEqual == null) {
			throw new RuntimeException("maxsys is null");
		}
		this.maxsysGreaterThanOrEqual = maxsysGreaterThanOrEqual;
		return this;
	}

	public CellDataTableQuery maxsysLessThanOrEqual(
			Integer maxsysLessThanOrEqual) {
		if (maxsysLessThanOrEqual == null) {
			throw new RuntimeException("maxsys is null");
		}
		this.maxsysLessThanOrEqual = maxsysLessThanOrEqual;
		return this;
	}

	public CellDataTableQuery maxsyss(List<Integer> maxsyss) {
		if (maxsyss == null) {
			throw new RuntimeException("maxsyss is empty ");
		}
		this.maxsyss = maxsyss;
		return this;
	}

	public CellDataTableQuery maxuser(Integer maxuser) {
		if (maxuser == null) {
			throw new RuntimeException("maxuser is null");
		}
		this.maxuser = maxuser;
		return this;
	}

	public CellDataTableQuery maxuserGreaterThanOrEqual(
			Integer maxuserGreaterThanOrEqual) {
		if (maxuserGreaterThanOrEqual == null) {
			throw new RuntimeException("maxuser is null");
		}
		this.maxuserGreaterThanOrEqual = maxuserGreaterThanOrEqual;
		return this;
	}

	public CellDataTableQuery maxuserLessThanOrEqual(
			Integer maxuserLessThanOrEqual) {
		if (maxuserLessThanOrEqual == null) {
			throw new RuntimeException("maxuser is null");
		}
		this.maxuserLessThanOrEqual = maxuserLessThanOrEqual;
		return this;
	}

	public CellDataTableQuery maxusers(List<Integer> maxusers) {
		if (maxusers == null) {
			throw new RuntimeException("maxusers is empty ");
		}
		this.maxusers = maxusers;
		return this;
	}

	public CellDataTableQuery name(String name) {
		if (name == null) {
			throw new RuntimeException("name is null");
		}
		this.name = name;
		return this;
	}

	public CellDataTableQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public CellDataTableQuery names(List<String> names) {
		if (names == null) {
			throw new RuntimeException("names is empty ");
		}
		this.names = names;
		return this;
	}

	public void setAddtype(Integer addtype) {
		this.addtype = addtype;
	}

	public void setAddtypeGreaterThanOrEqual(Integer addtypeGreaterThanOrEqual) {
		this.addtypeGreaterThanOrEqual = addtypeGreaterThanOrEqual;
	}

	public void setAddtypeLessThanOrEqual(Integer addtypeLessThanOrEqual) {
		this.addtypeLessThanOrEqual = addtypeLessThanOrEqual;
	}

	public void setAddtypes(List<Integer> addtypes) {
		this.addtypes = addtypes;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
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

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setIndexIdGreaterThanOrEqual(Integer indexIdGreaterThanOrEqual) {
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
	}

	public void setIndexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
	}

	public void setIndexIds(List<Integer> indexIds) {
		this.indexIds = indexIds;
	}

	public void setIssubtable(String issubtable) {
		this.issubtable = issubtable;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setNames(List<String> names) {
		this.names = names;
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

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setTablenameLike(String tablenameLike) {
		this.tablenameLike = tablenameLike;
	}

	public void setTablenames(List<String> tablenames) {
		this.tablenames = tablenames;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTopidLike(String topidLike) {
		this.topidLike = topidLike;
	}

	public void setTopids(List<String> topids) {
		this.topids = topids;
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

	public CellDataTableQuery sysnum(String sysnum) {
		if (sysnum == null) {
			throw new RuntimeException("sysnum is null");
		}
		this.sysnum = sysnum;
		return this;
	}

	public CellDataTableQuery sysnumLike(String sysnumLike) {
		if (sysnumLike == null) {
			throw new RuntimeException("sysnum is null");
		}
		this.sysnumLike = sysnumLike;
		return this;
	}

	public CellDataTableQuery sysnums(List<String> sysnums) {
		if (sysnums == null) {
			throw new RuntimeException("sysnums is empty ");
		}
		this.sysnums = sysnums;
		return this;
	}

	public CellDataTableQuery tablename(String tablename) {
		if (tablename == null) {
			throw new RuntimeException("tablename is null");
		}
		this.tablename = tablename;
		return this;
	}

	public CellDataTableQuery tablenameLike(String tablenameLike) {
		if (tablenameLike == null) {
			throw new RuntimeException("tablename is null");
		}
		this.tablenameLike = tablenameLike;
		return this;
	}

	public CellDataTableQuery tablenames(List<String> tablenames) {
		if (tablenames == null) {
			throw new RuntimeException("tablenames is empty ");
		}
		this.tablenames = tablenames;
		return this;
	}

	public CellDataTableQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public CellDataTableQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public CellDataTableQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public CellDataTableQuery userid(String userid) {
		if (userid == null) {
			throw new RuntimeException("userid is null");
		}
		this.userid = userid;
		return this;
	}

	public CellDataTableQuery useridLike(String useridLike) {
		if (useridLike == null) {
			throw new RuntimeException("userid is null");
		}
		this.useridLike = useridLike;
		return this;
	}

	public CellDataTableQuery userids(List<String> userids) {
		if (userids == null) {
			throw new RuntimeException("userids is empty ");
		}
		this.userids = userids;
		return this;
	}

}