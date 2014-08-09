/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.base.modules.sys.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreedotQuery extends DataQuery {
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
	protected Integer menuid;
	protected Integer menuidGreaterThanOrEqual;
	protected Integer menuidLessThanOrEqual;
	protected List<Integer> menuids;
	protected Integer isend;
	protected Integer isendGreaterThanOrEqual;
	protected Integer isendLessThanOrEqual;
	protected List<Integer> isends;
	protected String sysmenuid;
	protected String sysmenuidLike;
	protected List<String> sysmenuids;
	protected Integer type;
	protected Integer typeGreaterThanOrEqual;
	protected Integer typeLessThanOrEqual;
	protected List<Integer> types;
	protected String filenumid;
	protected String filenumidLike;
	protected List<String> filenumids;
	protected String filenumid2;
	protected String filenumid2Like;
	protected List<String> filenumid2s;
	protected Integer projIndex;
	protected Integer projIndexGreaterThanOrEqual;
	protected Integer projIndexLessThanOrEqual;
	protected List<Integer> projIndexs;
	protected Integer domainIndex;
	protected Integer domainIndexGreaterThanOrEqual;
	protected Integer domainIndexLessThanOrEqual;
	protected List<Integer> domainIndexs;

	public TreedotQuery() {

	}

	public TreedotQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public TreedotQuery domainIndex(Integer domainIndex) {
		if (domainIndex == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndex = domainIndex;
		return this;
	}

	public TreedotQuery domainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		if (domainIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
		return this;
	}

	public TreedotQuery domainIndexLessThanOrEqual(
			Integer domainIndexLessThanOrEqual) {
		if (domainIndexLessThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
		return this;
	}

	public TreedotQuery domainIndexs(List<Integer> domainIndexs) {
		if (domainIndexs == null) {
			throw new RuntimeException("domainIndexs is empty ");
		}
		this.domainIndexs = domainIndexs;
		return this;
	}

	public TreedotQuery filenumid(String filenumid) {
		if (filenumid == null) {
			throw new RuntimeException("filenumid is null");
		}
		this.filenumid = filenumid;
		return this;
	}

	public TreedotQuery filenumid2(String filenumid2) {
		if (filenumid2 == null) {
			throw new RuntimeException("filenumid2 is null");
		}
		this.filenumid2 = filenumid2;
		return this;
	}

	public TreedotQuery filenumid2Like(String filenumid2Like) {
		if (filenumid2Like == null) {
			throw new RuntimeException("filenumid2 is null");
		}
		this.filenumid2Like = filenumid2Like;
		return this;
	}

	public TreedotQuery filenumid2s(List<String> filenumid2s) {
		if (filenumid2s == null) {
			throw new RuntimeException("filenumid2s is empty ");
		}
		this.filenumid2s = filenumid2s;
		return this;
	}

	public TreedotQuery filenumidLike(String filenumidLike) {
		if (filenumidLike == null) {
			throw new RuntimeException("filenumid is null");
		}
		this.filenumidLike = filenumidLike;
		return this;
	}

	public TreedotQuery filenumids(List<String> filenumids) {
		if (filenumids == null) {
			throw new RuntimeException("filenumids is empty ");
		}
		this.filenumids = filenumids;
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

	public String getFilenumid() {
		return filenumid;
	}

	public String getFilenumid2() {
		return filenumid2;
	}

	public String getFilenumid2Like() {
		if (filenumid2Like != null && filenumid2Like.trim().length() > 0) {
			if (!filenumid2Like.startsWith("%")) {
				filenumid2Like = "%" + filenumid2Like;
			}
			if (!filenumid2Like.endsWith("%")) {
				filenumid2Like = filenumid2Like + "%";
			}
		}
		return filenumid2Like;
	}

	public List<String> getFilenumid2s() {
		return filenumid2s;
	}

	public String getFilenumidLike() {
		if (filenumidLike != null && filenumidLike.trim().length() > 0) {
			if (!filenumidLike.startsWith("%")) {
				filenumidLike = "%" + filenumidLike;
			}
			if (!filenumidLike.endsWith("%")) {
				filenumidLike = filenumidLike + "%";
			}
		}
		return filenumidLike;
	}

	public List<String> getFilenumids() {
		return filenumids;
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

	public Integer getIsend() {
		return isend;
	}

	public Integer getIsendGreaterThanOrEqual() {
		return isendGreaterThanOrEqual;
	}

	public Integer getIsendLessThanOrEqual() {
		return isendLessThanOrEqual;
	}

	public List<Integer> getIsends() {
		return isends;
	}

	public Integer getMenuid() {
		return menuid;
	}

	public Integer getMenuidGreaterThanOrEqual() {
		return menuidGreaterThanOrEqual;
	}

	public Integer getMenuidLessThanOrEqual() {
		return menuidLessThanOrEqual;
	}

	public List<Integer> getMenuids() {
		return menuids;
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
			if (getSortOrder() != null) {
				a_x = " desc ";
			}

			if (columns.get(sortField) != null) {
				orderBy = " E." + columns.get(sortField) + a_x;
			}
		}
		return orderBy;
	}

	public Integer getProjIndex() {
		return projIndex;
	}

	public Integer getProjIndexGreaterThanOrEqual() {
		return projIndexGreaterThanOrEqual;
	}

	public Integer getProjIndexLessThanOrEqual() {
		return projIndexLessThanOrEqual;
	}

	public List<Integer> getProjIndexs() {
		return projIndexs;
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

	public String getSysmenuid() {
		return sysmenuid;
	}

	public String getSysmenuidLike() {
		if (sysmenuidLike != null && sysmenuidLike.trim().length() > 0) {
			if (!sysmenuidLike.startsWith("%")) {
				sysmenuidLike = "%" + sysmenuidLike;
			}
			if (!sysmenuidLike.endsWith("%")) {
				sysmenuidLike = sysmenuidLike + "%";
			}
		}
		return sysmenuidLike;
	}

	public List<String> getSysmenuids() {
		return sysmenuids;
	}

	public Integer getType() {
		return type;
	}

	public Integer getTypeGreaterThanOrEqual() {
		return typeGreaterThanOrEqual;
	}

	public Integer getTypeLessThanOrEqual() {
		return typeLessThanOrEqual;
	}

	public List<Integer> getTypes() {
		return types;
	}

	public TreedotQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public TreedotQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public TreedotQuery indexNameLike(String indexNameLike) {
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
		addColumn("num", "num");
		addColumn("content", "content");
		addColumn("sindexName", "sindex_name");
		addColumn("nodeico", "nodeico");
		addColumn("listno", "listno");
		addColumn("menuid", "menuid");
		addColumn("isend", "isend");
		addColumn("sysmenuid", "sysmenuid");
		addColumn("type", "type");
		addColumn("filenumid", "filenumid");
		addColumn("filenumid2", "filenumid2");
		addColumn("projIndex", "proj_index");
		addColumn("domainIndex", "domain_index");
	}

	public TreedotQuery isend(Integer isend) {
		if (isend == null) {
			throw new RuntimeException("isend is null");
		}
		this.isend = isend;
		return this;
	}

	public TreedotQuery isendGreaterThanOrEqual(Integer isendGreaterThanOrEqual) {
		if (isendGreaterThanOrEqual == null) {
			throw new RuntimeException("isend is null");
		}
		this.isendGreaterThanOrEqual = isendGreaterThanOrEqual;
		return this;
	}

	public TreedotQuery isendLessThanOrEqual(Integer isendLessThanOrEqual) {
		if (isendLessThanOrEqual == null) {
			throw new RuntimeException("isend is null");
		}
		this.isendLessThanOrEqual = isendLessThanOrEqual;
		return this;
	}

	public TreedotQuery isends(List<Integer> isends) {
		if (isends == null) {
			throw new RuntimeException("isends is empty ");
		}
		this.isends = isends;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreedotQuery menuid(Integer menuid) {
		if (menuid == null) {
			throw new RuntimeException("menuid is null");
		}
		this.menuid = menuid;
		return this;
	}

	public TreedotQuery menuidGreaterThanOrEqual(
			Integer menuidGreaterThanOrEqual) {
		if (menuidGreaterThanOrEqual == null) {
			throw new RuntimeException("menuid is null");
		}
		this.menuidGreaterThanOrEqual = menuidGreaterThanOrEqual;
		return this;
	}

	public TreedotQuery menuidLessThanOrEqual(Integer menuidLessThanOrEqual) {
		if (menuidLessThanOrEqual == null) {
			throw new RuntimeException("menuid is null");
		}
		this.menuidLessThanOrEqual = menuidLessThanOrEqual;
		return this;
	}

	public TreedotQuery menuids(List<Integer> menuids) {
		if (menuids == null) {
			throw new RuntimeException("menuids is empty ");
		}
		this.menuids = menuids;
		return this;
	}

	public TreedotQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreedotQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreedotQuery nlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreedotQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreedotQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreedotQuery projIndex(Integer projIndex) {
		if (projIndex == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndex = projIndex;
		return this;
	}

	public TreedotQuery projIndexGreaterThanOrEqual(
			Integer projIndexGreaterThanOrEqual) {
		if (projIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndexGreaterThanOrEqual = projIndexGreaterThanOrEqual;
		return this;
	}

	public TreedotQuery projIndexLessThanOrEqual(
			Integer projIndexLessThanOrEqual) {
		if (projIndexLessThanOrEqual == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndexLessThanOrEqual = projIndexLessThanOrEqual;
		return this;
	}

	public TreedotQuery projIndexs(List<Integer> projIndexs) {
		if (projIndexs == null) {
			throw new RuntimeException("projIndexs is empty ");
		}
		this.projIndexs = projIndexs;
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

	public void setFilenumid(String filenumid) {
		this.filenumid = filenumid;
	}

	public void setFilenumid2(String filenumid2) {
		this.filenumid2 = filenumid2;
	}

	public void setFilenumid2Like(String filenumid2Like) {
		this.filenumid2Like = filenumid2Like;
	}

	public void setFilenumid2s(List<String> filenumid2s) {
		this.filenumid2s = filenumid2s;
	}

	public void setFilenumidLike(String filenumidLike) {
		this.filenumidLike = filenumidLike;
	}

	public void setFilenumids(List<String> filenumids) {
		this.filenumids = filenumids;
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

	public void setIsend(Integer isend) {
		this.isend = isend;
	}

	public void setIsendGreaterThanOrEqual(Integer isendGreaterThanOrEqual) {
		this.isendGreaterThanOrEqual = isendGreaterThanOrEqual;
	}

	public void setIsendLessThanOrEqual(Integer isendLessThanOrEqual) {
		this.isendLessThanOrEqual = isendLessThanOrEqual;
	}

	public void setIsends(List<Integer> isends) {
		this.isends = isends;
	}

	public void setMenuid(Integer menuid) {
		this.menuid = menuid;
	}

	public void setMenuidGreaterThanOrEqual(Integer menuidGreaterThanOrEqual) {
		this.menuidGreaterThanOrEqual = menuidGreaterThanOrEqual;
	}

	public void setMenuidLessThanOrEqual(Integer menuidLessThanOrEqual) {
		this.menuidLessThanOrEqual = menuidLessThanOrEqual;
	}

	public void setMenuids(List<Integer> menuids) {
		this.menuids = menuids;
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

	public void setProjIndex(Integer projIndex) {
		this.projIndex = projIndex;
	}

	public void setProjIndexGreaterThanOrEqual(
			Integer projIndexGreaterThanOrEqual) {
		this.projIndexGreaterThanOrEqual = projIndexGreaterThanOrEqual;
	}

	public void setProjIndexLessThanOrEqual(Integer projIndexLessThanOrEqual) {
		this.projIndexLessThanOrEqual = projIndexLessThanOrEqual;
	}

	public void setProjIndexs(List<Integer> projIndexs) {
		this.projIndexs = projIndexs;
	}

	public void setSindexNameLike(String sindexNameLike) {
		this.sindexNameLike = sindexNameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setSysmenuid(String sysmenuid) {
		this.sysmenuid = sysmenuid;
	}

	public void setSysmenuidLike(String sysmenuidLike) {
		this.sysmenuidLike = sysmenuidLike;
	}

	public void setSysmenuids(List<String> sysmenuids) {
		this.sysmenuids = sysmenuids;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void setTypeGreaterThanOrEqual(Integer typeGreaterThanOrEqual) {
		this.typeGreaterThanOrEqual = typeGreaterThanOrEqual;
	}

	public void setTypeLessThanOrEqual(Integer typeLessThanOrEqual) {
		this.typeLessThanOrEqual = typeLessThanOrEqual;
	}

	public void setTypes(List<Integer> types) {
		this.types = types;
	}

	public TreedotQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public TreedotQuery sysmenuid(String sysmenuid) {
		if (sysmenuid == null) {
			throw new RuntimeException("sysmenuid is null");
		}
		this.sysmenuid = sysmenuid;
		return this;
	}

	public TreedotQuery sysmenuidLike(String sysmenuidLike) {
		if (sysmenuidLike == null) {
			throw new RuntimeException("sysmenuid is null");
		}
		this.sysmenuidLike = sysmenuidLike;
		return this;
	}

	public TreedotQuery sysmenuids(List<String> sysmenuids) {
		if (sysmenuids == null) {
			throw new RuntimeException("sysmenuids is empty ");
		}
		this.sysmenuids = sysmenuids;
		return this;
	}

	public TreedotQuery type(Integer type) {
		if (type == null) {
			throw new RuntimeException("type is null");
		}
		this.type = type;
		return this;
	}

	public TreedotQuery typeGreaterThanOrEqual(Integer typeGreaterThanOrEqual) {
		if (typeGreaterThanOrEqual == null) {
			throw new RuntimeException("type is null");
		}
		this.typeGreaterThanOrEqual = typeGreaterThanOrEqual;
		return this;
	}

	public TreedotQuery typeLessThanOrEqual(Integer typeLessThanOrEqual) {
		if (typeLessThanOrEqual == null) {
			throw new RuntimeException("type is null");
		}
		this.typeLessThanOrEqual = typeLessThanOrEqual;
		return this;
	}

	public TreedotQuery types(List<Integer> types) {
		if (types == null) {
			throw new RuntimeException("types is empty ");
		}
		this.types = types;
		return this;
	}

}