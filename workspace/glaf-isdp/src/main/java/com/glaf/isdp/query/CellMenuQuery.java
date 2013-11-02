package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellMenuQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String nameLike;
	protected List<String> names;
	protected String userid;
	protected List<String> userids;
	protected String isuselect;
	protected List<String> isuselects;
	protected Integer issystem;
	protected List<Integer> issystems;
	protected Integer intused;
	protected List<Integer> intuseds;
	protected String busiessId;
	protected List<String> busiessIds;
	protected Integer intdel;
	protected List<Integer> intdels;
	

	public CellMenuQuery() {

	}

	public CellMenuQuery busiessId(String busiessId) {
		if (busiessId == null) {
			throw new RuntimeException("busiessId is null");
		}
		this.busiessId = busiessId;
		return this;
	}

	public CellMenuQuery busiessIds(List<String> busiessIds) {
		if (busiessIds == null) {
			throw new RuntimeException("busiessIds is empty ");
		}
		this.busiessIds = busiessIds;
		return this;
	}

	public String getBusiessId() {
		return busiessId;
	}

	public List<String> getBusiessIds() {
		return busiessIds;
	}

	public Integer getIntdel() {
		return intdel;
	}

	public List<Integer> getIntdels() {
		return intdels;
	}

	public Integer getIntused() {
		return intused;
	}

	public List<Integer> getIntuseds() {
		return intuseds;
	}

	public Integer getIssystem() {
		return issystem;
	}

	public List<Integer> getIssystems() {
		return issystems;
	}

	public String getIsuselect() {
		return isuselect;
	}

	public List<String> getIsuselects() {
		return isuselects;
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

	public String getUserid() {
		return userid;
	}

	public List<String> getUserids() {
		return userids;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("name", "name");
		addColumn("userid", "userid");
		addColumn("isuselect", "isuselect");
		addColumn("issystem", "issystem");
		addColumn("intused", "intused");
		addColumn("busiessId", "busiess_id");
		addColumn("intdel", "intdel");
	}

	public CellMenuQuery intdel(Integer intdel) {
		if (intdel == null) {
			throw new RuntimeException("intdel is null");
		}
		this.intdel = intdel;
		return this;
	}

	public CellMenuQuery intdels(List<Integer> intdels) {
		if (intdels == null) {
			throw new RuntimeException("intdels is empty ");
		}
		this.intdels = intdels;
		return this;
	}

	public CellMenuQuery intused(Integer intused) {
		if (intused == null) {
			throw new RuntimeException("intused is null");
		}
		this.intused = intused;
		return this;
	}

	public CellMenuQuery intuseds(List<Integer> intuseds) {
		if (intuseds == null) {
			throw new RuntimeException("intuseds is empty ");
		}
		this.intuseds = intuseds;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellMenuQuery issystem(Integer issystem) {
		if (issystem == null) {
			throw new RuntimeException("issystem is null");
		}
		this.issystem = issystem;
		return this;
	}

	public CellMenuQuery issystems(List<Integer> issystems) {
		if (issystems == null) {
			throw new RuntimeException("issystems is empty ");
		}
		this.issystems = issystems;
		return this;
	}

	public CellMenuQuery isuselect(String isuselect) {
		if (isuselect == null) {
			throw new RuntimeException("isuselect is null");
		}
		this.isuselect = isuselect;
		return this;
	}

	public CellMenuQuery isuselects(List<String> isuselects) {
		if (isuselects == null) {
			throw new RuntimeException("isuselects is empty ");
		}
		this.isuselects = isuselects;
		return this;
	}

	public CellMenuQuery name(String name) {
		if (name == null) {
			throw new RuntimeException("name is null");
		}
		this.name = name;
		return this;
	}

	public CellMenuQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public CellMenuQuery names(List<String> names) {
		if (names == null) {
			throw new RuntimeException("names is empty ");
		}
		this.names = names;
		return this;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
	}

	public void setBusiessIds(List<String> busiessIds) {
		this.busiessIds = busiessIds;
	}

	public void setIntdel(Integer intdel) {
		this.intdel = intdel;
	}

	public void setIntdels(List<Integer> intdels) {
		this.intdels = intdels;
	}

	public void setIntused(Integer intused) {
		this.intused = intused;
	}

	public void setIntuseds(List<Integer> intuseds) {
		this.intuseds = intuseds;
	}

	public void setIssystem(Integer issystem) {
		this.issystem = issystem;
	}

	public void setIssystems(List<Integer> issystems) {
		this.issystems = issystems;
	}

	public void setIsuselect(String isuselect) {
		this.isuselect = isuselect;
	}

	public void setIsuselects(List<String> isuselects) {
		this.isuselects = isuselects;
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

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUserids(List<String> userids) {
		this.userids = userids;
	}

	public CellMenuQuery userid(String userid) {
		if (userid == null) {
			throw new RuntimeException("userid is null");
		}
		this.userid = userid;
		return this;
	}

	public CellMenuQuery userids(List<String> userids) {
		if (userids == null) {
			throw new RuntimeException("userids is empty ");
		}
		this.userids = userids;
		return this;
	}

}