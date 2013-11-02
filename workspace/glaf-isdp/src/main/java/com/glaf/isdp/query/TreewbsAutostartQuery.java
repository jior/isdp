package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreewbsAutostartQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer wbsindex;
	protected Integer wbsindexGreaterThanOrEqual;
	protected Integer wbsindexLessThanOrEqual;
	protected List<Integer> wbsindexs;
	protected Integer intstartype;
	protected Integer intstartypeGreaterThanOrEqual;
	protected Integer intstartypeLessThanOrEqual;
	protected List<Integer> intstartypes;
	protected Integer intstardelayday;
	protected Integer intstardelaydayGreaterThanOrEqual;
	protected Integer intstardelaydayLessThanOrEqual;
	protected List<Integer> intstardelaydays;
	protected Integer inttype;
	protected Integer inttypeGreaterThanOrEqual;
	protected Integer inttypeLessThanOrEqual;
	protected List<Integer> inttypes;
	

	public TreewbsAutostartQuery() {

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

	public Integer getIntstardelayday() {
		return intstardelayday;
	}

	public Integer getIntstardelaydayGreaterThanOrEqual() {
		return intstardelaydayGreaterThanOrEqual;
	}

	public Integer getIntstardelaydayLessThanOrEqual() {
		return intstardelaydayLessThanOrEqual;
	}

	public List<Integer> getIntstardelaydays() {
		return intstardelaydays;
	}

	public Integer getIntstartype() {
		return intstartype;
	}

	public Integer getIntstartypeGreaterThanOrEqual() {
		return intstartypeGreaterThanOrEqual;
	}

	public Integer getIntstartypeLessThanOrEqual() {
		return intstartypeLessThanOrEqual;
	}

	public List<Integer> getIntstartypes() {
		return intstartypes;
	}

	public Integer getInttype() {
		return inttype;
	}

	public Integer getInttypeGreaterThanOrEqual() {
		return inttypeGreaterThanOrEqual;
	}

	public Integer getInttypeLessThanOrEqual() {
		return inttypeLessThanOrEqual;
	}

	public List<Integer> getInttypes() {
		return inttypes;
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

	public Integer getWbsindex() {
		return wbsindex;
	}

	public Integer getWbsindexGreaterThanOrEqual() {
		return wbsindexGreaterThanOrEqual;
	}

	public Integer getWbsindexLessThanOrEqual() {
		return wbsindexLessThanOrEqual;
	}

	public List<Integer> getWbsindexs() {
		return wbsindexs;
	}

	public TreewbsAutostartQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public TreewbsAutostartQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery indexIds(List<Integer> indexIds) {
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
		addColumn("indexId", "index_id");
		addColumn("wbsindex", "wbsindex");
		addColumn("intstartype", "intstartype");
		addColumn("intstardelayday", "intstardelayday");
		addColumn("inttype", "inttype");
	}

	public TreewbsAutostartQuery intstardelayday(Integer intstardelayday) {
		if (intstardelayday == null) {
			throw new RuntimeException("intstardelayday is null");
		}
		this.intstardelayday = intstardelayday;
		return this;
	}

	public TreewbsAutostartQuery intstardelaydayGreaterThanOrEqual(
			Integer intstardelaydayGreaterThanOrEqual) {
		if (intstardelaydayGreaterThanOrEqual == null) {
			throw new RuntimeException("intstardelayday is null");
		}
		this.intstardelaydayGreaterThanOrEqual = intstardelaydayGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery intstardelaydayLessThanOrEqual(
			Integer intstardelaydayLessThanOrEqual) {
		if (intstardelaydayLessThanOrEqual == null) {
			throw new RuntimeException("intstardelayday is null");
		}
		this.intstardelaydayLessThanOrEqual = intstardelaydayLessThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery intstardelaydays(List<Integer> intstardelaydays) {
		if (intstardelaydays == null) {
			throw new RuntimeException("intstardelaydays is empty ");
		}
		this.intstardelaydays = intstardelaydays;
		return this;
	}

	public TreewbsAutostartQuery intstartype(Integer intstartype) {
		if (intstartype == null) {
			throw new RuntimeException("intstartype is null");
		}
		this.intstartype = intstartype;
		return this;
	}

	public TreewbsAutostartQuery intstartypeGreaterThanOrEqual(
			Integer intstartypeGreaterThanOrEqual) {
		if (intstartypeGreaterThanOrEqual == null) {
			throw new RuntimeException("intstartype is null");
		}
		this.intstartypeGreaterThanOrEqual = intstartypeGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery intstartypeLessThanOrEqual(
			Integer intstartypeLessThanOrEqual) {
		if (intstartypeLessThanOrEqual == null) {
			throw new RuntimeException("intstartype is null");
		}
		this.intstartypeLessThanOrEqual = intstartypeLessThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery intstartypes(List<Integer> intstartypes) {
		if (intstartypes == null) {
			throw new RuntimeException("intstartypes is empty ");
		}
		this.intstartypes = intstartypes;
		return this;
	}

	public TreewbsAutostartQuery inttype(Integer inttype) {
		if (inttype == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttype = inttype;
		return this;
	}

	public TreewbsAutostartQuery inttypeGreaterThanOrEqual(
			Integer inttypeGreaterThanOrEqual) {
		if (inttypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery inttypeLessThanOrEqual(
			Integer inttypeLessThanOrEqual) {
		if (inttypeLessThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery inttypes(List<Integer> inttypes) {
		if (inttypes == null) {
			throw new RuntimeException("inttypes is empty ");
		}
		this.inttypes = inttypes;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
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

	public void setIntstardelayday(Integer intstardelayday) {
		this.intstardelayday = intstardelayday;
	}

	public void setIntstardelaydayGreaterThanOrEqual(
			Integer intstardelaydayGreaterThanOrEqual) {
		this.intstardelaydayGreaterThanOrEqual = intstardelaydayGreaterThanOrEqual;
	}

	public void setIntstardelaydayLessThanOrEqual(
			Integer intstardelaydayLessThanOrEqual) {
		this.intstardelaydayLessThanOrEqual = intstardelaydayLessThanOrEqual;
	}

	public void setIntstardelaydays(List<Integer> intstardelaydays) {
		this.intstardelaydays = intstardelaydays;
	}

	public void setIntstartype(Integer intstartype) {
		this.intstartype = intstartype;
	}

	public void setIntstartypeGreaterThanOrEqual(
			Integer intstartypeGreaterThanOrEqual) {
		this.intstartypeGreaterThanOrEqual = intstartypeGreaterThanOrEqual;
	}

	public void setIntstartypeLessThanOrEqual(Integer intstartypeLessThanOrEqual) {
		this.intstartypeLessThanOrEqual = intstartypeLessThanOrEqual;
	}

	public void setIntstartypes(List<Integer> intstartypes) {
		this.intstartypes = intstartypes;
	}

	public void setInttype(Integer inttype) {
		this.inttype = inttype;
	}

	public void setInttypeGreaterThanOrEqual(Integer inttypeGreaterThanOrEqual) {
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
	}

	public void setInttypeLessThanOrEqual(Integer inttypeLessThanOrEqual) {
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
	}

	public void setInttypes(List<Integer> inttypes) {
		this.inttypes = inttypes;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setWbsindex(Integer wbsindex) {
		this.wbsindex = wbsindex;
	}

	public void setWbsindexGreaterThanOrEqual(Integer wbsindexGreaterThanOrEqual) {
		this.wbsindexGreaterThanOrEqual = wbsindexGreaterThanOrEqual;
	}

	public void setWbsindexLessThanOrEqual(Integer wbsindexLessThanOrEqual) {
		this.wbsindexLessThanOrEqual = wbsindexLessThanOrEqual;
	}

	public void setWbsindexs(List<Integer> wbsindexs) {
		this.wbsindexs = wbsindexs;
	}

	public TreewbsAutostartQuery wbsindex(Integer wbsindex) {
		if (wbsindex == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindex = wbsindex;
		return this;
	}

	public TreewbsAutostartQuery wbsindexGreaterThanOrEqual(
			Integer wbsindexGreaterThanOrEqual) {
		if (wbsindexGreaterThanOrEqual == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindexGreaterThanOrEqual = wbsindexGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery wbsindexLessThanOrEqual(
			Integer wbsindexLessThanOrEqual) {
		if (wbsindexLessThanOrEqual == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindexLessThanOrEqual = wbsindexLessThanOrEqual;
		return this;
	}

	public TreewbsAutostartQuery wbsindexs(List<Integer> wbsindexs) {
		if (wbsindexs == null) {
			throw new RuntimeException("wbsindexs is empty ");
		}
		this.wbsindexs = wbsindexs;
		return this;
	}

}