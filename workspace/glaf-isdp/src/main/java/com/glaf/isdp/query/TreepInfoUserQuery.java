package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreepInfoUserQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected String numLike;
	protected String indexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String nodetype;
	protected String nodetypeLike;
	protected List<String> nodetypes;
	protected Integer fromid;
	protected Integer fromidGreaterThanOrEqual;
	protected Integer fromidLessThanOrEqual;
	protected List<Integer> fromids;
	protected Integer showid;
	protected Integer showidGreaterThanOrEqual;
	protected Integer showidLessThanOrEqual;
	protected List<Integer> showids;
	protected String projtype;
	protected String projtypeLike;
	protected List<String> projtypes;
	protected Integer partId;
	protected Integer partIdGreaterThanOrEqual;
	protected Integer partIdLessThanOrEqual;
	protected List<Integer> partIds;
	protected Integer pfilesIndex;
	protected Integer pfilesIndexGreaterThanOrEqual;
	protected Integer pfilesIndexLessThanOrEqual;
	protected List<Integer> pfilesIndexs;
	protected String typeTablename;
	protected String typeTablenameLike;
	protected List<String> typeTablenames;
	protected String strfileLocate;
	protected String strfileLocateLike;
	protected List<String> strfileLocates;
	

	public TreepInfoUserQuery() {

	}

	public TreepInfoUserQuery fromid(Integer fromid) {
		if (fromid == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromid = fromid;
		return this;
	}

	public TreepInfoUserQuery fromidGreaterThanOrEqual(
			Integer fromidGreaterThanOrEqual) {
		if (fromidGreaterThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidGreaterThanOrEqual = fromidGreaterThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery fromidLessThanOrEqual(
			Integer fromidLessThanOrEqual) {
		if (fromidLessThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidLessThanOrEqual = fromidLessThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery fromids(List<Integer> fromids) {
		if (fromids == null) {
			throw new RuntimeException("fromids is empty ");
		}
		this.fromids = fromids;
		return this;
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

	public String getNodetypeLike() {
		if (nodetypeLike != null && nodetypeLike.trim().length() > 0) {
			if (!nodetypeLike.startsWith("%")) {
				nodetypeLike = "%" + nodetypeLike;
			}
			if (!nodetypeLike.endsWith("%")) {
				nodetypeLike = nodetypeLike + "%";
			}
		}
		return nodetypeLike;
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

	public Integer getPartId() {
		return partId;
	}

	public Integer getPartIdGreaterThanOrEqual() {
		return partIdGreaterThanOrEqual;
	}

	public Integer getPartIdLessThanOrEqual() {
		return partIdLessThanOrEqual;
	}

	public List<Integer> getPartIds() {
		return partIds;
	}

	public Integer getPfilesIndex() {
		return pfilesIndex;
	}

	public Integer getPfilesIndexGreaterThanOrEqual() {
		return pfilesIndexGreaterThanOrEqual;
	}

	public Integer getPfilesIndexLessThanOrEqual() {
		return pfilesIndexLessThanOrEqual;
	}

	public List<Integer> getPfilesIndexs() {
		return pfilesIndexs;
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

	public String getStrfileLocate() {
		return strfileLocate;
	}

	public String getStrfileLocateLike() {
		if (strfileLocateLike != null && strfileLocateLike.trim().length() > 0) {
			if (!strfileLocateLike.startsWith("%")) {
				strfileLocateLike = "%" + strfileLocateLike;
			}
			if (!strfileLocateLike.endsWith("%")) {
				strfileLocateLike = strfileLocateLike + "%";
			}
		}
		return strfileLocateLike;
	}

	public List<String> getStrfileLocates() {
		return strfileLocates;
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

	public TreepInfoUserQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public TreepInfoUserQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public TreepInfoUserQuery indexNameLike(String indexNameLike) {
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
		addColumn("num", "num");
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("nodetype", "nodetype");
		addColumn("fromid", "fromid");
		addColumn("showid", "showid");
		addColumn("projtype", "projtype");
		addColumn("nodeico", "nodeico");
		addColumn("listno", "listno");
		addColumn("partId", "part_id");
		addColumn("pfilesIndex", "pfiles_index");
		addColumn("typeTablename", "type_tablename");
		addColumn("strfileLocate", "strfileLocate");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreepInfoUserQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreepInfoUserQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery nlevelLessThanOrEqual(
			Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreepInfoUserQuery nodetype(String nodetype) {
		if (nodetype == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetype = nodetype;
		return this;
	}

	public TreepInfoUserQuery nodetypeLike(String nodetypeLike) {
		if (nodetypeLike == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetypeLike = nodetypeLike;
		return this;
	}

	public TreepInfoUserQuery nodetypes(List<String> nodetypes) {
		if (nodetypes == null) {
			throw new RuntimeException("nodetypes is empty ");
		}
		this.nodetypes = nodetypes;
		return this;
	}

	public TreepInfoUserQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreepInfoUserQuery partId(Integer partId) {
		if (partId == null) {
			throw new RuntimeException("partId is null");
		}
		this.partId = partId;
		return this;
	}

	public TreepInfoUserQuery partIdGreaterThanOrEqual(
			Integer partIdGreaterThanOrEqual) {
		if (partIdGreaterThanOrEqual == null) {
			throw new RuntimeException("partId is null");
		}
		this.partIdGreaterThanOrEqual = partIdGreaterThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery partIdLessThanOrEqual(
			Integer partIdLessThanOrEqual) {
		if (partIdLessThanOrEqual == null) {
			throw new RuntimeException("partId is null");
		}
		this.partIdLessThanOrEqual = partIdLessThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery partIds(List<Integer> partIds) {
		if (partIds == null) {
			throw new RuntimeException("partIds is empty ");
		}
		this.partIds = partIds;
		return this;
	}

	public TreepInfoUserQuery pfilesIndex(Integer pfilesIndex) {
		if (pfilesIndex == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndex = pfilesIndex;
		return this;
	}

	public TreepInfoUserQuery pfilesIndexGreaterThanOrEqual(
			Integer pfilesIndexGreaterThanOrEqual) {
		if (pfilesIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndexGreaterThanOrEqual = pfilesIndexGreaterThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery pfilesIndexLessThanOrEqual(
			Integer pfilesIndexLessThanOrEqual) {
		if (pfilesIndexLessThanOrEqual == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndexLessThanOrEqual = pfilesIndexLessThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery pfilesIndexs(List<Integer> pfilesIndexs) {
		if (pfilesIndexs == null) {
			throw new RuntimeException("pfilesIndexs is empty ");
		}
		this.pfilesIndexs = pfilesIndexs;
		return this;
	}

	public TreepInfoUserQuery projtype(String projtype) {
		if (projtype == null) {
			throw new RuntimeException("projtype is null");
		}
		this.projtype = projtype;
		return this;
	}

	public TreepInfoUserQuery projtypeLike(String projtypeLike) {
		if (projtypeLike == null) {
			throw new RuntimeException("projtype is null");
		}
		this.projtypeLike = projtypeLike;
		return this;
	}

	public TreepInfoUserQuery projtypes(List<String> projtypes) {
		if (projtypes == null) {
			throw new RuntimeException("projtypes is empty ");
		}
		this.projtypes = projtypes;
		return this;
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

	public void setIdLike(String idLike) {
		this.idLike = idLike;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
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

	public void setNodetypeLike(String nodetypeLike) {
		this.nodetypeLike = nodetypeLike;
	}

	public void setNodetypes(List<String> nodetypes) {
		this.nodetypes = nodetypes;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public void setPartIdGreaterThanOrEqual(Integer partIdGreaterThanOrEqual) {
		this.partIdGreaterThanOrEqual = partIdGreaterThanOrEqual;
	}

	public void setPartIdLessThanOrEqual(Integer partIdLessThanOrEqual) {
		this.partIdLessThanOrEqual = partIdLessThanOrEqual;
	}

	public void setPartIds(List<Integer> partIds) {
		this.partIds = partIds;
	}

	public void setPfilesIndex(Integer pfilesIndex) {
		this.pfilesIndex = pfilesIndex;
	}

	public void setPfilesIndexGreaterThanOrEqual(
			Integer pfilesIndexGreaterThanOrEqual) {
		this.pfilesIndexGreaterThanOrEqual = pfilesIndexGreaterThanOrEqual;
	}

	public void setPfilesIndexLessThanOrEqual(Integer pfilesIndexLessThanOrEqual) {
		this.pfilesIndexLessThanOrEqual = pfilesIndexLessThanOrEqual;
	}

	public void setPfilesIndexs(List<Integer> pfilesIndexs) {
		this.pfilesIndexs = pfilesIndexs;
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

	public void setStrfileLocate(String strfileLocate) {
		this.strfileLocate = strfileLocate;
	}

	public void setStrfileLocateLike(String strfileLocateLike) {
		this.strfileLocateLike = strfileLocateLike;
	}

	public void setStrfileLocates(List<String> strfileLocates) {
		this.strfileLocates = strfileLocates;
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

	public TreepInfoUserQuery showid(Integer showid) {
		if (showid == null) {
			throw new RuntimeException("showid is null");
		}
		this.showid = showid;
		return this;
	}

	public TreepInfoUserQuery showidGreaterThanOrEqual(
			Integer showidGreaterThanOrEqual) {
		if (showidGreaterThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidGreaterThanOrEqual = showidGreaterThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery showidLessThanOrEqual(
			Integer showidLessThanOrEqual) {
		if (showidLessThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidLessThanOrEqual = showidLessThanOrEqual;
		return this;
	}

	public TreepInfoUserQuery showids(List<Integer> showids) {
		if (showids == null) {
			throw new RuntimeException("showids is empty ");
		}
		this.showids = showids;
		return this;
	}

	public TreepInfoUserQuery strfileLocate(String strfileLocate) {
		if (strfileLocate == null) {
			throw new RuntimeException("strfileLocate is null");
		}
		this.strfileLocate = strfileLocate;
		return this;
	}

	public TreepInfoUserQuery strfileLocateLike(String strfileLocateLike) {
		if (strfileLocateLike == null) {
			throw new RuntimeException("strfileLocate is null");
		}
		this.strfileLocateLike = strfileLocateLike;
		return this;
	}

	public TreepInfoUserQuery strfileLocates(List<String> strfileLocates) {
		if (strfileLocates == null) {
			throw new RuntimeException("strfileLocates is empty ");
		}
		this.strfileLocates = strfileLocates;
		return this;
	}

	public TreepInfoUserQuery typeTablename(String typeTablename) {
		if (typeTablename == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablename = typeTablename;
		return this;
	}

	public TreepInfoUserQuery typeTablenameLike(String typeTablenameLike) {
		if (typeTablenameLike == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablenameLike = typeTablenameLike;
		return this;
	}

	public TreepInfoUserQuery typeTablenames(List<String> typeTablenames) {
		if (typeTablenames == null) {
			throw new RuntimeException("typeTablenames is empty ");
		}
		this.typeTablenames = typeTablenames;
		return this;
	}

}