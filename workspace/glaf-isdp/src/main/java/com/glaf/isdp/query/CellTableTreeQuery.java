package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellTableTreeQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String id;
	protected String idLike;
	protected List<String> ids;
	protected String indexNameLike;
	protected Integer tabletype;
	protected List<Integer> tabletypes;
	protected Integer intdel;
	protected String busiessId;
	protected List<String> busiessIds;
	protected String contentLike;
	protected String numLike;
	protected List<String> nums;
	protected Integer menuindex;
	protected List<Integer> menuindexs;
	protected Integer domainIndex;
	protected List<Integer> domainIndexs;
	

	public CellTableTreeQuery() {

	}

	public CellTableTreeQuery busiessId(String busiessId) {
		if (busiessId == null) {
			throw new RuntimeException("busiessId is null");
		}
		this.busiessId = busiessId;
		return this;
	}

	public CellTableTreeQuery busiessIds(List<String> busiessIds) {
		if (busiessIds == null) {
			throw new RuntimeException("busiessIds is empty ");
		}
		this.busiessIds = busiessIds;
		return this;
	}

	public CellTableTreeQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public CellTableTreeQuery domainIndex(Integer domainIndex) {
		if (domainIndex == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndex = domainIndex;
		return this;
	}

	public CellTableTreeQuery domainIndexs(List<Integer> domainIndexs) {
		if (domainIndexs == null) {
			throw new RuntimeException("domainIndexs is empty ");
		}
		this.domainIndexs = domainIndexs;
		return this;
	}

	public String getBusiessId() {
		return busiessId;
	}

	public List<String> getBusiessIds() {
		return busiessIds;
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

	public Integer getDomainIndex() {
		return domainIndex;
	}

	public List<Integer> getDomainIndexs() {
		return domainIndexs;
	}

	public String getId() {
		return id;
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

	public Integer getIntdel() {
		return intdel;
	}

	public Integer getMenuindex() {
		return menuindex;
	}

	public List<Integer> getMenuindexs() {
		return menuindexs;
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

	public List<String> getNums() {
		return nums;
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

	public Integer getTabletype() {
		return tabletype;
	}

	public List<Integer> getTabletypes() {
		return tabletypes;
	}

	public CellTableTreeQuery id(String id) {
		if (id == null) {
			throw new RuntimeException("id is null");
		}
		this.id = id;
		return this;
	}

	public CellTableTreeQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public CellTableTreeQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public CellTableTreeQuery indexNameLike(String indexNameLike) {
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
		addColumn("nodeico", "nodeico");
		addColumn("listno", "listno");
		addColumn("tabletype", "tabletype");
		addColumn("intdel", "intdel");
		addColumn("busiessId", "busiess_id");
		addColumn("content", "content");
		addColumn("num", "num");
		addColumn("menuindex", "menuindex");
		addColumn("domainIndex", "domain_index");
		addColumn("winWidth", "win_width");
		addColumn("winHeight", "win_height");
	}

	public CellTableTreeQuery intdel(Integer intdel) {
		if (intdel == null) {
			throw new RuntimeException("intdel is null");
		}
		this.intdel = intdel;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellTableTreeQuery menuindex(Integer menuindex) {
		if (menuindex == null) {
			throw new RuntimeException("menuindex is null");
		}
		this.menuindex = menuindex;
		return this;
	}

	public CellTableTreeQuery menuindexs(List<Integer> menuindexs) {
		if (menuindexs == null) {
			throw new RuntimeException("menuindexs is empty ");
		}
		this.menuindexs = menuindexs;
		return this;
	}

	public CellTableTreeQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
	}

	public void setBusiessIds(List<String> busiessIds) {
		this.busiessIds = busiessIds;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setDomainIndex(Integer domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setDomainIndexs(List<Integer> domainIndexs) {
		this.domainIndexs = domainIndexs;
	}

	public void setId(String id) {
		this.id = id;
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

	public void setIntdel(Integer intdel) {
		this.intdel = intdel;
	}

	public void setMenuindex(Integer menuindex) {
		this.menuindex = menuindex;
	}

	public void setMenuindexs(List<Integer> menuindexs) {
		this.menuindexs = menuindexs;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setNums(List<String> nums) {
		this.nums = nums;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTabletype(Integer tabletype) {
		this.tabletype = tabletype;
	}

	public void setTabletypes(List<Integer> tabletypes) {
		this.tabletypes = tabletypes;
	}

	public CellTableTreeQuery tabletype(Integer tabletype) {
		if (tabletype == null) {
			throw new RuntimeException("tabletype is null");
		}
		this.tabletype = tabletype;
		return this;
	}

	public CellTableTreeQuery tabletypes(List<Integer> tabletypes) {
		if (tabletypes == null) {
			throw new RuntimeException("tabletypes is empty ");
		}
		this.tabletypes = tabletypes;
		return this;
	}

}