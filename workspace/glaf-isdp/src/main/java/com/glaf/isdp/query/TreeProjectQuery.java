package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreeProjectQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected Integer topId;
	protected Integer topIdGreaterThanOrEqual;
	protected Integer topIdLessThanOrEqual;
	protected List<Integer> topIds;
	protected String indexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String numLike;
	protected String contentLike;
	protected String useId;
	protected String useIdLike;
	protected List<String> useIds;
	protected String sindexNameLike;
	protected String content2Like;
	protected String topnode;
	protected String topnodeLike;
	protected List<String> topnodes;
	protected String projtype;
	protected String projtypeLike;
	protected List<String> projtypes;
	protected String unitnum;
	protected String unitnumLike;
	protected List<String> unitnums;
	protected Integer showid;
	protected Integer showidGreaterThanOrEqual;
	protected Integer showidLessThanOrEqual;
	protected List<Integer> showids;
	protected Long scaleQ;
	protected Long scaleQGreaterThanOrEqual;
	protected Long scaleQLessThanOrEqual;
	protected List<Long> scaleQs;
	protected String ispegwork;
	protected String ispegworkLike;
	protected List<String> ispegworks;
	

	public TreeProjectQuery() {

	}

	public TreeProjectQuery content2Like(String content2Like) {
		if (content2Like == null) {
			throw new RuntimeException("content2 is null");
		}
		this.content2Like = content2Like;
		return this;
	}

	public TreeProjectQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public String getContent2Like() {
		if (content2Like != null && content2Like.trim().length() > 0) {
			if (!content2Like.startsWith("%")) {
				content2Like = "%" + content2Like;
			}
			if (!content2Like.endsWith("%")) {
				content2Like = content2Like + "%";
			}
		}
		return content2Like;
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

	public String getIspegwork() {
		return ispegwork;
	}

	public String getIspegworkLike() {
		if (ispegworkLike != null && ispegworkLike.trim().length() > 0) {
			if (!ispegworkLike.startsWith("%")) {
				ispegworkLike = "%" + ispegworkLike;
			}
			if (!ispegworkLike.endsWith("%")) {
				ispegworkLike = ispegworkLike + "%";
			}
		}
		return ispegworkLike;
	}

	public List<String> getIspegworks() {
		return ispegworks;
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

	public String getProjtype() {
		return projtype;
	}

	public String getProjtypeLike() {
		if (projtypeLike != null && projtypeLike.trim().length() > 0) {
			if (!projtypeLike.startsWith("%")) {
				projtypeLike = "%" + projtypeLike;
			}
			if (!projtypeLike.endsWith("%")) {
				projtypeLike = projtypeLike + "%";
			}
		}
		return projtypeLike;
	}

	public List<String> getProjtypes() {
		return projtypes;
	}

	public Long getScaleQ() {
		return scaleQ;
	}

	public Long getScaleQGreaterThanOrEqual() {
		return scaleQGreaterThanOrEqual;
	}

	public Long getScaleQLessThanOrEqual() {
		return scaleQLessThanOrEqual;
	}

	public List<Long> getScaleQs() {
		return scaleQs;
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

	public String getSindexNameLike() {
		if (sindexNameLike != null && sindexNameLike.trim().length() > 0) {
			if (!sindexNameLike.startsWith("%")) {
				sindexNameLike = "%" + sindexNameLike;
			}
			if (!sindexNameLike.endsWith("%")) {
				sindexNameLike = sindexNameLike + "%";
			}
		}
		return sindexNameLike;
	}

	public Integer getTopId() {
		return topId;
	}

	public Integer getTopIdGreaterThanOrEqual() {
		return topIdGreaterThanOrEqual;
	}

	public Integer getTopIdLessThanOrEqual() {
		return topIdLessThanOrEqual;
	}

	public List<Integer> getTopIds() {
		return topIds;
	}

	public String getTopnode() {
		return topnode;
	}

	public String getTopnodeLike() {
		if (topnodeLike != null && topnodeLike.trim().length() > 0) {
			if (!topnodeLike.startsWith("%")) {
				topnodeLike = "%" + topnodeLike;
			}
			if (!topnodeLike.endsWith("%")) {
				topnodeLike = topnodeLike + "%";
			}
		}
		return topnodeLike;
	}

	public List<String> getTopnodes() {
		return topnodes;
	}

	public String getUnitnum() {
		return unitnum;
	}

	public String getUnitnumLike() {
		if (unitnumLike != null && unitnumLike.trim().length() > 0) {
			if (!unitnumLike.startsWith("%")) {
				unitnumLike = "%" + unitnumLike;
			}
			if (!unitnumLike.endsWith("%")) {
				unitnumLike = unitnumLike + "%";
			}
		}
		return unitnumLike;
	}

	public List<String> getUnitnums() {
		return unitnums;
	}

	public String getUseId() {
		return useId;
	}

	public String getUseIdLike() {
		if (useIdLike != null && useIdLike.trim().length() > 0) {
			if (!useIdLike.startsWith("%")) {
				useIdLike = "%" + useIdLike;
			}
			if (!useIdLike.endsWith("%")) {
				useIdLike = useIdLike + "%";
			}
		}
		return useIdLike;
	}

	public List<String> getUseIds() {
		return useIds;
	}

	public TreeProjectQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("idLike is null");
		}
		this.idLike = idLike;
		return this;
	}

	public TreeProjectQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public TreeProjectQuery indexNameLike(String indexNameLike) {
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
		addColumn("id", "ID");
		addColumn("parentId", "parent_id");
		addColumn("topId", "top_id");
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("num", "num");
		addColumn("content", "content");
		addColumn("useId", "useId");
		addColumn("sindexName", "sindex_name");
		addColumn("content2", "content2");
		addColumn("topnode", "topnode");
		addColumn("nodeico", "nodeico");
		addColumn("projtype", "projtype");
		addColumn("unitnum", "unitnum");
		addColumn("showid", "showid");
		addColumn("scaleQ", "scale_q");
		addColumn("ispegwork", "ispegwork");
		addColumn("treeprojUser2", "treeproj_user2");
	}

	public TreeProjectQuery ispegwork(String ispegwork) {
		if (ispegwork == null) {
			throw new RuntimeException("ispegwork is null");
		}
		this.ispegwork = ispegwork;
		return this;
	}

	public TreeProjectQuery ispegworkLike(String ispegworkLike) {
		if (ispegworkLike == null) {
			throw new RuntimeException("ispegwork is null");
		}
		this.ispegworkLike = ispegworkLike;
		return this;
	}

	public TreeProjectQuery ispegworks(List<String> ispegworks) {
		if (ispegworks == null) {
			throw new RuntimeException("ispegworks is empty ");
		}
		this.ispegworks = ispegworks;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreeProjectQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreeProjectQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreeProjectQuery nlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreeProjectQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreeProjectQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreeProjectQuery projtype(String projtype) {
		if (projtype == null) {
			throw new RuntimeException("projtype is null");
		}
		this.projtype = projtype;
		return this;
	}

	public TreeProjectQuery projtypeLike(String projtypeLike) {
		if (projtypeLike == null) {
			throw new RuntimeException("projtype is null");
		}
		this.projtypeLike = projtypeLike;
		return this;
	}

	public TreeProjectQuery projtypes(List<String> projtypes) {
		if (projtypes == null) {
			throw new RuntimeException("projtypes is empty ");
		}
		this.projtypes = projtypes;
		return this;
	}

	public TreeProjectQuery scaleQ(Long scaleQ) {
		if (scaleQ == null) {
			throw new RuntimeException("scaleQ is null");
		}
		this.scaleQ = scaleQ;
		return this;
	}

	public TreeProjectQuery scaleQGreaterThanOrEqual(
			Long scaleQGreaterThanOrEqual) {
		if (scaleQGreaterThanOrEqual == null) {
			throw new RuntimeException("scaleQ is null");
		}
		this.scaleQGreaterThanOrEqual = scaleQGreaterThanOrEqual;
		return this;
	}

	public TreeProjectQuery scaleQLessThanOrEqual(Long scaleQLessThanOrEqual) {
		if (scaleQLessThanOrEqual == null) {
			throw new RuntimeException("scaleQ is null");
		}
		this.scaleQLessThanOrEqual = scaleQLessThanOrEqual;
		return this;
	}

	public TreeProjectQuery scaleQs(List<Long> scaleQs) {
		if (scaleQs == null) {
			throw new RuntimeException("scaleQs is empty ");
		}
		this.scaleQs = scaleQs;
		return this;
	}

	public void setContent2Like(String content2Like) {
		this.content2Like = content2Like;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
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

	public void setIspegwork(String ispegwork) {
		this.ispegwork = ispegwork;
	}

	public void setIspegworkLike(String ispegworkLike) {
		this.ispegworkLike = ispegworkLike;
	}

	public void setIspegworks(List<String> ispegworks) {
		this.ispegworks = ispegworks;
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

	public void setProjtype(String projtype) {
		this.projtype = projtype;
	}

	public void setProjtypeLike(String projtypeLike) {
		this.projtypeLike = projtypeLike;
	}

	public void setProjtypes(List<String> projtypes) {
		this.projtypes = projtypes;
	}

	public void setScaleQ(Long scaleQ) {
		this.scaleQ = scaleQ;
	}

	public void setScaleQGreaterThanOrEqual(Long scaleQGreaterThanOrEqual) {
		this.scaleQGreaterThanOrEqual = scaleQGreaterThanOrEqual;
	}

	public void setScaleQLessThanOrEqual(Long scaleQLessThanOrEqual) {
		this.scaleQLessThanOrEqual = scaleQLessThanOrEqual;
	}

	public void setScaleQs(List<Long> scaleQs) {
		this.scaleQs = scaleQs;
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

	public void setSindexNameLike(String sindexNameLike) {
		this.sindexNameLike = sindexNameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTopId(Integer topId) {
		this.topId = topId;
	}

	public void setTopIdGreaterThanOrEqual(Integer topIdGreaterThanOrEqual) {
		this.topIdGreaterThanOrEqual = topIdGreaterThanOrEqual;
	}

	public void setTopIdLessThanOrEqual(Integer topIdLessThanOrEqual) {
		this.topIdLessThanOrEqual = topIdLessThanOrEqual;
	}

	public void setTopIds(List<Integer> topIds) {
		this.topIds = topIds;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTopnodeLike(String topnodeLike) {
		this.topnodeLike = topnodeLike;
	}

	public void setTopnodes(List<String> topnodes) {
		this.topnodes = topnodes;
	}

	public void setUnitnum(String unitnum) {
		this.unitnum = unitnum;
	}

	public void setUnitnumLike(String unitnumLike) {
		this.unitnumLike = unitnumLike;
	}

	public void setUnitnums(List<String> unitnums) {
		this.unitnums = unitnums;
	}

	public void setUseId(String useId) {
		this.useId = useId;
	}

	public void setUseIdLike(String useIdLike) {
		this.useIdLike = useIdLike;
	}

	public void setUseIds(List<String> useIds) {
		this.useIds = useIds;
	}

	public TreeProjectQuery showid(Integer showid) {
		if (showid == null) {
			throw new RuntimeException("showid is null");
		}
		this.showid = showid;
		return this;
	}

	public TreeProjectQuery showidGreaterThanOrEqual(
			Integer showidGreaterThanOrEqual) {
		if (showidGreaterThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidGreaterThanOrEqual = showidGreaterThanOrEqual;
		return this;
	}

	public TreeProjectQuery showidLessThanOrEqual(Integer showidLessThanOrEqual) {
		if (showidLessThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidLessThanOrEqual = showidLessThanOrEqual;
		return this;
	}

	public TreeProjectQuery showids(List<Integer> showids) {
		if (showids == null) {
			throw new RuntimeException("showids is empty ");
		}
		this.showids = showids;
		return this;
	}

	public TreeProjectQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public TreeProjectQuery topId(Integer topId) {
		if (topId == null) {
			throw new RuntimeException("topId is null");
		}
		this.topId = topId;
		return this;
	}

	public TreeProjectQuery topIdGreaterThanOrEqual(
			Integer topIdGreaterThanOrEqual) {
		if (topIdGreaterThanOrEqual == null) {
			throw new RuntimeException("topId is null");
		}
		this.topIdGreaterThanOrEqual = topIdGreaterThanOrEqual;
		return this;
	}

	public TreeProjectQuery topIdLessThanOrEqual(Integer topIdLessThanOrEqual) {
		if (topIdLessThanOrEqual == null) {
			throw new RuntimeException("topId is null");
		}
		this.topIdLessThanOrEqual = topIdLessThanOrEqual;
		return this;
	}

	public TreeProjectQuery topIds(List<Integer> topIds) {
		if (topIds == null) {
			throw new RuntimeException("topIds is empty ");
		}
		this.topIds = topIds;
		return this;
	}

	public TreeProjectQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public TreeProjectQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public TreeProjectQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public TreeProjectQuery unitnum(String unitnum) {
		if (unitnum == null) {
			throw new RuntimeException("unitnum is null");
		}
		this.unitnum = unitnum;
		return this;
	}

	public TreeProjectQuery unitnumLike(String unitnumLike) {
		if (unitnumLike == null) {
			throw new RuntimeException("unitnum is null");
		}
		this.unitnumLike = unitnumLike;
		return this;
	}

	public TreeProjectQuery unitnums(List<String> unitnums) {
		if (unitnums == null) {
			throw new RuntimeException("unitnums is empty ");
		}
		this.unitnums = unitnums;
		return this;
	}

	public TreeProjectQuery useId(String useId) {
		if (useId == null) {
			throw new RuntimeException("useId is null");
		}
		this.useId = useId;
		return this;
	}

	public TreeProjectQuery useIdLike(String useIdLike) {
		if (useIdLike == null) {
			throw new RuntimeException("useId is null");
		}
		this.useIdLike = useIdLike;
		return this;
	}

	public TreeProjectQuery useIds(List<String> useIds) {
		if (useIds == null) {
			throw new RuntimeException("useIds is empty ");
		}
		this.useIds = useIds;
		return this;
	}

}