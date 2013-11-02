package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreewbsQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected String numLike;
	protected String indexNameLike;
	protected String sindexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String contentLike;
	protected Integer inttype;
	protected Integer inttypeGreaterThanOrEqual;
	protected Integer inttypeLessThanOrEqual;
	protected List<Integer> inttypes;
	protected Integer pindexId;
	protected Integer pindexIdGreaterThanOrEqual;
	protected Integer pindexIdLessThanOrEqual;
	protected List<Integer> pindexIds;
	protected String typeTablename;
	protected String typeTablenameLike;
	protected List<String> typeTablenames;
	protected Integer intusetname;
	protected Integer intusetnameGreaterThanOrEqual;
	protected Integer intusetnameLessThanOrEqual;
	protected List<Integer> intusetnames;
	protected Integer intstartype;
	protected Integer intstartypeGreaterThanOrEqual;
	protected Integer intstartypeLessThanOrEqual;
	protected List<Integer> intstartypes;
	protected Integer intstardelayday;
	protected Integer intstardelaydayGreaterThanOrEqual;
	protected Integer intstardelaydayLessThanOrEqual;
	protected List<Integer> intstardelaydays;
	protected Integer intstartA;
	protected Integer intstartAGreaterThanOrEqual;
	protected Integer intstartALessThanOrEqual;
	protected List<Integer> intstartAs;
	protected Integer intstartP;
	protected Integer intstartPGreaterThanOrEqual;
	protected Integer intstartPLessThanOrEqual;
	protected List<Integer> intstartPs;
	protected Integer intendA;
	protected Integer intendAGreaterThanOrEqual;
	protected Integer intendALessThanOrEqual;
	protected List<Integer> intendAs;
	protected Integer intendP;
	protected Integer intendPGreaterThanOrEqual;
	protected Integer intendPLessThanOrEqual;
	protected List<Integer> intendPs;
	protected Integer intneednode;
	protected Integer intneednodeGreaterThanOrEqual;
	protected Integer intneednodeLessThanOrEqual;
	protected List<Integer> intneednodes;
	protected Integer intusetnum;
	protected Integer intusetnumGreaterThanOrEqual;
	protected Integer intusetnumLessThanOrEqual;
	protected List<Integer> intusetnums;
	protected Integer domainIndex;
	protected Integer domainIndexGreaterThanOrEqual;
	protected Integer domainIndexLessThanOrEqual;
	protected List<Integer> domainIndexs;
	protected String strfileLocate;
	protected String strfileLocateLike;
	protected List<String> strfileLocates;
	protected Integer intnodetype;
	protected Integer intnodetypeGreaterThanOrEqual;
	protected Integer intnodetypeLessThanOrEqual;
	protected List<Integer> intnodetypes;
	protected Integer intloadfile;
	protected Integer intloadfileGreaterThanOrEqual;
	protected Integer intloadfileLessThanOrEqual;
	protected List<Integer> intloadfiles;
	protected Integer intorglevel;
	protected Integer intorglevelGreaterThanOrEqual;
	protected Integer intorglevelLessThanOrEqual;
	protected List<Integer> intorglevels;
	protected Integer uindexId;
	protected Integer uindexIdGreaterThanOrEqual;
	protected Integer uindexIdLessThanOrEqual;
	protected List<Integer> uindexIds;
	

	public TreewbsQuery() {

	}

	public TreewbsQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public TreewbsQuery domainIndex(Integer domainIndex) {
		if (domainIndex == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndex = domainIndex;
		return this;
	}

	public TreewbsQuery domainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		if (domainIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery domainIndexLessThanOrEqual(
			Integer domainIndexLessThanOrEqual) {
		if (domainIndexLessThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
		return this;
	}

	public TreewbsQuery domainIndexs(List<Integer> domainIndexs) {
		if (domainIndexs == null) {
			throw new RuntimeException("domainIndexs is empty ");
		}
		this.domainIndexs = domainIndexs;
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

	public Integer getIntendA() {
		return intendA;
	}

	public Integer getIntendAGreaterThanOrEqual() {
		return intendAGreaterThanOrEqual;
	}

	public Integer getIntendALessThanOrEqual() {
		return intendALessThanOrEqual;
	}

	public List<Integer> getIntendAs() {
		return intendAs;
	}

	public Integer getIntendP() {
		return intendP;
	}

	public Integer getIntendPGreaterThanOrEqual() {
		return intendPGreaterThanOrEqual;
	}

	public Integer getIntendPLessThanOrEqual() {
		return intendPLessThanOrEqual;
	}

	public List<Integer> getIntendPs() {
		return intendPs;
	}

	public Integer getIntloadfile() {
		return intloadfile;
	}

	public Integer getIntloadfileGreaterThanOrEqual() {
		return intloadfileGreaterThanOrEqual;
	}

	public Integer getIntloadfileLessThanOrEqual() {
		return intloadfileLessThanOrEqual;
	}

	public List<Integer> getIntloadfiles() {
		return intloadfiles;
	}

	public Integer getIntneednode() {
		return intneednode;
	}

	public Integer getIntneednodeGreaterThanOrEqual() {
		return intneednodeGreaterThanOrEqual;
	}

	public Integer getIntneednodeLessThanOrEqual() {
		return intneednodeLessThanOrEqual;
	}

	public List<Integer> getIntneednodes() {
		return intneednodes;
	}

	public Integer getIntnodetype() {
		return intnodetype;
	}

	public Integer getIntnodetypeGreaterThanOrEqual() {
		return intnodetypeGreaterThanOrEqual;
	}

	public Integer getIntnodetypeLessThanOrEqual() {
		return intnodetypeLessThanOrEqual;
	}

	public List<Integer> getIntnodetypes() {
		return intnodetypes;
	}

	public Integer getIntorglevel() {
		return intorglevel;
	}

	public Integer getIntorglevelGreaterThanOrEqual() {
		return intorglevelGreaterThanOrEqual;
	}

	public Integer getIntorglevelLessThanOrEqual() {
		return intorglevelLessThanOrEqual;
	}

	public List<Integer> getIntorglevels() {
		return intorglevels;
	}

	public Integer getIntstardelayday() {
		return intstardelayday;
	}

	public Integer getIntstardelaydayGreaterThanOrEqual() {
		return intstardelaydayGreaterThanOrEqual;
	}

	public Integer getIntstardelaydayLessThanOrEqual() {
		return intstardelaydayLessThanOrEqual;
	}

	public List<Integer> getIntstardelaydays() {
		return intstardelaydays;
	}

	public Integer getIntstartA() {
		return intstartA;
	}

	public Integer getIntstartAGreaterThanOrEqual() {
		return intstartAGreaterThanOrEqual;
	}

	public Integer getIntstartALessThanOrEqual() {
		return intstartALessThanOrEqual;
	}

	public List<Integer> getIntstartAs() {
		return intstartAs;
	}

	public Integer getIntstartP() {
		return intstartP;
	}

	public Integer getIntstartPGreaterThanOrEqual() {
		return intstartPGreaterThanOrEqual;
	}

	public Integer getIntstartPLessThanOrEqual() {
		return intstartPLessThanOrEqual;
	}

	public List<Integer> getIntstartPs() {
		return intstartPs;
	}

	public Integer getIntstartype() {
		return intstartype;
	}

	public Integer getIntstartypeGreaterThanOrEqual() {
		return intstartypeGreaterThanOrEqual;
	}

	public Integer getIntstartypeLessThanOrEqual() {
		return intstartypeLessThanOrEqual;
	}

	public List<Integer> getIntstartypes() {
		return intstartypes;
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

	public Integer getIntusetname() {
		return intusetname;
	}

	public Integer getIntusetnameGreaterThanOrEqual() {
		return intusetnameGreaterThanOrEqual;
	}

	public Integer getIntusetnameLessThanOrEqual() {
		return intusetnameLessThanOrEqual;
	}

	public List<Integer> getIntusetnames() {
		return intusetnames;
	}

	public Integer getIntusetnum() {
		return intusetnum;
	}

	public Integer getIntusetnumGreaterThanOrEqual() {
		return intusetnumGreaterThanOrEqual;
	}

	public Integer getIntusetnumLessThanOrEqual() {
		return intusetnumLessThanOrEqual;
	}

	public List<Integer> getIntusetnums() {
		return intusetnums;
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

	public Integer getPindexId() {
		return pindexId;
	}

	public Integer getPindexIdGreaterThanOrEqual() {
		return pindexIdGreaterThanOrEqual;
	}

	public Integer getPindexIdLessThanOrEqual() {
		return pindexIdLessThanOrEqual;
	}

	public List<Integer> getPindexIds() {
		return pindexIds;
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

	public Integer getUindexId() {
		return uindexId;
	}

	public Integer getUindexIdGreaterThanOrEqual() {
		return uindexIdGreaterThanOrEqual;
	}

	public Integer getUindexIdLessThanOrEqual() {
		return uindexIdLessThanOrEqual;
	}

	public List<Integer> getUindexIds() {
		return uindexIds;
	}

	public TreewbsQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public TreewbsQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public TreewbsQuery indexNameLike(String indexNameLike) {
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
		addColumn("sindexName", "sindex_name");
		addColumn("nlevel", "nlevel");
		addColumn("content", "content");
		addColumn("nodeico", "nodeico");
		addColumn("listno", "listno");
		addColumn("inttype", "inttype");
		addColumn("pindexId", "pindex_id");
		addColumn("typeTablename", "type_tablename");
		addColumn("intusetname", "intusetname");
		addColumn("intstartype", "intstartype");
		addColumn("intstardelayday", "intstardelayday");
		addColumn("intstartA", "intstart_a");
		addColumn("intstartP", "intstart_p");
		addColumn("intendA", "intend_a");
		addColumn("intendP", "intend_p");
		addColumn("intneednode", "intneednode");
		addColumn("intusetnum", "intusetnum");
		addColumn("domainIndex", "domain_index");
		addColumn("strfileLocate", "strfileLocate");
		addColumn("intnodetype", "intnodetype");
		addColumn("intloadfile", "intloadfile");
		addColumn("intorglevel", "intorglevel");
		addColumn("uindexId", "uindex_id");
	}

	public TreewbsQuery intendA(Integer intendA) {
		if (intendA == null) {
			throw new RuntimeException("intendA is null");
		}
		this.intendA = intendA;
		return this;
	}

	public TreewbsQuery intendAGreaterThanOrEqual(
			Integer intendAGreaterThanOrEqual) {
		if (intendAGreaterThanOrEqual == null) {
			throw new RuntimeException("intendA is null");
		}
		this.intendAGreaterThanOrEqual = intendAGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intendALessThanOrEqual(Integer intendALessThanOrEqual) {
		if (intendALessThanOrEqual == null) {
			throw new RuntimeException("intendA is null");
		}
		this.intendALessThanOrEqual = intendALessThanOrEqual;
		return this;
	}

	public TreewbsQuery intendAs(List<Integer> intendAs) {
		if (intendAs == null) {
			throw new RuntimeException("intendAs is empty ");
		}
		this.intendAs = intendAs;
		return this;
	}

	public TreewbsQuery intendP(Integer intendP) {
		if (intendP == null) {
			throw new RuntimeException("intendP is null");
		}
		this.intendP = intendP;
		return this;
	}

	public TreewbsQuery intendPGreaterThanOrEqual(
			Integer intendPGreaterThanOrEqual) {
		if (intendPGreaterThanOrEqual == null) {
			throw new RuntimeException("intendP is null");
		}
		this.intendPGreaterThanOrEqual = intendPGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intendPLessThanOrEqual(Integer intendPLessThanOrEqual) {
		if (intendPLessThanOrEqual == null) {
			throw new RuntimeException("intendP is null");
		}
		this.intendPLessThanOrEqual = intendPLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intendPs(List<Integer> intendPs) {
		if (intendPs == null) {
			throw new RuntimeException("intendPs is empty ");
		}
		this.intendPs = intendPs;
		return this;
	}

	public TreewbsQuery intloadfile(Integer intloadfile) {
		if (intloadfile == null) {
			throw new RuntimeException("intloadfile is null");
		}
		this.intloadfile = intloadfile;
		return this;
	}

	public TreewbsQuery intloadfileGreaterThanOrEqual(
			Integer intloadfileGreaterThanOrEqual) {
		if (intloadfileGreaterThanOrEqual == null) {
			throw new RuntimeException("intloadfile is null");
		}
		this.intloadfileGreaterThanOrEqual = intloadfileGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intloadfileLessThanOrEqual(
			Integer intloadfileLessThanOrEqual) {
		if (intloadfileLessThanOrEqual == null) {
			throw new RuntimeException("intloadfile is null");
		}
		this.intloadfileLessThanOrEqual = intloadfileLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intloadfiles(List<Integer> intloadfiles) {
		if (intloadfiles == null) {
			throw new RuntimeException("intloadfiles is empty ");
		}
		this.intloadfiles = intloadfiles;
		return this;
	}

	public TreewbsQuery intneednode(Integer intneednode) {
		if (intneednode == null) {
			throw new RuntimeException("intneednode is null");
		}
		this.intneednode = intneednode;
		return this;
	}

	public TreewbsQuery intneednodeGreaterThanOrEqual(
			Integer intneednodeGreaterThanOrEqual) {
		if (intneednodeGreaterThanOrEqual == null) {
			throw new RuntimeException("intneednode is null");
		}
		this.intneednodeGreaterThanOrEqual = intneednodeGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intneednodeLessThanOrEqual(
			Integer intneednodeLessThanOrEqual) {
		if (intneednodeLessThanOrEqual == null) {
			throw new RuntimeException("intneednode is null");
		}
		this.intneednodeLessThanOrEqual = intneednodeLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intneednodes(List<Integer> intneednodes) {
		if (intneednodes == null) {
			throw new RuntimeException("intneednodes is empty ");
		}
		this.intneednodes = intneednodes;
		return this;
	}

	public TreewbsQuery intnodetype(Integer intnodetype) {
		if (intnodetype == null) {
			throw new RuntimeException("intnodetype is null");
		}
		this.intnodetype = intnodetype;
		return this;
	}

	public TreewbsQuery intnodetypeGreaterThanOrEqual(
			Integer intnodetypeGreaterThanOrEqual) {
		if (intnodetypeGreaterThanOrEqual == null) {
			throw new RuntimeException("intnodetype is null");
		}
		this.intnodetypeGreaterThanOrEqual = intnodetypeGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intnodetypeLessThanOrEqual(
			Integer intnodetypeLessThanOrEqual) {
		if (intnodetypeLessThanOrEqual == null) {
			throw new RuntimeException("intnodetype is null");
		}
		this.intnodetypeLessThanOrEqual = intnodetypeLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intnodetypes(List<Integer> intnodetypes) {
		if (intnodetypes == null) {
			throw new RuntimeException("intnodetypes is empty ");
		}
		this.intnodetypes = intnodetypes;
		return this;
	}

	public TreewbsQuery intorglevel(Integer intorglevel) {
		if (intorglevel == null) {
			throw new RuntimeException("intorglevel is null");
		}
		this.intorglevel = intorglevel;
		return this;
	}

	public TreewbsQuery intorglevelGreaterThanOrEqual(
			Integer intorglevelGreaterThanOrEqual) {
		if (intorglevelGreaterThanOrEqual == null) {
			throw new RuntimeException("intorglevel is null");
		}
		this.intorglevelGreaterThanOrEqual = intorglevelGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intorglevelLessThanOrEqual(
			Integer intorglevelLessThanOrEqual) {
		if (intorglevelLessThanOrEqual == null) {
			throw new RuntimeException("intorglevel is null");
		}
		this.intorglevelLessThanOrEqual = intorglevelLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intorglevels(List<Integer> intorglevels) {
		if (intorglevels == null) {
			throw new RuntimeException("intorglevels is empty ");
		}
		this.intorglevels = intorglevels;
		return this;
	}

	public TreewbsQuery intstardelayday(Integer intstardelayday) {
		if (intstardelayday == null) {
			throw new RuntimeException("intstardelayday is null");
		}
		this.intstardelayday = intstardelayday;
		return this;
	}

	public TreewbsQuery intstardelaydayGreaterThanOrEqual(
			Integer intstardelaydayGreaterThanOrEqual) {
		if (intstardelaydayGreaterThanOrEqual == null) {
			throw new RuntimeException("intstardelayday is null");
		}
		this.intstardelaydayGreaterThanOrEqual = intstardelaydayGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intstardelaydayLessThanOrEqual(
			Integer intstardelaydayLessThanOrEqual) {
		if (intstardelaydayLessThanOrEqual == null) {
			throw new RuntimeException("intstardelayday is null");
		}
		this.intstardelaydayLessThanOrEqual = intstardelaydayLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intstardelaydays(List<Integer> intstardelaydays) {
		if (intstardelaydays == null) {
			throw new RuntimeException("intstardelaydays is empty ");
		}
		this.intstardelaydays = intstardelaydays;
		return this;
	}

	public TreewbsQuery intstartA(Integer intstartA) {
		if (intstartA == null) {
			throw new RuntimeException("intstartA is null");
		}
		this.intstartA = intstartA;
		return this;
	}

	public TreewbsQuery intstartAGreaterThanOrEqual(
			Integer intstartAGreaterThanOrEqual) {
		if (intstartAGreaterThanOrEqual == null) {
			throw new RuntimeException("intstartA is null");
		}
		this.intstartAGreaterThanOrEqual = intstartAGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intstartALessThanOrEqual(
			Integer intstartALessThanOrEqual) {
		if (intstartALessThanOrEqual == null) {
			throw new RuntimeException("intstartA is null");
		}
		this.intstartALessThanOrEqual = intstartALessThanOrEqual;
		return this;
	}

	public TreewbsQuery intstartAs(List<Integer> intstartAs) {
		if (intstartAs == null) {
			throw new RuntimeException("intstartAs is empty ");
		}
		this.intstartAs = intstartAs;
		return this;
	}

	public TreewbsQuery intstartP(Integer intstartP) {
		if (intstartP == null) {
			throw new RuntimeException("intstartP is null");
		}
		this.intstartP = intstartP;
		return this;
	}

	public TreewbsQuery intstartPGreaterThanOrEqual(
			Integer intstartPGreaterThanOrEqual) {
		if (intstartPGreaterThanOrEqual == null) {
			throw new RuntimeException("intstartP is null");
		}
		this.intstartPGreaterThanOrEqual = intstartPGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intstartPLessThanOrEqual(
			Integer intstartPLessThanOrEqual) {
		if (intstartPLessThanOrEqual == null) {
			throw new RuntimeException("intstartP is null");
		}
		this.intstartPLessThanOrEqual = intstartPLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intstartPs(List<Integer> intstartPs) {
		if (intstartPs == null) {
			throw new RuntimeException("intstartPs is empty ");
		}
		this.intstartPs = intstartPs;
		return this;
	}

	public TreewbsQuery intstartype(Integer intstartype) {
		if (intstartype == null) {
			throw new RuntimeException("intstartype is null");
		}
		this.intstartype = intstartype;
		return this;
	}

	public TreewbsQuery intstartypeGreaterThanOrEqual(
			Integer intstartypeGreaterThanOrEqual) {
		if (intstartypeGreaterThanOrEqual == null) {
			throw new RuntimeException("intstartype is null");
		}
		this.intstartypeGreaterThanOrEqual = intstartypeGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intstartypeLessThanOrEqual(
			Integer intstartypeLessThanOrEqual) {
		if (intstartypeLessThanOrEqual == null) {
			throw new RuntimeException("intstartype is null");
		}
		this.intstartypeLessThanOrEqual = intstartypeLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intstartypes(List<Integer> intstartypes) {
		if (intstartypes == null) {
			throw new RuntimeException("intstartypes is empty ");
		}
		this.intstartypes = intstartypes;
		return this;
	}

	public TreewbsQuery inttype(Integer inttype) {
		if (inttype == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttype = inttype;
		return this;
	}

	public TreewbsQuery inttypeGreaterThanOrEqual(
			Integer inttypeGreaterThanOrEqual) {
		if (inttypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery inttypeLessThanOrEqual(Integer inttypeLessThanOrEqual) {
		if (inttypeLessThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
		return this;
	}

	public TreewbsQuery inttypes(List<Integer> inttypes) {
		if (inttypes == null) {
			throw new RuntimeException("inttypes is empty ");
		}
		this.inttypes = inttypes;
		return this;
	}

	public TreewbsQuery intusetname(Integer intusetname) {
		if (intusetname == null) {
			throw new RuntimeException("intusetname is null");
		}
		this.intusetname = intusetname;
		return this;
	}

	public TreewbsQuery intusetnameGreaterThanOrEqual(
			Integer intusetnameGreaterThanOrEqual) {
		if (intusetnameGreaterThanOrEqual == null) {
			throw new RuntimeException("intusetname is null");
		}
		this.intusetnameGreaterThanOrEqual = intusetnameGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intusetnameLessThanOrEqual(
			Integer intusetnameLessThanOrEqual) {
		if (intusetnameLessThanOrEqual == null) {
			throw new RuntimeException("intusetname is null");
		}
		this.intusetnameLessThanOrEqual = intusetnameLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intusetnames(List<Integer> intusetnames) {
		if (intusetnames == null) {
			throw new RuntimeException("intusetnames is empty ");
		}
		this.intusetnames = intusetnames;
		return this;
	}

	public TreewbsQuery intusetnum(Integer intusetnum) {
		if (intusetnum == null) {
			throw new RuntimeException("intusetnum is null");
		}
		this.intusetnum = intusetnum;
		return this;
	}

	public TreewbsQuery intusetnumGreaterThanOrEqual(
			Integer intusetnumGreaterThanOrEqual) {
		if (intusetnumGreaterThanOrEqual == null) {
			throw new RuntimeException("intusetnum is null");
		}
		this.intusetnumGreaterThanOrEqual = intusetnumGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery intusetnumLessThanOrEqual(
			Integer intusetnumLessThanOrEqual) {
		if (intusetnumLessThanOrEqual == null) {
			throw new RuntimeException("intusetnum is null");
		}
		this.intusetnumLessThanOrEqual = intusetnumLessThanOrEqual;
		return this;
	}

	public TreewbsQuery intusetnums(List<Integer> intusetnums) {
		if (intusetnums == null) {
			throw new RuntimeException("intusetnums is empty ");
		}
		this.intusetnums = intusetnums;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreewbsQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreewbsQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery nlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreewbsQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreewbsQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreewbsQuery pindexId(Integer pindexId) {
		if (pindexId == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexId = pindexId;
		return this;
	}

	public TreewbsQuery pindexIdGreaterThanOrEqual(
			Integer pindexIdGreaterThanOrEqual) {
		if (pindexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexIdGreaterThanOrEqual = pindexIdGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery pindexIdLessThanOrEqual(Integer pindexIdLessThanOrEqual) {
		if (pindexIdLessThanOrEqual == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexIdLessThanOrEqual = pindexIdLessThanOrEqual;
		return this;
	}

	public TreewbsQuery pindexIds(List<Integer> pindexIds) {
		if (pindexIds == null) {
			throw new RuntimeException("pindexIds is empty ");
		}
		this.pindexIds = pindexIds;
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

	public void setIdLike(String idLike) {
		this.idLike = idLike;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public void setIndexNameLike(String indexNameLike) {
		this.indexNameLike = indexNameLike;
	}

	public void setIntendA(Integer intendA) {
		this.intendA = intendA;
	}

	public void setIntendAGreaterThanOrEqual(Integer intendAGreaterThanOrEqual) {
		this.intendAGreaterThanOrEqual = intendAGreaterThanOrEqual;
	}

	public void setIntendALessThanOrEqual(Integer intendALessThanOrEqual) {
		this.intendALessThanOrEqual = intendALessThanOrEqual;
	}

	public void setIntendAs(List<Integer> intendAs) {
		this.intendAs = intendAs;
	}

	public void setIntendP(Integer intendP) {
		this.intendP = intendP;
	}

	public void setIntendPGreaterThanOrEqual(Integer intendPGreaterThanOrEqual) {
		this.intendPGreaterThanOrEqual = intendPGreaterThanOrEqual;
	}

	public void setIntendPLessThanOrEqual(Integer intendPLessThanOrEqual) {
		this.intendPLessThanOrEqual = intendPLessThanOrEqual;
	}

	public void setIntendPs(List<Integer> intendPs) {
		this.intendPs = intendPs;
	}

	public void setIntloadfile(Integer intloadfile) {
		this.intloadfile = intloadfile;
	}

	public void setIntloadfileGreaterThanOrEqual(
			Integer intloadfileGreaterThanOrEqual) {
		this.intloadfileGreaterThanOrEqual = intloadfileGreaterThanOrEqual;
	}

	public void setIntloadfileLessThanOrEqual(Integer intloadfileLessThanOrEqual) {
		this.intloadfileLessThanOrEqual = intloadfileLessThanOrEqual;
	}

	public void setIntloadfiles(List<Integer> intloadfiles) {
		this.intloadfiles = intloadfiles;
	}

	public void setIntneednode(Integer intneednode) {
		this.intneednode = intneednode;
	}

	public void setIntneednodeGreaterThanOrEqual(
			Integer intneednodeGreaterThanOrEqual) {
		this.intneednodeGreaterThanOrEqual = intneednodeGreaterThanOrEqual;
	}

	public void setIntneednodeLessThanOrEqual(Integer intneednodeLessThanOrEqual) {
		this.intneednodeLessThanOrEqual = intneednodeLessThanOrEqual;
	}

	public void setIntneednodes(List<Integer> intneednodes) {
		this.intneednodes = intneednodes;
	}

	public void setIntnodetype(Integer intnodetype) {
		this.intnodetype = intnodetype;
	}

	public void setIntnodetypeGreaterThanOrEqual(
			Integer intnodetypeGreaterThanOrEqual) {
		this.intnodetypeGreaterThanOrEqual = intnodetypeGreaterThanOrEqual;
	}

	public void setIntnodetypeLessThanOrEqual(Integer intnodetypeLessThanOrEqual) {
		this.intnodetypeLessThanOrEqual = intnodetypeLessThanOrEqual;
	}

	public void setIntnodetypes(List<Integer> intnodetypes) {
		this.intnodetypes = intnodetypes;
	}

	public void setIntorglevel(Integer intorglevel) {
		this.intorglevel = intorglevel;
	}

	public void setIntorglevelGreaterThanOrEqual(
			Integer intorglevelGreaterThanOrEqual) {
		this.intorglevelGreaterThanOrEqual = intorglevelGreaterThanOrEqual;
	}

	public void setIntorglevelLessThanOrEqual(Integer intorglevelLessThanOrEqual) {
		this.intorglevelLessThanOrEqual = intorglevelLessThanOrEqual;
	}

	public void setIntorglevels(List<Integer> intorglevels) {
		this.intorglevels = intorglevels;
	}

	public void setIntstardelayday(Integer intstardelayday) {
		this.intstardelayday = intstardelayday;
	}

	public void setIntstardelaydayGreaterThanOrEqual(
			Integer intstardelaydayGreaterThanOrEqual) {
		this.intstardelaydayGreaterThanOrEqual = intstardelaydayGreaterThanOrEqual;
	}

	public void setIntstardelaydayLessThanOrEqual(
			Integer intstardelaydayLessThanOrEqual) {
		this.intstardelaydayLessThanOrEqual = intstardelaydayLessThanOrEqual;
	}

	public void setIntstardelaydays(List<Integer> intstardelaydays) {
		this.intstardelaydays = intstardelaydays;
	}

	public void setIntstartA(Integer intstartA) {
		this.intstartA = intstartA;
	}

	public void setIntstartAGreaterThanOrEqual(
			Integer intstartAGreaterThanOrEqual) {
		this.intstartAGreaterThanOrEqual = intstartAGreaterThanOrEqual;
	}

	public void setIntstartALessThanOrEqual(Integer intstartALessThanOrEqual) {
		this.intstartALessThanOrEqual = intstartALessThanOrEqual;
	}

	public void setIntstartAs(List<Integer> intstartAs) {
		this.intstartAs = intstartAs;
	}

	public void setIntstartP(Integer intstartP) {
		this.intstartP = intstartP;
	}

	public void setIntstartPGreaterThanOrEqual(
			Integer intstartPGreaterThanOrEqual) {
		this.intstartPGreaterThanOrEqual = intstartPGreaterThanOrEqual;
	}

	public void setIntstartPLessThanOrEqual(Integer intstartPLessThanOrEqual) {
		this.intstartPLessThanOrEqual = intstartPLessThanOrEqual;
	}

	public void setIntstartPs(List<Integer> intstartPs) {
		this.intstartPs = intstartPs;
	}

	public void setIntstartype(Integer intstartype) {
		this.intstartype = intstartype;
	}

	public void setIntstartypeGreaterThanOrEqual(
			Integer intstartypeGreaterThanOrEqual) {
		this.intstartypeGreaterThanOrEqual = intstartypeGreaterThanOrEqual;
	}

	public void setIntstartypeLessThanOrEqual(Integer intstartypeLessThanOrEqual) {
		this.intstartypeLessThanOrEqual = intstartypeLessThanOrEqual;
	}

	public void setIntstartypes(List<Integer> intstartypes) {
		this.intstartypes = intstartypes;
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

	public void setIntusetname(Integer intusetname) {
		this.intusetname = intusetname;
	}

	public void setIntusetnameGreaterThanOrEqual(
			Integer intusetnameGreaterThanOrEqual) {
		this.intusetnameGreaterThanOrEqual = intusetnameGreaterThanOrEqual;
	}

	public void setIntusetnameLessThanOrEqual(Integer intusetnameLessThanOrEqual) {
		this.intusetnameLessThanOrEqual = intusetnameLessThanOrEqual;
	}

	public void setIntusetnames(List<Integer> intusetnames) {
		this.intusetnames = intusetnames;
	}

	public void setIntusetnum(Integer intusetnum) {
		this.intusetnum = intusetnum;
	}

	public void setIntusetnumGreaterThanOrEqual(
			Integer intusetnumGreaterThanOrEqual) {
		this.intusetnumGreaterThanOrEqual = intusetnumGreaterThanOrEqual;
	}

	public void setIntusetnumLessThanOrEqual(Integer intusetnumLessThanOrEqual) {
		this.intusetnumLessThanOrEqual = intusetnumLessThanOrEqual;
	}

	public void setIntusetnums(List<Integer> intusetnums) {
		this.intusetnums = intusetnums;
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

	public void setPindexId(Integer pindexId) {
		this.pindexId = pindexId;
	}

	public void setPindexIdGreaterThanOrEqual(Integer pindexIdGreaterThanOrEqual) {
		this.pindexIdGreaterThanOrEqual = pindexIdGreaterThanOrEqual;
	}

	public void setPindexIdLessThanOrEqual(Integer pindexIdLessThanOrEqual) {
		this.pindexIdLessThanOrEqual = pindexIdLessThanOrEqual;
	}

	public void setPindexIds(List<Integer> pindexIds) {
		this.pindexIds = pindexIds;
	}

	public void setSindexNameLike(String sindexNameLike) {
		this.sindexNameLike = sindexNameLike;
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

	public void setUindexId(Integer uindexId) {
		this.uindexId = uindexId;
	}

	public void setUindexIdGreaterThanOrEqual(Integer uindexIdGreaterThanOrEqual) {
		this.uindexIdGreaterThanOrEqual = uindexIdGreaterThanOrEqual;
	}

	public void setUindexIdLessThanOrEqual(Integer uindexIdLessThanOrEqual) {
		this.uindexIdLessThanOrEqual = uindexIdLessThanOrEqual;
	}

	public void setUindexIds(List<Integer> uindexIds) {
		this.uindexIds = uindexIds;
	}

	public TreewbsQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public TreewbsQuery strfileLocate(String strfileLocate) {
		if (strfileLocate == null) {
			throw new RuntimeException("strfileLocate is null");
		}
		this.strfileLocate = strfileLocate;
		return this;
	}

	public TreewbsQuery strfileLocateLike(String strfileLocateLike) {
		if (strfileLocateLike == null) {
			throw new RuntimeException("strfileLocate is null");
		}
		this.strfileLocateLike = strfileLocateLike;
		return this;
	}

	public TreewbsQuery strfileLocates(List<String> strfileLocates) {
		if (strfileLocates == null) {
			throw new RuntimeException("strfileLocates is empty ");
		}
		this.strfileLocates = strfileLocates;
		return this;
	}

	public TreewbsQuery typeTablename(String typeTablename) {
		if (typeTablename == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablename = typeTablename;
		return this;
	}

	public TreewbsQuery typeTablenameLike(String typeTablenameLike) {
		if (typeTablenameLike == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablenameLike = typeTablenameLike;
		return this;
	}

	public TreewbsQuery typeTablenames(List<String> typeTablenames) {
		if (typeTablenames == null) {
			throw new RuntimeException("typeTablenames is empty ");
		}
		this.typeTablenames = typeTablenames;
		return this;
	}

	public TreewbsQuery uindexId(Integer uindexId) {
		if (uindexId == null) {
			throw new RuntimeException("uindexId is null");
		}
		this.uindexId = uindexId;
		return this;
	}

	public TreewbsQuery uindexIdGreaterThanOrEqual(
			Integer uindexIdGreaterThanOrEqual) {
		if (uindexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("uindexId is null");
		}
		this.uindexIdGreaterThanOrEqual = uindexIdGreaterThanOrEqual;
		return this;
	}

	public TreewbsQuery uindexIdLessThanOrEqual(Integer uindexIdLessThanOrEqual) {
		if (uindexIdLessThanOrEqual == null) {
			throw new RuntimeException("uindexId is null");
		}
		this.uindexIdLessThanOrEqual = uindexIdLessThanOrEqual;
		return this;
	}

	public TreewbsQuery uindexIds(List<Integer> uindexIds) {
		if (uindexIds == null) {
			throw new RuntimeException("uindexIds is empty ");
		}
		this.uindexIds = uindexIds;
		return this;
	}

}