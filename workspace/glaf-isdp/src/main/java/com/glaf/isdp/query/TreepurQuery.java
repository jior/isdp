package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreepurQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String indexNameLike;
	protected Integer modulenum;
	protected Integer modulenumGreaterThanOrEqual;
	protected Integer modulenumLessThanOrEqual;
	protected List<Integer> modulenums;
	protected String contentLike;
	

	public TreepurQuery() {

	}

	public TreepurQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
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

	public Integer getModulenum() {
		return modulenum;
	}

	public Integer getModulenumGreaterThanOrEqual() {
		return modulenumGreaterThanOrEqual;
	}

	public Integer getModulenumLessThanOrEqual() {
		return modulenumLessThanOrEqual;
	}

	public List<Integer> getModulenums() {
		return modulenums;
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

	public TreepurQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public TreepurQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public TreepurQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public TreepurQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	public TreepurQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("parentId", "parent_id");
		addColumn("indexId", "index_id");
		addColumn("indexName", "index_name");
		addColumn("modulenum", "modulenum");
		addColumn("content", "content");
		addColumn("listno", "listno");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreepurQuery modulenum(Integer modulenum) {
		if (modulenum == null) {
			throw new RuntimeException("modulenum is null");
		}
		this.modulenum = modulenum;
		return this;
	}

	public TreepurQuery modulenumGreaterThanOrEqual(
			Integer modulenumGreaterThanOrEqual) {
		if (modulenumGreaterThanOrEqual == null) {
			throw new RuntimeException("modulenum is null");
		}
		this.modulenumGreaterThanOrEqual = modulenumGreaterThanOrEqual;
		return this;
	}

	public TreepurQuery modulenumLessThanOrEqual(
			Integer modulenumLessThanOrEqual) {
		if (modulenumLessThanOrEqual == null) {
			throw new RuntimeException("modulenum is null");
		}
		this.modulenumLessThanOrEqual = modulenumLessThanOrEqual;
		return this;
	}

	public TreepurQuery modulenums(List<Integer> modulenums) {
		if (modulenums == null) {
			throw new RuntimeException("modulenums is empty ");
		}
		this.modulenums = modulenums;
		return this;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
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

	public void setModulenum(Integer modulenum) {
		this.modulenum = modulenum;
	}

	public void setModulenumGreaterThanOrEqual(
			Integer modulenumGreaterThanOrEqual) {
		this.modulenumGreaterThanOrEqual = modulenumGreaterThanOrEqual;
	}

	public void setModulenumLessThanOrEqual(Integer modulenumLessThanOrEqual) {
		this.modulenumLessThanOrEqual = modulenumLessThanOrEqual;
	}

	public void setModulenums(List<Integer> modulenums) {
		this.modulenums = modulenums;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}