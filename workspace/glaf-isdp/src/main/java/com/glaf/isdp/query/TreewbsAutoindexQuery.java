package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreewbsAutoindexQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer autoindex;
	protected Integer autoindexGreaterThanOrEqual;
	protected Integer autoindexLessThanOrEqual;
	protected List<Integer> autoindexs;
	protected Integer inttype;
	protected Integer inttypeGreaterThanOrEqual;
	protected Integer inttypeLessThanOrEqual;
	protected List<Integer> inttypes;
	protected Integer indexRule;
	protected Integer indexRuleGreaterThanOrEqual;
	protected Integer indexRuleLessThanOrEqual;
	protected List<Integer> indexRules;
	

	public TreewbsAutoindexQuery() {

	}

	public TreewbsAutoindexQuery autoindex(Integer autoindex) {
		if (autoindex == null) {
			throw new RuntimeException("autoindex is null");
		}
		this.autoindex = autoindex;
		return this;
	}

	public TreewbsAutoindexQuery autoindexGreaterThanOrEqual(
			Integer autoindexGreaterThanOrEqual) {
		if (autoindexGreaterThanOrEqual == null) {
			throw new RuntimeException("autoindex is null");
		}
		this.autoindexGreaterThanOrEqual = autoindexGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutoindexQuery autoindexLessThanOrEqual(
			Integer autoindexLessThanOrEqual) {
		if (autoindexLessThanOrEqual == null) {
			throw new RuntimeException("autoindex is null");
		}
		this.autoindexLessThanOrEqual = autoindexLessThanOrEqual;
		return this;
	}

	public TreewbsAutoindexQuery autoindexs(List<Integer> autoindexs) {
		if (autoindexs == null) {
			throw new RuntimeException("autoindexs is empty ");
		}
		this.autoindexs = autoindexs;
		return this;
	}

	public Integer getAutoindex() {
		return autoindex;
	}

	public Integer getAutoindexGreaterThanOrEqual() {
		return autoindexGreaterThanOrEqual;
	}

	public Integer getAutoindexLessThanOrEqual() {
		return autoindexLessThanOrEqual;
	}

	public List<Integer> getAutoindexs() {
		return autoindexs;
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

	public Integer getIndexRule() {
		return indexRule;
	}

	public Integer getIndexRuleGreaterThanOrEqual() {
		return indexRuleGreaterThanOrEqual;
	}

	public Integer getIndexRuleLessThanOrEqual() {
		return indexRuleLessThanOrEqual;
	}

	public List<Integer> getIndexRules() {
		return indexRules;
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

	public TreewbsAutoindexQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public TreewbsAutoindexQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutoindexQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public TreewbsAutoindexQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	public TreewbsAutoindexQuery indexRule(Integer indexRule) {
		if (indexRule == null) {
			throw new RuntimeException("indexRule is null");
		}
		this.indexRule = indexRule;
		return this;
	}

	public TreewbsAutoindexQuery indexRuleGreaterThanOrEqual(
			Integer indexRuleGreaterThanOrEqual) {
		if (indexRuleGreaterThanOrEqual == null) {
			throw new RuntimeException("indexRule is null");
		}
		this.indexRuleGreaterThanOrEqual = indexRuleGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutoindexQuery indexRuleLessThanOrEqual(
			Integer indexRuleLessThanOrEqual) {
		if (indexRuleLessThanOrEqual == null) {
			throw new RuntimeException("indexRule is null");
		}
		this.indexRuleLessThanOrEqual = indexRuleLessThanOrEqual;
		return this;
	}

	public TreewbsAutoindexQuery indexRules(List<Integer> indexRules) {
		if (indexRules == null) {
			throw new RuntimeException("indexRules is empty ");
		}
		this.indexRules = indexRules;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("indexId", "index_id");
		addColumn("autoindex", "autoindex");
		addColumn("inttype", "inttype");
		addColumn("indexRule", "index_rule");
	}

	public TreewbsAutoindexQuery inttype(Integer inttype) {
		if (inttype == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttype = inttype;
		return this;
	}

	public TreewbsAutoindexQuery inttypeGreaterThanOrEqual(
			Integer inttypeGreaterThanOrEqual) {
		if (inttypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
		return this;
	}

	public TreewbsAutoindexQuery inttypeLessThanOrEqual(
			Integer inttypeLessThanOrEqual) {
		if (inttypeLessThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
		return this;
	}

	public TreewbsAutoindexQuery inttypes(List<Integer> inttypes) {
		if (inttypes == null) {
			throw new RuntimeException("inttypes is empty ");
		}
		this.inttypes = inttypes;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setAutoindex(Integer autoindex) {
		this.autoindex = autoindex;
	}

	public void setAutoindexGreaterThanOrEqual(
			Integer autoindexGreaterThanOrEqual) {
		this.autoindexGreaterThanOrEqual = autoindexGreaterThanOrEqual;
	}

	public void setAutoindexLessThanOrEqual(Integer autoindexLessThanOrEqual) {
		this.autoindexLessThanOrEqual = autoindexLessThanOrEqual;
	}

	public void setAutoindexs(List<Integer> autoindexs) {
		this.autoindexs = autoindexs;
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

	public void setIndexRule(Integer indexRule) {
		this.indexRule = indexRule;
	}

	public void setIndexRuleGreaterThanOrEqual(
			Integer indexRuleGreaterThanOrEqual) {
		this.indexRuleGreaterThanOrEqual = indexRuleGreaterThanOrEqual;
	}

	public void setIndexRuleLessThanOrEqual(Integer indexRuleLessThanOrEqual) {
		this.indexRuleLessThanOrEqual = indexRuleLessThanOrEqual;
	}

	public void setIndexRules(List<Integer> indexRules) {
		this.indexRules = indexRules;
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

}