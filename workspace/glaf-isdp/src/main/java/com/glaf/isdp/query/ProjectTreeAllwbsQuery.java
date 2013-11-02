package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class ProjectTreeAllwbsQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected String numLike;
	protected String indexNameLike;
	protected Integer cellTaskIndexId;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String contentLike;
	protected Integer type;
	protected Integer typeGreaterThanOrEqual;
	protected Integer typeLessThanOrEqual;
	protected List<Integer> types;
	protected Integer roleid;
	protected Integer roleidGreaterThanOrEqual;
	protected Integer roleidLessThanOrEqual;
	protected List<Integer> roleids;
	protected String rolename;
	protected String rolenameLike;
	protected List<String> rolenames;
	protected Integer limtime;
	protected Integer limtimeGreaterThanOrEqual;
	protected Integer limtimeLessThanOrEqual;
	protected List<Integer> limtimes;
	protected String userid;
	protected String useridLike;
	protected List<String> userids;
	protected String username;
	protected String usernameLike;
	protected List<String> usernames;
	protected Date starttimeGreaterThanOrEqual;
	protected Date starttimeLessThanOrEqual;
	protected Date endtimeGreaterThanOrEqual;
	protected Date endtimeLessThanOrEqual;
	protected Long useday;
	protected Long usedayGreaterThanOrEqual;
	protected Long usedayLessThanOrEqual;
	protected List<Long> usedays;
	protected Integer intfinish;
	protected Integer intfinishGreaterThanOrEqual;
	protected Integer intfinishLessThanOrEqual;
	protected List<Integer> intfinishs;
	protected String mainId;
	protected String mainIdLike;
	protected List<String> mainIds;
	

	public ProjectTreeAllwbsQuery() {

	}

	public ProjectTreeAllwbsQuery cellTaskIndexId(Integer cellTaskIndexId) {
		if (cellTaskIndexId == null) {
			throw new RuntimeException("cellTaskIndexId is null");
		}
		this.cellTaskIndexId = cellTaskIndexId;
		return this;
	}

	public ProjectTreeAllwbsQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public ProjectTreeAllwbsQuery endtimeGreaterThanOrEqual(
			Date endtimeGreaterThanOrEqual) {
		if (endtimeGreaterThanOrEqual == null) {
			throw new RuntimeException("endtime is null");
		}
		this.endtimeGreaterThanOrEqual = endtimeGreaterThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery endtimeLessThanOrEqual(
			Date endtimeLessThanOrEqual) {
		if (endtimeLessThanOrEqual == null) {
			throw new RuntimeException("endtime is null");
		}
		this.endtimeLessThanOrEqual = endtimeLessThanOrEqual;
		return this;
	}

	public Integer getCellTaskIndexId() {
		return cellTaskIndexId;
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

	public Date getEndtimeGreaterThanOrEqual() {
		return endtimeGreaterThanOrEqual;
	}

	public Date getEndtimeLessThanOrEqual() {
		return endtimeLessThanOrEqual;
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

	public List<String> getIds() {
		return ids;
	}

	public String getIndexNameLike() {
		if (indexNameLike != null && indexNameLike.trim().length() > 0) {
			if (!indexNameLike.startsWith("%")) {
				indexNameLike = "%" + indexNameLike;
			}
			if (!indexNameLike.endsWith("%")) {
				indexNameLike = indexNameLike + "%";
			}
		}
		return indexNameLike;
	}

	public Integer getIntfinish() {
		return intfinish;
	}

	public Integer getIntfinishGreaterThanOrEqual() {
		return intfinishGreaterThanOrEqual;
	}

	public Integer getIntfinishLessThanOrEqual() {
		return intfinishLessThanOrEqual;
	}

	public List<Integer> getIntfinishs() {
		return intfinishs;
	}

	public Integer getLimtime() {
		return limtime;
	}

	public Integer getLimtimeGreaterThanOrEqual() {
		return limtimeGreaterThanOrEqual;
	}

	public Integer getLimtimeLessThanOrEqual() {
		return limtimeLessThanOrEqual;
	}

	public List<Integer> getLimtimes() {
		return limtimes;
	}

	public String getMainId() {
		return mainId;
	}

	public String getMainIdLike() {
		if (mainIdLike != null && mainIdLike.trim().length() > 0) {
			if (!mainIdLike.startsWith("%")) {
				mainIdLike = "%" + mainIdLike;
			}
			if (!mainIdLike.endsWith("%")) {
				mainIdLike = mainIdLike + "%";
			}
		}
		return mainIdLike;
	}

	public List<String> getMainIds() {
		return mainIds;
	}

	public Integer getNlevel() {
		return nlevel;
	}

	public Integer getNlevelGreaterThanOrEqual() {
		return nlevelGreaterThanOrEqual;
	}

	public Integer getNlevelLessThanOrEqual() {
		return nlevelLessThanOrEqual;
	}

	public List<Integer> getNlevels() {
		return nlevels;
	}

	public String getNumLike() {
		if (numLike != null && numLike.trim().length() > 0) {
			if (!numLike.startsWith("%")) {
				numLike = "%" + numLike;
			}
			if (!numLike.endsWith("%")) {
				numLike = numLike + "%";
			}
		}
		return numLike;
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

	public Integer getRoleid() {
		return roleid;
	}

	public Integer getRoleidGreaterThanOrEqual() {
		return roleidGreaterThanOrEqual;
	}

	public Integer getRoleidLessThanOrEqual() {
		return roleidLessThanOrEqual;
	}

	public List<Integer> getRoleids() {
		return roleids;
	}

	public String getRolename() {
		return rolename;
	}

	public String getRolenameLike() {
		if (rolenameLike != null && rolenameLike.trim().length() > 0) {
			if (!rolenameLike.startsWith("%")) {
				rolenameLike = "%" + rolenameLike;
			}
			if (!rolenameLike.endsWith("%")) {
				rolenameLike = rolenameLike + "%";
			}
		}
		return rolenameLike;
	}

	public List<String> getRolenames() {
		return rolenames;
	}

	public Date getStarttimeGreaterThanOrEqual() {
		return starttimeGreaterThanOrEqual;
	}

	public Date getStarttimeLessThanOrEqual() {
		return starttimeLessThanOrEqual;
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

	public Long getUseday() {
		return useday;
	}

	public Long getUsedayGreaterThanOrEqual() {
		return usedayGreaterThanOrEqual;
	}

	public Long getUsedayLessThanOrEqual() {
		return usedayLessThanOrEqual;
	}

	public List<Long> getUsedays() {
		return usedays;
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

	public String getUsername() {
		return username;
	}

	public String getUsernameLike() {
		if (usernameLike != null && usernameLike.trim().length() > 0) {
			if (!usernameLike.startsWith("%")) {
				usernameLike = "%" + usernameLike;
			}
			if (!usernameLike.endsWith("%")) {
				usernameLike = usernameLike + "%";
			}
		}
		return usernameLike;
	}

	public List<String> getUsernames() {
		return usernames;
	}

	public ProjectTreeAllwbsQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public ProjectTreeAllwbsQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public ProjectTreeAllwbsQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("indexId", "index_id");
		addColumn("parentId", "parent_id");
		addColumn("id", "id");
		addColumn("num", "num");
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("content", "content");
		addColumn("nodeico", "nodeico");
		addColumn("listno", "listno");
		addColumn("type", "type");
		addColumn("roleid", "roleid");
		addColumn("rolename", "rolename");
		addColumn("limtime", "limtime");
		addColumn("userid", "userid");
		addColumn("username", "username");
		addColumn("starttime", "starttime");
		addColumn("endtime", "endtime");
		addColumn("useday", "useday");
		addColumn("intfinish", "intfinish");
		addColumn("mainId", "main_id");
	}

	public ProjectTreeAllwbsQuery intfinish(Integer intfinish) {
		if (intfinish == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinish = intfinish;
		return this;
	}

	public ProjectTreeAllwbsQuery intfinishGreaterThanOrEqual(
			Integer intfinishGreaterThanOrEqual) {
		if (intfinishGreaterThanOrEqual == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinishGreaterThanOrEqual = intfinishGreaterThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery intfinishLessThanOrEqual(
			Integer intfinishLessThanOrEqual) {
		if (intfinishLessThanOrEqual == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinishLessThanOrEqual = intfinishLessThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery intfinishs(List<Integer> intfinishs) {
		if (intfinishs == null) {
			throw new RuntimeException("intfinishs is empty ");
		}
		this.intfinishs = intfinishs;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public ProjectTreeAllwbsQuery limtime(Integer limtime) {
		if (limtime == null) {
			throw new RuntimeException("limtime is null");
		}
		this.limtime = limtime;
		return this;
	}

	public ProjectTreeAllwbsQuery limtimeGreaterThanOrEqual(
			Integer limtimeGreaterThanOrEqual) {
		if (limtimeGreaterThanOrEqual == null) {
			throw new RuntimeException("limtime is null");
		}
		this.limtimeGreaterThanOrEqual = limtimeGreaterThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery limtimeLessThanOrEqual(
			Integer limtimeLessThanOrEqual) {
		if (limtimeLessThanOrEqual == null) {
			throw new RuntimeException("limtime is null");
		}
		this.limtimeLessThanOrEqual = limtimeLessThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery limtimes(List<Integer> limtimes) {
		if (limtimes == null) {
			throw new RuntimeException("limtimes is empty ");
		}
		this.limtimes = limtimes;
		return this;
	}

	public ProjectTreeAllwbsQuery mainId(String mainId) {
		if (mainId == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainId = mainId;
		return this;
	}

	public ProjectTreeAllwbsQuery mainIdLike(String mainIdLike) {
		if (mainIdLike == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainIdLike = mainIdLike;
		return this;
	}

	public ProjectTreeAllwbsQuery mainIds(List<String> mainIds) {
		if (mainIds == null) {
			throw new RuntimeException("mainIds is empty ");
		}
		this.mainIds = mainIds;
		return this;
	}

	public ProjectTreeAllwbsQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public ProjectTreeAllwbsQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery nlevelLessThanOrEqual(
			Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public ProjectTreeAllwbsQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public ProjectTreeAllwbsQuery roleid(Integer roleid) {
		if (roleid == null) {
			throw new RuntimeException("roleid is null");
		}
		this.roleid = roleid;
		return this;
	}

	public ProjectTreeAllwbsQuery roleidGreaterThanOrEqual(
			Integer roleidGreaterThanOrEqual) {
		if (roleidGreaterThanOrEqual == null) {
			throw new RuntimeException("roleid is null");
		}
		this.roleidGreaterThanOrEqual = roleidGreaterThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery roleidLessThanOrEqual(
			Integer roleidLessThanOrEqual) {
		if (roleidLessThanOrEqual == null) {
			throw new RuntimeException("roleid is null");
		}
		this.roleidLessThanOrEqual = roleidLessThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery roleids(List<Integer> roleids) {
		if (roleids == null) {
			throw new RuntimeException("roleids is empty ");
		}
		this.roleids = roleids;
		return this;
	}

	public ProjectTreeAllwbsQuery rolename(String rolename) {
		if (rolename == null) {
			throw new RuntimeException("rolename is null");
		}
		this.rolename = rolename;
		return this;
	}

	public ProjectTreeAllwbsQuery rolenameLike(String rolenameLike) {
		if (rolenameLike == null) {
			throw new RuntimeException("rolename is null");
		}
		this.rolenameLike = rolenameLike;
		return this;
	}

	public ProjectTreeAllwbsQuery rolenames(List<String> rolenames) {
		if (rolenames == null) {
			throw new RuntimeException("rolenames is empty ");
		}
		this.rolenames = rolenames;
		return this;
	}

	public void setCellTaskIndexId(Integer cellTaskIndexId) {
		this.cellTaskIndexId = cellTaskIndexId;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setEndtimeGreaterThanOrEqual(Date endtimeGreaterThanOrEqual) {
		this.endtimeGreaterThanOrEqual = endtimeGreaterThanOrEqual;
	}

	public void setEndtimeLessThanOrEqual(Date endtimeLessThanOrEqual) {
		this.endtimeLessThanOrEqual = endtimeLessThanOrEqual;
	}

	public void setIdLike(String idLike) {
		this.idLike = idLike;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public void setIndexNameLike(String indexNameLike) {
		this.indexNameLike = indexNameLike;
	}

	public void setIntfinish(Integer intfinish) {
		this.intfinish = intfinish;
	}

	public void setIntfinishGreaterThanOrEqual(
			Integer intfinishGreaterThanOrEqual) {
		this.intfinishGreaterThanOrEqual = intfinishGreaterThanOrEqual;
	}

	public void setIntfinishLessThanOrEqual(Integer intfinishLessThanOrEqual) {
		this.intfinishLessThanOrEqual = intfinishLessThanOrEqual;
	}

	public void setIntfinishs(List<Integer> intfinishs) {
		this.intfinishs = intfinishs;
	}

	public void setLimtime(Integer limtime) {
		this.limtime = limtime;
	}

	public void setLimtimeGreaterThanOrEqual(Integer limtimeGreaterThanOrEqual) {
		this.limtimeGreaterThanOrEqual = limtimeGreaterThanOrEqual;
	}

	public void setLimtimeLessThanOrEqual(Integer limtimeLessThanOrEqual) {
		this.limtimeLessThanOrEqual = limtimeLessThanOrEqual;
	}

	public void setLimtimes(List<Integer> limtimes) {
		this.limtimes = limtimes;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public void setMainIdLike(String mainIdLike) {
		this.mainIdLike = mainIdLike;
	}

	public void setMainIds(List<String> mainIds) {
		this.mainIds = mainIds;
	}

	public void setNlevel(Integer nlevel) {
		this.nlevel = nlevel;
	}

	public void setNlevelGreaterThanOrEqual(Integer nlevelGreaterThanOrEqual) {
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
	}

	public void setNlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
	}

	public void setNlevels(List<Integer> nlevels) {
		this.nlevels = nlevels;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public void setRoleidGreaterThanOrEqual(Integer roleidGreaterThanOrEqual) {
		this.roleidGreaterThanOrEqual = roleidGreaterThanOrEqual;
	}

	public void setRoleidLessThanOrEqual(Integer roleidLessThanOrEqual) {
		this.roleidLessThanOrEqual = roleidLessThanOrEqual;
	}

	public void setRoleids(List<Integer> roleids) {
		this.roleids = roleids;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public void setRolenameLike(String rolenameLike) {
		this.rolenameLike = rolenameLike;
	}

	public void setRolenames(List<String> rolenames) {
		this.rolenames = rolenames;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStarttimeGreaterThanOrEqual(Date starttimeGreaterThanOrEqual) {
		this.starttimeGreaterThanOrEqual = starttimeGreaterThanOrEqual;
	}

	public void setStarttimeLessThanOrEqual(Date starttimeLessThanOrEqual) {
		this.starttimeLessThanOrEqual = starttimeLessThanOrEqual;
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

	public void setUseday(Long useday) {
		this.useday = useday;
	}

	public void setUsedayGreaterThanOrEqual(Long usedayGreaterThanOrEqual) {
		this.usedayGreaterThanOrEqual = usedayGreaterThanOrEqual;
	}

	public void setUsedayLessThanOrEqual(Long usedayLessThanOrEqual) {
		this.usedayLessThanOrEqual = usedayLessThanOrEqual;
	}

	public void setUsedays(List<Long> usedays) {
		this.usedays = usedays;
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

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUsernameLike(String usernameLike) {
		this.usernameLike = usernameLike;
	}

	public void setUsernames(List<String> usernames) {
		this.usernames = usernames;
	}

	public ProjectTreeAllwbsQuery starttimeGreaterThanOrEqual(
			Date starttimeGreaterThanOrEqual) {
		if (starttimeGreaterThanOrEqual == null) {
			throw new RuntimeException("starttime is null");
		}
		this.starttimeGreaterThanOrEqual = starttimeGreaterThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery starttimeLessThanOrEqual(
			Date starttimeLessThanOrEqual) {
		if (starttimeLessThanOrEqual == null) {
			throw new RuntimeException("starttime is null");
		}
		this.starttimeLessThanOrEqual = starttimeLessThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery type(Integer type) {
		if (type == null) {
			throw new RuntimeException("type is null");
		}
		this.type = type;
		return this;
	}

	public ProjectTreeAllwbsQuery typeGreaterThanOrEqual(
			Integer typeGreaterThanOrEqual) {
		if (typeGreaterThanOrEqual == null) {
			throw new RuntimeException("type is null");
		}
		this.typeGreaterThanOrEqual = typeGreaterThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery typeLessThanOrEqual(
			Integer typeLessThanOrEqual) {
		if (typeLessThanOrEqual == null) {
			throw new RuntimeException("type is null");
		}
		this.typeLessThanOrEqual = typeLessThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery types(List<Integer> types) {
		if (types == null) {
			throw new RuntimeException("types is empty ");
		}
		this.types = types;
		return this;
	}

	public ProjectTreeAllwbsQuery useday(Long useday) {
		if (useday == null) {
			throw new RuntimeException("useday is null");
		}
		this.useday = useday;
		return this;
	}

	public ProjectTreeAllwbsQuery usedayGreaterThanOrEqual(
			Long usedayGreaterThanOrEqual) {
		if (usedayGreaterThanOrEqual == null) {
			throw new RuntimeException("useday is null");
		}
		this.usedayGreaterThanOrEqual = usedayGreaterThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery usedayLessThanOrEqual(
			Long usedayLessThanOrEqual) {
		if (usedayLessThanOrEqual == null) {
			throw new RuntimeException("useday is null");
		}
		this.usedayLessThanOrEqual = usedayLessThanOrEqual;
		return this;
	}

	public ProjectTreeAllwbsQuery usedays(List<Long> usedays) {
		if (usedays == null) {
			throw new RuntimeException("usedays is empty ");
		}
		this.usedays = usedays;
		return this;
	}

	public ProjectTreeAllwbsQuery userid(String userid) {
		if (userid == null) {
			throw new RuntimeException("userid is null");
		}
		this.userid = userid;
		return this;
	}

	public ProjectTreeAllwbsQuery useridLike(String useridLike) {
		if (useridLike == null) {
			throw new RuntimeException("userid is null");
		}
		this.useridLike = useridLike;
		return this;
	}

	public ProjectTreeAllwbsQuery userids(List<String> userids) {
		if (userids == null) {
			throw new RuntimeException("userids is empty ");
		}
		this.userids = userids;
		return this;
	}

	public ProjectTreeAllwbsQuery username(String username) {
		if (username == null) {
			throw new RuntimeException("username is null");
		}
		this.username = username;
		return this;
	}

	public ProjectTreeAllwbsQuery usernameLike(String usernameLike) {
		if (usernameLike == null) {
			throw new RuntimeException("username is null");
		}
		this.usernameLike = usernameLike;
		return this;
	}

	public ProjectTreeAllwbsQuery usernames(List<String> usernames) {
		if (usernames == null) {
			throw new RuntimeException("usernames is empty ");
		}
		this.usernames = usernames;
		return this;
	}

}