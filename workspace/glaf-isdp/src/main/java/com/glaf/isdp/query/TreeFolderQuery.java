package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreeFolderQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected String indexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String contentLike;
	protected Integer inttype;
	protected Integer inttypeGreaterThanOrEqual;
	protected Integer inttypeLessThanOrEqual;
	protected List<Integer> inttypes;
	protected String sindexNameLike;
	protected String numLike;
	protected String filenum;
	protected String filenumLike;
	protected List<String> filenums;
	protected String ftype;
	protected String ftypeLike;
	protected List<String> ftypes;
	protected Integer ztype;
	protected Integer ztypeGreaterThanOrEqual;
	protected Integer ztypeLessThanOrEqual;
	protected List<Integer> ztypes;
	protected String slevel;
	protected String slevelLike;
	protected List<String> slevels;
	protected String savetime;
	protected String savetimeLike;
	protected List<String> savetimes;
	protected Integer domainIndex;
	protected Integer domainIndexGreaterThanOrEqual;
	protected Integer domainIndexLessThanOrEqual;
	protected List<Integer> domainIndexs;
	protected Integer menuindex;
	protected Integer menuindexGreaterThanOrEqual;
	protected Integer menuindexLessThanOrEqual;
	protected List<Integer> menuindexs;
	

	public TreeFolderQuery() {

	}

	public TreeFolderQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public TreeFolderQuery domainIndex(Integer domainIndex) {
		if (domainIndex == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndex = domainIndex;
		return this;
	}

	public TreeFolderQuery domainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		if (domainIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
		return this;
	}

	public TreeFolderQuery domainIndexLessThanOrEqual(
			Integer domainIndexLessThanOrEqual) {
		if (domainIndexLessThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
		return this;
	}

	public TreeFolderQuery domainIndexs(List<Integer> domainIndexs) {
		if (domainIndexs == null) {
			throw new RuntimeException("domainIndexs is empty ");
		}
		this.domainIndexs = domainIndexs;
		return this;
	}

	public TreeFolderQuery filenum(String filenum) {
		if (filenum == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenum = filenum;
		return this;
	}

	public TreeFolderQuery filenumLike(String filenumLike) {
		if (filenumLike == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumLike = filenumLike;
		return this;
	}

	public TreeFolderQuery filenums(List<String> filenums) {
		if (filenums == null) {
			throw new RuntimeException("filenums is empty ");
		}
		this.filenums = filenums;
		return this;
	}

	public TreeFolderQuery ftype(String ftype) {
		if (ftype == null) {
			throw new RuntimeException("ftype is null");
		}
		this.ftype = ftype;
		return this;
	}

	public TreeFolderQuery ftypeLike(String ftypeLike) {
		if (ftypeLike == null) {
			throw new RuntimeException("ftype is null");
		}
		this.ftypeLike = ftypeLike;
		return this;
	}

	public TreeFolderQuery ftypes(List<String> ftypes) {
		if (ftypes == null) {
			throw new RuntimeException("ftypes is empty ");
		}
		this.ftypes = ftypes;
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

	public String getFilenum() {
		return filenum;
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

	public List<String> getFilenums() {
		return filenums;
	}

	public String getFtype() {
		return ftype;
	}

	public String getFtypeLike() {
		if (ftypeLike != null && ftypeLike.trim().length() > 0) {
			if (!ftypeLike.startsWith("%")) {
				ftypeLike = "%" + ftypeLike;
			}
			if (!ftypeLike.endsWith("%")) {
				ftypeLike = ftypeLike + "%";
			}
		}
		return ftypeLike;
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

	public Integer getMenuindex() {
		return menuindex;
	}

	public Integer getMenuindexGreaterThanOrEqual() {
		return menuindexGreaterThanOrEqual;
	}

	public Integer getMenuindexLessThanOrEqual() {
		return menuindexLessThanOrEqual;
	}

	public List<Integer> getMenuindexs() {
		return menuindexs;
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

	public List<String> getSavetimes() {
		return savetimes;
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

	public List<String> getSlevels() {
		return slevels;
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

	public TreeFolderQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public TreeFolderQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public TreeFolderQuery indexNameLike(String indexNameLike) {
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
		addColumn("id", "id");
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("content", "content");
		addColumn("nodeico", "nodeico");
		addColumn("listno", "listno");
		addColumn("inttype", "inttype");
		addColumn("sindexName", "sindex_name");
		addColumn("num", "num");
		addColumn("filenum", "filenum");
		addColumn("ftype", "ftype");
		addColumn("ztype", "ztype");
		addColumn("slevel", "slevel");
		addColumn("savetime", "savetime");
		addColumn("domainIndex", "domain_index");
		addColumn("menuindex", "menuindex");
	}

	public TreeFolderQuery inttype(Integer inttype) {
		if (inttype == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttype = inttype;
		return this;
	}

	public TreeFolderQuery inttypeGreaterThanOrEqual(
			Integer inttypeGreaterThanOrEqual) {
		if (inttypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
		return this;
	}

	public TreeFolderQuery inttypeLessThanOrEqual(Integer inttypeLessThanOrEqual) {
		if (inttypeLessThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
		return this;
	}

	public TreeFolderQuery inttypes(List<Integer> inttypes) {
		if (inttypes == null) {
			throw new RuntimeException("inttypes is empty ");
		}
		this.inttypes = inttypes;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreeFolderQuery menuindex(Integer menuindex) {
		if (menuindex == null) {
			throw new RuntimeException("menuindex is null");
		}
		this.menuindex = menuindex;
		return this;
	}

	public TreeFolderQuery menuindexGreaterThanOrEqual(
			Integer menuindexGreaterThanOrEqual) {
		if (menuindexGreaterThanOrEqual == null) {
			throw new RuntimeException("menuindex is null");
		}
		this.menuindexGreaterThanOrEqual = menuindexGreaterThanOrEqual;
		return this;
	}

	public TreeFolderQuery menuindexLessThanOrEqual(
			Integer menuindexLessThanOrEqual) {
		if (menuindexLessThanOrEqual == null) {
			throw new RuntimeException("menuindex is null");
		}
		this.menuindexLessThanOrEqual = menuindexLessThanOrEqual;
		return this;
	}

	public TreeFolderQuery menuindexs(List<Integer> menuindexs) {
		if (menuindexs == null) {
			throw new RuntimeException("menuindexs is empty ");
		}
		this.menuindexs = menuindexs;
		return this;
	}

	public TreeFolderQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreeFolderQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreeFolderQuery nlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreeFolderQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreeFolderQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreeFolderQuery savetime(String savetime) {
		if (savetime == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetime = savetime;
		return this;
	}

	public TreeFolderQuery savetimeLike(String savetimeLike) {
		if (savetimeLike == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetimeLike = savetimeLike;
		return this;
	}

	public TreeFolderQuery savetimes(List<String> savetimes) {
		if (savetimes == null) {
			throw new RuntimeException("savetimes is empty ");
		}
		this.savetimes = savetimes;
		return this;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
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

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public void setFilenumLike(String filenumLike) {
		this.filenumLike = filenumLike;
	}

	public void setFilenums(List<String> filenums) {
		this.filenums = filenums;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public void setFtypeLike(String ftypeLike) {
		this.ftypeLike = ftypeLike;
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

	public void setMenuindex(Integer menuindex) {
		this.menuindex = menuindex;
	}

	public void setMenuindexGreaterThanOrEqual(
			Integer menuindexGreaterThanOrEqual) {
		this.menuindexGreaterThanOrEqual = menuindexGreaterThanOrEqual;
	}

	public void setMenuindexLessThanOrEqual(Integer menuindexLessThanOrEqual) {
		this.menuindexLessThanOrEqual = menuindexLessThanOrEqual;
	}

	public void setMenuindexs(List<Integer> menuindexs) {
		this.menuindexs = menuindexs;
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

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setSavetimeLike(String savetimeLike) {
		this.savetimeLike = savetimeLike;
	}

	public void setSavetimes(List<String> savetimes) {
		this.savetimes = savetimes;
	}

	public void setSindexNameLike(String sindexNameLike) {
		this.sindexNameLike = sindexNameLike;
	}

	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}

	public void setSlevelLike(String slevelLike) {
		this.slevelLike = slevelLike;
	}

	public void setSlevels(List<String> slevels) {
		this.slevels = slevels;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
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

	public TreeFolderQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public TreeFolderQuery slevel(String slevel) {
		if (slevel == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevel = slevel;
		return this;
	}

	public TreeFolderQuery slevelLike(String slevelLike) {
		if (slevelLike == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevelLike = slevelLike;
		return this;
	}

	public TreeFolderQuery slevels(List<String> slevels) {
		if (slevels == null) {
			throw new RuntimeException("slevels is empty ");
		}
		this.slevels = slevels;
		return this;
	}

	public TreeFolderQuery ztype(Integer ztype) {
		if (ztype == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztype = ztype;
		return this;
	}

	public TreeFolderQuery ztypeGreaterThanOrEqual(
			Integer ztypeGreaterThanOrEqual) {
		if (ztypeGreaterThanOrEqual == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeGreaterThanOrEqual = ztypeGreaterThanOrEqual;
		return this;
	}

	public TreeFolderQuery ztypeLessThanOrEqual(Integer ztypeLessThanOrEqual) {
		if (ztypeLessThanOrEqual == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeLessThanOrEqual = ztypeLessThanOrEqual;
		return this;
	}

	public TreeFolderQuery ztypes(List<Integer> ztypes) {
		if (ztypes == null) {
			throw new RuntimeException("ztypes is empty ");
		}
		this.ztypes = ztypes;
		return this;
	}

}