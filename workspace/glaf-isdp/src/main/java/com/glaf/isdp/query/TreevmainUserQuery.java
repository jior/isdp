package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreevmainUserQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String indexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String numLike;
	protected String filenumLike;
	protected String contentLike;
	protected String vflag;
	protected String vflagLike;
	protected List<String> vflags;
	protected String sindexNameLike;
	protected Integer ztype;
	protected Integer ztypeGreaterThanOrEqual;
	protected Integer ztypeLessThanOrEqual;
	protected List<Integer> ztypes;
	protected String content2Like;
	protected String topnode;
	protected String topnodeLike;
	protected List<String> topnodes;
	protected String nodetype;
	protected List<String> nodetypes;
	protected Integer fromid;
	protected Integer fromidGreaterThanOrEqual;
	protected Integer fromidLessThanOrEqual;
	protected List<Integer> fromids;
	protected Integer frmtypeindex;
	protected Integer frmtypeindexGreaterThanOrEqual;
	protected Integer frmtypeindexLessThanOrEqual;
	protected List<Integer> frmtypeindexs;

	

	public TreevmainUserQuery() {

	}

	public TreevmainUserQuery content2Like(String content2Like) {
		if (content2Like == null) {
			throw new RuntimeException("content2 is null");
		}
		this.content2Like = content2Like;
		return this;
	}

	public TreevmainUserQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public TreevmainUserQuery filenumLike(String filenumLike) {
		if (filenumLike == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumLike = filenumLike;
		return this;
	}

	public TreevmainUserQuery frmtypeindex(Integer frmtypeindex) {
		if (frmtypeindex == null) {
			throw new RuntimeException("frmtypeindex is null");
		}
		this.frmtypeindex = frmtypeindex;
		return this;
	}

	public TreevmainUserQuery frmtypeindexGreaterThanOrEqual(
			Integer frmtypeindexGreaterThanOrEqual) {
		if (frmtypeindexGreaterThanOrEqual == null) {
			throw new RuntimeException("frmtypeindex is null");
		}
		this.frmtypeindexGreaterThanOrEqual = frmtypeindexGreaterThanOrEqual;
		return this;
	}

	public TreevmainUserQuery frmtypeindexLessThanOrEqual(
			Integer frmtypeindexLessThanOrEqual) {
		if (frmtypeindexLessThanOrEqual == null) {
			throw new RuntimeException("frmtypeindex is null");
		}
		this.frmtypeindexLessThanOrEqual = frmtypeindexLessThanOrEqual;
		return this;
	}

	public TreevmainUserQuery frmtypeindexs(List<Integer> frmtypeindexs) {
		if (frmtypeindexs == null) {
			throw new RuntimeException("frmtypeindexs is empty ");
		}
		this.frmtypeindexs = frmtypeindexs;
		return this;
	}

	public TreevmainUserQuery fromid(Integer fromid) {
		if (fromid == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromid = fromid;
		return this;
	}

	public TreevmainUserQuery fromidGreaterThanOrEqual(
			Integer fromidGreaterThanOrEqual) {
		if (fromidGreaterThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidGreaterThanOrEqual = fromidGreaterThanOrEqual;
		return this;
	}

	public TreevmainUserQuery fromidLessThanOrEqual(
			Integer fromidLessThanOrEqual) {
		if (fromidLessThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidLessThanOrEqual = fromidLessThanOrEqual;
		return this;
	}

	public TreevmainUserQuery fromids(List<Integer> fromids) {
		if (fromids == null) {
			throw new RuntimeException("fromids is empty ");
		}
		this.fromids = fromids;
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

	public String getFilenumLike() {
		if (filenumLike != null && filenumLike.trim().length() > 0) {
			if (!filenumLike.startsWith("%")) {
				filenumLike = "%" + filenumLike;
			}
			if (!filenumLike.endsWith("%")) {
				filenumLike = filenumLike + "%";
			}
		}
		return filenumLike;
	}

	public Integer getFrmtypeindex() {
		return frmtypeindex;
	}

	public Integer getFrmtypeindexGreaterThanOrEqual() {
		return frmtypeindexGreaterThanOrEqual;
	}

	public Integer getFrmtypeindexLessThanOrEqual() {
		return frmtypeindexLessThanOrEqual;
	}

	public List<Integer> getFrmtypeindexs() {
		return frmtypeindexs;
	}

	public Integer getFromid() {
		return fromid;
	}

	public Integer getFromidGreaterThanOrEqual() {
		return fromidGreaterThanOrEqual;
	}

	public Integer getFromidLessThanOrEqual() {
		return fromidLessThanOrEqual;
	}

	public List<Integer> getFromids() {
		return fromids;
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

	public String getNodetype() {
		return nodetype;
	}

	public List<String> getNodetypes() {
		return nodetypes;
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

	public String getVflag() {
		return vflag;
	}

	public String getVflagLike() {
		if (vflagLike != null && vflagLike.trim().length() > 0) {
			if (!vflagLike.startsWith("%")) {
				vflagLike = "%" + vflagLike;
			}
			if (!vflagLike.endsWith("%")) {
				vflagLike = vflagLike + "%";
			}
		}
		return vflagLike;
	}

	public List<String> getVflags() {
		return vflags;
	}

	public Integer getZtype() {
		return ztype;
	}

	public Integer getZtypeGreaterThanOrEqual() {
		return ztypeGreaterThanOrEqual;
	}

	public Integer getZtypeLessThanOrEqual() {
		return ztypeLessThanOrEqual;
	}

	public List<Integer> getZtypes() {
		return ztypes;
	}

	public TreevmainUserQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public TreevmainUserQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public TreevmainUserQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public TreevmainUserQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	public TreevmainUserQuery indexNameLike(String indexNameLike) {
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
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("num", "num");
		addColumn("filenum", "filenum");
		addColumn("content", "content");
		addColumn("vflag", "vflag");
		addColumn("sindexName", "sindex_name");
		addColumn("ztype", "ztype");
		addColumn("content2", "content2");
		addColumn("topnode", "topnode");
		addColumn("nodeico", "nodeico");
		addColumn("nodetype", "nodetype");
		addColumn("fromid", "fromid");
		addColumn("listno", "listno");
		addColumn("frmtypeindex", "frmtypeindex");
		addColumn("showid", "showid");
		addColumn("showfrmid", "showfrmid");
		addColumn("showfrmindexId", "showfrmindex_id");
		addColumn("dwid", "dwid");
		addColumn("jid", "jid");
		addColumn("flid", "flid");
		addColumn("ctypeId", "ctype_id");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreevmainUserQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreevmainUserQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreevmainUserQuery nlevelLessThanOrEqual(
			Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreevmainUserQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreevmainUserQuery nodetype(String nodetype) {
		if (nodetype == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetype = nodetype;
		return this;
	}

	public TreevmainUserQuery nodetypes(List<String> nodetypes) {
		if (nodetypes == null) {
			throw new RuntimeException("nodetypes is empty ");
		}
		this.nodetypes = nodetypes;
		return this;
	}

	public TreevmainUserQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public void setContent2Like(String content2Like) {
		this.content2Like = content2Like;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setFilenumLike(String filenumLike) {
		this.filenumLike = filenumLike;
	}

	public void setFrmtypeindex(Integer frmtypeindex) {
		this.frmtypeindex = frmtypeindex;
	}

	public void setFrmtypeindexGreaterThanOrEqual(
			Integer frmtypeindexGreaterThanOrEqual) {
		this.frmtypeindexGreaterThanOrEqual = frmtypeindexGreaterThanOrEqual;
	}

	public void setFrmtypeindexLessThanOrEqual(
			Integer frmtypeindexLessThanOrEqual) {
		this.frmtypeindexLessThanOrEqual = frmtypeindexLessThanOrEqual;
	}

	public void setFrmtypeindexs(List<Integer> frmtypeindexs) {
		this.frmtypeindexs = frmtypeindexs;
	}

	public void setFromid(Integer fromid) {
		this.fromid = fromid;
	}

	public void setFromidGreaterThanOrEqual(Integer fromidGreaterThanOrEqual) {
		this.fromidGreaterThanOrEqual = fromidGreaterThanOrEqual;
	}

	public void setFromidLessThanOrEqual(Integer fromidLessThanOrEqual) {
		this.fromidLessThanOrEqual = fromidLessThanOrEqual;
	}

	public void setFromids(List<Integer> fromids) {
		this.fromids = fromids;
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

	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	public void setNodetypes(List<String> nodetypes) {
		this.nodetypes = nodetypes;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setSindexNameLike(String sindexNameLike) {
		this.sindexNameLike = sindexNameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
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

	public void setVflag(String vflag) {
		this.vflag = vflag;
	}

	public void setVflagLike(String vflagLike) {
		this.vflagLike = vflagLike;
	}

	public void setVflags(List<String> vflags) {
		this.vflags = vflags;
	}

	public void setZtype(Integer ztype) {
		this.ztype = ztype;
	}

	public void setZtypeGreaterThanOrEqual(Integer ztypeGreaterThanOrEqual) {
		this.ztypeGreaterThanOrEqual = ztypeGreaterThanOrEqual;
	}

	public void setZtypeLessThanOrEqual(Integer ztypeLessThanOrEqual) {
		this.ztypeLessThanOrEqual = ztypeLessThanOrEqual;
	}

	public void setZtypes(List<Integer> ztypes) {
		this.ztypes = ztypes;
	}

	public TreevmainUserQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public TreevmainUserQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public TreevmainUserQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public TreevmainUserQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public TreevmainUserQuery vflag(String vflag) {
		if (vflag == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflag = vflag;
		return this;
	}

	public TreevmainUserQuery vflagLike(String vflagLike) {
		if (vflagLike == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflagLike = vflagLike;
		return this;
	}

	public TreevmainUserQuery vflags(List<String> vflags) {
		if (vflags == null) {
			throw new RuntimeException("vflags is empty ");
		}
		this.vflags = vflags;
		return this;
	}

	public TreevmainUserQuery ztype(Integer ztype) {
		if (ztype == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztype = ztype;
		return this;
	}

	public TreevmainUserQuery ztypeGreaterThanOrEqual(
			Integer ztypeGreaterThanOrEqual) {
		if (ztypeGreaterThanOrEqual == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeGreaterThanOrEqual = ztypeGreaterThanOrEqual;
		return this;
	}

	public TreevmainUserQuery ztypeLessThanOrEqual(Integer ztypeLessThanOrEqual) {
		if (ztypeLessThanOrEqual == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeLessThanOrEqual = ztypeLessThanOrEqual;
		return this;
	}

	public TreevmainUserQuery ztypes(List<Integer> ztypes) {
		if (ztypes == null) {
			throw new RuntimeException("ztypes is empty ");
		}
		this.ztypes = ztypes;
		return this;
	}

}