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

package com.glaf.dms.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

/**
 * 
 * 查询类
 * 
 */
public class DmsTreevmainCommQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected List<Integer> indexIds;
	protected String id;
	protected String idLike;
	protected List<String> ids;
	protected String indexName;
	protected String indexNameLike;
	protected List<String> indexNames;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected Integer nodetype;
	protected Integer nodetypeGreaterThanOrEqual;
	protected Integer nodetypeLessThanOrEqual;
	protected List<Integer> nodetypes;
	protected Integer fromid;
	protected Integer fromidGreaterThanOrEqual;
	protected Integer fromidLessThanOrEqual;
	protected List<Integer> fromids;
	protected Integer nodeico;
	protected Integer nodeicoGreaterThanOrEqual;
	protected Integer nodeicoLessThanOrEqual;
	protected List<Integer> nodeicos;
	protected Integer listno;
	protected Integer listnoGreaterThanOrEqual;
	protected Integer listnoLessThanOrEqual;
	protected List<Integer> listnos;
	protected String choosePublishFlag;
	protected String choosePublishFlagLike;
	protected List<String> choosePublishFlags;
	protected Long choosePublishTime;
	protected Long choosePublishTimeGreaterThanOrEqual;
	protected Long choosePublishTimeLessThanOrEqual;
	protected List<Long> choosePublishTimes;
	protected Integer publishdiskid;
	protected Integer publishdiskidGreaterThanOrEqual;
	protected Integer publishdiskidLessThanOrEqual;
	protected List<Integer> publishdiskids;

	public DmsTreevmainCommQuery() {

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

	public String getIndexName() {
		return indexName;
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

	public List<String> getIndexNames() {
		return indexNames;
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

	public Integer getNodetype() {
		return nodetype;
	}

	public Integer getNodetypeGreaterThanOrEqual() {
		return nodetypeGreaterThanOrEqual;
	}

	public Integer getNodetypeLessThanOrEqual() {
		return nodetypeLessThanOrEqual;
	}

	public List<Integer> getNodetypes() {
		return nodetypes;
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

	public Integer getNodeico() {
		return nodeico;
	}

	public Integer getNodeicoGreaterThanOrEqual() {
		return nodeicoGreaterThanOrEqual;
	}

	public Integer getNodeicoLessThanOrEqual() {
		return nodeicoLessThanOrEqual;
	}

	public List<Integer> getNodeicos() {
		return nodeicos;
	}

	public Integer getListno() {
		return listno;
	}

	public Integer getListnoGreaterThanOrEqual() {
		return listnoGreaterThanOrEqual;
	}

	public Integer getListnoLessThanOrEqual() {
		return listnoLessThanOrEqual;
	}

	public List<Integer> getListnos() {
		return listnos;
	}

	public String getChoosePublishFlag() {
		return choosePublishFlag;
	}

	public String getChoosePublishFlagLike() {
		if (choosePublishFlagLike != null
				&& choosePublishFlagLike.trim().length() > 0) {
			if (!choosePublishFlagLike.startsWith("%")) {
				choosePublishFlagLike = "%" + choosePublishFlagLike;
			}
			if (!choosePublishFlagLike.endsWith("%")) {
				choosePublishFlagLike = choosePublishFlagLike + "%";
			}
		}
		return choosePublishFlagLike;
	}

	public List<String> getChoosePublishFlags() {
		return choosePublishFlags;
	}

	public Long getChoosePublishTime() {
		return choosePublishTime;
	}

	public Long getChoosePublishTimeGreaterThanOrEqual() {
		return choosePublishTimeGreaterThanOrEqual;
	}

	public Long getChoosePublishTimeLessThanOrEqual() {
		return choosePublishTimeLessThanOrEqual;
	}

	public List<Long> getChoosePublishTimes() {
		return choosePublishTimes;
	}

	public Integer getPublishdiskid() {
		return publishdiskid;
	}

	public Integer getPublishdiskidGreaterThanOrEqual() {
		return publishdiskidGreaterThanOrEqual;
	}

	public Integer getPublishdiskidLessThanOrEqual() {
		return publishdiskidLessThanOrEqual;
	}

	public List<Integer> getPublishdiskids() {
		return publishdiskids;
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

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void setIndexNameLike(String indexNameLike) {
		this.indexNameLike = indexNameLike;
	}

	public void setIndexNames(List<String> indexNames) {
		this.indexNames = indexNames;
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

	public void setNodetype(Integer nodetype) {
		this.nodetype = nodetype;
	}

	public void setNodetypeGreaterThanOrEqual(Integer nodetypeGreaterThanOrEqual) {
		this.nodetypeGreaterThanOrEqual = nodetypeGreaterThanOrEqual;
	}

	public void setNodetypeLessThanOrEqual(Integer nodetypeLessThanOrEqual) {
		this.nodetypeLessThanOrEqual = nodetypeLessThanOrEqual;
	}

	public void setNodetypes(List<Integer> nodetypes) {
		this.nodetypes = nodetypes;
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

	public void setNodeico(Integer nodeico) {
		this.nodeico = nodeico;
	}

	public void setNodeicoGreaterThanOrEqual(Integer nodeicoGreaterThanOrEqual) {
		this.nodeicoGreaterThanOrEqual = nodeicoGreaterThanOrEqual;
	}

	public void setNodeicoLessThanOrEqual(Integer nodeicoLessThanOrEqual) {
		this.nodeicoLessThanOrEqual = nodeicoLessThanOrEqual;
	}

	public void setNodeicos(List<Integer> nodeicos) {
		this.nodeicos = nodeicos;
	}

	public void setListno(Integer listno) {
		this.listno = listno;
	}

	public void setListnoGreaterThanOrEqual(Integer listnoGreaterThanOrEqual) {
		this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
	}

	public void setListnoLessThanOrEqual(Integer listnoLessThanOrEqual) {
		this.listnoLessThanOrEqual = listnoLessThanOrEqual;
	}

	public void setListnos(List<Integer> listnos) {
		this.listnos = listnos;
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishFlagLike(String choosePublishFlagLike) {
		this.choosePublishFlagLike = choosePublishFlagLike;
	}

	public void setChoosePublishFlags(List<String> choosePublishFlags) {
		this.choosePublishFlags = choosePublishFlags;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setChoosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
	}

	public void setChoosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
	}

	public void setChoosePublishTimes(List<Long> choosePublishTimes) {
		this.choosePublishTimes = choosePublishTimes;
	}

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
	}

	public void setPublishdiskidGreaterThanOrEqual(
			Integer publishdiskidGreaterThanOrEqual) {
		this.publishdiskidGreaterThanOrEqual = publishdiskidGreaterThanOrEqual;
	}

	public void setPublishdiskidLessThanOrEqual(
			Integer publishdiskidLessThanOrEqual) {
		this.publishdiskidLessThanOrEqual = publishdiskidLessThanOrEqual;
	}

	public void setPublishdiskids(List<Integer> publishdiskids) {
		this.publishdiskids = publishdiskids;
	}

	public DmsTreevmainCommQuery id(String id) {
		if (id == null) {
			throw new RuntimeException("id is null");
		}
		this.id = id;
		return this;
	}

	public DmsTreevmainCommQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public DmsTreevmainCommQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public DmsTreevmainCommQuery indexName(String indexName) {
		if (indexName == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexName = indexName;
		return this;
	}

	public DmsTreevmainCommQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	public DmsTreevmainCommQuery indexNames(List<String> indexNames) {
		if (indexNames == null) {
			throw new RuntimeException("indexNames is empty ");
		}
		this.indexNames = indexNames;
		return this;
	}

	public DmsTreevmainCommQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public DmsTreevmainCommQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery nlevelLessThanOrEqual(
			Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public DmsTreevmainCommQuery nodetype(Integer nodetype) {
		if (nodetype == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetype = nodetype;
		return this;
	}

	public DmsTreevmainCommQuery nodetypeGreaterThanOrEqual(
			Integer nodetypeGreaterThanOrEqual) {
		if (nodetypeGreaterThanOrEqual == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetypeGreaterThanOrEqual = nodetypeGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery nodetypeLessThanOrEqual(
			Integer nodetypeLessThanOrEqual) {
		if (nodetypeLessThanOrEqual == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetypeLessThanOrEqual = nodetypeLessThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery nodetypes(List<Integer> nodetypes) {
		if (nodetypes == null) {
			throw new RuntimeException("nodetypes is empty ");
		}
		this.nodetypes = nodetypes;
		return this;
	}

	public DmsTreevmainCommQuery fromid(Integer fromid) {
		if (fromid == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromid = fromid;
		return this;
	}

	public DmsTreevmainCommQuery fromidGreaterThanOrEqual(
			Integer fromidGreaterThanOrEqual) {
		if (fromidGreaterThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidGreaterThanOrEqual = fromidGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery fromidLessThanOrEqual(
			Integer fromidLessThanOrEqual) {
		if (fromidLessThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidLessThanOrEqual = fromidLessThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery fromids(List<Integer> fromids) {
		if (fromids == null) {
			throw new RuntimeException("fromids is empty ");
		}
		this.fromids = fromids;
		return this;
	}

	public DmsTreevmainCommQuery nodeico(Integer nodeico) {
		if (nodeico == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeico = nodeico;
		return this;
	}

	public DmsTreevmainCommQuery nodeicoGreaterThanOrEqual(
			Integer nodeicoGreaterThanOrEqual) {
		if (nodeicoGreaterThanOrEqual == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeicoGreaterThanOrEqual = nodeicoGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery nodeicoLessThanOrEqual(
			Integer nodeicoLessThanOrEqual) {
		if (nodeicoLessThanOrEqual == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeicoLessThanOrEqual = nodeicoLessThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery nodeicos(List<Integer> nodeicos) {
		if (nodeicos == null) {
			throw new RuntimeException("nodeicos is empty ");
		}
		this.nodeicos = nodeicos;
		return this;
	}

	public DmsTreevmainCommQuery listno(Integer listno) {
		if (listno == null) {
			throw new RuntimeException("listno is null");
		}
		this.listno = listno;
		return this;
	}

	public DmsTreevmainCommQuery listnoGreaterThanOrEqual(
			Integer listnoGreaterThanOrEqual) {
		if (listnoGreaterThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery listnoLessThanOrEqual(
			Integer listnoLessThanOrEqual) {
		if (listnoLessThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoLessThanOrEqual = listnoLessThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery listnos(List<Integer> listnos) {
		if (listnos == null) {
			throw new RuntimeException("listnos is empty ");
		}
		this.listnos = listnos;
		return this;
	}

	public DmsTreevmainCommQuery choosePublishFlag(String choosePublishFlag) {
		if (choosePublishFlag == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlag = choosePublishFlag;
		return this;
	}

	public DmsTreevmainCommQuery choosePublishFlagLike(
			String choosePublishFlagLike) {
		if (choosePublishFlagLike == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlagLike = choosePublishFlagLike;
		return this;
	}

	public DmsTreevmainCommQuery choosePublishFlags(
			List<String> choosePublishFlags) {
		if (choosePublishFlags == null) {
			throw new RuntimeException("choosePublishFlags is empty ");
		}
		this.choosePublishFlags = choosePublishFlags;
		return this;
	}

	public DmsTreevmainCommQuery choosePublishTime(Long choosePublishTime) {
		if (choosePublishTime == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTime = choosePublishTime;
		return this;
	}

	public DmsTreevmainCommQuery choosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		if (choosePublishTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery choosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		if (choosePublishTimeLessThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery choosePublishTimes(
			List<Long> choosePublishTimes) {
		if (choosePublishTimes == null) {
			throw new RuntimeException("choosePublishTimes is empty ");
		}
		this.choosePublishTimes = choosePublishTimes;
		return this;
	}

	public DmsTreevmainCommQuery publishdiskid(Integer publishdiskid) {
		if (publishdiskid == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskid = publishdiskid;
		return this;
	}

	public DmsTreevmainCommQuery publishdiskidGreaterThanOrEqual(
			Integer publishdiskidGreaterThanOrEqual) {
		if (publishdiskidGreaterThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidGreaterThanOrEqual = publishdiskidGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery publishdiskidLessThanOrEqual(
			Integer publishdiskidLessThanOrEqual) {
		if (publishdiskidLessThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidLessThanOrEqual = publishdiskidLessThanOrEqual;
		return this;
	}

	public DmsTreevmainCommQuery publishdiskids(List<Integer> publishdiskids) {
		if (publishdiskids == null) {
			throw new RuntimeException("publishdiskids is empty ");
		}
		this.publishdiskids = publishdiskids;
		return this;
	}

	public String getOrderBy() {
		if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

			if ("id".equals(sortColumn)) {
				orderBy = "E.ID" + a_x;
			}

			if ("parentId".equals(sortColumn)) {
				orderBy = "E.PARENT_ID" + a_x;
			}

			if ("indexName".equals(sortColumn)) {
				orderBy = "E.INDEX_NAME" + a_x;
			}

			if ("nlevel".equals(sortColumn)) {
				orderBy = "E.NLEVEL" + a_x;
			}

			if ("nodetype".equals(sortColumn)) {
				orderBy = "E.NODETYPE" + a_x;
			}

			if ("fromid".equals(sortColumn)) {
				orderBy = "E.FROMID" + a_x;
			}

			if ("nodeico".equals(sortColumn)) {
				orderBy = "E.NODEICO" + a_x;
			}

			if ("listno".equals(sortColumn)) {
				orderBy = "E.LISTNO" + a_x;
			}

			if ("choosePublishFlag".equals(sortColumn)) {
				orderBy = "E.CHOOSEPUBLISHFLAG" + a_x;
			}

			if ("choosePublishTime".equals(sortColumn)) {
				orderBy = "E.CHOOSEPUBLISHTIME" + a_x;
			}

			if ("publishdiskid".equals(sortColumn)) {
				orderBy = "E.PUBLISHDISKID" + a_x;
			}

		}
		return orderBy;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("indexId", "INDEX_ID");
		addColumn("id", "ID");
		addColumn("parentId", "PARENT_ID");
		addColumn("indexName", "INDEX_NAME");
		addColumn("nlevel", "NLEVEL");
		addColumn("nodetype", "NODETYPE");
		addColumn("fromid", "FROMID");
		addColumn("nodeico", "NODEICO");
		addColumn("listno", "LISTNO");
		addColumn("choosePublishFlag", "CHOOSEPUBLISHFLAG");
		addColumn("choosePublishTime", "CHOOSEPUBLISHTIME");
		addColumn("publishdiskid", "PUBLISHDISKID");
	}

}