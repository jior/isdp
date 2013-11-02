package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreepnameQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String numLike;
	protected String indexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected Integer showid;
	protected Integer showidGreaterThanOrEqual;
	protected Integer showidLessThanOrEqual;
	protected List<Integer> showids;
	protected String ruleId;
	protected String ruleIdLike;
	protected List<String> ruleIds;
	protected String fruleId;
	protected String fruleIdLike;
	protected List<String> fruleIds;
	protected String wcompanyLike;
	protected String sysId;
	protected String sysIdLike;
	protected List<String> sysIds;
	protected Integer domainIndex;
	protected Integer domainIndexGreaterThanOrEqual;
	protected Integer domainIndexLessThanOrEqual;
	protected List<Integer> domainIndexs;
	

	public TreepnameQuery() {

	}

	public TreepnameQuery domainIndex(Integer domainIndex) {
		if (domainIndex == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndex = domainIndex;
		return this;
	}

	public TreepnameQuery domainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		if (domainIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
		return this;
	}

	public TreepnameQuery domainIndexLessThanOrEqual(
			Integer domainIndexLessThanOrEqual) {
		if (domainIndexLessThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
		return this;
	}

	public TreepnameQuery domainIndexs(List<Integer> domainIndexs) {
		if (domainIndexs == null) {
			throw new RuntimeException("domainIndexs is empty ");
		}
		this.domainIndexs = domainIndexs;
		return this;
	}

	public TreepnameQuery fruleId(String fruleId) {
		if (fruleId == null) {
			throw new RuntimeException("fruleId is null");
		}
		this.fruleId = fruleId;
		return this;
	}

	public TreepnameQuery fruleIdLike(String fruleIdLike) {
		if (fruleIdLike == null) {
			throw new RuntimeException("fruleId is null");
		}
		this.fruleIdLike = fruleIdLike;
		return this;
	}

	public TreepnameQuery fruleIds(List<String> fruleIds) {
		if (fruleIds == null) {
			throw new RuntimeException("fruleIds is empty ");
		}
		this.fruleIds = fruleIds;
		return this;
	}

	public Integer getDomainIndex() {
		return domainIndex;
	}

	public Integer getDomainIndexGreaterThanOrEqual() {
		return domainIndexGreaterThanOrEqual;
	}

	public Integer getDomainIndexLessThanOrEqual() {
		return domainIndexLessThanOrEqual;
	}

	public List<Integer> getDomainIndexs() {
		return domainIndexs;
	}

	public String getFruleId() {
		return fruleId;
	}

	public String getFruleIdLike() {
		if (fruleIdLike != null && fruleIdLike.trim().length() > 0) {
			if (!fruleIdLike.startsWith("%")) {
				fruleIdLike = "%" + fruleIdLike;
			}
			if (!fruleIdLike.endsWith("%")) {
				fruleIdLike = fruleIdLike + "%";
			}
		}
		return fruleIdLike;
	}

	public List<String> getFruleIds() {
		return fruleIds;
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

	public String getRuleId() {
		return ruleId;
	}

	public String getRuleIdLike() {
		if (ruleIdLike != null && ruleIdLike.trim().length() > 0) {
			if (!ruleIdLike.startsWith("%")) {
				ruleIdLike = "%" + ruleIdLike;
			}
			if (!ruleIdLike.endsWith("%")) {
				ruleIdLike = ruleIdLike + "%";
			}
		}
		return ruleIdLike;
	}

	public List<String> getRuleIds() {
		return ruleIds;
	}

	public Integer getShowid() {
		return showid;
	}

	public Integer getShowidGreaterThanOrEqual() {
		return showidGreaterThanOrEqual;
	}

	public Integer getShowidLessThanOrEqual() {
		return showidLessThanOrEqual;
	}

	public List<Integer> getShowids() {
		return showids;
	}

	public String getSysId() {
		return sysId;
	}

	public String getSysIdLike() {
		if (sysIdLike != null && sysIdLike.trim().length() > 0) {
			if (!sysIdLike.startsWith("%")) {
				sysIdLike = "%" + sysIdLike;
			}
			if (!sysIdLike.endsWith("%")) {
				sysIdLike = sysIdLike + "%";
			}
		}
		return sysIdLike;
	}

	public List<String> getSysIds() {
		return sysIds;
	}

	public String getWcompanyLike() {
		if (wcompanyLike != null && wcompanyLike.trim().length() > 0) {
			if (!wcompanyLike.startsWith("%")) {
				wcompanyLike = "%" + wcompanyLike;
			}
			if (!wcompanyLike.endsWith("%")) {
				wcompanyLike = wcompanyLike + "%";
			}
		}
		return wcompanyLike;
	}

	public TreepnameQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public TreepnameQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public TreepnameQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public TreepnameQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	public TreepnameQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "ID");
		addColumn("parentId", "parent_id");
		addColumn("indexId", "index_id");
		addColumn("num", "num");
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("showid", "showid");
		addColumn("ruleId", "ruleId");
		addColumn("nodeico", "nodeico");
		addColumn("fruleId", "fruleId");
		addColumn("wcompany", "wcompany");
		addColumn("listno", "listno");
		addColumn("sysId", "sys_id");
		addColumn("domainIndex", "domain_index");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreepnameQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreepnameQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreepnameQuery nlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreepnameQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreepnameQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreepnameQuery ruleId(String ruleId) {
		if (ruleId == null) {
			throw new RuntimeException("ruleId is null");
		}
		this.ruleId = ruleId;
		return this;
	}

	public TreepnameQuery ruleIdLike(String ruleIdLike) {
		if (ruleIdLike == null) {
			throw new RuntimeException("ruleId is null");
		}
		this.ruleIdLike = ruleIdLike;
		return this;
	}

	public TreepnameQuery ruleIds(List<String> ruleIds) {
		if (ruleIds == null) {
			throw new RuntimeException("ruleIds is empty ");
		}
		this.ruleIds = ruleIds;
		return this;
	}

	public void setDomainIndex(Integer domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setDomainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
	}

	public void setDomainIndexLessThanOrEqual(Integer domainIndexLessThanOrEqual) {
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
	}

	public void setDomainIndexs(List<Integer> domainIndexs) {
		this.domainIndexs = domainIndexs;
	}

	public void setFruleId(String fruleId) {
		this.fruleId = fruleId;
	}

	public void setFruleIdLike(String fruleIdLike) {
		this.fruleIdLike = fruleIdLike;
	}

	public void setFruleIds(List<String> fruleIds) {
		this.fruleIds = fruleIds;
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

	public void setIndexNameLike(String indexNameLike) {
		this.indexNameLike = indexNameLike;
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

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public void setRuleIdLike(String ruleIdLike) {
		this.ruleIdLike = ruleIdLike;
	}

	public void setRuleIds(List<String> ruleIds) {
		this.ruleIds = ruleIds;
	}

	public void setShowid(Integer showid) {
		this.showid = showid;
	}

	public void setShowidGreaterThanOrEqual(Integer showidGreaterThanOrEqual) {
		this.showidGreaterThanOrEqual = showidGreaterThanOrEqual;
	}

	public void setShowidLessThanOrEqual(Integer showidLessThanOrEqual) {
		this.showidLessThanOrEqual = showidLessThanOrEqual;
	}

	public void setShowids(List<Integer> showids) {
		this.showids = showids;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public void setSysIdLike(String sysIdLike) {
		this.sysIdLike = sysIdLike;
	}

	public void setSysIds(List<String> sysIds) {
		this.sysIds = sysIds;
	}

	public void setWcompanyLike(String wcompanyLike) {
		this.wcompanyLike = wcompanyLike;
	}

	public TreepnameQuery showid(Integer showid) {
		if (showid == null) {
			throw new RuntimeException("showid is null");
		}
		this.showid = showid;
		return this;
	}

	public TreepnameQuery showidGreaterThanOrEqual(
			Integer showidGreaterThanOrEqual) {
		if (showidGreaterThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidGreaterThanOrEqual = showidGreaterThanOrEqual;
		return this;
	}

	public TreepnameQuery showidLessThanOrEqual(Integer showidLessThanOrEqual) {
		if (showidLessThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidLessThanOrEqual = showidLessThanOrEqual;
		return this;
	}

	public TreepnameQuery showids(List<Integer> showids) {
		if (showids == null) {
			throw new RuntimeException("showids is empty ");
		}
		this.showids = showids;
		return this;
	}

	public TreepnameQuery sysId(String sysId) {
		if (sysId == null) {
			throw new RuntimeException("sysId is null");
		}
		this.sysId = sysId;
		return this;
	}

	public TreepnameQuery sysIdLike(String sysIdLike) {
		if (sysIdLike == null) {
			throw new RuntimeException("sysId is null");
		}
		this.sysIdLike = sysIdLike;
		return this;
	}

	public TreepnameQuery sysIds(List<String> sysIds) {
		if (sysIds == null) {
			throw new RuntimeException("sysIds is empty ");
		}
		this.sysIds = sysIds;
		return this;
	}

	public TreepnameQuery wcompanyLike(String wcompanyLike) {
		if (wcompanyLike == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompanyLike = wcompanyLike;
		return this;
	}

}