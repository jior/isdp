package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellCriterionTreeQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer treeprojIndex;
	protected Integer treeprojIndexGreaterThanOrEqual;
	protected Integer treeprojIndexLessThanOrEqual;
	protected List<Integer> treeprojIndexs;
	protected String numLike;
	protected String indexNameLike;
	protected String contentLike;
	protected List<String> contents;
	protected Integer isuse;
	protected Integer isuseGreaterThanOrEqual;
	protected Integer isuseLessThanOrEqual;
	protected List<Integer> isuses;
	protected String idLike;
	protected List<String> ids;
	protected Integer inttype;
	protected Integer inttypeGreaterThanOrEqual;
	protected Integer inttypeLessThanOrEqual;
	protected List<Integer> inttypes;
	

	public CellCriterionTreeQuery() {

	}

	public CellCriterionTreeQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public CellCriterionTreeQuery contents(List<String> contents) {
		if (contents == null) {
			throw new RuntimeException("contents is empty ");
		}
		this.contents = contents;
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

	public List<String> getContents() {
		return contents;
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

	public Integer getIsuse() {
		return isuse;
	}

	public Integer getIsuseGreaterThanOrEqual() {
		return isuseGreaterThanOrEqual;
	}

	public Integer getIsuseLessThanOrEqual() {
		return isuseLessThanOrEqual;
	}

	public List<Integer> getIsuses() {
		return isuses;
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

	public Integer getTreeprojIndex() {
		return treeprojIndex;
	}

	public Integer getTreeprojIndexGreaterThanOrEqual() {
		return treeprojIndexGreaterThanOrEqual;
	}

	public Integer getTreeprojIndexLessThanOrEqual() {
		return treeprojIndexLessThanOrEqual;
	}

	public List<Integer> getTreeprojIndexs() {
		return treeprojIndexs;
	}

	public CellCriterionTreeQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public CellCriterionTreeQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public CellCriterionTreeQuery indexNameLike(String indexNameLike) {
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
		addColumn("parentId", "parent_id");
		addColumn("treeprojIndex", "treeproj_index");
		addColumn("num", "num");
		addColumn("indexName", "index_name");
		addColumn("content", "content");
		addColumn("isuse", "isuse");
		addColumn("nodeico", "nodeico");
		addColumn("listno", "listno");
		addColumn("id", "id");
		addColumn("inttype", "inttype");
	}

	public CellCriterionTreeQuery inttype(Integer inttype) {
		if (inttype == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttype = inttype;
		return this;
	}

	public CellCriterionTreeQuery inttypeGreaterThanOrEqual(
			Integer inttypeGreaterThanOrEqual) {
		if (inttypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
		return this;
	}

	public CellCriterionTreeQuery inttypeLessThanOrEqual(
			Integer inttypeLessThanOrEqual) {
		if (inttypeLessThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
		return this;
	}

	public CellCriterionTreeQuery inttypes(List<Integer> inttypes) {
		if (inttypes == null) {
			throw new RuntimeException("inttypes is empty ");
		}
		this.inttypes = inttypes;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellCriterionTreeQuery isuse(Integer isuse) {
		if (isuse == null) {
			throw new RuntimeException("isuse is null");
		}
		this.isuse = isuse;
		return this;
	}

	public CellCriterionTreeQuery isuseGreaterThanOrEqual(
			Integer isuseGreaterThanOrEqual) {
		if (isuseGreaterThanOrEqual == null) {
			throw new RuntimeException("isuse is null");
		}
		this.isuseGreaterThanOrEqual = isuseGreaterThanOrEqual;
		return this;
	}

	public CellCriterionTreeQuery isuseLessThanOrEqual(
			Integer isuseLessThanOrEqual) {
		if (isuseLessThanOrEqual == null) {
			throw new RuntimeException("isuse is null");
		}
		this.isuseLessThanOrEqual = isuseLessThanOrEqual;
		return this;
	}

	public CellCriterionTreeQuery isuses(List<Integer> isuses) {
		if (isuses == null) {
			throw new RuntimeException("isuses is empty ");
		}
		this.isuses = isuses;
		return this;
	}

	public CellCriterionTreeQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
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

	public void setIsuse(Integer isuse) {
		this.isuse = isuse;
	}

	public void setIsuseGreaterThanOrEqual(Integer isuseGreaterThanOrEqual) {
		this.isuseGreaterThanOrEqual = isuseGreaterThanOrEqual;
	}

	public void setIsuseLessThanOrEqual(Integer isuseLessThanOrEqual) {
		this.isuseLessThanOrEqual = isuseLessThanOrEqual;
	}

	public void setIsuses(List<Integer> isuses) {
		this.isuses = isuses;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTreeprojIndex(Integer treeprojIndex) {
		this.treeprojIndex = treeprojIndex;
	}

	public void setTreeprojIndexGreaterThanOrEqual(
			Integer treeprojIndexGreaterThanOrEqual) {
		this.treeprojIndexGreaterThanOrEqual = treeprojIndexGreaterThanOrEqual;
	}

	public void setTreeprojIndexLessThanOrEqual(
			Integer treeprojIndexLessThanOrEqual) {
		this.treeprojIndexLessThanOrEqual = treeprojIndexLessThanOrEqual;
	}

	public void setTreeprojIndexs(List<Integer> treeprojIndexs) {
		this.treeprojIndexs = treeprojIndexs;
	}

	public CellCriterionTreeQuery treeprojIndex(Integer treeprojIndex) {
		if (treeprojIndex == null) {
			throw new RuntimeException("treeprojIndex is null");
		}
		this.treeprojIndex = treeprojIndex;
		return this;
	}

	public CellCriterionTreeQuery treeprojIndexGreaterThanOrEqual(
			Integer treeprojIndexGreaterThanOrEqual) {
		if (treeprojIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("treeprojIndex is null");
		}
		this.treeprojIndexGreaterThanOrEqual = treeprojIndexGreaterThanOrEqual;
		return this;
	}

	public CellCriterionTreeQuery treeprojIndexLessThanOrEqual(
			Integer treeprojIndexLessThanOrEqual) {
		if (treeprojIndexLessThanOrEqual == null) {
			throw new RuntimeException("treeprojIndex is null");
		}
		this.treeprojIndexLessThanOrEqual = treeprojIndexLessThanOrEqual;
		return this;
	}

	public CellCriterionTreeQuery treeprojIndexs(List<Integer> treeprojIndexs) {
		if (treeprojIndexs == null) {
			throw new RuntimeException("treeprojIndexs is empty ");
		}
		this.treeprojIndexs = treeprojIndexs;
		return this;
	}

}