package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class ProjectCellAndFileQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer inttype;
	protected Integer inttypeGreaterThanOrEqual;
	protected Integer inttypeLessThanOrEqual;
	protected List<Integer> inttypes;
	protected String name;
	protected String nameLike;
	protected List<String> names;
	protected String defId;
	protected String defIdLike;
	protected List<String> defIds;
	protected String useId;
	protected String useIdLike;
	protected List<String> useIds;
	protected Integer intPage0;
	protected Integer intPage0GreaterThanOrEqual;
	protected Integer intPage0LessThanOrEqual;
	protected List<Integer> intPage0s;
	protected Integer intPage1;
	protected Integer intPage1GreaterThanOrEqual;
	protected Integer intPage1LessThanOrEqual;
	protected List<Integer> intPage1s;
	protected Integer intPage2;
	protected Integer intPage2GreaterThanOrEqual;
	protected Integer intPage2LessThanOrEqual;
	protected List<Integer> intPage2s;
	protected Integer intfinish;
	protected Integer intfinishGreaterThanOrEqual;
	protected Integer intfinishLessThanOrEqual;
	protected List<Integer> intfinishs;
	

	public ProjectCellAndFileQuery() {

	}

	public ProjectCellAndFileQuery defId(String defId) {
		if (defId == null) {
			throw new RuntimeException("defId is null");
		}
		this.defId = defId;
		return this;
	}

	public ProjectCellAndFileQuery defIdLike(String defIdLike) {
		if (defIdLike == null) {
			throw new RuntimeException("defId is null");
		}
		this.defIdLike = defIdLike;
		return this;
	}

	public ProjectCellAndFileQuery defIds(List<String> defIds) {
		if (defIds == null) {
			throw new RuntimeException("defIds is empty ");
		}
		this.defIds = defIds;
		return this;
	}

	public String getDefId() {
		return defId;
	}

	public String getDefIdLike() {
		if (defIdLike != null && defIdLike.trim().length() > 0) {
			if (!defIdLike.startsWith("%")) {
				defIdLike = "%" + defIdLike;
			}
			if (!defIdLike.endsWith("%")) {
				defIdLike = defIdLike + "%";
			}
		}
		return defIdLike;
	}

	public List<String> getDefIds() {
		return defIds;
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

	public Integer getIntfinish() {
		return intfinish;
	}

	public Integer getIntfinishGreaterThanOrEqual() {
		return intfinishGreaterThanOrEqual;
	}

	public Integer getIntfinishLessThanOrEqual() {
		return intfinishLessThanOrEqual;
	}

	public List<Integer> getIntfinishs() {
		return intfinishs;
	}

	public Integer getIntPage0() {
		return intPage0;
	}

	public Integer getIntPage0GreaterThanOrEqual() {
		return intPage0GreaterThanOrEqual;
	}

	public Integer getIntPage0LessThanOrEqual() {
		return intPage0LessThanOrEqual;
	}

	public List<Integer> getIntPage0s() {
		return intPage0s;
	}

	public Integer getIntPage1() {
		return intPage1;
	}

	public Integer getIntPage1GreaterThanOrEqual() {
		return intPage1GreaterThanOrEqual;
	}

	public Integer getIntPage1LessThanOrEqual() {
		return intPage1LessThanOrEqual;
	}

	public List<Integer> getIntPage1s() {
		return intPage1s;
	}

	public Integer getIntPage2() {
		return intPage2;
	}

	public Integer getIntPage2GreaterThanOrEqual() {
		return intPage2GreaterThanOrEqual;
	}

	public Integer getIntPage2LessThanOrEqual() {
		return intPage2LessThanOrEqual;
	}

	public List<Integer> getIntPage2s() {
		return intPage2s;
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

	public String getName() {
		return name;
	}

	public String getNameLike() {
		if (nameLike != null && nameLike.trim().length() > 0) {
			if (!nameLike.startsWith("%")) {
				nameLike = "%" + nameLike;
			}
			if (!nameLike.endsWith("%")) {
				nameLike = nameLike + "%";
			}
		}
		return nameLike;
	}

	public List<String> getNames() {
		return names;
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

	public ProjectCellAndFileQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public ProjectCellAndFileQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery indexIds(List<Integer> indexIds) {
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
		addColumn("inttype", "inttype");
		addColumn("name", "name");
		addColumn("defId", "defId");
		addColumn("useId", "useId");
		addColumn("intPage0", "intPage0");
		addColumn("intPage1", "intPage1");
		addColumn("intPage2", "intPage2");
		addColumn("intfinish", "intfinish");
	}

	public ProjectCellAndFileQuery intfinish(Integer intfinish) {
		if (intfinish == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinish = intfinish;
		return this;
	}

	public ProjectCellAndFileQuery intfinishGreaterThanOrEqual(
			Integer intfinishGreaterThanOrEqual) {
		if (intfinishGreaterThanOrEqual == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinishGreaterThanOrEqual = intfinishGreaterThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery intfinishLessThanOrEqual(
			Integer intfinishLessThanOrEqual) {
		if (intfinishLessThanOrEqual == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinishLessThanOrEqual = intfinishLessThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery intfinishs(List<Integer> intfinishs) {
		if (intfinishs == null) {
			throw new RuntimeException("intfinishs is empty ");
		}
		this.intfinishs = intfinishs;
		return this;
	}

	public ProjectCellAndFileQuery intPage0(Integer intPage0) {
		if (intPage0 == null) {
			throw new RuntimeException("intPage0 is null");
		}
		this.intPage0 = intPage0;
		return this;
	}

	public ProjectCellAndFileQuery intPage0GreaterThanOrEqual(
			Integer intPage0GreaterThanOrEqual) {
		if (intPage0GreaterThanOrEqual == null) {
			throw new RuntimeException("intPage0 is null");
		}
		this.intPage0GreaterThanOrEqual = intPage0GreaterThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery intPage0LessThanOrEqual(
			Integer intPage0LessThanOrEqual) {
		if (intPage0LessThanOrEqual == null) {
			throw new RuntimeException("intPage0 is null");
		}
		this.intPage0LessThanOrEqual = intPage0LessThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery intPage0s(List<Integer> intPage0s) {
		if (intPage0s == null) {
			throw new RuntimeException("intPage0s is empty ");
		}
		this.intPage0s = intPage0s;
		return this;
	}

	public ProjectCellAndFileQuery intPage1(Integer intPage1) {
		if (intPage1 == null) {
			throw new RuntimeException("intPage1 is null");
		}
		this.intPage1 = intPage1;
		return this;
	}

	public ProjectCellAndFileQuery intPage1GreaterThanOrEqual(
			Integer intPage1GreaterThanOrEqual) {
		if (intPage1GreaterThanOrEqual == null) {
			throw new RuntimeException("intPage1 is null");
		}
		this.intPage1GreaterThanOrEqual = intPage1GreaterThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery intPage1LessThanOrEqual(
			Integer intPage1LessThanOrEqual) {
		if (intPage1LessThanOrEqual == null) {
			throw new RuntimeException("intPage1 is null");
		}
		this.intPage1LessThanOrEqual = intPage1LessThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery intPage1s(List<Integer> intPage1s) {
		if (intPage1s == null) {
			throw new RuntimeException("intPage1s is empty ");
		}
		this.intPage1s = intPage1s;
		return this;
	}

	public ProjectCellAndFileQuery intPage2(Integer intPage2) {
		if (intPage2 == null) {
			throw new RuntimeException("intPage2 is null");
		}
		this.intPage2 = intPage2;
		return this;
	}

	public ProjectCellAndFileQuery intPage2GreaterThanOrEqual(
			Integer intPage2GreaterThanOrEqual) {
		if (intPage2GreaterThanOrEqual == null) {
			throw new RuntimeException("intPage2 is null");
		}
		this.intPage2GreaterThanOrEqual = intPage2GreaterThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery intPage2LessThanOrEqual(
			Integer intPage2LessThanOrEqual) {
		if (intPage2LessThanOrEqual == null) {
			throw new RuntimeException("intPage2 is null");
		}
		this.intPage2LessThanOrEqual = intPage2LessThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery intPage2s(List<Integer> intPage2s) {
		if (intPage2s == null) {
			throw new RuntimeException("intPage2s is empty ");
		}
		this.intPage2s = intPage2s;
		return this;
	}

	public ProjectCellAndFileQuery inttype(Integer inttype) {
		if (inttype == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttype = inttype;
		return this;
	}

	public ProjectCellAndFileQuery inttypeGreaterThanOrEqual(
			Integer inttypeGreaterThanOrEqual) {
		if (inttypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery inttypeLessThanOrEqual(
			Integer inttypeLessThanOrEqual) {
		if (inttypeLessThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
		return this;
	}

	public ProjectCellAndFileQuery inttypes(List<Integer> inttypes) {
		if (inttypes == null) {
			throw new RuntimeException("inttypes is empty ");
		}
		this.inttypes = inttypes;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public ProjectCellAndFileQuery name(String name) {
		if (name == null) {
			throw new RuntimeException("name is null");
		}
		this.name = name;
		return this;
	}

	public ProjectCellAndFileQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public ProjectCellAndFileQuery names(List<String> names) {
		if (names == null) {
			throw new RuntimeException("names is empty ");
		}
		this.names = names;
		return this;
	}

	public void setDefId(String defId) {
		this.defId = defId;
	}

	public void setDefIdLike(String defIdLike) {
		this.defIdLike = defIdLike;
	}

	public void setDefIds(List<String> defIds) {
		this.defIds = defIds;
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

	public void setIntfinish(Integer intfinish) {
		this.intfinish = intfinish;
	}

	public void setIntfinishGreaterThanOrEqual(
			Integer intfinishGreaterThanOrEqual) {
		this.intfinishGreaterThanOrEqual = intfinishGreaterThanOrEqual;
	}

	public void setIntfinishLessThanOrEqual(Integer intfinishLessThanOrEqual) {
		this.intfinishLessThanOrEqual = intfinishLessThanOrEqual;
	}

	public void setIntfinishs(List<Integer> intfinishs) {
		this.intfinishs = intfinishs;
	}

	public void setIntPage0(Integer intPage0) {
		this.intPage0 = intPage0;
	}

	public void setIntPage0GreaterThanOrEqual(Integer intPage0GreaterThanOrEqual) {
		this.intPage0GreaterThanOrEqual = intPage0GreaterThanOrEqual;
	}

	public void setIntPage0LessThanOrEqual(Integer intPage0LessThanOrEqual) {
		this.intPage0LessThanOrEqual = intPage0LessThanOrEqual;
	}

	public void setIntPage0s(List<Integer> intPage0s) {
		this.intPage0s = intPage0s;
	}

	public void setIntPage1(Integer intPage1) {
		this.intPage1 = intPage1;
	}

	public void setIntPage1GreaterThanOrEqual(Integer intPage1GreaterThanOrEqual) {
		this.intPage1GreaterThanOrEqual = intPage1GreaterThanOrEqual;
	}

	public void setIntPage1LessThanOrEqual(Integer intPage1LessThanOrEqual) {
		this.intPage1LessThanOrEqual = intPage1LessThanOrEqual;
	}

	public void setIntPage1s(List<Integer> intPage1s) {
		this.intPage1s = intPage1s;
	}

	public void setIntPage2(Integer intPage2) {
		this.intPage2 = intPage2;
	}

	public void setIntPage2GreaterThanOrEqual(Integer intPage2GreaterThanOrEqual) {
		this.intPage2GreaterThanOrEqual = intPage2GreaterThanOrEqual;
	}

	public void setIntPage2LessThanOrEqual(Integer intPage2LessThanOrEqual) {
		this.intPage2LessThanOrEqual = intPage2LessThanOrEqual;
	}

	public void setIntPage2s(List<Integer> intPage2s) {
		this.intPage2s = intPage2s;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
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

	public ProjectCellAndFileQuery useId(String useId) {
		if (useId == null) {
			throw new RuntimeException("useId is null");
		}
		this.useId = useId;
		return this;
	}

	public ProjectCellAndFileQuery useIdLike(String useIdLike) {
		if (useIdLike == null) {
			throw new RuntimeException("useId is null");
		}
		this.useIdLike = useIdLike;
		return this;
	}

	public ProjectCellAndFileQuery useIds(List<String> useIds) {
		if (useIds == null) {
			throw new RuntimeException("useIds is empty ");
		}
		this.useIds = useIds;
		return this;
	}

}