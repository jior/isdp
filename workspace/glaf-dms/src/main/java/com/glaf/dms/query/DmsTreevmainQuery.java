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
public class DmsTreevmainQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected List<String> ids;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String indexName;
	protected String indexNameLike;
	protected List<String> indexNames;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String num;
	protected String numLike;
	protected List<String> nums;
	protected String filenum;
	protected String filenumLike;
	protected List<String> filenums;
	protected String content;
	protected String contentLike;
	protected List<String> contents;
	protected String vflag;
	protected String vflagLike;
	protected List<String> vflags;
	protected String sindexName;
	protected String sindexNameLike;
	protected List<String> sindexNames;
	protected Integer ztype;
	protected Integer ztypeGreaterThanOrEqual;
	protected Integer ztypeLessThanOrEqual;
	protected List<Integer> ztypes;
	protected String content2;
	protected String content2Like;
	protected List<String> content2s;
	protected String topnode;
	protected String topnodeLike;
	protected List<String> topnodes;
	protected Integer nodeico;
	protected Integer nodeicoGreaterThanOrEqual;
	protected Integer nodeicoLessThanOrEqual;
	protected List<Integer> nodeicos;
	protected Integer intendofshow;
	protected Integer intendofshowGreaterThanOrEqual;
	protected Integer intendofshowLessThanOrEqual;
	protected List<Integer> intendofshows;
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

	public DmsTreevmainQuery() {

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

	public String getNum() {
		return num;
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

	public String getContent() {
		return content;
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

	public String getVflag() {
		return vflag;
	}

	public String getVflagLike() {
		if (vflagLike != null && vflagLike.trim().length() > 0) {
			if (!vflagLike.startsWith("%")) {
				vflagLike = "%" + vflagLike;
			}
			if (!vflagLike.endsWith("%")) {
				vflagLike = vflagLike + "%";
			}
		}
		return vflagLike;
	}

	public List<String> getVflags() {
		return vflags;
	}

	public String getSindexName() {
		return sindexName;
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

	public List<String> getSindexNames() {
		return sindexNames;
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

	public String getContent2() {
		return content2;
	}

	public String getContent2Like() {
		if (content2Like != null && content2Like.trim().length() > 0) {
			if (!content2Like.startsWith("%")) {
				content2Like = "%" + content2Like;
			}
			if (!content2Like.endsWith("%")) {
				content2Like = content2Like + "%";
			}
		}
		return content2Like;
	}

	public List<String> getContent2s() {
		return content2s;
	}

	public String getTopnode() {
		return topnode;
	}

	public String getTopnodeLike() {
		if (topnodeLike != null && topnodeLike.trim().length() > 0) {
			if (!topnodeLike.startsWith("%")) {
				topnodeLike = "%" + topnodeLike;
			}
			if (!topnodeLike.endsWith("%")) {
				topnodeLike = topnodeLike + "%";
			}
		}
		return topnodeLike;
	}

	public List<String> getTopnodes() {
		return topnodes;
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

	public Integer getIntendofshow() {
		return intendofshow;
	}

	public Integer getIntendofshowGreaterThanOrEqual() {
		return intendofshowGreaterThanOrEqual;
	}

	public Integer getIntendofshowLessThanOrEqual() {
		return intendofshowLessThanOrEqual;
	}

	public List<Integer> getIntendofshows() {
		return intendofshows;
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

	public void setNum(String num) {
		this.num = num;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setNums(List<String> nums) {
		this.nums = nums;
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

	public void setContent(String content) {
		this.content = content;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public void setVflag(String vflag) {
		this.vflag = vflag;
	}

	public void setVflagLike(String vflagLike) {
		this.vflagLike = vflagLike;
	}

	public void setVflags(List<String> vflags) {
		this.vflags = vflags;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setSindexNameLike(String sindexNameLike) {
		this.sindexNameLike = sindexNameLike;
	}

	public void setSindexNames(List<String> sindexNames) {
		this.sindexNames = sindexNames;
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

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public void setContent2Like(String content2Like) {
		this.content2Like = content2Like;
	}

	public void setContent2s(List<String> content2s) {
		this.content2s = content2s;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTopnodeLike(String topnodeLike) {
		this.topnodeLike = topnodeLike;
	}

	public void setTopnodes(List<String> topnodes) {
		this.topnodes = topnodes;
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

	public void setIntendofshow(Integer intendofshow) {
		this.intendofshow = intendofshow;
	}

	public void setIntendofshowGreaterThanOrEqual(
			Integer intendofshowGreaterThanOrEqual) {
		this.intendofshowGreaterThanOrEqual = intendofshowGreaterThanOrEqual;
	}

	public void setIntendofshowLessThanOrEqual(
			Integer intendofshowLessThanOrEqual) {
		this.intendofshowLessThanOrEqual = intendofshowLessThanOrEqual;
	}

	public void setIntendofshows(List<Integer> intendofshows) {
		this.intendofshows = intendofshows;
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

	public DmsTreevmainQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public DmsTreevmainQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	public DmsTreevmainQuery indexName(String indexName) {
		if (indexName == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexName = indexName;
		return this;
	}

	public DmsTreevmainQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	public DmsTreevmainQuery indexNames(List<String> indexNames) {
		if (indexNames == null) {
			throw new RuntimeException("indexNames is empty ");
		}
		this.indexNames = indexNames;
		return this;
	}

	public DmsTreevmainQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public DmsTreevmainQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery nlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public DmsTreevmainQuery num(String num) {
		if (num == null) {
			throw new RuntimeException("num is null");
		}
		this.num = num;
		return this;
	}

	public DmsTreevmainQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public DmsTreevmainQuery nums(List<String> nums) {
		if (nums == null) {
			throw new RuntimeException("nums is empty ");
		}
		this.nums = nums;
		return this;
	}

	public DmsTreevmainQuery filenum(String filenum) {
		if (filenum == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenum = filenum;
		return this;
	}

	public DmsTreevmainQuery filenumLike(String filenumLike) {
		if (filenumLike == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumLike = filenumLike;
		return this;
	}

	public DmsTreevmainQuery filenums(List<String> filenums) {
		if (filenums == null) {
			throw new RuntimeException("filenums is empty ");
		}
		this.filenums = filenums;
		return this;
	}

	public DmsTreevmainQuery content(String content) {
		if (content == null) {
			throw new RuntimeException("content is null");
		}
		this.content = content;
		return this;
	}

	public DmsTreevmainQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public DmsTreevmainQuery contents(List<String> contents) {
		if (contents == null) {
			throw new RuntimeException("contents is empty ");
		}
		this.contents = contents;
		return this;
	}

	public DmsTreevmainQuery vflag(String vflag) {
		if (vflag == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflag = vflag;
		return this;
	}

	public DmsTreevmainQuery vflagLike(String vflagLike) {
		if (vflagLike == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflagLike = vflagLike;
		return this;
	}

	public DmsTreevmainQuery vflags(List<String> vflags) {
		if (vflags == null) {
			throw new RuntimeException("vflags is empty ");
		}
		this.vflags = vflags;
		return this;
	}

	public DmsTreevmainQuery sindexName(String sindexName) {
		if (sindexName == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexName = sindexName;
		return this;
	}

	public DmsTreevmainQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public DmsTreevmainQuery sindexNames(List<String> sindexNames) {
		if (sindexNames == null) {
			throw new RuntimeException("sindexNames is empty ");
		}
		this.sindexNames = sindexNames;
		return this;
	}

	public DmsTreevmainQuery ztype(Integer ztype) {
		if (ztype == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztype = ztype;
		return this;
	}

	public DmsTreevmainQuery ztypeGreaterThanOrEqual(
			Integer ztypeGreaterThanOrEqual) {
		if (ztypeGreaterThanOrEqual == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeGreaterThanOrEqual = ztypeGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery ztypeLessThanOrEqual(Integer ztypeLessThanOrEqual) {
		if (ztypeLessThanOrEqual == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeLessThanOrEqual = ztypeLessThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery ztypes(List<Integer> ztypes) {
		if (ztypes == null) {
			throw new RuntimeException("ztypes is empty ");
		}
		this.ztypes = ztypes;
		return this;
	}

	public DmsTreevmainQuery content2(String content2) {
		if (content2 == null) {
			throw new RuntimeException("content2 is null");
		}
		this.content2 = content2;
		return this;
	}

	public DmsTreevmainQuery content2Like(String content2Like) {
		if (content2Like == null) {
			throw new RuntimeException("content2 is null");
		}
		this.content2Like = content2Like;
		return this;
	}

	public DmsTreevmainQuery content2s(List<String> content2s) {
		if (content2s == null) {
			throw new RuntimeException("content2s is empty ");
		}
		this.content2s = content2s;
		return this;
	}

	public DmsTreevmainQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public DmsTreevmainQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public DmsTreevmainQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public DmsTreevmainQuery nodeico(Integer nodeico) {
		if (nodeico == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeico = nodeico;
		return this;
	}

	public DmsTreevmainQuery nodeicoGreaterThanOrEqual(
			Integer nodeicoGreaterThanOrEqual) {
		if (nodeicoGreaterThanOrEqual == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeicoGreaterThanOrEqual = nodeicoGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery nodeicoLessThanOrEqual(
			Integer nodeicoLessThanOrEqual) {
		if (nodeicoLessThanOrEqual == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeicoLessThanOrEqual = nodeicoLessThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery nodeicos(List<Integer> nodeicos) {
		if (nodeicos == null) {
			throw new RuntimeException("nodeicos is empty ");
		}
		this.nodeicos = nodeicos;
		return this;
	}

	public DmsTreevmainQuery intendofshow(Integer intendofshow) {
		if (intendofshow == null) {
			throw new RuntimeException("intendofshow is null");
		}
		this.intendofshow = intendofshow;
		return this;
	}

	public DmsTreevmainQuery intendofshowGreaterThanOrEqual(
			Integer intendofshowGreaterThanOrEqual) {
		if (intendofshowGreaterThanOrEqual == null) {
			throw new RuntimeException("intendofshow is null");
		}
		this.intendofshowGreaterThanOrEqual = intendofshowGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery intendofshowLessThanOrEqual(
			Integer intendofshowLessThanOrEqual) {
		if (intendofshowLessThanOrEqual == null) {
			throw new RuntimeException("intendofshow is null");
		}
		this.intendofshowLessThanOrEqual = intendofshowLessThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery intendofshows(List<Integer> intendofshows) {
		if (intendofshows == null) {
			throw new RuntimeException("intendofshows is empty ");
		}
		this.intendofshows = intendofshows;
		return this;
	}

	public DmsTreevmainQuery choosePublishFlag(String choosePublishFlag) {
		if (choosePublishFlag == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlag = choosePublishFlag;
		return this;
	}

	public DmsTreevmainQuery choosePublishFlagLike(String choosePublishFlagLike) {
		if (choosePublishFlagLike == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlagLike = choosePublishFlagLike;
		return this;
	}

	public DmsTreevmainQuery choosePublishFlags(List<String> choosePublishFlags) {
		if (choosePublishFlags == null) {
			throw new RuntimeException("choosePublishFlags is empty ");
		}
		this.choosePublishFlags = choosePublishFlags;
		return this;
	}

	public DmsTreevmainQuery choosePublishTime(Long choosePublishTime) {
		if (choosePublishTime == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTime = choosePublishTime;
		return this;
	}

	public DmsTreevmainQuery choosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		if (choosePublishTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery choosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		if (choosePublishTimeLessThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery choosePublishTimes(List<Long> choosePublishTimes) {
		if (choosePublishTimes == null) {
			throw new RuntimeException("choosePublishTimes is empty ");
		}
		this.choosePublishTimes = choosePublishTimes;
		return this;
	}

	public DmsTreevmainQuery publishdiskid(Integer publishdiskid) {
		if (publishdiskid == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskid = publishdiskid;
		return this;
	}

	public DmsTreevmainQuery publishdiskidGreaterThanOrEqual(
			Integer publishdiskidGreaterThanOrEqual) {
		if (publishdiskidGreaterThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidGreaterThanOrEqual = publishdiskidGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery publishdiskidLessThanOrEqual(
			Integer publishdiskidLessThanOrEqual) {
		if (publishdiskidLessThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidLessThanOrEqual = publishdiskidLessThanOrEqual;
		return this;
	}

	public DmsTreevmainQuery publishdiskids(List<Integer> publishdiskids) {
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

			if ("indexId".equals(sortColumn)) {
				orderBy = "E.INDEX_ID" + a_x;
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

			if ("num".equals(sortColumn)) {
				orderBy = "E.NUM" + a_x;
			}

			if ("filenum".equals(sortColumn)) {
				orderBy = "E.FILENUM" + a_x;
			}

			if ("content".equals(sortColumn)) {
				orderBy = "E.CONTENT" + a_x;
			}

			if ("vflag".equals(sortColumn)) {
				orderBy = "E.VFLAG" + a_x;
			}

			if ("sindexName".equals(sortColumn)) {
				orderBy = "E.SINDEX_NAME" + a_x;
			}

			if ("ztype".equals(sortColumn)) {
				orderBy = "E.ZTYPE" + a_x;
			}

			if ("content2".equals(sortColumn)) {
				orderBy = "E.CONTENT2" + a_x;
			}

			if ("topnode".equals(sortColumn)) {
				orderBy = "E.TOPNODE" + a_x;
			}

			if ("nodeico".equals(sortColumn)) {
				orderBy = "E.NODEICO" + a_x;
			}

			if ("intendofshow".equals(sortColumn)) {
				orderBy = "E.INTENDOFSHOW" + a_x;
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
		addColumn("id", "ID");
		addColumn("indexId", "INDEX_ID");
		addColumn("parentId", "PARENT_ID");
		addColumn("indexName", "INDEX_NAME");
		addColumn("nlevel", "NLEVEL");
		addColumn("num", "NUM");
		addColumn("filenum", "FILENUM");
		addColumn("content", "CONTENT");
		addColumn("vflag", "VFLAG");
		addColumn("sindexName", "SINDEX_NAME");
		addColumn("ztype", "ZTYPE");
		addColumn("content2", "CONTENT2");
		addColumn("topnode", "TOPNODE");
		addColumn("nodeico", "NODEICO");
		addColumn("intendofshow", "INTENDOFSHOW");
		addColumn("choosePublishFlag", "CHOOSEPUBLISHFLAG");
		addColumn("choosePublishTime", "CHOOSEPUBLISHTIME");
		addColumn("publishdiskid", "PUBLISHDISKID");
	}

}