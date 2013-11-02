package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellTreedotQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected String indexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String numLike;
	protected String contentLike;
	protected String sindexNameLike;
	protected Integer viewtype;
	protected Integer viewtypeGreaterThanOrEqual;
	protected Integer viewtypeLessThanOrEqual;
	protected List<Integer> viewtypes;
	protected String ismode;
	protected String ismodeLike;
	protected List<String> ismodes;
	protected String modetableId;
	protected String modetableIdLike;
	protected List<String> modetableIds;
	protected Integer issystem;
	protected Integer issystemGreaterThanOrEqual;
	protected Integer issystemLessThanOrEqual;
	protected List<Integer> issystems;
	protected Integer intsystemselect;
	protected Integer intsystemselectGreaterThanOrEqual;
	protected Integer intsystemselectLessThanOrEqual;
	protected List<Integer> intsystemselects;
	protected Integer intused;
	protected Integer intusedGreaterThanOrEqual;
	protected Integer intusedLessThanOrEqual;
	protected List<Integer> intuseds;
	protected Integer intdel;
	protected Integer intdelGreaterThanOrEqual;
	protected Integer intdelLessThanOrEqual;
	protected List<Integer> intdels;
	protected String typeTablename;
	protected String typeTablenameLike;
	protected List<String> typeTablenames;
	protected Integer intoperation;
	protected Integer intoperationGreaterThanOrEqual;
	protected Integer intoperationLessThanOrEqual;
	protected List<Integer> intoperations;
	protected Integer intMuiFrm;
	protected Integer intMuiFrmGreaterThanOrEqual;
	protected Integer intMuiFrmLessThanOrEqual;
	protected List<Integer> intMuiFrms;
	protected Integer intnoshow;
	protected Integer intnoshowGreaterThanOrEqual;
	protected Integer intnoshowLessThanOrEqual;
	protected List<Integer> intnoshows;
	protected String typeBasetable;
	protected String typeBasetableLike;
	protected List<String> typeBasetables;
	protected Integer typeIndex;
	protected Integer typeIndexGreaterThanOrEqual;
	protected Integer typeIndexLessThanOrEqual;
	protected List<Integer> typeIndexs;
	protected String gid;
	protected String gidLike;
	protected List<String> gids;
	

	public CellTreedotQuery() {

	}

	public CellTreedotQuery contentLike(String contentLike) {
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

	public String getGid() {
		return gid;
	}

	public String getGidLike() {
		if (gidLike != null && gidLike.trim().length() > 0) {
			if (!gidLike.startsWith("%")) {
				gidLike = "%" + gidLike;
			}
			if (!gidLike.endsWith("%")) {
				gidLike = gidLike + "%";
			}
		}
		return gidLike;
	}

	public List<String> getGids() {
		return gids;
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

	public Integer getIntdelGreaterThanOrEqual() {
		return intdelGreaterThanOrEqual;
	}

	public Integer getIntdelLessThanOrEqual() {
		return intdelLessThanOrEqual;
	}

	public List<Integer> getIntdels() {
		return intdels;
	}

	public Integer getIntMuiFrm() {
		return intMuiFrm;
	}

	public Integer getIntMuiFrmGreaterThanOrEqual() {
		return intMuiFrmGreaterThanOrEqual;
	}

	public Integer getIntMuiFrmLessThanOrEqual() {
		return intMuiFrmLessThanOrEqual;
	}

	public List<Integer> getIntMuiFrms() {
		return intMuiFrms;
	}

	public Integer getIntnoshow() {
		return intnoshow;
	}

	public Integer getIntnoshowGreaterThanOrEqual() {
		return intnoshowGreaterThanOrEqual;
	}

	public Integer getIntnoshowLessThanOrEqual() {
		return intnoshowLessThanOrEqual;
	}

	public List<Integer> getIntnoshows() {
		return intnoshows;
	}

	public Integer getIntoperation() {
		return intoperation;
	}

	public Integer getIntoperationGreaterThanOrEqual() {
		return intoperationGreaterThanOrEqual;
	}

	public Integer getIntoperationLessThanOrEqual() {
		return intoperationLessThanOrEqual;
	}

	public List<Integer> getIntoperations() {
		return intoperations;
	}

	public Integer getIntsystemselect() {
		return intsystemselect;
	}

	public Integer getIntsystemselectGreaterThanOrEqual() {
		return intsystemselectGreaterThanOrEqual;
	}

	public Integer getIntsystemselectLessThanOrEqual() {
		return intsystemselectLessThanOrEqual;
	}

	public List<Integer> getIntsystemselects() {
		return intsystemselects;
	}

	public Integer getIntused() {
		return intused;
	}

	public Integer getIntusedGreaterThanOrEqual() {
		return intusedGreaterThanOrEqual;
	}

	public Integer getIntusedLessThanOrEqual() {
		return intusedLessThanOrEqual;
	}

	public List<Integer> getIntuseds() {
		return intuseds;
	}

	public String getIsmode() {
		return ismode;
	}

	public String getIsmodeLike() {
		if (ismodeLike != null && ismodeLike.trim().length() > 0) {
			if (!ismodeLike.startsWith("%")) {
				ismodeLike = "%" + ismodeLike;
			}
			if (!ismodeLike.endsWith("%")) {
				ismodeLike = ismodeLike + "%";
			}
		}
		return ismodeLike;
	}

	public List<String> getIsmodes() {
		return ismodes;
	}

	public Integer getIssystem() {
		return issystem;
	}

	public Integer getIssystemGreaterThanOrEqual() {
		return issystemGreaterThanOrEqual;
	}

	public Integer getIssystemLessThanOrEqual() {
		return issystemLessThanOrEqual;
	}

	public List<Integer> getIssystems() {
		return issystems;
	}

	public String getModetableId() {
		return modetableId;
	}

	public String getModetableIdLike() {
		if (modetableIdLike != null && modetableIdLike.trim().length() > 0) {
			if (!modetableIdLike.startsWith("%")) {
				modetableIdLike = "%" + modetableIdLike;
			}
			if (!modetableIdLike.endsWith("%")) {
				modetableIdLike = modetableIdLike + "%";
			}
		}
		return modetableIdLike;
	}

	public List<String> getModetableIds() {
		return modetableIds;
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

	public String getTypeBasetable() {
		return typeBasetable;
	}

	public String getTypeBasetableLike() {
		if (typeBasetableLike != null && typeBasetableLike.trim().length() > 0) {
			if (!typeBasetableLike.startsWith("%")) {
				typeBasetableLike = "%" + typeBasetableLike;
			}
			if (!typeBasetableLike.endsWith("%")) {
				typeBasetableLike = typeBasetableLike + "%";
			}
		}
		return typeBasetableLike;
	}

	public List<String> getTypeBasetables() {
		return typeBasetables;
	}

	public Integer getTypeIndex() {
		return typeIndex;
	}

	public Integer getTypeIndexGreaterThanOrEqual() {
		return typeIndexGreaterThanOrEqual;
	}

	public Integer getTypeIndexLessThanOrEqual() {
		return typeIndexLessThanOrEqual;
	}

	public List<Integer> getTypeIndexs() {
		return typeIndexs;
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

	public Integer getViewtype() {
		return viewtype;
	}

	public Integer getViewtypeGreaterThanOrEqual() {
		return viewtypeGreaterThanOrEqual;
	}

	public Integer getViewtypeLessThanOrEqual() {
		return viewtypeLessThanOrEqual;
	}

	public List<Integer> getViewtypes() {
		return viewtypes;
	}

	public CellTreedotQuery gid(String gid) {
		if (gid == null) {
			throw new RuntimeException("gid is null");
		}
		this.gid = gid;
		return this;
	}

	public CellTreedotQuery gidLike(String gidLike) {
		if (gidLike == null) {
			throw new RuntimeException("gid is null");
		}
		this.gidLike = gidLike;
		return this;
	}

	public CellTreedotQuery gids(List<String> gids) {
		if (gids == null) {
			throw new RuntimeException("gids is empty ");
		}
		this.gids = gids;
		return this;
	}

	public CellTreedotQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public CellTreedotQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public CellTreedotQuery indexNameLike(String indexNameLike) {
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
		addColumn("nodeico", "nodeico");
		addColumn("sindexName", "sindex_name");
		addColumn("listno", "listno");
		addColumn("viewtype", "viewtype");
		addColumn("ismode", "ismode");
		addColumn("modetableId", "modetable_id");
		addColumn("issystem", "issystem");
		addColumn("customData", "customData");
		addColumn("intsystemselect", "intsystemselect");
		addColumn("intused", "intused");
		addColumn("intdel", "intdel");
		addColumn("typeTablename", "type_tablename");
		addColumn("intoperation", "intoperation");
		addColumn("picfile", "picfile");
		addColumn("intMuiFrm", "intMuiFrm");
		addColumn("intnoshow", "intnoshow");
		addColumn("typeBasetable", "type_basetable");
		addColumn("typeIndex", "type_index");
		addColumn("gid", "gid");
	}

	public CellTreedotQuery intdel(Integer intdel) {
		if (intdel == null) {
			throw new RuntimeException("intdel is null");
		}
		this.intdel = intdel;
		return this;
	}

	public CellTreedotQuery intdelGreaterThanOrEqual(
			Integer intdelGreaterThanOrEqual) {
		if (intdelGreaterThanOrEqual == null) {
			throw new RuntimeException("intdel is null");
		}
		this.intdelGreaterThanOrEqual = intdelGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery intdelLessThanOrEqual(Integer intdelLessThanOrEqual) {
		if (intdelLessThanOrEqual == null) {
			throw new RuntimeException("intdel is null");
		}
		this.intdelLessThanOrEqual = intdelLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery intdels(List<Integer> intdels) {
		if (intdels == null) {
			throw new RuntimeException("intdels is empty ");
		}
		this.intdels = intdels;
		return this;
	}

	public CellTreedotQuery intMuiFrm(Integer intMuiFrm) {
		if (intMuiFrm == null) {
			throw new RuntimeException("intMuiFrm is null");
		}
		this.intMuiFrm = intMuiFrm;
		return this;
	}

	public CellTreedotQuery intMuiFrmGreaterThanOrEqual(
			Integer intMuiFrmGreaterThanOrEqual) {
		if (intMuiFrmGreaterThanOrEqual == null) {
			throw new RuntimeException("intMuiFrm is null");
		}
		this.intMuiFrmGreaterThanOrEqual = intMuiFrmGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery intMuiFrmLessThanOrEqual(
			Integer intMuiFrmLessThanOrEqual) {
		if (intMuiFrmLessThanOrEqual == null) {
			throw new RuntimeException("intMuiFrm is null");
		}
		this.intMuiFrmLessThanOrEqual = intMuiFrmLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery intMuiFrms(List<Integer> intMuiFrms) {
		if (intMuiFrms == null) {
			throw new RuntimeException("intMuiFrms is empty ");
		}
		this.intMuiFrms = intMuiFrms;
		return this;
	}

	public CellTreedotQuery intnoshow(Integer intnoshow) {
		if (intnoshow == null) {
			throw new RuntimeException("intnoshow is null");
		}
		this.intnoshow = intnoshow;
		return this;
	}

	public CellTreedotQuery intnoshowGreaterThanOrEqual(
			Integer intnoshowGreaterThanOrEqual) {
		if (intnoshowGreaterThanOrEqual == null) {
			throw new RuntimeException("intnoshow is null");
		}
		this.intnoshowGreaterThanOrEqual = intnoshowGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery intnoshowLessThanOrEqual(
			Integer intnoshowLessThanOrEqual) {
		if (intnoshowLessThanOrEqual == null) {
			throw new RuntimeException("intnoshow is null");
		}
		this.intnoshowLessThanOrEqual = intnoshowLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery intnoshows(List<Integer> intnoshows) {
		if (intnoshows == null) {
			throw new RuntimeException("intnoshows is empty ");
		}
		this.intnoshows = intnoshows;
		return this;
	}

	public CellTreedotQuery intoperation(Integer intoperation) {
		if (intoperation == null) {
			throw new RuntimeException("intoperation is null");
		}
		this.intoperation = intoperation;
		return this;
	}

	public CellTreedotQuery intoperationGreaterThanOrEqual(
			Integer intoperationGreaterThanOrEqual) {
		if (intoperationGreaterThanOrEqual == null) {
			throw new RuntimeException("intoperation is null");
		}
		this.intoperationGreaterThanOrEqual = intoperationGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery intoperationLessThanOrEqual(
			Integer intoperationLessThanOrEqual) {
		if (intoperationLessThanOrEqual == null) {
			throw new RuntimeException("intoperation is null");
		}
		this.intoperationLessThanOrEqual = intoperationLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery intoperations(List<Integer> intoperations) {
		if (intoperations == null) {
			throw new RuntimeException("intoperations is empty ");
		}
		this.intoperations = intoperations;
		return this;
	}

	public CellTreedotQuery intsystemselect(Integer intsystemselect) {
		if (intsystemselect == null) {
			throw new RuntimeException("intsystemselect is null");
		}
		this.intsystemselect = intsystemselect;
		return this;
	}

	public CellTreedotQuery intsystemselectGreaterThanOrEqual(
			Integer intsystemselectGreaterThanOrEqual) {
		if (intsystemselectGreaterThanOrEqual == null) {
			throw new RuntimeException("intsystemselect is null");
		}
		this.intsystemselectGreaterThanOrEqual = intsystemselectGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery intsystemselectLessThanOrEqual(
			Integer intsystemselectLessThanOrEqual) {
		if (intsystemselectLessThanOrEqual == null) {
			throw new RuntimeException("intsystemselect is null");
		}
		this.intsystemselectLessThanOrEqual = intsystemselectLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery intsystemselects(List<Integer> intsystemselects) {
		if (intsystemselects == null) {
			throw new RuntimeException("intsystemselects is empty ");
		}
		this.intsystemselects = intsystemselects;
		return this;
	}

	public CellTreedotQuery intused(Integer intused) {
		if (intused == null) {
			throw new RuntimeException("intused is null");
		}
		this.intused = intused;
		return this;
	}

	public CellTreedotQuery intusedGreaterThanOrEqual(
			Integer intusedGreaterThanOrEqual) {
		if (intusedGreaterThanOrEqual == null) {
			throw new RuntimeException("intused is null");
		}
		this.intusedGreaterThanOrEqual = intusedGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery intusedLessThanOrEqual(
			Integer intusedLessThanOrEqual) {
		if (intusedLessThanOrEqual == null) {
			throw new RuntimeException("intused is null");
		}
		this.intusedLessThanOrEqual = intusedLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery intuseds(List<Integer> intuseds) {
		if (intuseds == null) {
			throw new RuntimeException("intuseds is empty ");
		}
		this.intuseds = intuseds;
		return this;
	}

	public CellTreedotQuery ismode(String ismode) {
		if (ismode == null) {
			throw new RuntimeException("ismode is null");
		}
		this.ismode = ismode;
		return this;
	}

	public CellTreedotQuery ismodeLike(String ismodeLike) {
		if (ismodeLike == null) {
			throw new RuntimeException("ismode is null");
		}
		this.ismodeLike = ismodeLike;
		return this;
	}

	public CellTreedotQuery ismodes(List<String> ismodes) {
		if (ismodes == null) {
			throw new RuntimeException("ismodes is empty ");
		}
		this.ismodes = ismodes;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellTreedotQuery issystem(Integer issystem) {
		if (issystem == null) {
			throw new RuntimeException("issystem is null");
		}
		this.issystem = issystem;
		return this;
	}

	public CellTreedotQuery issystemGreaterThanOrEqual(
			Integer issystemGreaterThanOrEqual) {
		if (issystemGreaterThanOrEqual == null) {
			throw new RuntimeException("issystem is null");
		}
		this.issystemGreaterThanOrEqual = issystemGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery issystemLessThanOrEqual(
			Integer issystemLessThanOrEqual) {
		if (issystemLessThanOrEqual == null) {
			throw new RuntimeException("issystem is null");
		}
		this.issystemLessThanOrEqual = issystemLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery issystems(List<Integer> issystems) {
		if (issystems == null) {
			throw new RuntimeException("issystems is empty ");
		}
		this.issystems = issystems;
		return this;
	}

	public CellTreedotQuery modetableId(String modetableId) {
		if (modetableId == null) {
			throw new RuntimeException("modetableId is null");
		}
		this.modetableId = modetableId;
		return this;
	}

	public CellTreedotQuery modetableIdLike(String modetableIdLike) {
		if (modetableIdLike == null) {
			throw new RuntimeException("modetableId is null");
		}
		this.modetableIdLike = modetableIdLike;
		return this;
	}

	public CellTreedotQuery modetableIds(List<String> modetableIds) {
		if (modetableIds == null) {
			throw new RuntimeException("modetableIds is empty ");
		}
		this.modetableIds = modetableIds;
		return this;
	}

	public CellTreedotQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public CellTreedotQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery nlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public CellTreedotQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public void setGidLike(String gidLike) {
		this.gidLike = gidLike;
	}

	public void setGids(List<String> gids) {
		this.gids = gids;
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

	public void setIntdelGreaterThanOrEqual(Integer intdelGreaterThanOrEqual) {
		this.intdelGreaterThanOrEqual = intdelGreaterThanOrEqual;
	}

	public void setIntdelLessThanOrEqual(Integer intdelLessThanOrEqual) {
		this.intdelLessThanOrEqual = intdelLessThanOrEqual;
	}

	public void setIntdels(List<Integer> intdels) {
		this.intdels = intdels;
	}

	public void setIntMuiFrm(Integer intMuiFrm) {
		this.intMuiFrm = intMuiFrm;
	}

	public void setIntMuiFrmGreaterThanOrEqual(
			Integer intMuiFrmGreaterThanOrEqual) {
		this.intMuiFrmGreaterThanOrEqual = intMuiFrmGreaterThanOrEqual;
	}

	public void setIntMuiFrmLessThanOrEqual(Integer intMuiFrmLessThanOrEqual) {
		this.intMuiFrmLessThanOrEqual = intMuiFrmLessThanOrEqual;
	}

	public void setIntMuiFrms(List<Integer> intMuiFrms) {
		this.intMuiFrms = intMuiFrms;
	}

	public void setIntnoshow(Integer intnoshow) {
		this.intnoshow = intnoshow;
	}

	public void setIntnoshowGreaterThanOrEqual(
			Integer intnoshowGreaterThanOrEqual) {
		this.intnoshowGreaterThanOrEqual = intnoshowGreaterThanOrEqual;
	}

	public void setIntnoshowLessThanOrEqual(Integer intnoshowLessThanOrEqual) {
		this.intnoshowLessThanOrEqual = intnoshowLessThanOrEqual;
	}

	public void setIntnoshows(List<Integer> intnoshows) {
		this.intnoshows = intnoshows;
	}

	public void setIntoperation(Integer intoperation) {
		this.intoperation = intoperation;
	}

	public void setIntoperationGreaterThanOrEqual(
			Integer intoperationGreaterThanOrEqual) {
		this.intoperationGreaterThanOrEqual = intoperationGreaterThanOrEqual;
	}

	public void setIntoperationLessThanOrEqual(
			Integer intoperationLessThanOrEqual) {
		this.intoperationLessThanOrEqual = intoperationLessThanOrEqual;
	}

	public void setIntoperations(List<Integer> intoperations) {
		this.intoperations = intoperations;
	}

	public void setIntsystemselect(Integer intsystemselect) {
		this.intsystemselect = intsystemselect;
	}

	public void setIntsystemselectGreaterThanOrEqual(
			Integer intsystemselectGreaterThanOrEqual) {
		this.intsystemselectGreaterThanOrEqual = intsystemselectGreaterThanOrEqual;
	}

	public void setIntsystemselectLessThanOrEqual(
			Integer intsystemselectLessThanOrEqual) {
		this.intsystemselectLessThanOrEqual = intsystemselectLessThanOrEqual;
	}

	public void setIntsystemselects(List<Integer> intsystemselects) {
		this.intsystemselects = intsystemselects;
	}

	public void setIntused(Integer intused) {
		this.intused = intused;
	}

	public void setIntusedGreaterThanOrEqual(Integer intusedGreaterThanOrEqual) {
		this.intusedGreaterThanOrEqual = intusedGreaterThanOrEqual;
	}

	public void setIntusedLessThanOrEqual(Integer intusedLessThanOrEqual) {
		this.intusedLessThanOrEqual = intusedLessThanOrEqual;
	}

	public void setIntuseds(List<Integer> intuseds) {
		this.intuseds = intuseds;
	}

	public void setIsmode(String ismode) {
		this.ismode = ismode;
	}

	public void setIsmodeLike(String ismodeLike) {
		this.ismodeLike = ismodeLike;
	}

	public void setIsmodes(List<String> ismodes) {
		this.ismodes = ismodes;
	}

	public void setIssystem(Integer issystem) {
		this.issystem = issystem;
	}

	public void setIssystemGreaterThanOrEqual(Integer issystemGreaterThanOrEqual) {
		this.issystemGreaterThanOrEqual = issystemGreaterThanOrEqual;
	}

	public void setIssystemLessThanOrEqual(Integer issystemLessThanOrEqual) {
		this.issystemLessThanOrEqual = issystemLessThanOrEqual;
	}

	public void setIssystems(List<Integer> issystems) {
		this.issystems = issystems;
	}

	public void setModetableId(String modetableId) {
		this.modetableId = modetableId;
	}

	public void setModetableIdLike(String modetableIdLike) {
		this.modetableIdLike = modetableIdLike;
	}

	public void setModetableIds(List<String> modetableIds) {
		this.modetableIds = modetableIds;
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

	public void setSindexNameLike(String sindexNameLike) {
		this.sindexNameLike = sindexNameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTypeBasetable(String typeBasetable) {
		this.typeBasetable = typeBasetable;
	}

	public void setTypeBasetableLike(String typeBasetableLike) {
		this.typeBasetableLike = typeBasetableLike;
	}

	public void setTypeBasetables(List<String> typeBasetables) {
		this.typeBasetables = typeBasetables;
	}

	public void setTypeIndex(Integer typeIndex) {
		this.typeIndex = typeIndex;
	}

	public void setTypeIndexGreaterThanOrEqual(
			Integer typeIndexGreaterThanOrEqual) {
		this.typeIndexGreaterThanOrEqual = typeIndexGreaterThanOrEqual;
	}

	public void setTypeIndexLessThanOrEqual(Integer typeIndexLessThanOrEqual) {
		this.typeIndexLessThanOrEqual = typeIndexLessThanOrEqual;
	}

	public void setTypeIndexs(List<Integer> typeIndexs) {
		this.typeIndexs = typeIndexs;
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

	public void setViewtype(Integer viewtype) {
		this.viewtype = viewtype;
	}

	public void setViewtypeGreaterThanOrEqual(Integer viewtypeGreaterThanOrEqual) {
		this.viewtypeGreaterThanOrEqual = viewtypeGreaterThanOrEqual;
	}

	public void setViewtypeLessThanOrEqual(Integer viewtypeLessThanOrEqual) {
		this.viewtypeLessThanOrEqual = viewtypeLessThanOrEqual;
	}

	public void setViewtypes(List<Integer> viewtypes) {
		this.viewtypes = viewtypes;
	}

	public CellTreedotQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public CellTreedotQuery typeBasetable(String typeBasetable) {
		if (typeBasetable == null) {
			throw new RuntimeException("typeBasetable is null");
		}
		this.typeBasetable = typeBasetable;
		return this;
	}

	public CellTreedotQuery typeBasetableLike(String typeBasetableLike) {
		if (typeBasetableLike == null) {
			throw new RuntimeException("typeBasetable is null");
		}
		this.typeBasetableLike = typeBasetableLike;
		return this;
	}

	public CellTreedotQuery typeBasetables(List<String> typeBasetables) {
		if (typeBasetables == null) {
			throw new RuntimeException("typeBasetables is empty ");
		}
		this.typeBasetables = typeBasetables;
		return this;
	}

	public CellTreedotQuery typeIndex(Integer typeIndex) {
		if (typeIndex == null) {
			throw new RuntimeException("typeIndex is null");
		}
		this.typeIndex = typeIndex;
		return this;
	}

	public CellTreedotQuery typeIndexGreaterThanOrEqual(
			Integer typeIndexGreaterThanOrEqual) {
		if (typeIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("typeIndex is null");
		}
		this.typeIndexGreaterThanOrEqual = typeIndexGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery typeIndexLessThanOrEqual(
			Integer typeIndexLessThanOrEqual) {
		if (typeIndexLessThanOrEqual == null) {
			throw new RuntimeException("typeIndex is null");
		}
		this.typeIndexLessThanOrEqual = typeIndexLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery typeIndexs(List<Integer> typeIndexs) {
		if (typeIndexs == null) {
			throw new RuntimeException("typeIndexs is empty ");
		}
		this.typeIndexs = typeIndexs;
		return this;
	}

	public CellTreedotQuery typeTablename(String typeTablename) {
		if (typeTablename == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablename = typeTablename;
		return this;
	}

	public CellTreedotQuery typeTablenameLike(String typeTablenameLike) {
		if (typeTablenameLike == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablenameLike = typeTablenameLike;
		return this;
	}

	public CellTreedotQuery typeTablenames(List<String> typeTablenames) {
		if (typeTablenames == null) {
			throw new RuntimeException("typeTablenames is empty ");
		}
		this.typeTablenames = typeTablenames;
		return this;
	}

	public CellTreedotQuery viewtype(Integer viewtype) {
		if (viewtype == null) {
			throw new RuntimeException("viewtype is null");
		}
		this.viewtype = viewtype;
		return this;
	}

	public CellTreedotQuery viewtypeGreaterThanOrEqual(
			Integer viewtypeGreaterThanOrEqual) {
		if (viewtypeGreaterThanOrEqual == null) {
			throw new RuntimeException("viewtype is null");
		}
		this.viewtypeGreaterThanOrEqual = viewtypeGreaterThanOrEqual;
		return this;
	}

	public CellTreedotQuery viewtypeLessThanOrEqual(
			Integer viewtypeLessThanOrEqual) {
		if (viewtypeLessThanOrEqual == null) {
			throw new RuntimeException("viewtype is null");
		}
		this.viewtypeLessThanOrEqual = viewtypeLessThanOrEqual;
		return this;
	}

	public CellTreedotQuery viewtypes(List<Integer> viewtypes) {
		if (viewtypes == null) {
			throw new RuntimeException("viewtypes is empty ");
		}
		this.viewtypes = viewtypes;
		return this;
	}

}