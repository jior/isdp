package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellFillFormQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String taskId;
	protected String taskIdLike;
	protected List<String> taskIds;
	protected Integer pfileflag;
	protected Integer pfileflagGreaterThanOrEqual;
	protected Integer pfileflagLessThanOrEqual;
	protected List<Integer> pfileflags;
	protected String filedotFileid;
	protected String filedotFileidLike;
	protected List<String> filedotFileids;
	protected String nameLike;

	protected String pfileId;
	protected String pfileIdLike;
	protected List<String> pfileIds;
	protected Integer tempsave;
	protected Integer tempsaveGreaterThanOrEqual;
	protected Integer tempsaveLessThanOrEqual;
	protected List<Integer> tempsaves;
	protected String userid;
	protected String useridLike;
	protected List<String> userids;
	protected Integer refillflag;
	protected Integer refillflagGreaterThanOrEqual;
	protected Integer refillflagLessThanOrEqual;
	protected List<Integer> refillflags;
	protected Integer groupid;
	protected Integer groupidGreaterThanOrEqual;
	protected Integer groupidLessThanOrEqual;
	protected List<Integer> groupids;
	protected String oldId;
	protected String oldIdLike;
	protected List<String> oldIds;
	protected Integer roleId;
	protected Integer roleIdGreaterThanOrEqual;
	protected Integer roleIdLessThanOrEqual;
	protected List<Integer> roleIds;
	protected Integer isfinish;
	protected Integer isfinishGreaterThanOrEqual;
	protected Integer isfinishLessThanOrEqual;
	protected List<Integer> isfinishs;
	protected String typeTablename;
	protected String typeTablenameLike;
	protected List<String> typeTablenames;
	protected String typeId;
	protected String typeIdLike;
	protected List<String> typeIds;
	protected Integer typeIndexId;
	protected Integer typeIndexIdGreaterThanOrEqual;
	protected Integer typeIndexIdLessThanOrEqual;
	protected List<Integer> typeIndexIds;
	protected String mainId;
	protected String mainIdLike;
	protected List<String> mainIds;
	

	public CellFillFormQuery() {

	}

	public CellFillFormQuery filedotFileid(String filedotFileid) {
		if (filedotFileid == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileid = filedotFileid;
		return this;
	}

	public CellFillFormQuery filedotFileidLike(String filedotFileidLike) {
		if (filedotFileidLike == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileidLike = filedotFileidLike;
		return this;
	}

	public CellFillFormQuery filedotFileids(List<String> filedotFileids) {
		if (filedotFileids == null) {
			throw new RuntimeException("filedotFileids is empty ");
		}
		this.filedotFileids = filedotFileids;
		return this;
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

	public Integer getGroupid() {
		return groupid;
	}

	public Integer getGroupidGreaterThanOrEqual() {
		return groupidGreaterThanOrEqual;
	}

	public Integer getGroupidLessThanOrEqual() {
		return groupidLessThanOrEqual;
	}

	public List<Integer> getGroupids() {
		return groupids;
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

	public Integer getIsfinish() {
		return isfinish;
	}

	public Integer getIsfinishGreaterThanOrEqual() {
		return isfinishGreaterThanOrEqual;
	}

	public Integer getIsfinishLessThanOrEqual() {
		return isfinishLessThanOrEqual;
	}

	public List<Integer> getIsfinishs() {
		return isfinishs;
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

	public String getOldId() {
		return oldId;
	}

	public String getOldIdLike() {
		if (oldIdLike != null && oldIdLike.trim().length() > 0) {
			if (!oldIdLike.startsWith("%")) {
				oldIdLike = "%" + oldIdLike;
			}
			if (!oldIdLike.endsWith("%")) {
				oldIdLike = oldIdLike + "%";
			}
		}
		return oldIdLike;
	}

	public List<String> getOldIds() {
		return oldIds;
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

	public Integer getPfileflag() {
		return pfileflag;
	}

	public Integer getPfileflagGreaterThanOrEqual() {
		return pfileflagGreaterThanOrEqual;
	}

	public Integer getPfileflagLessThanOrEqual() {
		return pfileflagLessThanOrEqual;
	}

	public List<Integer> getPfileflags() {
		return pfileflags;
	}

	public String getPfileId() {
		return pfileId;
	}

	public String getPfileIdLike() {
		if (pfileIdLike != null && pfileIdLike.trim().length() > 0) {
			if (!pfileIdLike.startsWith("%")) {
				pfileIdLike = "%" + pfileIdLike;
			}
			if (!pfileIdLike.endsWith("%")) {
				pfileIdLike = pfileIdLike + "%";
			}
		}
		return pfileIdLike;
	}

	public List<String> getPfileIds() {
		return pfileIds;
	}

	public Integer getRefillflag() {
		return refillflag;
	}

	public Integer getRefillflagGreaterThanOrEqual() {
		return refillflagGreaterThanOrEqual;
	}

	public Integer getRefillflagLessThanOrEqual() {
		return refillflagLessThanOrEqual;
	}

	public List<Integer> getRefillflags() {
		return refillflags;
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

	public String getTaskId() {
		return taskId;
	}

	public String getTaskIdLike() {
		if (taskIdLike != null && taskIdLike.trim().length() > 0) {
			if (!taskIdLike.startsWith("%")) {
				taskIdLike = "%" + taskIdLike;
			}
			if (!taskIdLike.endsWith("%")) {
				taskIdLike = taskIdLike + "%";
			}
		}
		return taskIdLike;
	}

	public List<String> getTaskIds() {
		return taskIds;
	}

	public Integer getTempsave() {
		return tempsave;
	}

	public Integer getTempsaveGreaterThanOrEqual() {
		return tempsaveGreaterThanOrEqual;
	}

	public Integer getTempsaveLessThanOrEqual() {
		return tempsaveLessThanOrEqual;
	}

	public List<Integer> getTempsaves() {
		return tempsaves;
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

	public Integer getTypeIndexId() {
		return typeIndexId;
	}

	public Integer getTypeIndexIdGreaterThanOrEqual() {
		return typeIndexIdGreaterThanOrEqual;
	}

	public Integer getTypeIndexIdLessThanOrEqual() {
		return typeIndexIdLessThanOrEqual;
	}

	public List<Integer> getTypeIndexIds() {
		return typeIndexIds;
	}

	public String getTypeTablename() {
		return typeTablename;
	}

	public String getTypeTablenameLike() {
		if (typeTablenameLike != null && typeTablenameLike.trim().length() > 0) {
			if (!typeTablenameLike.startsWith("%")) {
				typeTablenameLike = "%" + typeTablenameLike;
			}
			if (!typeTablenameLike.endsWith("%")) {
				typeTablenameLike = typeTablenameLike + "%";
			}
		}
		return typeTablenameLike;
	}

	public List<String> getTypeTablenames() {
		return typeTablenames;
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

	public CellFillFormQuery groupid(Integer groupid) {
		if (groupid == null) {
			throw new RuntimeException("groupid is null");
		}
		this.groupid = groupid;
		return this;
	}

	public CellFillFormQuery groupidGreaterThanOrEqual(
			Integer groupidGreaterThanOrEqual) {
		if (groupidGreaterThanOrEqual == null) {
			throw new RuntimeException("groupid is null");
		}
		this.groupidGreaterThanOrEqual = groupidGreaterThanOrEqual;
		return this;
	}

	public CellFillFormQuery groupidLessThanOrEqual(
			Integer groupidLessThanOrEqual) {
		if (groupidLessThanOrEqual == null) {
			throw new RuntimeException("groupid is null");
		}
		this.groupidLessThanOrEqual = groupidLessThanOrEqual;
		return this;
	}

	public CellFillFormQuery groupids(List<Integer> groupids) {
		if (groupids == null) {
			throw new RuntimeException("groupids is empty ");
		}
		this.groupids = groupids;
		return this;
	}

	public CellFillFormQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellFillFormQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public CellFillFormQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public CellFillFormQuery indexIds(List<Integer> indexIds) {
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
		addColumn("topid", "topid");
		addColumn("indexId", "index_id");
		addColumn("taskId", "Task_id");
		addColumn("pfileflag", "pfileflag");
		addColumn("filedotFileid", "filedot_fileid");
		addColumn("name", "name");
		addColumn("chknum", "chknum");
		addColumn("listno", "listno");
		addColumn("chktotal", "chktotal");
		addColumn("chkresult", "chkresult");
		addColumn("pfileId", "pfile_id");
		addColumn("tempsave", "tempsave");
		addColumn("userid", "userid");
		addColumn("refillflag", "refillflag");
		addColumn("groupid", "groupid");
		addColumn("oldId", "old_id");
		addColumn("roleId", "role_id");
		addColumn("isfinish", "isfinish");
		addColumn("typeTablename", "type_tablename");
		addColumn("typeId", "type_id");
		addColumn("typeIndexId", "type_index_id");
		addColumn("mainId", "main_id");
		addColumn("intlastpage", "intlastpage");
	}

	public CellFillFormQuery isfinish(Integer isfinish) {
		if (isfinish == null) {
			throw new RuntimeException("isfinish is null");
		}
		this.isfinish = isfinish;
		return this;
	}

	public CellFillFormQuery isfinishGreaterThanOrEqual(
			Integer isfinishGreaterThanOrEqual) {
		if (isfinishGreaterThanOrEqual == null) {
			throw new RuntimeException("isfinish is null");
		}
		this.isfinishGreaterThanOrEqual = isfinishGreaterThanOrEqual;
		return this;
	}

	public CellFillFormQuery isfinishLessThanOrEqual(
			Integer isfinishLessThanOrEqual) {
		if (isfinishLessThanOrEqual == null) {
			throw new RuntimeException("isfinish is null");
		}
		this.isfinishLessThanOrEqual = isfinishLessThanOrEqual;
		return this;
	}

	public CellFillFormQuery isfinishs(List<Integer> isfinishs) {
		if (isfinishs == null) {
			throw new RuntimeException("isfinishs is empty ");
		}
		this.isfinishs = isfinishs;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellFillFormQuery mainId(String mainId) {
		if (mainId == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainId = mainId;
		return this;
	}

	public CellFillFormQuery mainIdLike(String mainIdLike) {
		if (mainIdLike == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainIdLike = mainIdLike;
		return this;
	}

	public CellFillFormQuery mainIds(List<String> mainIds) {
		if (mainIds == null) {
			throw new RuntimeException("mainIds is empty ");
		}
		this.mainIds = mainIds;
		return this;
	}

	public CellFillFormQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public CellFillFormQuery oldId(String oldId) {
		if (oldId == null) {
			throw new RuntimeException("oldId is null");
		}
		this.oldId = oldId;
		return this;
	}

	public CellFillFormQuery oldIdLike(String oldIdLike) {
		if (oldIdLike == null) {
			throw new RuntimeException("oldId is null");
		}
		this.oldIdLike = oldIdLike;
		return this;
	}

	public CellFillFormQuery oldIds(List<String> oldIds) {
		if (oldIds == null) {
			throw new RuntimeException("oldIds is empty ");
		}
		this.oldIds = oldIds;
		return this;
	}

	public CellFillFormQuery pfileflag(Integer pfileflag) {
		if (pfileflag == null) {
			throw new RuntimeException("pfileflag is null");
		}
		this.pfileflag = pfileflag;
		return this;
	}

	public CellFillFormQuery pfileflagGreaterThanOrEqual(
			Integer pfileflagGreaterThanOrEqual) {
		if (pfileflagGreaterThanOrEqual == null) {
			throw new RuntimeException("pfileflag is null");
		}
		this.pfileflagGreaterThanOrEqual = pfileflagGreaterThanOrEqual;
		return this;
	}

	public CellFillFormQuery pfileflagLessThanOrEqual(
			Integer pfileflagLessThanOrEqual) {
		if (pfileflagLessThanOrEqual == null) {
			throw new RuntimeException("pfileflag is null");
		}
		this.pfileflagLessThanOrEqual = pfileflagLessThanOrEqual;
		return this;
	}

	public CellFillFormQuery pfileflags(List<Integer> pfileflags) {
		if (pfileflags == null) {
			throw new RuntimeException("pfileflags is empty ");
		}
		this.pfileflags = pfileflags;
		return this;
	}

	public CellFillFormQuery pfileId(String pfileId) {
		if (pfileId == null) {
			throw new RuntimeException("pfileId is null");
		}
		this.pfileId = pfileId;
		return this;
	}

	public CellFillFormQuery pfileIdLike(String pfileIdLike) {
		if (pfileIdLike == null) {
			throw new RuntimeException("pfileId is null");
		}
		this.pfileIdLike = pfileIdLike;
		return this;
	}

	public CellFillFormQuery pfileIds(List<String> pfileIds) {
		if (pfileIds == null) {
			throw new RuntimeException("pfileIds is empty ");
		}
		this.pfileIds = pfileIds;
		return this;
	}

	public CellFillFormQuery refillflag(Integer refillflag) {
		if (refillflag == null) {
			throw new RuntimeException("refillflag is null");
		}
		this.refillflag = refillflag;
		return this;
	}

	public CellFillFormQuery refillflagGreaterThanOrEqual(
			Integer refillflagGreaterThanOrEqual) {
		if (refillflagGreaterThanOrEqual == null) {
			throw new RuntimeException("refillflag is null");
		}
		this.refillflagGreaterThanOrEqual = refillflagGreaterThanOrEqual;
		return this;
	}

	public CellFillFormQuery refillflagLessThanOrEqual(
			Integer refillflagLessThanOrEqual) {
		if (refillflagLessThanOrEqual == null) {
			throw new RuntimeException("refillflag is null");
		}
		this.refillflagLessThanOrEqual = refillflagLessThanOrEqual;
		return this;
	}

	public CellFillFormQuery refillflags(List<Integer> refillflags) {
		if (refillflags == null) {
			throw new RuntimeException("refillflags is empty ");
		}
		this.refillflags = refillflags;
		return this;
	}

	public CellFillFormQuery roleId(Integer roleId) {
		if (roleId == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleId = roleId;
		return this;
	}

	public CellFillFormQuery roleIdGreaterThanOrEqual(
			Integer roleIdGreaterThanOrEqual) {
		if (roleIdGreaterThanOrEqual == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleIdGreaterThanOrEqual = roleIdGreaterThanOrEqual;
		return this;
	}

	public CellFillFormQuery roleIdLessThanOrEqual(Integer roleIdLessThanOrEqual) {
		if (roleIdLessThanOrEqual == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleIdLessThanOrEqual = roleIdLessThanOrEqual;
		return this;
	}

	public CellFillFormQuery roleIds(List<Integer> roleIds) {
		if (roleIds == null) {
			throw new RuntimeException("roleIds is empty ");
		}
		this.roleIds = roleIds;
		return this;
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

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	public void setGroupidGreaterThanOrEqual(Integer groupidGreaterThanOrEqual) {
		this.groupidGreaterThanOrEqual = groupidGreaterThanOrEqual;
	}

	public void setGroupidLessThanOrEqual(Integer groupidLessThanOrEqual) {
		this.groupidLessThanOrEqual = groupidLessThanOrEqual;
	}

	public void setGroupids(List<Integer> groupids) {
		this.groupids = groupids;
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

	public void setIsfinish(Integer isfinish) {
		this.isfinish = isfinish;
	}

	public void setIsfinishGreaterThanOrEqual(Integer isfinishGreaterThanOrEqual) {
		this.isfinishGreaterThanOrEqual = isfinishGreaterThanOrEqual;
	}

	public void setIsfinishLessThanOrEqual(Integer isfinishLessThanOrEqual) {
		this.isfinishLessThanOrEqual = isfinishLessThanOrEqual;
	}

	public void setIsfinishs(List<Integer> isfinishs) {
		this.isfinishs = isfinishs;
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

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public void setOldIdLike(String oldIdLike) {
		this.oldIdLike = oldIdLike;
	}

	public void setOldIds(List<String> oldIds) {
		this.oldIds = oldIds;
	}

	public void setPfileflag(Integer pfileflag) {
		this.pfileflag = pfileflag;
	}

	public void setPfileflagGreaterThanOrEqual(
			Integer pfileflagGreaterThanOrEqual) {
		this.pfileflagGreaterThanOrEqual = pfileflagGreaterThanOrEqual;
	}

	public void setPfileflagLessThanOrEqual(Integer pfileflagLessThanOrEqual) {
		this.pfileflagLessThanOrEqual = pfileflagLessThanOrEqual;
	}

	public void setPfileflags(List<Integer> pfileflags) {
		this.pfileflags = pfileflags;
	}

	public void setPfileId(String pfileId) {
		this.pfileId = pfileId;
	}

	public void setPfileIdLike(String pfileIdLike) {
		this.pfileIdLike = pfileIdLike;
	}

	public void setPfileIds(List<String> pfileIds) {
		this.pfileIds = pfileIds;
	}

	public void setRefillflag(Integer refillflag) {
		this.refillflag = refillflag;
	}

	public void setRefillflagGreaterThanOrEqual(
			Integer refillflagGreaterThanOrEqual) {
		this.refillflagGreaterThanOrEqual = refillflagGreaterThanOrEqual;
	}

	public void setRefillflagLessThanOrEqual(Integer refillflagLessThanOrEqual) {
		this.refillflagLessThanOrEqual = refillflagLessThanOrEqual;
	}

	public void setRefillflags(List<Integer> refillflags) {
		this.refillflags = refillflags;
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

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTaskIdLike(String taskIdLike) {
		this.taskIdLike = taskIdLike;
	}

	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;
	}

	public void setTempsave(Integer tempsave) {
		this.tempsave = tempsave;
	}

	public void setTempsaveGreaterThanOrEqual(Integer tempsaveGreaterThanOrEqual) {
		this.tempsaveGreaterThanOrEqual = tempsaveGreaterThanOrEqual;
	}

	public void setTempsaveLessThanOrEqual(Integer tempsaveLessThanOrEqual) {
		this.tempsaveLessThanOrEqual = tempsaveLessThanOrEqual;
	}

	public void setTempsaves(List<Integer> tempsaves) {
		this.tempsaves = tempsaves;
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

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIdLike(String typeIdLike) {
		this.typeIdLike = typeIdLike;
	}

	public void setTypeIds(List<String> typeIds) {
		this.typeIds = typeIds;
	}

	public void setTypeIndexId(Integer typeIndexId) {
		this.typeIndexId = typeIndexId;
	}

	public void setTypeIndexIdGreaterThanOrEqual(
			Integer typeIndexIdGreaterThanOrEqual) {
		this.typeIndexIdGreaterThanOrEqual = typeIndexIdGreaterThanOrEqual;
	}

	public void setTypeIndexIdLessThanOrEqual(Integer typeIndexIdLessThanOrEqual) {
		this.typeIndexIdLessThanOrEqual = typeIndexIdLessThanOrEqual;
	}

	public void setTypeIndexIds(List<Integer> typeIndexIds) {
		this.typeIndexIds = typeIndexIds;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public void setTypeTablenameLike(String typeTablenameLike) {
		this.typeTablenameLike = typeTablenameLike;
	}

	public void setTypeTablenames(List<String> typeTablenames) {
		this.typeTablenames = typeTablenames;
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

	public CellFillFormQuery taskId(String taskId) {
		if (taskId == null) {
			throw new RuntimeException("taskId is null");
		}
		this.taskId = taskId;
		return this;
	}

	public CellFillFormQuery taskIdLike(String taskIdLike) {
		if (taskIdLike == null) {
			throw new RuntimeException("taskId is null");
		}
		this.taskIdLike = taskIdLike;
		return this;
	}

	public CellFillFormQuery taskIds(List<String> taskIds) {
		if (taskIds == null) {
			throw new RuntimeException("taskIds is empty ");
		}
		this.taskIds = taskIds;
		return this;
	}

	public CellFillFormQuery tempsave(Integer tempsave) {
		if (tempsave == null) {
			throw new RuntimeException("tempsave is null");
		}
		this.tempsave = tempsave;
		return this;
	}

	public CellFillFormQuery tempsaveGreaterThanOrEqual(
			Integer tempsaveGreaterThanOrEqual) {
		if (tempsaveGreaterThanOrEqual == null) {
			throw new RuntimeException("tempsave is null");
		}
		this.tempsaveGreaterThanOrEqual = tempsaveGreaterThanOrEqual;
		return this;
	}

	public CellFillFormQuery tempsaveLessThanOrEqual(
			Integer tempsaveLessThanOrEqual) {
		if (tempsaveLessThanOrEqual == null) {
			throw new RuntimeException("tempsave is null");
		}
		this.tempsaveLessThanOrEqual = tempsaveLessThanOrEqual;
		return this;
	}

	public CellFillFormQuery tempsaves(List<Integer> tempsaves) {
		if (tempsaves == null) {
			throw new RuntimeException("tempsaves is empty ");
		}
		this.tempsaves = tempsaves;
		return this;
	}

	public CellFillFormQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public CellFillFormQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public CellFillFormQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public CellFillFormQuery typeId(String typeId) {
		if (typeId == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeId = typeId;
		return this;
	}

	public CellFillFormQuery typeIdLike(String typeIdLike) {
		if (typeIdLike == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeIdLike = typeIdLike;
		return this;
	}

	public CellFillFormQuery typeIds(List<String> typeIds) {
		if (typeIds == null) {
			throw new RuntimeException("typeIds is empty ");
		}
		this.typeIds = typeIds;
		return this;
	}

	public CellFillFormQuery typeIndexId(Integer typeIndexId) {
		if (typeIndexId == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexId = typeIndexId;
		return this;
	}

	public CellFillFormQuery typeIndexIdGreaterThanOrEqual(
			Integer typeIndexIdGreaterThanOrEqual) {
		if (typeIndexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexIdGreaterThanOrEqual = typeIndexIdGreaterThanOrEqual;
		return this;
	}

	public CellFillFormQuery typeIndexIdLessThanOrEqual(
			Integer typeIndexIdLessThanOrEqual) {
		if (typeIndexIdLessThanOrEqual == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexIdLessThanOrEqual = typeIndexIdLessThanOrEqual;
		return this;
	}

	public CellFillFormQuery typeIndexIds(List<Integer> typeIndexIds) {
		if (typeIndexIds == null) {
			throw new RuntimeException("typeIndexIds is empty ");
		}
		this.typeIndexIds = typeIndexIds;
		return this;
	}

	public CellFillFormQuery typeTablename(String typeTablename) {
		if (typeTablename == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablename = typeTablename;
		return this;
	}

	public CellFillFormQuery typeTablenameLike(String typeTablenameLike) {
		if (typeTablenameLike == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablenameLike = typeTablenameLike;
		return this;
	}

	public CellFillFormQuery typeTablenames(List<String> typeTablenames) {
		if (typeTablenames == null) {
			throw new RuntimeException("typeTablenames is empty ");
		}
		this.typeTablenames = typeTablenames;
		return this;
	}

	public CellFillFormQuery userid(String userid) {
		if (userid == null) {
			throw new RuntimeException("userid is null");
		}
		this.userid = userid;
		return this;
	}

	public CellFillFormQuery useridLike(String useridLike) {
		if (useridLike == null) {
			throw new RuntimeException("userid is null");
		}
		this.useridLike = useridLike;
		return this;
	}

	public CellFillFormQuery userids(List<String> userids) {
		if (userids == null) {
			throw new RuntimeException("userids is empty ");
		}
		this.userids = userids;
		return this;
	}

}