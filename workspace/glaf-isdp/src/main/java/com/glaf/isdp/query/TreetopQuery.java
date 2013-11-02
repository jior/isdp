package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreetopQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected String indexNameLike;
	protected String numLike;
	protected String contentLike;
	protected String ftype;
	protected List<String> ftypes;
	protected String secondIndexNameLike;
	protected String filenumLike;
	protected Integer ztype;
	protected List<Integer> ztypes;
	protected String content2Like;
	protected String topnode;
	protected String topnodeLike;
	protected List<String> topnodes;
	protected String slevel;
	protected String slevelLike;
	protected String savetime;
	protected String savetimeLike;
	protected String topNode;

	

	public TreetopQuery() {

	}

	public TreetopQuery content2Like(String content2Like) {
		if (content2Like == null) {
			throw new RuntimeException("content2 is null");
		}
		this.content2Like = content2Like;
		return this;
	}

	public TreetopQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public TreetopQuery filenumLike(String filenumLike) {
		if (filenumLike == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumLike = filenumLike;
		return this;
	}

	public TreetopQuery ftype(String ftype) {
		if (ftype == null) {
			throw new RuntimeException("ftype is null");
		}
		this.ftype = ftype;
		return this;
	}

	public TreetopQuery ftypes(List<String> ftypes) {
		if (ftypes == null) {
			throw new RuntimeException("ftypes is empty ");
		}
		this.ftypes = ftypes;
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

	public String getFtype() {
		return ftype;
	}

	public List<String> getFtypes() {
		return ftypes;
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

	public String getSavetime() {
		return savetime;
	}

	public String getSavetimeLike() {
		if (savetimeLike != null && savetimeLike.trim().length() > 0) {
			if (!savetimeLike.startsWith("%")) {
				savetimeLike = "%" + savetimeLike;
			}
			if (!savetimeLike.endsWith("%")) {
				savetimeLike = savetimeLike + "%";
			}
		}
		return savetimeLike;
	}

	public String getSecondIndexNameLike() {
		if (secondIndexNameLike != null
				&& secondIndexNameLike.trim().length() > 0) {
			if (!secondIndexNameLike.startsWith("%")) {
				secondIndexNameLike = "%" + secondIndexNameLike;
			}
			if (!secondIndexNameLike.endsWith("%")) {
				secondIndexNameLike = secondIndexNameLike + "%";
			}
		}
		return secondIndexNameLike;
	}

	public String getSlevel() {
		return slevel;
	}

	public String getSlevelLike() {
		if (slevelLike != null && slevelLike.trim().length() > 0) {
			if (!slevelLike.startsWith("%")) {
				slevelLike = "%" + slevelLike;
			}
			if (!slevelLike.endsWith("%")) {
				slevelLike = slevelLike + "%";
			}
		}
		return slevelLike;
	}

	public String getTopnode() {
		return topnode;
	}

	public String getTopNode() {
		return topNode;
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

	public Integer getZtype() {
		return ztype;
	}

	public List<Integer> getZtypes() {
		return ztypes;
	}

	public TreetopQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public TreetopQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public TreetopQuery indexNameLike(String indexNameLike) {
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
		addColumn("id", "id");
		addColumn("parentId", "parent_id");
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("num", "num");
		addColumn("content", "content");
		addColumn("ftype", "ftype");
		addColumn("secondIndexName", "sindex_name");
		addColumn("filenum", "filenum");
		addColumn("ztype", "ztype");
		addColumn("content2", "content2");
		addColumn("topnode", "topnode");
		addColumn("isnotshow", "isnotshow");
		addColumn("nodeico", "nodeico");
		addColumn("filenumid", "filenumid");
		addColumn("slevel", "slevel");
		addColumn("savetime", "savetime");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreetopQuery nameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	public TreetopQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreetopQuery savetime(String savetime) {
		if (savetime == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetime = savetime;
		return this;
	}

	public TreetopQuery savetimeLike(String savetimeLike) {
		if (savetimeLike == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetimeLike = savetimeLike;
		return this;
	}

	public TreetopQuery secondIndexNameLike(String secondIndexNameLike) {
		if (secondIndexNameLike == null) {
			throw new RuntimeException("secondIndexName is null");
		}
		this.secondIndexNameLike = secondIndexNameLike;
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

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public void setFtypes(List<String> ftypes) {
		this.ftypes = ftypes;
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

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setSavetimeLike(String savetimeLike) {
		this.savetimeLike = savetimeLike;
	}

	public void setSecondIndexNameLike(String secondIndexNameLike) {
		this.secondIndexNameLike = secondIndexNameLike;
	}

	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}

	public void setSlevelLike(String slevelLike) {
		this.slevelLike = slevelLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTopNode(String topNode) {
		this.topNode = topNode;
	}

	public void setTopnodeLike(String topnodeLike) {
		this.topnodeLike = topnodeLike;
	}

	public void setTopnodes(List<String> topnodes) {
		this.topnodes = topnodes;
	}

	public void setZtype(Integer ztype) {
		this.ztype = ztype;
	}

	public void setZtypes(List<Integer> ztypes) {
		this.ztypes = ztypes;
	}

	public TreetopQuery slevel(String slevel) {
		if (slevel == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevel = slevel;
		return this;
	}

	public TreetopQuery slevelLike(String slevelLike) {
		if (slevelLike == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevelLike = slevelLike;
		return this;
	}

	public TreetopQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public TreetopQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public TreetopQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public TreetopQuery ztype(Integer ztype) {
		if (ztype == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztype = ztype;
		return this;
	}

	public TreetopQuery ztypes(List<Integer> ztypes) {
		if (ztypes == null) {
			throw new RuntimeException("ztypes is empty ");
		}
		this.ztypes = ztypes;
		return this;
	}

}