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
public class DmsTreevmainUserQuery extends DataQuery {
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
	protected String nodetype;
	protected String nodetypeLike;
	protected List<String> nodetypes;
	protected Integer fromid;
	protected Integer fromidGreaterThanOrEqual;
	protected Integer fromidLessThanOrEqual;
	protected List<Integer> fromids;
	protected Integer listno;
	protected Integer listnoGreaterThanOrEqual;
	protected Integer listnoLessThanOrEqual;
	protected List<Integer> listnos;
	protected Integer frmtypeindex;
	protected Integer frmtypeindexGreaterThanOrEqual;
	protected Integer frmtypeindexLessThanOrEqual;
	protected List<Integer> frmtypeindexs;
	protected Integer showid;
	protected Integer showidGreaterThanOrEqual;
	protected Integer showidLessThanOrEqual;
	protected List<Integer> showids;
	protected String showfrmid;
	protected String showfrmidLike;
	protected List<String> showfrmids;
	protected Integer showfrmindexId;
	protected Integer showfrmindexIdGreaterThanOrEqual;
	protected Integer showfrmindexIdLessThanOrEqual;
	protected List<Integer> showfrmindexIds;
	protected Integer dwid;
	protected Integer dwidGreaterThanOrEqual;
	protected Integer dwidLessThanOrEqual;
	protected List<Integer> dwids;
	protected String jid;
	protected String jidLike;
	protected List<String> jids;
	protected String flid;
	protected String flidLike;
	protected List<String> flids;
	protected String ctypeId;
	protected String ctypeIdLike;
	protected List<String> ctypeIds;
	protected Integer commIndex;
	protected Integer commIndexGreaterThanOrEqual;
	protected Integer commIndexLessThanOrEqual;
	protected List<Integer> commIndexs;
	protected Integer baseIndex;
	protected Integer baseIndexGreaterThanOrEqual;
	protected Integer baseIndexLessThanOrEqual;
	protected List<Integer> baseIndexs;
	protected Integer commListno;
	protected Integer commListnoGreaterThanOrEqual;
	protected Integer commListnoLessThanOrEqual;
	protected List<Integer> commListnos;
	protected Integer projListno;
	protected Integer projListnoGreaterThanOrEqual;
	protected Integer projListnoLessThanOrEqual;
	protected List<Integer> projListnos;
	protected Integer intnoshow;
	protected Integer intnoshowGreaterThanOrEqual;
	protected Integer intnoshowLessThanOrEqual;
	protected List<Integer> intnoshows;
	protected Integer projParent;
	protected Integer projParentGreaterThanOrEqual;
	protected Integer projParentLessThanOrEqual;
	protected List<Integer> projParents;
	protected String treeDliststr;
	protected String treeDliststrLike;
	protected List<String> treeDliststrs;
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

	public DmsTreevmainUserQuery() {

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

	public String getNodetype() {
		return nodetype;
	}

	public String getNodetypeLike() {
		if (nodetypeLike != null && nodetypeLike.trim().length() > 0) {
			if (!nodetypeLike.startsWith("%")) {
				nodetypeLike = "%" + nodetypeLike;
			}
			if (!nodetypeLike.endsWith("%")) {
				nodetypeLike = nodetypeLike + "%";
			}
		}
		return nodetypeLike;
	}

	public List<String> getNodetypes() {
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

	public Integer getFrmtypeindex() {
		return frmtypeindex;
	}

	public Integer getFrmtypeindexGreaterThanOrEqual() {
		return frmtypeindexGreaterThanOrEqual;
	}

	public Integer getFrmtypeindexLessThanOrEqual() {
		return frmtypeindexLessThanOrEqual;
	}

	public List<Integer> getFrmtypeindexs() {
		return frmtypeindexs;
	}

	public Integer getShowid() {
		return showid;
	}

	public Integer getShowidGreaterThanOrEqual() {
		return showidGreaterThanOrEqual;
	}

	public Integer getShowidLessThanOrEqual() {
		return showidLessThanOrEqual;
	}

	public List<Integer> getShowids() {
		return showids;
	}

	public String getShowfrmid() {
		return showfrmid;
	}

	public String getShowfrmidLike() {
		if (showfrmidLike != null && showfrmidLike.trim().length() > 0) {
			if (!showfrmidLike.startsWith("%")) {
				showfrmidLike = "%" + showfrmidLike;
			}
			if (!showfrmidLike.endsWith("%")) {
				showfrmidLike = showfrmidLike + "%";
			}
		}
		return showfrmidLike;
	}

	public List<String> getShowfrmids() {
		return showfrmids;
	}

	public Integer getShowfrmindexId() {
		return showfrmindexId;
	}

	public Integer getShowfrmindexIdGreaterThanOrEqual() {
		return showfrmindexIdGreaterThanOrEqual;
	}

	public Integer getShowfrmindexIdLessThanOrEqual() {
		return showfrmindexIdLessThanOrEqual;
	}

	public List<Integer> getShowfrmindexIds() {
		return showfrmindexIds;
	}

	public Integer getDwid() {
		return dwid;
	}

	public Integer getDwidGreaterThanOrEqual() {
		return dwidGreaterThanOrEqual;
	}

	public Integer getDwidLessThanOrEqual() {
		return dwidLessThanOrEqual;
	}

	public List<Integer> getDwids() {
		return dwids;
	}

	public String getJid() {
		return jid;
	}

	public String getJidLike() {
		if (jidLike != null && jidLike.trim().length() > 0) {
			if (!jidLike.startsWith("%")) {
				jidLike = "%" + jidLike;
			}
			if (!jidLike.endsWith("%")) {
				jidLike = jidLike + "%";
			}
		}
		return jidLike;
	}

	public List<String> getJids() {
		return jids;
	}

	public String getFlid() {
		return flid;
	}

	public String getFlidLike() {
		if (flidLike != null && flidLike.trim().length() > 0) {
			if (!flidLike.startsWith("%")) {
				flidLike = "%" + flidLike;
			}
			if (!flidLike.endsWith("%")) {
				flidLike = flidLike + "%";
			}
		}
		return flidLike;
	}

	public List<String> getFlids() {
		return flids;
	}

	public String getCtypeId() {
		return ctypeId;
	}

	public String getCtypeIdLike() {
		if (ctypeIdLike != null && ctypeIdLike.trim().length() > 0) {
			if (!ctypeIdLike.startsWith("%")) {
				ctypeIdLike = "%" + ctypeIdLike;
			}
			if (!ctypeIdLike.endsWith("%")) {
				ctypeIdLike = ctypeIdLike + "%";
			}
		}
		return ctypeIdLike;
	}

	public List<String> getCtypeIds() {
		return ctypeIds;
	}

	public Integer getCommIndex() {
		return commIndex;
	}

	public Integer getCommIndexGreaterThanOrEqual() {
		return commIndexGreaterThanOrEqual;
	}

	public Integer getCommIndexLessThanOrEqual() {
		return commIndexLessThanOrEqual;
	}

	public List<Integer> getCommIndexs() {
		return commIndexs;
	}

	public Integer getBaseIndex() {
		return baseIndex;
	}

	public Integer getBaseIndexGreaterThanOrEqual() {
		return baseIndexGreaterThanOrEqual;
	}

	public Integer getBaseIndexLessThanOrEqual() {
		return baseIndexLessThanOrEqual;
	}

	public List<Integer> getBaseIndexs() {
		return baseIndexs;
	}

	public Integer getCommListno() {
		return commListno;
	}

	public Integer getCommListnoGreaterThanOrEqual() {
		return commListnoGreaterThanOrEqual;
	}

	public Integer getCommListnoLessThanOrEqual() {
		return commListnoLessThanOrEqual;
	}

	public List<Integer> getCommListnos() {
		return commListnos;
	}

	public Integer getProjListno() {
		return projListno;
	}

	public Integer getProjListnoGreaterThanOrEqual() {
		return projListnoGreaterThanOrEqual;
	}

	public Integer getProjListnoLessThanOrEqual() {
		return projListnoLessThanOrEqual;
	}

	public List<Integer> getProjListnos() {
		return projListnos;
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

	public Integer getProjParent() {
		return projParent;
	}

	public Integer getProjParentGreaterThanOrEqual() {
		return projParentGreaterThanOrEqual;
	}

	public Integer getProjParentLessThanOrEqual() {
		return projParentLessThanOrEqual;
	}

	public List<Integer> getProjParents() {
		return projParents;
	}

	public String getTreeDliststr() {
		return treeDliststr;
	}

	public String getTreeDliststrLike() {
		if (treeDliststrLike != null && treeDliststrLike.trim().length() > 0) {
			if (!treeDliststrLike.startsWith("%")) {
				treeDliststrLike = "%" + treeDliststrLike;
			}
			if (!treeDliststrLike.endsWith("%")) {
				treeDliststrLike = treeDliststrLike + "%";
			}
		}
		return treeDliststrLike;
	}

	public List<String> getTreeDliststrs() {
		return treeDliststrs;
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

	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	public void setNodetypeLike(String nodetypeLike) {
		this.nodetypeLike = nodetypeLike;
	}

	public void setNodetypes(List<String> nodetypes) {
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

	public void setFrmtypeindex(Integer frmtypeindex) {
		this.frmtypeindex = frmtypeindex;
	}

	public void setFrmtypeindexGreaterThanOrEqual(
			Integer frmtypeindexGreaterThanOrEqual) {
		this.frmtypeindexGreaterThanOrEqual = frmtypeindexGreaterThanOrEqual;
	}

	public void setFrmtypeindexLessThanOrEqual(
			Integer frmtypeindexLessThanOrEqual) {
		this.frmtypeindexLessThanOrEqual = frmtypeindexLessThanOrEqual;
	}

	public void setFrmtypeindexs(List<Integer> frmtypeindexs) {
		this.frmtypeindexs = frmtypeindexs;
	}

	public void setShowid(Integer showid) {
		this.showid = showid;
	}

	public void setShowidGreaterThanOrEqual(Integer showidGreaterThanOrEqual) {
		this.showidGreaterThanOrEqual = showidGreaterThanOrEqual;
	}

	public void setShowidLessThanOrEqual(Integer showidLessThanOrEqual) {
		this.showidLessThanOrEqual = showidLessThanOrEqual;
	}

	public void setShowids(List<Integer> showids) {
		this.showids = showids;
	}

	public void setShowfrmid(String showfrmid) {
		this.showfrmid = showfrmid;
	}

	public void setShowfrmidLike(String showfrmidLike) {
		this.showfrmidLike = showfrmidLike;
	}

	public void setShowfrmids(List<String> showfrmids) {
		this.showfrmids = showfrmids;
	}

	public void setShowfrmindexId(Integer showfrmindexId) {
		this.showfrmindexId = showfrmindexId;
	}

	public void setShowfrmindexIdGreaterThanOrEqual(
			Integer showfrmindexIdGreaterThanOrEqual) {
		this.showfrmindexIdGreaterThanOrEqual = showfrmindexIdGreaterThanOrEqual;
	}

	public void setShowfrmindexIdLessThanOrEqual(
			Integer showfrmindexIdLessThanOrEqual) {
		this.showfrmindexIdLessThanOrEqual = showfrmindexIdLessThanOrEqual;
	}

	public void setShowfrmindexIds(List<Integer> showfrmindexIds) {
		this.showfrmindexIds = showfrmindexIds;
	}

	public void setDwid(Integer dwid) {
		this.dwid = dwid;
	}

	public void setDwidGreaterThanOrEqual(Integer dwidGreaterThanOrEqual) {
		this.dwidGreaterThanOrEqual = dwidGreaterThanOrEqual;
	}

	public void setDwidLessThanOrEqual(Integer dwidLessThanOrEqual) {
		this.dwidLessThanOrEqual = dwidLessThanOrEqual;
	}

	public void setDwids(List<Integer> dwids) {
		this.dwids = dwids;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	public void setJidLike(String jidLike) {
		this.jidLike = jidLike;
	}

	public void setJids(List<String> jids) {
		this.jids = jids;
	}

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFlidLike(String flidLike) {
		this.flidLike = flidLike;
	}

	public void setFlids(List<String> flids) {
		this.flids = flids;
	}

	public void setCtypeId(String ctypeId) {
		this.ctypeId = ctypeId;
	}

	public void setCtypeIdLike(String ctypeIdLike) {
		this.ctypeIdLike = ctypeIdLike;
	}

	public void setCtypeIds(List<String> ctypeIds) {
		this.ctypeIds = ctypeIds;
	}

	public void setCommIndex(Integer commIndex) {
		this.commIndex = commIndex;
	}

	public void setCommIndexGreaterThanOrEqual(
			Integer commIndexGreaterThanOrEqual) {
		this.commIndexGreaterThanOrEqual = commIndexGreaterThanOrEqual;
	}

	public void setCommIndexLessThanOrEqual(Integer commIndexLessThanOrEqual) {
		this.commIndexLessThanOrEqual = commIndexLessThanOrEqual;
	}

	public void setCommIndexs(List<Integer> commIndexs) {
		this.commIndexs = commIndexs;
	}

	public void setBaseIndex(Integer baseIndex) {
		this.baseIndex = baseIndex;
	}

	public void setBaseIndexGreaterThanOrEqual(
			Integer baseIndexGreaterThanOrEqual) {
		this.baseIndexGreaterThanOrEqual = baseIndexGreaterThanOrEqual;
	}

	public void setBaseIndexLessThanOrEqual(Integer baseIndexLessThanOrEqual) {
		this.baseIndexLessThanOrEqual = baseIndexLessThanOrEqual;
	}

	public void setBaseIndexs(List<Integer> baseIndexs) {
		this.baseIndexs = baseIndexs;
	}

	public void setCommListno(Integer commListno) {
		this.commListno = commListno;
	}

	public void setCommListnoGreaterThanOrEqual(
			Integer commListnoGreaterThanOrEqual) {
		this.commListnoGreaterThanOrEqual = commListnoGreaterThanOrEqual;
	}

	public void setCommListnoLessThanOrEqual(Integer commListnoLessThanOrEqual) {
		this.commListnoLessThanOrEqual = commListnoLessThanOrEqual;
	}

	public void setCommListnos(List<Integer> commListnos) {
		this.commListnos = commListnos;
	}

	public void setProjListno(Integer projListno) {
		this.projListno = projListno;
	}

	public void setProjListnoGreaterThanOrEqual(
			Integer projListnoGreaterThanOrEqual) {
		this.projListnoGreaterThanOrEqual = projListnoGreaterThanOrEqual;
	}

	public void setProjListnoLessThanOrEqual(Integer projListnoLessThanOrEqual) {
		this.projListnoLessThanOrEqual = projListnoLessThanOrEqual;
	}

	public void setProjListnos(List<Integer> projListnos) {
		this.projListnos = projListnos;
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

	public void setProjParent(Integer projParent) {
		this.projParent = projParent;
	}

	public void setProjParentGreaterThanOrEqual(
			Integer projParentGreaterThanOrEqual) {
		this.projParentGreaterThanOrEqual = projParentGreaterThanOrEqual;
	}

	public void setProjParentLessThanOrEqual(Integer projParentLessThanOrEqual) {
		this.projParentLessThanOrEqual = projParentLessThanOrEqual;
	}

	public void setProjParents(List<Integer> projParents) {
		this.projParents = projParents;
	}

	public void setTreeDliststr(String treeDliststr) {
		this.treeDliststr = treeDliststr;
	}

	public void setTreeDliststrLike(String treeDliststrLike) {
		this.treeDliststrLike = treeDliststrLike;
	}

	public void setTreeDliststrs(List<String> treeDliststrs) {
		this.treeDliststrs = treeDliststrs;
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

	public DmsTreevmainUserQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public DmsTreevmainUserQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	public DmsTreevmainUserQuery indexName(String indexName) {
		if (indexName == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexName = indexName;
		return this;
	}

	public DmsTreevmainUserQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	public DmsTreevmainUserQuery indexNames(List<String> indexNames) {
		if (indexNames == null) {
			throw new RuntimeException("indexNames is empty ");
		}
		this.indexNames = indexNames;
		return this;
	}

	public DmsTreevmainUserQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public DmsTreevmainUserQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery nlevelLessThanOrEqual(
			Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public DmsTreevmainUserQuery num(String num) {
		if (num == null) {
			throw new RuntimeException("num is null");
		}
		this.num = num;
		return this;
	}

	public DmsTreevmainUserQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public DmsTreevmainUserQuery nums(List<String> nums) {
		if (nums == null) {
			throw new RuntimeException("nums is empty ");
		}
		this.nums = nums;
		return this;
	}

	public DmsTreevmainUserQuery filenum(String filenum) {
		if (filenum == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenum = filenum;
		return this;
	}

	public DmsTreevmainUserQuery filenumLike(String filenumLike) {
		if (filenumLike == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumLike = filenumLike;
		return this;
	}

	public DmsTreevmainUserQuery filenums(List<String> filenums) {
		if (filenums == null) {
			throw new RuntimeException("filenums is empty ");
		}
		this.filenums = filenums;
		return this;
	}

	public DmsTreevmainUserQuery content(String content) {
		if (content == null) {
			throw new RuntimeException("content is null");
		}
		this.content = content;
		return this;
	}

	public DmsTreevmainUserQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public DmsTreevmainUserQuery contents(List<String> contents) {
		if (contents == null) {
			throw new RuntimeException("contents is empty ");
		}
		this.contents = contents;
		return this;
	}

	public DmsTreevmainUserQuery vflag(String vflag) {
		if (vflag == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflag = vflag;
		return this;
	}

	public DmsTreevmainUserQuery vflagLike(String vflagLike) {
		if (vflagLike == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflagLike = vflagLike;
		return this;
	}

	public DmsTreevmainUserQuery vflags(List<String> vflags) {
		if (vflags == null) {
			throw new RuntimeException("vflags is empty ");
		}
		this.vflags = vflags;
		return this;
	}

	public DmsTreevmainUserQuery sindexName(String sindexName) {
		if (sindexName == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexName = sindexName;
		return this;
	}

	public DmsTreevmainUserQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public DmsTreevmainUserQuery sindexNames(List<String> sindexNames) {
		if (sindexNames == null) {
			throw new RuntimeException("sindexNames is empty ");
		}
		this.sindexNames = sindexNames;
		return this;
	}

	public DmsTreevmainUserQuery ztype(Integer ztype) {
		if (ztype == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztype = ztype;
		return this;
	}

	public DmsTreevmainUserQuery ztypeGreaterThanOrEqual(
			Integer ztypeGreaterThanOrEqual) {
		if (ztypeGreaterThanOrEqual == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeGreaterThanOrEqual = ztypeGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery ztypeLessThanOrEqual(
			Integer ztypeLessThanOrEqual) {
		if (ztypeLessThanOrEqual == null) {
			throw new RuntimeException("ztype is null");
		}
		this.ztypeLessThanOrEqual = ztypeLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery ztypes(List<Integer> ztypes) {
		if (ztypes == null) {
			throw new RuntimeException("ztypes is empty ");
		}
		this.ztypes = ztypes;
		return this;
	}

	public DmsTreevmainUserQuery content2(String content2) {
		if (content2 == null) {
			throw new RuntimeException("content2 is null");
		}
		this.content2 = content2;
		return this;
	}

	public DmsTreevmainUserQuery content2Like(String content2Like) {
		if (content2Like == null) {
			throw new RuntimeException("content2 is null");
		}
		this.content2Like = content2Like;
		return this;
	}

	public DmsTreevmainUserQuery content2s(List<String> content2s) {
		if (content2s == null) {
			throw new RuntimeException("content2s is empty ");
		}
		this.content2s = content2s;
		return this;
	}

	public DmsTreevmainUserQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public DmsTreevmainUserQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public DmsTreevmainUserQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public DmsTreevmainUserQuery nodeico(Integer nodeico) {
		if (nodeico == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeico = nodeico;
		return this;
	}

	public DmsTreevmainUserQuery nodeicoGreaterThanOrEqual(
			Integer nodeicoGreaterThanOrEqual) {
		if (nodeicoGreaterThanOrEqual == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeicoGreaterThanOrEqual = nodeicoGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery nodeicoLessThanOrEqual(
			Integer nodeicoLessThanOrEqual) {
		if (nodeicoLessThanOrEqual == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeicoLessThanOrEqual = nodeicoLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery nodeicos(List<Integer> nodeicos) {
		if (nodeicos == null) {
			throw new RuntimeException("nodeicos is empty ");
		}
		this.nodeicos = nodeicos;
		return this;
	}

	public DmsTreevmainUserQuery nodetype(String nodetype) {
		if (nodetype == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetype = nodetype;
		return this;
	}

	public DmsTreevmainUserQuery nodetypeLike(String nodetypeLike) {
		if (nodetypeLike == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetypeLike = nodetypeLike;
		return this;
	}

	public DmsTreevmainUserQuery nodetypes(List<String> nodetypes) {
		if (nodetypes == null) {
			throw new RuntimeException("nodetypes is empty ");
		}
		this.nodetypes = nodetypes;
		return this;
	}

	public DmsTreevmainUserQuery fromid(Integer fromid) {
		if (fromid == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromid = fromid;
		return this;
	}

	public DmsTreevmainUserQuery fromidGreaterThanOrEqual(
			Integer fromidGreaterThanOrEqual) {
		if (fromidGreaterThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidGreaterThanOrEqual = fromidGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery fromidLessThanOrEqual(
			Integer fromidLessThanOrEqual) {
		if (fromidLessThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidLessThanOrEqual = fromidLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery fromids(List<Integer> fromids) {
		if (fromids == null) {
			throw new RuntimeException("fromids is empty ");
		}
		this.fromids = fromids;
		return this;
	}

	public DmsTreevmainUserQuery listno(Integer listno) {
		if (listno == null) {
			throw new RuntimeException("listno is null");
		}
		this.listno = listno;
		return this;
	}

	public DmsTreevmainUserQuery listnoGreaterThanOrEqual(
			Integer listnoGreaterThanOrEqual) {
		if (listnoGreaterThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery listnoLessThanOrEqual(
			Integer listnoLessThanOrEqual) {
		if (listnoLessThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoLessThanOrEqual = listnoLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery listnos(List<Integer> listnos) {
		if (listnos == null) {
			throw new RuntimeException("listnos is empty ");
		}
		this.listnos = listnos;
		return this;
	}

	public DmsTreevmainUserQuery frmtypeindex(Integer frmtypeindex) {
		if (frmtypeindex == null) {
			throw new RuntimeException("frmtypeindex is null");
		}
		this.frmtypeindex = frmtypeindex;
		return this;
	}

	public DmsTreevmainUserQuery frmtypeindexGreaterThanOrEqual(
			Integer frmtypeindexGreaterThanOrEqual) {
		if (frmtypeindexGreaterThanOrEqual == null) {
			throw new RuntimeException("frmtypeindex is null");
		}
		this.frmtypeindexGreaterThanOrEqual = frmtypeindexGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery frmtypeindexLessThanOrEqual(
			Integer frmtypeindexLessThanOrEqual) {
		if (frmtypeindexLessThanOrEqual == null) {
			throw new RuntimeException("frmtypeindex is null");
		}
		this.frmtypeindexLessThanOrEqual = frmtypeindexLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery frmtypeindexs(List<Integer> frmtypeindexs) {
		if (frmtypeindexs == null) {
			throw new RuntimeException("frmtypeindexs is empty ");
		}
		this.frmtypeindexs = frmtypeindexs;
		return this;
	}

	public DmsTreevmainUserQuery showid(Integer showid) {
		if (showid == null) {
			throw new RuntimeException("showid is null");
		}
		this.showid = showid;
		return this;
	}

	public DmsTreevmainUserQuery showidGreaterThanOrEqual(
			Integer showidGreaterThanOrEqual) {
		if (showidGreaterThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidGreaterThanOrEqual = showidGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery showidLessThanOrEqual(
			Integer showidLessThanOrEqual) {
		if (showidLessThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidLessThanOrEqual = showidLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery showids(List<Integer> showids) {
		if (showids == null) {
			throw new RuntimeException("showids is empty ");
		}
		this.showids = showids;
		return this;
	}

	public DmsTreevmainUserQuery showfrmid(String showfrmid) {
		if (showfrmid == null) {
			throw new RuntimeException("showfrmid is null");
		}
		this.showfrmid = showfrmid;
		return this;
	}

	public DmsTreevmainUserQuery showfrmidLike(String showfrmidLike) {
		if (showfrmidLike == null) {
			throw new RuntimeException("showfrmid is null");
		}
		this.showfrmidLike = showfrmidLike;
		return this;
	}

	public DmsTreevmainUserQuery showfrmids(List<String> showfrmids) {
		if (showfrmids == null) {
			throw new RuntimeException("showfrmids is empty ");
		}
		this.showfrmids = showfrmids;
		return this;
	}

	public DmsTreevmainUserQuery showfrmindexId(Integer showfrmindexId) {
		if (showfrmindexId == null) {
			throw new RuntimeException("showfrmindexId is null");
		}
		this.showfrmindexId = showfrmindexId;
		return this;
	}

	public DmsTreevmainUserQuery showfrmindexIdGreaterThanOrEqual(
			Integer showfrmindexIdGreaterThanOrEqual) {
		if (showfrmindexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("showfrmindexId is null");
		}
		this.showfrmindexIdGreaterThanOrEqual = showfrmindexIdGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery showfrmindexIdLessThanOrEqual(
			Integer showfrmindexIdLessThanOrEqual) {
		if (showfrmindexIdLessThanOrEqual == null) {
			throw new RuntimeException("showfrmindexId is null");
		}
		this.showfrmindexIdLessThanOrEqual = showfrmindexIdLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery showfrmindexIds(List<Integer> showfrmindexIds) {
		if (showfrmindexIds == null) {
			throw new RuntimeException("showfrmindexIds is empty ");
		}
		this.showfrmindexIds = showfrmindexIds;
		return this;
	}

	public DmsTreevmainUserQuery dwid(Integer dwid) {
		if (dwid == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwid = dwid;
		return this;
	}

	public DmsTreevmainUserQuery dwidGreaterThanOrEqual(
			Integer dwidGreaterThanOrEqual) {
		if (dwidGreaterThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidGreaterThanOrEqual = dwidGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery dwidLessThanOrEqual(Integer dwidLessThanOrEqual) {
		if (dwidLessThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidLessThanOrEqual = dwidLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery dwids(List<Integer> dwids) {
		if (dwids == null) {
			throw new RuntimeException("dwids is empty ");
		}
		this.dwids = dwids;
		return this;
	}

	public DmsTreevmainUserQuery jid(String jid) {
		if (jid == null) {
			throw new RuntimeException("jid is null");
		}
		this.jid = jid;
		return this;
	}

	public DmsTreevmainUserQuery jidLike(String jidLike) {
		if (jidLike == null) {
			throw new RuntimeException("jid is null");
		}
		this.jidLike = jidLike;
		return this;
	}

	public DmsTreevmainUserQuery jids(List<String> jids) {
		if (jids == null) {
			throw new RuntimeException("jids is empty ");
		}
		this.jids = jids;
		return this;
	}

	public DmsTreevmainUserQuery flid(String flid) {
		if (flid == null) {
			throw new RuntimeException("flid is null");
		}
		this.flid = flid;
		return this;
	}

	public DmsTreevmainUserQuery flidLike(String flidLike) {
		if (flidLike == null) {
			throw new RuntimeException("flid is null");
		}
		this.flidLike = flidLike;
		return this;
	}

	public DmsTreevmainUserQuery flids(List<String> flids) {
		if (flids == null) {
			throw new RuntimeException("flids is empty ");
		}
		this.flids = flids;
		return this;
	}

	public DmsTreevmainUserQuery ctypeId(String ctypeId) {
		if (ctypeId == null) {
			throw new RuntimeException("ctypeId is null");
		}
		this.ctypeId = ctypeId;
		return this;
	}

	public DmsTreevmainUserQuery ctypeIdLike(String ctypeIdLike) {
		if (ctypeIdLike == null) {
			throw new RuntimeException("ctypeId is null");
		}
		this.ctypeIdLike = ctypeIdLike;
		return this;
	}

	public DmsTreevmainUserQuery ctypeIds(List<String> ctypeIds) {
		if (ctypeIds == null) {
			throw new RuntimeException("ctypeIds is empty ");
		}
		this.ctypeIds = ctypeIds;
		return this;
	}

	public DmsTreevmainUserQuery commIndex(Integer commIndex) {
		if (commIndex == null) {
			throw new RuntimeException("commIndex is null");
		}
		this.commIndex = commIndex;
		return this;
	}

	public DmsTreevmainUserQuery commIndexGreaterThanOrEqual(
			Integer commIndexGreaterThanOrEqual) {
		if (commIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("commIndex is null");
		}
		this.commIndexGreaterThanOrEqual = commIndexGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery commIndexLessThanOrEqual(
			Integer commIndexLessThanOrEqual) {
		if (commIndexLessThanOrEqual == null) {
			throw new RuntimeException("commIndex is null");
		}
		this.commIndexLessThanOrEqual = commIndexLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery commIndexs(List<Integer> commIndexs) {
		if (commIndexs == null) {
			throw new RuntimeException("commIndexs is empty ");
		}
		this.commIndexs = commIndexs;
		return this;
	}

	public DmsTreevmainUserQuery baseIndex(Integer baseIndex) {
		if (baseIndex == null) {
			throw new RuntimeException("baseIndex is null");
		}
		this.baseIndex = baseIndex;
		return this;
	}

	public DmsTreevmainUserQuery baseIndexGreaterThanOrEqual(
			Integer baseIndexGreaterThanOrEqual) {
		if (baseIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("baseIndex is null");
		}
		this.baseIndexGreaterThanOrEqual = baseIndexGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery baseIndexLessThanOrEqual(
			Integer baseIndexLessThanOrEqual) {
		if (baseIndexLessThanOrEqual == null) {
			throw new RuntimeException("baseIndex is null");
		}
		this.baseIndexLessThanOrEqual = baseIndexLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery baseIndexs(List<Integer> baseIndexs) {
		if (baseIndexs == null) {
			throw new RuntimeException("baseIndexs is empty ");
		}
		this.baseIndexs = baseIndexs;
		return this;
	}

	public DmsTreevmainUserQuery commListno(Integer commListno) {
		if (commListno == null) {
			throw new RuntimeException("commListno is null");
		}
		this.commListno = commListno;
		return this;
	}

	public DmsTreevmainUserQuery commListnoGreaterThanOrEqual(
			Integer commListnoGreaterThanOrEqual) {
		if (commListnoGreaterThanOrEqual == null) {
			throw new RuntimeException("commListno is null");
		}
		this.commListnoGreaterThanOrEqual = commListnoGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery commListnoLessThanOrEqual(
			Integer commListnoLessThanOrEqual) {
		if (commListnoLessThanOrEqual == null) {
			throw new RuntimeException("commListno is null");
		}
		this.commListnoLessThanOrEqual = commListnoLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery commListnos(List<Integer> commListnos) {
		if (commListnos == null) {
			throw new RuntimeException("commListnos is empty ");
		}
		this.commListnos = commListnos;
		return this;
	}

	public DmsTreevmainUserQuery projListno(Integer projListno) {
		if (projListno == null) {
			throw new RuntimeException("projListno is null");
		}
		this.projListno = projListno;
		return this;
	}

	public DmsTreevmainUserQuery projListnoGreaterThanOrEqual(
			Integer projListnoGreaterThanOrEqual) {
		if (projListnoGreaterThanOrEqual == null) {
			throw new RuntimeException("projListno is null");
		}
		this.projListnoGreaterThanOrEqual = projListnoGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery projListnoLessThanOrEqual(
			Integer projListnoLessThanOrEqual) {
		if (projListnoLessThanOrEqual == null) {
			throw new RuntimeException("projListno is null");
		}
		this.projListnoLessThanOrEqual = projListnoLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery projListnos(List<Integer> projListnos) {
		if (projListnos == null) {
			throw new RuntimeException("projListnos is empty ");
		}
		this.projListnos = projListnos;
		return this;
	}

	public DmsTreevmainUserQuery intnoshow(Integer intnoshow) {
		if (intnoshow == null) {
			throw new RuntimeException("intnoshow is null");
		}
		this.intnoshow = intnoshow;
		return this;
	}

	public DmsTreevmainUserQuery intnoshowGreaterThanOrEqual(
			Integer intnoshowGreaterThanOrEqual) {
		if (intnoshowGreaterThanOrEqual == null) {
			throw new RuntimeException("intnoshow is null");
		}
		this.intnoshowGreaterThanOrEqual = intnoshowGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery intnoshowLessThanOrEqual(
			Integer intnoshowLessThanOrEqual) {
		if (intnoshowLessThanOrEqual == null) {
			throw new RuntimeException("intnoshow is null");
		}
		this.intnoshowLessThanOrEqual = intnoshowLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery intnoshows(List<Integer> intnoshows) {
		if (intnoshows == null) {
			throw new RuntimeException("intnoshows is empty ");
		}
		this.intnoshows = intnoshows;
		return this;
	}

	public DmsTreevmainUserQuery projParent(Integer projParent) {
		if (projParent == null) {
			throw new RuntimeException("projParent is null");
		}
		this.projParent = projParent;
		return this;
	}

	public DmsTreevmainUserQuery projParentGreaterThanOrEqual(
			Integer projParentGreaterThanOrEqual) {
		if (projParentGreaterThanOrEqual == null) {
			throw new RuntimeException("projParent is null");
		}
		this.projParentGreaterThanOrEqual = projParentGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery projParentLessThanOrEqual(
			Integer projParentLessThanOrEqual) {
		if (projParentLessThanOrEqual == null) {
			throw new RuntimeException("projParent is null");
		}
		this.projParentLessThanOrEqual = projParentLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery projParents(List<Integer> projParents) {
		if (projParents == null) {
			throw new RuntimeException("projParents is empty ");
		}
		this.projParents = projParents;
		return this;
	}

	public DmsTreevmainUserQuery treeDliststr(String treeDliststr) {
		if (treeDliststr == null) {
			throw new RuntimeException("treeDliststr is null");
		}
		this.treeDliststr = treeDliststr;
		return this;
	}

	public DmsTreevmainUserQuery treeDliststrLike(String treeDliststrLike) {
		if (treeDliststrLike == null) {
			throw new RuntimeException("treeDliststr is null");
		}
		this.treeDliststrLike = treeDliststrLike;
		return this;
	}

	public DmsTreevmainUserQuery treeDliststrs(List<String> treeDliststrs) {
		if (treeDliststrs == null) {
			throw new RuntimeException("treeDliststrs is empty ");
		}
		this.treeDliststrs = treeDliststrs;
		return this;
	}

	public DmsTreevmainUserQuery choosePublishFlag(String choosePublishFlag) {
		if (choosePublishFlag == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlag = choosePublishFlag;
		return this;
	}

	public DmsTreevmainUserQuery choosePublishFlagLike(
			String choosePublishFlagLike) {
		if (choosePublishFlagLike == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlagLike = choosePublishFlagLike;
		return this;
	}

	public DmsTreevmainUserQuery choosePublishFlags(
			List<String> choosePublishFlags) {
		if (choosePublishFlags == null) {
			throw new RuntimeException("choosePublishFlags is empty ");
		}
		this.choosePublishFlags = choosePublishFlags;
		return this;
	}

	public DmsTreevmainUserQuery choosePublishTime(Long choosePublishTime) {
		if (choosePublishTime == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTime = choosePublishTime;
		return this;
	}

	public DmsTreevmainUserQuery choosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		if (choosePublishTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery choosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		if (choosePublishTimeLessThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery choosePublishTimes(
			List<Long> choosePublishTimes) {
		if (choosePublishTimes == null) {
			throw new RuntimeException("choosePublishTimes is empty ");
		}
		this.choosePublishTimes = choosePublishTimes;
		return this;
	}

	public DmsTreevmainUserQuery publishdiskid(Integer publishdiskid) {
		if (publishdiskid == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskid = publishdiskid;
		return this;
	}

	public DmsTreevmainUserQuery publishdiskidGreaterThanOrEqual(
			Integer publishdiskidGreaterThanOrEqual) {
		if (publishdiskidGreaterThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidGreaterThanOrEqual = publishdiskidGreaterThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery publishdiskidLessThanOrEqual(
			Integer publishdiskidLessThanOrEqual) {
		if (publishdiskidLessThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidLessThanOrEqual = publishdiskidLessThanOrEqual;
		return this;
	}

	public DmsTreevmainUserQuery publishdiskids(List<Integer> publishdiskids) {
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

			if ("nodetype".equals(sortColumn)) {
				orderBy = "E.NODETYPE" + a_x;
			}

			if ("fromid".equals(sortColumn)) {
				orderBy = "E.FROMID" + a_x;
			}

			if ("listno".equals(sortColumn)) {
				orderBy = "E.LISTNO" + a_x;
			}

			if ("frmtypeindex".equals(sortColumn)) {
				orderBy = "E.FRMTYPEINDEX" + a_x;
			}

			if ("showid".equals(sortColumn)) {
				orderBy = "E.SHOWID" + a_x;
			}

			if ("showfrmid".equals(sortColumn)) {
				orderBy = "E.SHOWFRMID" + a_x;
			}

			if ("showfrmindexId".equals(sortColumn)) {
				orderBy = "E.SHOWFRMINDEX_ID" + a_x;
			}

			if ("dwid".equals(sortColumn)) {
				orderBy = "E.DWID" + a_x;
			}

			if ("jid".equals(sortColumn)) {
				orderBy = "E.JID" + a_x;
			}

			if ("flid".equals(sortColumn)) {
				orderBy = "E.FLID" + a_x;
			}

			if ("ctypeId".equals(sortColumn)) {
				orderBy = "E.CTYPE_ID" + a_x;
			}

			if ("commIndex".equals(sortColumn)) {
				orderBy = "E.COMM_INDEX" + a_x;
			}

			if ("baseIndex".equals(sortColumn)) {
				orderBy = "E.BASE_INDEX" + a_x;
			}

			if ("commListno".equals(sortColumn)) {
				orderBy = "E.COMM_LISTNO" + a_x;
			}

			if ("projListno".equals(sortColumn)) {
				orderBy = "E.PROJ_LISTNO" + a_x;
			}

			if ("intnoshow".equals(sortColumn)) {
				orderBy = "E.INTNOSHOW" + a_x;
			}

			if ("projParent".equals(sortColumn)) {
				orderBy = "E.PROJ_PARENT" + a_x;
			}

			if ("treeDliststr".equals(sortColumn)) {
				orderBy = "E.TREE_DLISTSTR" + a_x;
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
		addColumn("nodetype", "NODETYPE");
		addColumn("fromid", "FROMID");
		addColumn("listno", "LISTNO");
		addColumn("frmtypeindex", "FRMTYPEINDEX");
		addColumn("showid", "SHOWID");
		addColumn("showfrmid", "SHOWFRMID");
		addColumn("showfrmindexId", "SHOWFRMINDEX_ID");
		addColumn("dwid", "DWID");
		addColumn("jid", "JID");
		addColumn("flid", "FLID");
		addColumn("ctypeId", "CTYPE_ID");
		addColumn("commIndex", "COMM_INDEX");
		addColumn("baseIndex", "BASE_INDEX");
		addColumn("commListno", "COMM_LISTNO");
		addColumn("projListno", "PROJ_LISTNO");
		addColumn("intnoshow", "INTNOSHOW");
		addColumn("projParent", "PROJ_PARENT");
		addColumn("treeDliststr", "TREE_DLISTSTR");
		addColumn("choosePublishFlag", "CHOOSEPUBLISHFLAG");
		addColumn("choosePublishTime", "CHOOSEPUBLISHTIME");
		addColumn("publishdiskid", "PUBLISHDISKID");
	}

}