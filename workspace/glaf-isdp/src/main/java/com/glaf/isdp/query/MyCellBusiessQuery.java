package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class MyCellBusiessQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String nameLike;
	protected String isused;
	protected String contentLike;
	protected Integer intsystype;
	protected Integer intsystypeGreaterThanOrEqual;
	protected Integer intsystypeLessThanOrEqual;
	protected List<Integer> intsystypes;
	protected String picfile;
	protected String picfileLike;
	protected List<String> picfiles;
	protected String picfileWelcom;
	protected String picfileWelcomLike;
	protected List<String> picfileWelcoms;
	protected String picfileMain;
	protected String picfileMainLike;
	protected List<String> picfileMains;
	protected String picfileLogin;
	protected String picfileLoginLike;
	protected List<String> picfileLogins;
	protected String sysbuiesstypesId;
	protected String sysbuiesstypesIdLike;
	protected List<String> sysbuiesstypesIds;
	protected Integer domainIndex;
	protected Integer domainIndexGreaterThanOrEqual;
	protected Integer domainIndexLessThanOrEqual;
	protected List<Integer> domainIndexs;
	

	public MyCellBusiessQuery() {

	}

	public MyCellBusiessQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public MyCellBusiessQuery domainIndex(Integer domainIndex) {
		if (domainIndex == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndex = domainIndex;
		return this;
	}

	public MyCellBusiessQuery domainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		if (domainIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
		return this;
	}

	public MyCellBusiessQuery domainIndexLessThanOrEqual(
			Integer domainIndexLessThanOrEqual) {
		if (domainIndexLessThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
		return this;
	}

	public MyCellBusiessQuery domainIndexs(List<Integer> domainIndexs) {
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

	public Integer getIntsystype() {
		return intsystype;
	}

	public Integer getIntsystypeGreaterThanOrEqual() {
		return intsystypeGreaterThanOrEqual;
	}

	public Integer getIntsystypeLessThanOrEqual() {
		return intsystypeLessThanOrEqual;
	}

	public List<Integer> getIntsystypes() {
		return intsystypes;
	}

	public String getIsused() {
		return isused;
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

	public String getPicfile() {
		return picfile;
	}

	public String getPicfileLike() {
		if (picfileLike != null && picfileLike.trim().length() > 0) {
			if (!picfileLike.startsWith("%")) {
				picfileLike = "%" + picfileLike;
			}
			if (!picfileLike.endsWith("%")) {
				picfileLike = picfileLike + "%";
			}
		}
		return picfileLike;
	}

	public String getPicfileLogin() {
		return picfileLogin;
	}

	public String getPicfileLoginLike() {
		if (picfileLoginLike != null && picfileLoginLike.trim().length() > 0) {
			if (!picfileLoginLike.startsWith("%")) {
				picfileLoginLike = "%" + picfileLoginLike;
			}
			if (!picfileLoginLike.endsWith("%")) {
				picfileLoginLike = picfileLoginLike + "%";
			}
		}
		return picfileLoginLike;
	}

	public List<String> getPicfileLogins() {
		return picfileLogins;
	}

	public String getPicfileMain() {
		return picfileMain;
	}

	public String getPicfileMainLike() {
		if (picfileMainLike != null && picfileMainLike.trim().length() > 0) {
			if (!picfileMainLike.startsWith("%")) {
				picfileMainLike = "%" + picfileMainLike;
			}
			if (!picfileMainLike.endsWith("%")) {
				picfileMainLike = picfileMainLike + "%";
			}
		}
		return picfileMainLike;
	}

	public List<String> getPicfileMains() {
		return picfileMains;
	}

	public List<String> getPicfiles() {
		return picfiles;
	}

	public String getPicfileWelcom() {
		return picfileWelcom;
	}

	public String getPicfileWelcomLike() {
		if (picfileWelcomLike != null && picfileWelcomLike.trim().length() > 0) {
			if (!picfileWelcomLike.startsWith("%")) {
				picfileWelcomLike = "%" + picfileWelcomLike;
			}
			if (!picfileWelcomLike.endsWith("%")) {
				picfileWelcomLike = picfileWelcomLike + "%";
			}
		}
		return picfileWelcomLike;
	}

	public List<String> getPicfileWelcoms() {
		return picfileWelcoms;
	}

	public String getSysbuiesstypesId() {
		return sysbuiesstypesId;
	}

	public String getSysbuiesstypesIdLike() {
		if (sysbuiesstypesIdLike != null
				&& sysbuiesstypesIdLike.trim().length() > 0) {
			if (!sysbuiesstypesIdLike.startsWith("%")) {
				sysbuiesstypesIdLike = "%" + sysbuiesstypesIdLike;
			}
			if (!sysbuiesstypesIdLike.endsWith("%")) {
				sysbuiesstypesIdLike = sysbuiesstypesIdLike + "%";
			}
		}
		return sysbuiesstypesIdLike;
	}

	public List<String> getSysbuiesstypesIds() {
		return sysbuiesstypesIds;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("name", "name");
		addColumn("isused", "isused");
		addColumn("content", "content");
		addColumn("intsystype", "intsystype");
		addColumn("picfile", "picfile");
		addColumn("picfileWelcom", "picfile_welcom");
		addColumn("picfileMain", "picfile_main");
		addColumn("picfileLogin", "picfile_login");
		addColumn("sysbuiesstypesId", "sysbuiesstypes_id");
		addColumn("listno", "listno");
		addColumn("domainIndex", "domain_index");
	}

	public MyCellBusiessQuery intsystype(Integer intsystype) {
		if (intsystype == null) {
			throw new RuntimeException("intsystype is null");
		}
		this.intsystype = intsystype;
		return this;
	}

	public MyCellBusiessQuery intsystypeGreaterThanOrEqual(
			Integer intsystypeGreaterThanOrEqual) {
		if (intsystypeGreaterThanOrEqual == null) {
			throw new RuntimeException("intsystype is null");
		}
		this.intsystypeGreaterThanOrEqual = intsystypeGreaterThanOrEqual;
		return this;
	}

	public MyCellBusiessQuery intsystypeLessThanOrEqual(
			Integer intsystypeLessThanOrEqual) {
		if (intsystypeLessThanOrEqual == null) {
			throw new RuntimeException("intsystype is null");
		}
		this.intsystypeLessThanOrEqual = intsystypeLessThanOrEqual;
		return this;
	}

	public MyCellBusiessQuery intsystypes(List<Integer> intsystypes) {
		if (intsystypes == null) {
			throw new RuntimeException("intsystypes is empty ");
		}
		this.intsystypes = intsystypes;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public MyCellBusiessQuery isused(String isused) {
		if (isused == null) {
			throw new RuntimeException("isused is null");
		}
		this.isused = isused;
		return this;
	}

	public MyCellBusiessQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public MyCellBusiessQuery picfile(String picfile) {
		if (picfile == null) {
			throw new RuntimeException("picfile is null");
		}
		this.picfile = picfile;
		return this;
	}

	public MyCellBusiessQuery picfileLike(String picfileLike) {
		if (picfileLike == null) {
			throw new RuntimeException("picfile is null");
		}
		this.picfileLike = picfileLike;
		return this;
	}

	public MyCellBusiessQuery picfileLogin(String picfileLogin) {
		if (picfileLogin == null) {
			throw new RuntimeException("picfileLogin is null");
		}
		this.picfileLogin = picfileLogin;
		return this;
	}

	public MyCellBusiessQuery picfileLoginLike(String picfileLoginLike) {
		if (picfileLoginLike == null) {
			throw new RuntimeException("picfileLogin is null");
		}
		this.picfileLoginLike = picfileLoginLike;
		return this;
	}

	public MyCellBusiessQuery picfileLogins(List<String> picfileLogins) {
		if (picfileLogins == null) {
			throw new RuntimeException("picfileLogins is empty ");
		}
		this.picfileLogins = picfileLogins;
		return this;
	}

	public MyCellBusiessQuery picfileMain(String picfileMain) {
		if (picfileMain == null) {
			throw new RuntimeException("picfileMain is null");
		}
		this.picfileMain = picfileMain;
		return this;
	}

	public MyCellBusiessQuery picfileMainLike(String picfileMainLike) {
		if (picfileMainLike == null) {
			throw new RuntimeException("picfileMain is null");
		}
		this.picfileMainLike = picfileMainLike;
		return this;
	}

	public MyCellBusiessQuery picfileMains(List<String> picfileMains) {
		if (picfileMains == null) {
			throw new RuntimeException("picfileMains is empty ");
		}
		this.picfileMains = picfileMains;
		return this;
	}

	public MyCellBusiessQuery picfiles(List<String> picfiles) {
		if (picfiles == null) {
			throw new RuntimeException("picfiles is empty ");
		}
		this.picfiles = picfiles;
		return this;
	}

	public MyCellBusiessQuery picfileWelcom(String picfileWelcom) {
		if (picfileWelcom == null) {
			throw new RuntimeException("picfileWelcom is null");
		}
		this.picfileWelcom = picfileWelcom;
		return this;
	}

	public MyCellBusiessQuery picfileWelcomLike(String picfileWelcomLike) {
		if (picfileWelcomLike == null) {
			throw new RuntimeException("picfileWelcom is null");
		}
		this.picfileWelcomLike = picfileWelcomLike;
		return this;
	}

	public MyCellBusiessQuery picfileWelcoms(List<String> picfileWelcoms) {
		if (picfileWelcoms == null) {
			throw new RuntimeException("picfileWelcoms is empty ");
		}
		this.picfileWelcoms = picfileWelcoms;
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

	public void setIntsystype(Integer intsystype) {
		this.intsystype = intsystype;
	}

	public void setIntsystypeGreaterThanOrEqual(
			Integer intsystypeGreaterThanOrEqual) {
		this.intsystypeGreaterThanOrEqual = intsystypeGreaterThanOrEqual;
	}

	public void setIntsystypeLessThanOrEqual(Integer intsystypeLessThanOrEqual) {
		this.intsystypeLessThanOrEqual = intsystypeLessThanOrEqual;
	}

	public void setIntsystypes(List<Integer> intsystypes) {
		this.intsystypes = intsystypes;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setPicfile(String picfile) {
		this.picfile = picfile;
	}

	public void setPicfileLike(String picfileLike) {
		this.picfileLike = picfileLike;
	}

	public void setPicfileLogin(String picfileLogin) {
		this.picfileLogin = picfileLogin;
	}

	public void setPicfileLoginLike(String picfileLoginLike) {
		this.picfileLoginLike = picfileLoginLike;
	}

	public void setPicfileLogins(List<String> picfileLogins) {
		this.picfileLogins = picfileLogins;
	}

	public void setPicfileMain(String picfileMain) {
		this.picfileMain = picfileMain;
	}

	public void setPicfileMainLike(String picfileMainLike) {
		this.picfileMainLike = picfileMainLike;
	}

	public void setPicfileMains(List<String> picfileMains) {
		this.picfileMains = picfileMains;
	}

	public void setPicfiles(List<String> picfiles) {
		this.picfiles = picfiles;
	}

	public void setPicfileWelcom(String picfileWelcom) {
		this.picfileWelcom = picfileWelcom;
	}

	public void setPicfileWelcomLike(String picfileWelcomLike) {
		this.picfileWelcomLike = picfileWelcomLike;
	}

	public void setPicfileWelcoms(List<String> picfileWelcoms) {
		this.picfileWelcoms = picfileWelcoms;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setSysbuiesstypesId(String sysbuiesstypesId) {
		this.sysbuiesstypesId = sysbuiesstypesId;
	}

	public void setSysbuiesstypesIdLike(String sysbuiesstypesIdLike) {
		this.sysbuiesstypesIdLike = sysbuiesstypesIdLike;
	}

	public void setSysbuiesstypesIds(List<String> sysbuiesstypesIds) {
		this.sysbuiesstypesIds = sysbuiesstypesIds;
	}

	public MyCellBusiessQuery sysbuiesstypesId(String sysbuiesstypesId) {
		if (sysbuiesstypesId == null) {
			throw new RuntimeException("sysbuiesstypesId is null");
		}
		this.sysbuiesstypesId = sysbuiesstypesId;
		return this;
	}

	public MyCellBusiessQuery sysbuiesstypesIdLike(String sysbuiesstypesIdLike) {
		if (sysbuiesstypesIdLike == null) {
			throw new RuntimeException("sysbuiesstypesId is null");
		}
		this.sysbuiesstypesIdLike = sysbuiesstypesIdLike;
		return this;
	}

	public MyCellBusiessQuery sysbuiesstypesIds(List<String> sysbuiesstypesIds) {
		if (sysbuiesstypesIds == null) {
			throw new RuntimeException("sysbuiesstypesIds is empty ");
		}
		this.sysbuiesstypesIds = sysbuiesstypesIds;
		return this;
	}

}