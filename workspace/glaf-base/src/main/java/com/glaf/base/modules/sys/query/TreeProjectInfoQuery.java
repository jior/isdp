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

import com.glaf.core.query.DataQuery;
import java.util.Date;
import java.util.List;

public class TreeProjectInfoQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected List<Integer> indexIds;
	protected String id;
	protected String idLike;
	protected List<String> ids;
	protected String num;
	protected String numLike;
	protected List<String> nums;
	protected Integer topId;
	protected Integer topIdGreaterThanOrEqual;
	protected Integer topIdLessThanOrEqual;
	protected List<Integer> topIds;
	protected String indexName;
	protected String indexNameLike;
	protected List<String> indexNames;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String nodeType;
	protected String nodeTypeLike;
	protected List<String> nodeTypes;
	protected Integer fromId;
	protected Integer fromIdGreaterThanOrEqual;
	protected Integer fromIdLessThanOrEqual;
	protected List<Integer> fromIds;
	protected Integer partId;
	protected Integer partIdGreaterThanOrEqual;
	protected Integer partIdLessThanOrEqual;
	protected List<Integer> partIds;
	protected Integer showId;
	protected Integer showIdGreaterThanOrEqual;
	protected Integer showIdLessThanOrEqual;
	protected List<Integer> showIds;
	protected String sindexName;
	protected String sindexNameLike;
	protected List<String> sindexNames;
	protected Integer fileNum;
	protected Integer fileNumGreaterThanOrEqual;
	protected Integer fileNumLessThanOrEqual;
	protected List<Integer> fileNums;
	protected Integer fileNum0;
	protected Integer fileNum0GreaterThanOrEqual;
	protected Integer fileNum0LessThanOrEqual;
	protected List<Integer> fileNum0s;
	protected Integer fileNum1;
	protected Integer fileNum1GreaterThanOrEqual;
	protected Integer fileNum1LessThanOrEqual;
	protected List<Integer> fileNum1s;
	protected Integer fileNum2;
	protected Integer fileNum2GreaterThanOrEqual;
	protected Integer fileNum2LessThanOrEqual;
	protected List<Integer> fileNum2s;
	protected String projType;
	protected String projTypeLike;
	protected List<String> projTypes;
	protected String cid;
	protected String cidLike;
	protected List<String> cids;
	protected Integer dwid;
	protected Integer dwidGreaterThanOrEqual;
	protected Integer dwidLessThanOrEqual;
	protected List<Integer> dwids;
	protected Integer fxid;
	protected Integer fxidGreaterThanOrEqual;
	protected Integer fxidLessThanOrEqual;
	protected List<Integer> fxids;
	protected Integer fbid;
	protected Integer fbidGreaterThanOrEqual;
	protected Integer fbidLessThanOrEqual;
	protected List<Integer> fbids;
	protected String jid;
	protected String jidLike;
	protected List<String> jids;
	protected String flid;
	protected String flidLike;
	protected List<String> flids;
	protected String topNode;
	protected String topNodeLike;
	protected List<String> topNodes;
	protected Integer nodeIco;
	protected Integer nodeIcoGreaterThanOrEqual;
	protected Integer nodeIcoLessThanOrEqual;
	protected List<Integer> nodeIcos;
	protected String outFlag;
	protected String outFlagLike;
	protected List<String> outFlags;
	protected String inFlag;
	protected String inFlagLike;
	protected List<String> inFlags;
	protected String password;
	protected String passwordLike;
	protected List<String> passwords;
	protected String listNum;
	protected String listNumLike;
	protected List<String> listNums;
	protected String wcompany;
	protected String wcompanyLike;
	protected List<String> wcompanys;
	protected Integer listNo;
	protected Integer listNoGreaterThanOrEqual;
	protected Integer listNoLessThanOrEqual;
	protected List<Integer> listNos;
	protected String usernmu;
	protected String usernmuLike;
	protected List<String> usernmus;
	protected Integer indexIdOld;
	protected Integer indexIdOldGreaterThanOrEqual;
	protected Integer indexIdOldLessThanOrEqual;
	protected List<Integer> indexIdOlds;
	protected Integer pindexId;
	protected Integer pindexIdGreaterThanOrEqual;
	protected Integer pindexIdLessThanOrEqual;
	protected List<Integer> pindexIds;
	protected Integer finishInt;
	protected Integer finishIntGreaterThanOrEqual;
	protected Integer finishIntLessThanOrEqual;
	protected List<Integer> finishInts;
	protected String typeTableName;
	protected String typeTableNameLike;
	protected List<String> typeTableNames;
	protected String treedListStr;
	protected String treedListStrLike;
	protected List<String> treedListStrs;
	protected Integer pfilesIndex;
	protected Integer pfilesIndexGreaterThanOrEqual;
	protected Integer pfilesIndexLessThanOrEqual;
	protected List<Integer> pfilesIndexs;
	protected Date bdate;
	protected Date bdateGreaterThanOrEqual;
	protected Date bdateLessThanOrEqual;
	protected Date edate;
	protected Date edateGreaterThanOrEqual;
	protected Date edateLessThanOrEqual;
	protected Integer wbsIndex;
	protected Integer wbsIndexGreaterThanOrEqual;
	protected Integer wbsIndexLessThanOrEqual;
	protected List<Integer> wbsIndexs;
	protected Date bdates;
	protected Date bdatesGreaterThanOrEqual;
	protected Date bdatesLessThanOrEqual;
	protected List<Date> bdatess;
	protected Date edates;
	protected Date edatesGreaterThanOrEqual;
	protected Date edatesLessThanOrEqual;
	protected List<Date> edatess;
	protected String typeId;
	protected String typeIdLike;
	protected List<String> typeIds;
	protected Integer cell1;
	protected Integer cell1GreaterThanOrEqual;
	protected Integer cell1LessThanOrEqual;
	protected List<Integer> cell1s;
	protected Integer cell2;
	protected Integer cell2GreaterThanOrEqual;
	protected Integer cell2LessThanOrEqual;
	protected List<Integer> cell2s;
	protected Integer cell3;
	protected Integer cell3GreaterThanOrEqual;
	protected Integer cell3LessThanOrEqual;
	protected List<Integer> cell3s;
	protected String strFileLocate;
	protected String strFileLocateLike;
	protected List<String> strFileLocates;
	protected Integer intpFile1;
	protected Integer intpFile1GreaterThanOrEqual;
	protected Integer intpFile1LessThanOrEqual;
	protected List<Integer> intpFile1s;
	protected Integer intpFile2;
	protected Integer intpFile2GreaterThanOrEqual;
	protected Integer intpFile2LessThanOrEqual;
	protected List<Integer> intpFile2s;
	protected Integer intpFile3;
	protected Integer intpFile3GreaterThanOrEqual;
	protected Integer intpFile3LessThanOrEqual;
	protected List<Integer> intpFile3s;
	protected Integer intCellFinish;
	protected Integer intCellFinishGreaterThanOrEqual;
	protected Integer intCellFinishLessThanOrEqual;
	protected List<Integer> intCellFinishs;
	protected String sysId;
	protected String sysIdLike;
	protected List<String> sysIds;
	protected Integer indexIn;
	protected Integer indexInGreaterThanOrEqual;
	protected Integer indexInLessThanOrEqual;
	protected List<Integer> indexIns;
	protected String strButtonStar;
	protected String strButtonStarLike;
	protected List<String> strButtonStars;
	protected Integer intIsuse;
	protected Integer intIsuseGreaterThanOrEqual;
	protected Integer intIsuseLessThanOrEqual;
	protected List<Integer> intIsuses;
	protected Integer wbsIndexIn;
	protected Integer wbsIndexInGreaterThanOrEqual;
	protected Integer wbsIndexInLessThanOrEqual;
	protected List<Integer> wbsIndexIns;
	protected Integer uindexId;
	protected Integer uindexIdGreaterThanOrEqual;
	protected Integer uindexIdLessThanOrEqual;
	protected List<Integer> uindexIds;
	protected Integer lisNoWbs;
	protected Integer lisNoWbsGreaterThanOrEqual;
	protected Integer lisNoWbsLessThanOrEqual;
	protected List<Integer> lisNoWbss;
	protected String sysIdAdd;
	protected String sysIdAddLike;
	protected List<String> sysIdAdds;
	protected Integer indexInAdd;
	protected Integer indexInAddGreaterThanOrEqual;
	protected Integer indexInAddLessThanOrEqual;
	protected List<Integer> indexInAdds;
	protected String createByLike;
	protected List<String> createBys;
	protected Date createDateGreaterThanOrEqual;
	protected Date createDateLessThanOrEqual;
	protected Date updateDateGreaterThanOrEqual;
	protected Date updateDateLessThanOrEqual;
	protected String updateBy;
	protected String updateByLike;
	protected List<String> updateBys;
	protected List<String> idLikeList;
	protected Boolean bdatesIsNotNull;
	protected String conditionString;
	protected String projTypeNotEqual;

	public List<Integer> getIndexIds() {
		return indexIds;
	}

	public String getId() {
		return this.id;
	}

	public String getIdLike() {
		if ((this.idLike != null) && (this.idLike.trim().length() > 0)) {
			if (!(this.idLike.startsWith("%"))) {
				this.idLike = "%" + this.idLike;
			}
			if (!(this.idLike.endsWith("%"))) {
				this.idLike += "%";
			}
		}
		return this.idLike;
	}

	public List<String> getIds() {
		return this.ids;
	}

	public String getNum() {
		return this.num;
	}

	public String getNumLike() {
		if ((this.numLike != null) && (this.numLike.trim().length() > 0)) {
			if (!(this.numLike.startsWith("%"))) {
				this.numLike = "%" + this.numLike;
			}
			if (!(this.numLike.endsWith("%"))) {
				this.numLike += "%";
			}
		}
		return this.numLike;
	}

	public List<String> getNums() {
		return this.nums;
	}

	public Integer getTopId() {
		return this.topId;
	}

	public Integer getTopIdGreaterThanOrEqual() {
		return this.topIdGreaterThanOrEqual;
	}

	public Integer getTopIdLessThanOrEqual() {
		return this.topIdLessThanOrEqual;
	}

	public List<Integer> getTopIds() {
		return this.topIds;
	}

	public String getIndexName() {
		return this.indexName;
	}

	public String getIndexNameLike() {
		if ((this.indexNameLike != null)
				&& (this.indexNameLike.trim().length() > 0)) {
			if (!(this.indexNameLike.startsWith("%"))) {
				this.indexNameLike = "%" + this.indexNameLike;
			}
			if (!(this.indexNameLike.endsWith("%"))) {
				this.indexNameLike += "%";
			}
		}
		return this.indexNameLike;
	}

	public List<String> getIndexNames() {
		return this.indexNames;
	}

	public Integer getNlevel() {
		return this.nlevel;
	}

	public Integer getNlevelGreaterThanOrEqual() {
		return this.nlevelGreaterThanOrEqual;
	}

	public Integer getNlevelLessThanOrEqual() {
		return this.nlevelLessThanOrEqual;
	}

	public List<Integer> getNlevels() {
		return this.nlevels;
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public String getNodeTypeLike() {
		if ((this.nodeTypeLike != null)
				&& (this.nodeTypeLike.trim().length() > 0)) {
			if (!(this.nodeTypeLike.startsWith("%"))) {
				this.nodeTypeLike = "%" + this.nodeTypeLike;
			}
			if (!(this.nodeTypeLike.endsWith("%"))) {
				this.nodeTypeLike += "%";
			}
		}
		return this.nodeTypeLike;
	}

	public List<String> getNodeTypes() {
		return this.nodeTypes;
	}

	public Integer getFromId() {
		return this.fromId;
	}

	public Integer getFromIdGreaterThanOrEqual() {
		return this.fromIdGreaterThanOrEqual;
	}

	public Integer getFromIdLessThanOrEqual() {
		return this.fromIdLessThanOrEqual;
	}

	public List<Integer> getFromIds() {
		return this.fromIds;
	}

	public Integer getPartId() {
		return this.partId;
	}

	public Integer getPartIdGreaterThanOrEqual() {
		return this.partIdGreaterThanOrEqual;
	}

	public Integer getPartIdLessThanOrEqual() {
		return this.partIdLessThanOrEqual;
	}

	public List<Integer> getPartIds() {
		return this.partIds;
	}

	public Integer getShowId() {
		return this.showId;
	}

	public Integer getShowIdGreaterThanOrEqual() {
		return this.showIdGreaterThanOrEqual;
	}

	public Integer getShowIdLessThanOrEqual() {
		return this.showIdLessThanOrEqual;
	}

	public List<Integer> getShowIds() {
		return this.showIds;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getSindexNameLike() {
		if ((this.sindexNameLike != null)
				&& (this.sindexNameLike.trim().length() > 0)) {
			if (!(this.sindexNameLike.startsWith("%"))) {
				this.sindexNameLike = "%" + this.sindexNameLike;
			}
			if (!(this.sindexNameLike.endsWith("%"))) {
				this.sindexNameLike += "%";
			}
		}
		return this.sindexNameLike;
	}

	public List<String> getSindexNames() {
		return this.sindexNames;
	}

	public Integer getFileNum() {
		return this.fileNum;
	}

	public Integer getFileNumGreaterThanOrEqual() {
		return this.fileNumGreaterThanOrEqual;
	}

	public Integer getFileNumLessThanOrEqual() {
		return this.fileNumLessThanOrEqual;
	}

	public List<Integer> getFileNums() {
		return this.fileNums;
	}

	public Integer getFileNum0() {
		return this.fileNum0;
	}

	public Integer getFileNum0GreaterThanOrEqual() {
		return this.fileNum0GreaterThanOrEqual;
	}

	public Integer getFileNum0LessThanOrEqual() {
		return this.fileNum0LessThanOrEqual;
	}

	public List<Integer> getFileNum0s() {
		return this.fileNum0s;
	}

	public Integer getFileNum1() {
		return this.fileNum1;
	}

	public Integer getFileNum1GreaterThanOrEqual() {
		return this.fileNum1GreaterThanOrEqual;
	}

	public Integer getFileNum1LessThanOrEqual() {
		return this.fileNum1LessThanOrEqual;
	}

	public List<Integer> getFileNum1s() {
		return this.fileNum1s;
	}

	public Integer getFileNum2() {
		return this.fileNum2;
	}

	public Integer getFileNum2GreaterThanOrEqual() {
		return this.fileNum2GreaterThanOrEqual;
	}

	public Integer getFileNum2LessThanOrEqual() {
		return this.fileNum2LessThanOrEqual;
	}

	public List<Integer> getFileNum2s() {
		return this.fileNum2s;
	}

	public String getProjType() {
		return this.projType;
	}

	public String getProjTypeLike() {
		if ((this.projTypeLike != null)
				&& (this.projTypeLike.trim().length() > 0)) {
			if (!(this.projTypeLike.startsWith("%"))) {
				this.projTypeLike = "%" + this.projTypeLike;
			}
			if (!(this.projTypeLike.endsWith("%"))) {
				this.projTypeLike += "%";
			}
		}
		return this.projTypeLike;
	}

	public List<String> getProjTypes() {
		return this.projTypes;
	}

	public String getCid() {
		return this.cid;
	}

	public String getCidLike() {
		if ((this.cidLike != null) && (this.cidLike.trim().length() > 0)) {
			if (!(this.cidLike.startsWith("%"))) {
				this.cidLike = "%" + this.cidLike;
			}
			if (!(this.cidLike.endsWith("%"))) {
				this.cidLike += "%";
			}
		}
		return this.cidLike;
	}

	public List<String> getCids() {
		return this.cids;
	}

	public Integer getDwid() {
		return this.dwid;
	}

	public Integer getDwidGreaterThanOrEqual() {
		return this.dwidGreaterThanOrEqual;
	}

	public Integer getDwidLessThanOrEqual() {
		return this.dwidLessThanOrEqual;
	}

	public List<Integer> getDwids() {
		return this.dwids;
	}

	public Integer getFxid() {
		return this.fxid;
	}

	public Integer getFxidGreaterThanOrEqual() {
		return this.fxidGreaterThanOrEqual;
	}

	public Integer getFxidLessThanOrEqual() {
		return this.fxidLessThanOrEqual;
	}

	public List<Integer> getFxids() {
		return this.fxids;
	}

	public Integer getFbid() {
		return this.fbid;
	}

	public Integer getFbidGreaterThanOrEqual() {
		return this.fbidGreaterThanOrEqual;
	}

	public Integer getFbidLessThanOrEqual() {
		return this.fbidLessThanOrEqual;
	}

	public List<Integer> getFbids() {
		return this.fbids;
	}

	public String getJid() {
		return this.jid;
	}

	public String getJidLike() {
		if ((this.jidLike != null) && (this.jidLike.trim().length() > 0)) {
			if (!(this.jidLike.startsWith("%"))) {
				this.jidLike = "%" + this.jidLike;
			}
			if (!(this.jidLike.endsWith("%"))) {
				this.jidLike += "%";
			}
		}
		return this.jidLike;
	}

	public List<String> getJids() {
		return this.jids;
	}

	public String getFlid() {
		return this.flid;
	}

	public String getFlidLike() {
		if ((this.flidLike != null) && (this.flidLike.trim().length() > 0)) {
			if (!(this.flidLike.startsWith("%"))) {
				this.flidLike = "%" + this.flidLike;
			}
			if (!(this.flidLike.endsWith("%"))) {
				this.flidLike += "%";
			}
		}
		return this.flidLike;
	}

	public List<String> getFlids() {
		return this.flids;
	}

	public String getTopNode() {
		return this.topNode;
	}

	public String getTopNodeLike() {
		if ((this.topNodeLike != null)
				&& (this.topNodeLike.trim().length() > 0)) {
			if (!(this.topNodeLike.startsWith("%"))) {
				this.topNodeLike = "%" + this.topNodeLike;
			}
			if (!(this.topNodeLike.endsWith("%"))) {
				this.topNodeLike += "%";
			}
		}
		return this.topNodeLike;
	}

	public List<String> getTopNodes() {
		return this.topNodes;
	}

	public Integer getNodeIco() {
		return this.nodeIco;
	}

	public Integer getNodeIcoGreaterThanOrEqual() {
		return this.nodeIcoGreaterThanOrEqual;
	}

	public Integer getNodeIcoLessThanOrEqual() {
		return this.nodeIcoLessThanOrEqual;
	}

	public List<Integer> getNodeIcos() {
		return this.nodeIcos;
	}

	public String getOutFlag() {
		return this.outFlag;
	}

	public String getOutFlagLike() {
		if ((this.outFlagLike != null)
				&& (this.outFlagLike.trim().length() > 0)) {
			if (!(this.outFlagLike.startsWith("%"))) {
				this.outFlagLike = "%" + this.outFlagLike;
			}
			if (!(this.outFlagLike.endsWith("%"))) {
				this.outFlagLike += "%";
			}
		}
		return this.outFlagLike;
	}

	public List<String> getOutFlags() {
		return this.outFlags;
	}

	public String getInFlag() {
		return this.inFlag;
	}

	public String getInFlagLike() {
		if ((this.inFlagLike != null) && (this.inFlagLike.trim().length() > 0)) {
			if (!(this.inFlagLike.startsWith("%"))) {
				this.inFlagLike = "%" + this.inFlagLike;
			}
			if (!(this.inFlagLike.endsWith("%"))) {
				this.inFlagLike += "%";
			}
		}
		return this.inFlagLike;
	}

	public List<String> getInFlags() {
		return this.inFlags;
	}

	public String getPassword() {
		return this.password;
	}

	public String getPasswordLike() {
		if ((this.passwordLike != null)
				&& (this.passwordLike.trim().length() > 0)) {
			if (!(this.passwordLike.startsWith("%"))) {
				this.passwordLike = "%" + this.passwordLike;
			}
			if (!(this.passwordLike.endsWith("%"))) {
				this.passwordLike += "%";
			}
		}
		return this.passwordLike;
	}

	public List<String> getPasswords() {
		return this.passwords;
	}

	public String getListNum() {
		return this.listNum;
	}

	public String getListNumLike() {
		if ((this.listNumLike != null)
				&& (this.listNumLike.trim().length() > 0)) {
			if (!(this.listNumLike.startsWith("%"))) {
				this.listNumLike = "%" + this.listNumLike;
			}
			if (!(this.listNumLike.endsWith("%"))) {
				this.listNumLike += "%";
			}
		}
		return this.listNumLike;
	}

	public List<String> getListNums() {
		return this.listNums;
	}

	public String getWcompany() {
		return this.wcompany;
	}

	public String getWcompanyLike() {
		if ((this.wcompanyLike != null)
				&& (this.wcompanyLike.trim().length() > 0)) {
			if (!(this.wcompanyLike.startsWith("%"))) {
				this.wcompanyLike = "%" + this.wcompanyLike;
			}
			if (!(this.wcompanyLike.endsWith("%"))) {
				this.wcompanyLike += "%";
			}
		}
		return this.wcompanyLike;
	}

	public List<String> getWcompanys() {
		return this.wcompanys;
	}

	public Integer getListNo() {
		return this.listNo;
	}

	public Integer getListNoGreaterThanOrEqual() {
		return this.listNoGreaterThanOrEqual;
	}

	public Integer getListNoLessThanOrEqual() {
		return this.listNoLessThanOrEqual;
	}

	public List<Integer> getListNos() {
		return this.listNos;
	}

	public String getUsernmu() {
		return this.usernmu;
	}

	public String getUsernmuLike() {
		if ((this.usernmuLike != null)
				&& (this.usernmuLike.trim().length() > 0)) {
			if (!(this.usernmuLike.startsWith("%"))) {
				this.usernmuLike = "%" + this.usernmuLike;
			}
			if (!(this.usernmuLike.endsWith("%"))) {
				this.usernmuLike += "%";
			}
		}
		return this.usernmuLike;
	}

	public List<String> getUsernmus() {
		return this.usernmus;
	}

	public Integer getIndexIdOld() {
		return this.indexIdOld;
	}

	public Integer getIndexIdOldGreaterThanOrEqual() {
		return this.indexIdOldGreaterThanOrEqual;
	}

	public Integer getIndexIdOldLessThanOrEqual() {
		return this.indexIdOldLessThanOrEqual;
	}

	public List<Integer> getIndexIdOlds() {
		return this.indexIdOlds;
	}

	public Integer getPindexId() {
		return this.pindexId;
	}

	public Integer getPindexIdGreaterThanOrEqual() {
		return this.pindexIdGreaterThanOrEqual;
	}

	public Integer getPindexIdLessThanOrEqual() {
		return this.pindexIdLessThanOrEqual;
	}

	public List<Integer> getPindexIds() {
		return this.pindexIds;
	}

	public Integer getFinishInt() {
		return this.finishInt;
	}

	public Integer getFinishIntGreaterThanOrEqual() {
		return this.finishIntGreaterThanOrEqual;
	}

	public Integer getFinishIntLessThanOrEqual() {
		return this.finishIntLessThanOrEqual;
	}

	public List<Integer> getFinishInts() {
		return this.finishInts;
	}

	public String getTypeTableName() {
		return this.typeTableName;
	}

	public String getTypeTableNameLike() {
		if ((this.typeTableNameLike != null)
				&& (this.typeTableNameLike.trim().length() > 0)) {
			if (!(this.typeTableNameLike.startsWith("%"))) {
				this.typeTableNameLike = "%" + this.typeTableNameLike;
			}
			if (!(this.typeTableNameLike.endsWith("%"))) {
				this.typeTableNameLike += "%";
			}
		}
		return this.typeTableNameLike;
	}

	public List<String> getTypeTableNames() {
		return this.typeTableNames;
	}

	public String getTreedListStr() {
		return this.treedListStr;
	}

	public String getTreedListStrLike() {
		if ((this.treedListStrLike != null)
				&& (this.treedListStrLike.trim().length() > 0)) {
			if (!(this.treedListStrLike.startsWith("%"))) {
				this.treedListStrLike = "%" + this.treedListStrLike;
			}
			if (!(this.treedListStrLike.endsWith("%"))) {
				this.treedListStrLike += "%";
			}
		}
		return this.treedListStrLike;
	}

	public List<String> getTreedListStrs() {
		return this.treedListStrs;
	}

	public Integer getPfilesIndex() {
		return this.pfilesIndex;
	}

	public Integer getPfilesIndexGreaterThanOrEqual() {
		return this.pfilesIndexGreaterThanOrEqual;
	}

	public Integer getPfilesIndexLessThanOrEqual() {
		return this.pfilesIndexLessThanOrEqual;
	}

	public List<Integer> getPfilesIndexs() {
		return this.pfilesIndexs;
	}

	public Date getBdate() {
		return this.bdate;
	}

	public Date getBdateGreaterThanOrEqual() {
		return this.bdateGreaterThanOrEqual;
	}

	public Date getBdateLessThanOrEqual() {
		return this.bdateLessThanOrEqual;
	}

	public Date getEdate() {
		return this.edate;
	}

	public Date getEdateGreaterThanOrEqual() {
		return this.edateGreaterThanOrEqual;
	}

	public Date getEdateLessThanOrEqual() {
		return this.edateLessThanOrEqual;
	}

	public Integer getWbsIndex() {
		return this.wbsIndex;
	}

	public Integer getWbsIndexGreaterThanOrEqual() {
		return this.wbsIndexGreaterThanOrEqual;
	}

	public Integer getWbsIndexLessThanOrEqual() {
		return this.wbsIndexLessThanOrEqual;
	}

	public List<Integer> getWbsIndexs() {
		return this.wbsIndexs;
	}

	public Date getBdates() {
		return this.bdates;
	}

	public Date getBdatesGreaterThanOrEqual() {
		return this.bdatesGreaterThanOrEqual;
	}

	public Date getBdatesLessThanOrEqual() {
		return this.bdatesLessThanOrEqual;
	}

	public List<Date> getBdatess() {
		return this.bdatess;
	}

	public Date getEdatesGreaterThanOrEqual() {
		return this.edatesGreaterThanOrEqual;
	}

	public Date getEdatesLessThanOrEqual() {
		return this.edatesLessThanOrEqual;
	}

	public List<Date> getEdatess() {
		return this.edatess;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public String getTypeIdLike() {
		if ((this.typeIdLike != null) && (this.typeIdLike.trim().length() > 0)) {
			if (!(this.typeIdLike.startsWith("%"))) {
				this.typeIdLike = "%" + this.typeIdLike;
			}
			if (!(this.typeIdLike.endsWith("%"))) {
				this.typeIdLike += "%";
			}
		}
		return this.typeIdLike;
	}

	public List<String> getTypeIds() {
		return this.typeIds;
	}

	public Integer getCell1() {
		return this.cell1;
	}

	public Integer getCell1GreaterThanOrEqual() {
		return this.cell1GreaterThanOrEqual;
	}

	public Integer getCell1LessThanOrEqual() {
		return this.cell1LessThanOrEqual;
	}

	public List<Integer> getCell1s() {
		return this.cell1s;
	}

	public Integer getCell2() {
		return this.cell2;
	}

	public Integer getCell2GreaterThanOrEqual() {
		return this.cell2GreaterThanOrEqual;
	}

	public Integer getCell2LessThanOrEqual() {
		return this.cell2LessThanOrEqual;
	}

	public List<Integer> getCell2s() {
		return this.cell2s;
	}

	public Integer getCell3() {
		return this.cell3;
	}

	public Integer getCell3GreaterThanOrEqual() {
		return this.cell3GreaterThanOrEqual;
	}

	public Integer getCell3LessThanOrEqual() {
		return this.cell3LessThanOrEqual;
	}

	public List<Integer> getCell3s() {
		return this.cell3s;
	}

	public String getStrFileLocate() {
		return this.strFileLocate;
	}

	public String getStrFileLocateLike() {
		if ((this.strFileLocateLike != null)
				&& (this.strFileLocateLike.trim().length() > 0)) {
			if (!(this.strFileLocateLike.startsWith("%"))) {
				this.strFileLocateLike = "%" + this.strFileLocateLike;
			}
			if (!(this.strFileLocateLike.endsWith("%"))) {
				this.strFileLocateLike += "%";
			}
		}
		return this.strFileLocateLike;
	}

	public List<String> getStrFileLocates() {
		return this.strFileLocates;
	}

	public Integer getIntpFile1() {
		return this.intpFile1;
	}

	public Integer getIntpFile1GreaterThanOrEqual() {
		return this.intpFile1GreaterThanOrEqual;
	}

	public Integer getIntpFile1LessThanOrEqual() {
		return this.intpFile1LessThanOrEqual;
	}

	public List<Integer> getIntpFile1s() {
		return this.intpFile1s;
	}

	public Integer getIntpFile2() {
		return this.intpFile2;
	}

	public Integer getIntpFile2GreaterThanOrEqual() {
		return this.intpFile2GreaterThanOrEqual;
	}

	public Integer getIntpFile2LessThanOrEqual() {
		return this.intpFile2LessThanOrEqual;
	}

	public List<Integer> getIntpFile2s() {
		return this.intpFile2s;
	}

	public Integer getIntpFile3() {
		return this.intpFile3;
	}

	public Integer getIntpFile3GreaterThanOrEqual() {
		return this.intpFile3GreaterThanOrEqual;
	}

	public Integer getIntpFile3LessThanOrEqual() {
		return this.intpFile3LessThanOrEqual;
	}

	public List<Integer> getIntpFile3s() {
		return this.intpFile3s;
	}

	public Integer getIntCellFinish() {
		return this.intCellFinish;
	}

	public Integer getIntCellFinishGreaterThanOrEqual() {
		return this.intCellFinishGreaterThanOrEqual;
	}

	public Integer getIntCellFinishLessThanOrEqual() {
		return this.intCellFinishLessThanOrEqual;
	}

	public List<Integer> getIntCellFinishs() {
		return this.intCellFinishs;
	}

	public String getSysId() {
		return this.sysId;
	}

	public String getSysIdLike() {
		if ((this.sysIdLike != null) && (this.sysIdLike.trim().length() > 0)) {
			if (!(this.sysIdLike.startsWith("%"))) {
				this.sysIdLike = "%" + this.sysIdLike;
			}
			if (!(this.sysIdLike.endsWith("%"))) {
				this.sysIdLike += "%";
			}
		}
		return this.sysIdLike;
	}

	public List<String> getSysIds() {
		return this.sysIds;
	}

	public Integer getIndexIn() {
		return this.indexIn;
	}

	public Integer getIndexInGreaterThanOrEqual() {
		return this.indexInGreaterThanOrEqual;
	}

	public Integer getIndexInLessThanOrEqual() {
		return this.indexInLessThanOrEqual;
	}

	public List<Integer> getIndexIns() {
		return this.indexIns;
	}

	public String getStrButtonStar() {
		return this.strButtonStar;
	}

	public String getStrButtonStarLike() {
		if ((this.strButtonStarLike != null)
				&& (this.strButtonStarLike.trim().length() > 0)) {
			if (!(this.strButtonStarLike.startsWith("%"))) {
				this.strButtonStarLike = "%" + this.strButtonStarLike;
			}
			if (!(this.strButtonStarLike.endsWith("%"))) {
				this.strButtonStarLike += "%";
			}
		}
		return this.strButtonStarLike;
	}

	public List<String> getStrButtonStars() {
		return this.strButtonStars;
	}

	public Integer getIntIsuse() {
		return this.intIsuse;
	}

	public Integer getIntIsuseGreaterThanOrEqual() {
		return this.intIsuseGreaterThanOrEqual;
	}

	public Integer getIntIsuseLessThanOrEqual() {
		return this.intIsuseLessThanOrEqual;
	}

	public List<Integer> getIntIsuses() {
		return this.intIsuses;
	}

	public Integer getWbsIndexIn() {
		return this.wbsIndexIn;
	}

	public Integer getWbsIndexInGreaterThanOrEqual() {
		return this.wbsIndexInGreaterThanOrEqual;
	}

	public Integer getWbsIndexInLessThanOrEqual() {
		return this.wbsIndexInLessThanOrEqual;
	}

	public List<Integer> getWbsIndexIns() {
		return this.wbsIndexIns;
	}

	public Integer getUindexId() {
		return this.uindexId;
	}

	public Integer getUindexIdGreaterThanOrEqual() {
		return this.uindexIdGreaterThanOrEqual;
	}

	public Integer getUindexIdLessThanOrEqual() {
		return this.uindexIdLessThanOrEqual;
	}

	public List<Integer> getUindexIds() {
		return this.uindexIds;
	}

	public Integer getLisNoWbs() {
		return this.lisNoWbs;
	}

	public Integer getLisNoWbsGreaterThanOrEqual() {
		return this.lisNoWbsGreaterThanOrEqual;
	}

	public Integer getLisNoWbsLessThanOrEqual() {
		return this.lisNoWbsLessThanOrEqual;
	}

	public List<Integer> getLisNoWbss() {
		return this.lisNoWbss;
	}

	public String getSysIdAdd() {
		return this.sysIdAdd;
	}

	public String getSysIdAddLike() {
		if ((this.sysIdAddLike != null)
				&& (this.sysIdAddLike.trim().length() > 0)) {
			if (!(this.sysIdAddLike.startsWith("%"))) {
				this.sysIdAddLike = "%" + this.sysIdAddLike;
			}
			if (!(this.sysIdAddLike.endsWith("%"))) {
				this.sysIdAddLike += "%";
			}
		}
		return this.sysIdAddLike;
	}

	public List<String> getSysIdAdds() {
		return this.sysIdAdds;
	}

	public Integer getIndexInAdd() {
		return this.indexInAdd;
	}

	public Integer getIndexInAddGreaterThanOrEqual() {
		return this.indexInAddGreaterThanOrEqual;
	}

	public Integer getIndexInAddLessThanOrEqual() {
		return this.indexInAddLessThanOrEqual;
	}

	public List<Integer> getIndexInAdds() {
		return this.indexInAdds;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public String getCreateByLike() {
		if ((this.createByLike != null)
				&& (this.createByLike.trim().length() > 0)) {
			if (!(this.createByLike.startsWith("%"))) {
				this.createByLike = "%" + this.createByLike;
			}
			if (!(this.createByLike.endsWith("%"))) {
				this.createByLike += "%";
			}
		}
		return this.createByLike;
	}

	public List<String> getCreateBys() {
		return this.createBys;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public Date getCreateDateGreaterThanOrEqual() {
		return this.createDateGreaterThanOrEqual;
	}

	public Date getCreateDateLessThanOrEqual() {
		return this.createDateLessThanOrEqual;
	}

	public Date getUpdateDateGreaterThanOrEqual() {
		return this.updateDateGreaterThanOrEqual;
	}

	public Date getUpdateDateLessThanOrEqual() {
		return this.updateDateLessThanOrEqual;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public String getUpdateByLike() {
		if ((this.updateByLike != null)
				&& (this.updateByLike.trim().length() > 0)) {
			if (!(this.updateByLike.startsWith("%"))) {
				this.updateByLike = "%" + this.updateByLike;
			}
			if (!(this.updateByLike.endsWith("%"))) {
				this.updateByLike += "%";
			}
		}
		return this.updateByLike;
	}

	public List<String> getUpdateBys() {
		return this.updateBys;
	}

	public List<String> getIdLikeList() {
		return idLikeList;
	}

	public Boolean getBdatesIsNotNull() {
		return bdatesIsNotNull;
	}

	public String getConditionString() {
		return conditionString;
	}

	public String getProjTypeNotEqual() {
		return projTypeNotEqual;
	}

	public void setIndexIds(List<Integer> indexIds) {
		this.indexIds = indexIds;
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

	public void setNum(String num) {
		this.num = num;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setNums(List<String> nums) {
		this.nums = nums;
	}

	public void setTopId(Integer topId) {
		this.topId = topId;
	}

	public void setTopIdGreaterThanOrEqual(Integer topIdGreaterThanOrEqual) {
		this.topIdGreaterThanOrEqual = topIdGreaterThanOrEqual;
	}

	public void setTopIdLessThanOrEqual(Integer topIdLessThanOrEqual) {
		this.topIdLessThanOrEqual = topIdLessThanOrEqual;
	}

	public void setTopIds(List<Integer> topIds) {
		this.topIds = topIds;
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

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public void setNodeTypeLike(String nodeTypeLike) {
		this.nodeTypeLike = nodeTypeLike;
	}

	public void setNodeTypes(List<String> nodeTypes) {
		this.nodeTypes = nodeTypes;
	}

	public void setFromId(Integer fromId) {
		this.fromId = fromId;
	}

	public void setFromIdGreaterThanOrEqual(Integer fromIdGreaterThanOrEqual) {
		this.fromIdGreaterThanOrEqual = fromIdGreaterThanOrEqual;
	}

	public void setFromIdLessThanOrEqual(Integer fromIdLessThanOrEqual) {
		this.fromIdLessThanOrEqual = fromIdLessThanOrEqual;
	}

	public void setFromIds(List<Integer> fromIds) {
		this.fromIds = fromIds;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public void setPartIdGreaterThanOrEqual(Integer partIdGreaterThanOrEqual) {
		this.partIdGreaterThanOrEqual = partIdGreaterThanOrEqual;
	}

	public void setPartIdLessThanOrEqual(Integer partIdLessThanOrEqual) {
		this.partIdLessThanOrEqual = partIdLessThanOrEqual;
	}

	public void setPartIds(List<Integer> partIds) {
		this.partIds = partIds;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public void setShowIdGreaterThanOrEqual(Integer showIdGreaterThanOrEqual) {
		this.showIdGreaterThanOrEqual = showIdGreaterThanOrEqual;
	}

	public void setShowIdLessThanOrEqual(Integer showIdLessThanOrEqual) {
		this.showIdLessThanOrEqual = showIdLessThanOrEqual;
	}

	public void setShowIds(List<Integer> showIds) {
		this.showIds = showIds;
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

	public void setFileNum(Integer fileNum) {
		this.fileNum = fileNum;
	}

	public void setFileNumGreaterThanOrEqual(Integer fileNumGreaterThanOrEqual) {
		this.fileNumGreaterThanOrEqual = fileNumGreaterThanOrEqual;
	}

	public void setFileNumLessThanOrEqual(Integer fileNumLessThanOrEqual) {
		this.fileNumLessThanOrEqual = fileNumLessThanOrEqual;
	}

	public void setFileNums(List<Integer> fileNums) {
		this.fileNums = fileNums;
	}

	public void setFileNum0(Integer fileNum0) {
		this.fileNum0 = fileNum0;
	}

	public void setFileNum0GreaterThanOrEqual(Integer fileNum0GreaterThanOrEqual) {
		this.fileNum0GreaterThanOrEqual = fileNum0GreaterThanOrEqual;
	}

	public void setFileNum0LessThanOrEqual(Integer fileNum0LessThanOrEqual) {
		this.fileNum0LessThanOrEqual = fileNum0LessThanOrEqual;
	}

	public void setFileNum0s(List<Integer> fileNum0s) {
		this.fileNum0s = fileNum0s;
	}

	public void setFileNum1(Integer fileNum1) {
		this.fileNum1 = fileNum1;
	}

	public void setFileNum1GreaterThanOrEqual(Integer fileNum1GreaterThanOrEqual) {
		this.fileNum1GreaterThanOrEqual = fileNum1GreaterThanOrEqual;
	}

	public void setFileNum1LessThanOrEqual(Integer fileNum1LessThanOrEqual) {
		this.fileNum1LessThanOrEqual = fileNum1LessThanOrEqual;
	}

	public void setFileNum1s(List<Integer> fileNum1s) {
		this.fileNum1s = fileNum1s;
	}

	public void setFileNum2(Integer fileNum2) {
		this.fileNum2 = fileNum2;
	}

	public void setFileNum2GreaterThanOrEqual(Integer fileNum2GreaterThanOrEqual) {
		this.fileNum2GreaterThanOrEqual = fileNum2GreaterThanOrEqual;
	}

	public void setFileNum2LessThanOrEqual(Integer fileNum2LessThanOrEqual) {
		this.fileNum2LessThanOrEqual = fileNum2LessThanOrEqual;
	}

	public void setFileNum2s(List<Integer> fileNum2s) {
		this.fileNum2s = fileNum2s;
	}

	public void setProjType(String projType) {
		this.projType = projType;
	}

	public void setProjTypeLike(String projTypeLike) {
		this.projTypeLike = projTypeLike;
	}

	public void setProjTypes(List<String> projTypes) {
		this.projTypes = projTypes;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setCidLike(String cidLike) {
		this.cidLike = cidLike;
	}

	public void setCids(List<String> cids) {
		this.cids = cids;
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

	public void setFxid(Integer fxid) {
		this.fxid = fxid;
	}

	public void setFxidGreaterThanOrEqual(Integer fxidGreaterThanOrEqual) {
		this.fxidGreaterThanOrEqual = fxidGreaterThanOrEqual;
	}

	public void setFxidLessThanOrEqual(Integer fxidLessThanOrEqual) {
		this.fxidLessThanOrEqual = fxidLessThanOrEqual;
	}

	public void setFxids(List<Integer> fxids) {
		this.fxids = fxids;
	}

	public void setFbid(Integer fbid) {
		this.fbid = fbid;
	}

	public void setFbidGreaterThanOrEqual(Integer fbidGreaterThanOrEqual) {
		this.fbidGreaterThanOrEqual = fbidGreaterThanOrEqual;
	}

	public void setFbidLessThanOrEqual(Integer fbidLessThanOrEqual) {
		this.fbidLessThanOrEqual = fbidLessThanOrEqual;
	}

	public void setFbids(List<Integer> fbids) {
		this.fbids = fbids;
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

	public void setTopNode(String topNode) {
		this.topNode = topNode;
	}

	public void setTopNodeLike(String topNodeLike) {
		this.topNodeLike = topNodeLike;
	}

	public void setTopNodes(List<String> topNodes) {
		this.topNodes = topNodes;
	}

	public void setNodeIco(Integer nodeIco) {
		this.nodeIco = nodeIco;
	}

	public void setNodeIcoGreaterThanOrEqual(Integer nodeIcoGreaterThanOrEqual) {
		this.nodeIcoGreaterThanOrEqual = nodeIcoGreaterThanOrEqual;
	}

	public void setNodeIcoLessThanOrEqual(Integer nodeIcoLessThanOrEqual) {
		this.nodeIcoLessThanOrEqual = nodeIcoLessThanOrEqual;
	}

	public void setNodeIcos(List<Integer> nodeIcos) {
		this.nodeIcos = nodeIcos;
	}

	public void setOutFlag(String outFlag) {
		this.outFlag = outFlag;
	}

	public void setOutFlagLike(String outFlagLike) {
		this.outFlagLike = outFlagLike;
	}

	public void setOutFlags(List<String> outFlags) {
		this.outFlags = outFlags;
	}

	public void setInFlag(String inFlag) {
		this.inFlag = inFlag;
	}

	public void setInFlagLike(String inFlagLike) {
		this.inFlagLike = inFlagLike;
	}

	public void setInFlags(List<String> inFlags) {
		this.inFlags = inFlags;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPasswordLike(String passwordLike) {
		this.passwordLike = passwordLike;
	}

	public void setPasswords(List<String> passwords) {
		this.passwords = passwords;
	}

	public void setListNum(String listNum) {
		this.listNum = listNum;
	}

	public void setListNumLike(String listNumLike) {
		this.listNumLike = listNumLike;
	}

	public void setListNums(List<String> listNums) {
		this.listNums = listNums;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public void setWcompanyLike(String wcompanyLike) {
		this.wcompanyLike = wcompanyLike;
	}

	public void setWcompanys(List<String> wcompanys) {
		this.wcompanys = wcompanys;
	}

	public void setListNo(Integer listNo) {
		this.listNo = listNo;
	}

	public void setListNoGreaterThanOrEqual(Integer listNoGreaterThanOrEqual) {
		this.listNoGreaterThanOrEqual = listNoGreaterThanOrEqual;
	}

	public void setListNoLessThanOrEqual(Integer listNoLessThanOrEqual) {
		this.listNoLessThanOrEqual = listNoLessThanOrEqual;
	}

	public void setListNos(List<Integer> listNos) {
		this.listNos = listNos;
	}

	public void setUsernmu(String usernmu) {
		this.usernmu = usernmu;
	}

	public void setUsernmuLike(String usernmuLike) {
		this.usernmuLike = usernmuLike;
	}

	public void setUsernmus(List<String> usernmus) {
		this.usernmus = usernmus;
	}

	public void setIndexIdOld(Integer indexIdOld) {
		this.indexIdOld = indexIdOld;
	}

	public void setIndexIdOldGreaterThanOrEqual(
			Integer indexIdOldGreaterThanOrEqual) {
		this.indexIdOldGreaterThanOrEqual = indexIdOldGreaterThanOrEqual;
	}

	public void setIndexIdOldLessThanOrEqual(Integer indexIdOldLessThanOrEqual) {
		this.indexIdOldLessThanOrEqual = indexIdOldLessThanOrEqual;
	}

	public void setIndexIdOlds(List<Integer> indexIdOlds) {
		this.indexIdOlds = indexIdOlds;
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

	public void setFinishInt(Integer finishInt) {
		this.finishInt = finishInt;
	}

	public void setFinishIntGreaterThanOrEqual(
			Integer finishIntGreaterThanOrEqual) {
		this.finishIntGreaterThanOrEqual = finishIntGreaterThanOrEqual;
	}

	public void setFinishIntLessThanOrEqual(Integer finishIntLessThanOrEqual) {
		this.finishIntLessThanOrEqual = finishIntLessThanOrEqual;
	}

	public void setFinishInts(List<Integer> finishInts) {
		this.finishInts = finishInts;
	}

	public void setTypeTableName(String typeTableName) {
		this.typeTableName = typeTableName;
	}

	public void setTypeTableNameLike(String typeTableNameLike) {
		this.typeTableNameLike = typeTableNameLike;
	}

	public void setTypeTableNames(List<String> typeTableNames) {
		this.typeTableNames = typeTableNames;
	}

	public void setTreedListStr(String treedListStr) {
		this.treedListStr = treedListStr;
	}

	public void setTreedListStrLike(String treedListStrLike) {
		this.treedListStrLike = treedListStrLike;
	}

	public void setTreedListStrs(List<String> treedListStrs) {
		this.treedListStrs = treedListStrs;
	}

	public void setPfilesIndex(Integer pfilesIndex) {
		this.pfilesIndex = pfilesIndex;
	}

	public void setPfilesIndexGreaterThanOrEqual(
			Integer pfilesIndexGreaterThanOrEqual) {
		this.pfilesIndexGreaterThanOrEqual = pfilesIndexGreaterThanOrEqual;
	}

	public void setPfilesIndexLessThanOrEqual(Integer pfilesIndexLessThanOrEqual) {
		this.pfilesIndexLessThanOrEqual = pfilesIndexLessThanOrEqual;
	}

	public void setPfilesIndexs(List<Integer> pfilesIndexs) {
		this.pfilesIndexs = pfilesIndexs;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public void setBdateGreaterThanOrEqual(Date bdateGreaterThanOrEqual) {
		this.bdateGreaterThanOrEqual = bdateGreaterThanOrEqual;
	}

	public void setBdateLessThanOrEqual(Date bdateLessThanOrEqual) {
		this.bdateLessThanOrEqual = bdateLessThanOrEqual;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public void setEdateGreaterThanOrEqual(Date edateGreaterThanOrEqual) {
		this.edateGreaterThanOrEqual = edateGreaterThanOrEqual;
	}

	public void setEdateLessThanOrEqual(Date edateLessThanOrEqual) {
		this.edateLessThanOrEqual = edateLessThanOrEqual;
	}

	public void setWbsIndex(Integer wbsIndex) {
		this.wbsIndex = wbsIndex;
	}

	public void setWbsIndexGreaterThanOrEqual(Integer wbsIndexGreaterThanOrEqual) {
		this.wbsIndexGreaterThanOrEqual = wbsIndexGreaterThanOrEqual;
	}

	public void setWbsIndexLessThanOrEqual(Integer wbsIndexLessThanOrEqual) {
		this.wbsIndexLessThanOrEqual = wbsIndexLessThanOrEqual;
	}

	public void setWbsIndexs(List<Integer> wbsIndexs) {
		this.wbsIndexs = wbsIndexs;
	}

	public void setBdates(Date bdates) {
		this.bdates = bdates;
	}

	public void setBdatesGreaterThanOrEqual(Date bdatesGreaterThanOrEqual) {
		this.bdatesGreaterThanOrEqual = bdatesGreaterThanOrEqual;
	}

	public void setBdatesLessThanOrEqual(Date bdatesLessThanOrEqual) {
		this.bdatesLessThanOrEqual = bdatesLessThanOrEqual;
	}

	public void setBdatess(List<Date> bdatess) {
		this.bdatess = bdatess;
	}

	public void setEdates(Date edates) {
		this.edates = edates;
	}

	public void setEdatesGreaterThanOrEqual(Date edatesGreaterThanOrEqual) {
		this.edatesGreaterThanOrEqual = edatesGreaterThanOrEqual;
	}

	public void setEdatesLessThanOrEqual(Date edatesLessThanOrEqual) {
		this.edatesLessThanOrEqual = edatesLessThanOrEqual;
	}

	public void setEdatess(List<Date> edatess) {
		this.edatess = edatess;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIdLike(String typeIdLike) {
		this.typeIdLike = typeIdLike;
	}

	public void setTypeIds(List<String> typeIds) {
		this.typeIds = typeIds;
	}

	public void setCell1(Integer cell1) {
		this.cell1 = cell1;
	}

	public void setCell1GreaterThanOrEqual(Integer cell1GreaterThanOrEqual) {
		this.cell1GreaterThanOrEqual = cell1GreaterThanOrEqual;
	}

	public void setCell1LessThanOrEqual(Integer cell1LessThanOrEqual) {
		this.cell1LessThanOrEqual = cell1LessThanOrEqual;
	}

	public void setCell1s(List<Integer> cell1s) {
		this.cell1s = cell1s;
	}

	public void setCell2(Integer cell2) {
		this.cell2 = cell2;
	}

	public void setCell2GreaterThanOrEqual(Integer cell2GreaterThanOrEqual) {
		this.cell2GreaterThanOrEqual = cell2GreaterThanOrEqual;
	}

	public void setCell2LessThanOrEqual(Integer cell2LessThanOrEqual) {
		this.cell2LessThanOrEqual = cell2LessThanOrEqual;
	}

	public void setCell2s(List<Integer> cell2s) {
		this.cell2s = cell2s;
	}

	public void setCell3(Integer cell3) {
		this.cell3 = cell3;
	}

	public void setCell3GreaterThanOrEqual(Integer cell3GreaterThanOrEqual) {
		this.cell3GreaterThanOrEqual = cell3GreaterThanOrEqual;
	}

	public void setCell3LessThanOrEqual(Integer cell3LessThanOrEqual) {
		this.cell3LessThanOrEqual = cell3LessThanOrEqual;
	}

	public void setCell3s(List<Integer> cell3s) {
		this.cell3s = cell3s;
	}

	public void setStrFileLocate(String strFileLocate) {
		this.strFileLocate = strFileLocate;
	}

	public void setStrFileLocateLike(String strFileLocateLike) {
		this.strFileLocateLike = strFileLocateLike;
	}

	public void setStrFileLocates(List<String> strFileLocates) {
		this.strFileLocates = strFileLocates;
	}

	public void setIntpFile1(Integer intpFile1) {
		this.intpFile1 = intpFile1;
	}

	public void setIntpFile1GreaterThanOrEqual(
			Integer intpFile1GreaterThanOrEqual) {
		this.intpFile1GreaterThanOrEqual = intpFile1GreaterThanOrEqual;
	}

	public void setIntpFile1LessThanOrEqual(Integer intpFile1LessThanOrEqual) {
		this.intpFile1LessThanOrEqual = intpFile1LessThanOrEqual;
	}

	public void setIntpFile1s(List<Integer> intpFile1s) {
		this.intpFile1s = intpFile1s;
	}

	public void setIntpFile2(Integer intpFile2) {
		this.intpFile2 = intpFile2;
	}

	public void setIntpFile2GreaterThanOrEqual(
			Integer intpFile2GreaterThanOrEqual) {
		this.intpFile2GreaterThanOrEqual = intpFile2GreaterThanOrEqual;
	}

	public void setIntpFile2LessThanOrEqual(Integer intpFile2LessThanOrEqual) {
		this.intpFile2LessThanOrEqual = intpFile2LessThanOrEqual;
	}

	public void setIntpFile2s(List<Integer> intpFile2s) {
		this.intpFile2s = intpFile2s;
	}

	public void setIntpFile3(Integer intpFile3) {
		this.intpFile3 = intpFile3;
	}

	public void setIntpFile3GreaterThanOrEqual(
			Integer intpFile3GreaterThanOrEqual) {
		this.intpFile3GreaterThanOrEqual = intpFile3GreaterThanOrEqual;
	}

	public void setIntpFile3LessThanOrEqual(Integer intpFile3LessThanOrEqual) {
		this.intpFile3LessThanOrEqual = intpFile3LessThanOrEqual;
	}

	public void setIntpFile3s(List<Integer> intpFile3s) {
		this.intpFile3s = intpFile3s;
	}

	public void setIntCellFinish(Integer intCellFinish) {
		this.intCellFinish = intCellFinish;
	}

	public void setIntCellFinishGreaterThanOrEqual(
			Integer intCellFinishGreaterThanOrEqual) {
		this.intCellFinishGreaterThanOrEqual = intCellFinishGreaterThanOrEqual;
	}

	public void setIntCellFinishLessThanOrEqual(
			Integer intCellFinishLessThanOrEqual) {
		this.intCellFinishLessThanOrEqual = intCellFinishLessThanOrEqual;
	}

	public void setIntCellFinishs(List<Integer> intCellFinishs) {
		this.intCellFinishs = intCellFinishs;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public void setSysIdLike(String sysIdLike) {
		this.sysIdLike = sysIdLike;
	}

	public void setSysIds(List<String> sysIds) {
		this.sysIds = sysIds;
	}

	public void setIndexIn(Integer indexIn) {
		this.indexIn = indexIn;
	}

	public void setIndexInGreaterThanOrEqual(Integer indexInGreaterThanOrEqual) {
		this.indexInGreaterThanOrEqual = indexInGreaterThanOrEqual;
	}

	public void setIndexInLessThanOrEqual(Integer indexInLessThanOrEqual) {
		this.indexInLessThanOrEqual = indexInLessThanOrEqual;
	}

	public void setIndexIns(List<Integer> indexIns) {
		this.indexIns = indexIns;
	}

	public void setStrButtonStar(String strButtonStar) {
		this.strButtonStar = strButtonStar;
	}

	public void setStrButtonStarLike(String strButtonStarLike) {
		this.strButtonStarLike = strButtonStarLike;
	}

	public void setStrButtonStars(List<String> strButtonStars) {
		this.strButtonStars = strButtonStars;
	}

	public void setIntIsuse(Integer intIsuse) {
		this.intIsuse = intIsuse;
	}

	public void setIntIsuseGreaterThanOrEqual(Integer intIsuseGreaterThanOrEqual) {
		this.intIsuseGreaterThanOrEqual = intIsuseGreaterThanOrEqual;
	}

	public void setIntIsuseLessThanOrEqual(Integer intIsuseLessThanOrEqual) {
		this.intIsuseLessThanOrEqual = intIsuseLessThanOrEqual;
	}

	public void setIntIsuses(List<Integer> intIsuses) {
		this.intIsuses = intIsuses;
	}

	public void setWbsIndexIn(Integer wbsIndexIn) {
		this.wbsIndexIn = wbsIndexIn;
	}

	public void setWbsIndexInGreaterThanOrEqual(
			Integer wbsIndexInGreaterThanOrEqual) {
		this.wbsIndexInGreaterThanOrEqual = wbsIndexInGreaterThanOrEqual;
	}

	public void setWbsIndexInLessThanOrEqual(Integer wbsIndexInLessThanOrEqual) {
		this.wbsIndexInLessThanOrEqual = wbsIndexInLessThanOrEqual;
	}

	public void setWbsIndexIns(List<Integer> wbsIndexIns) {
		this.wbsIndexIns = wbsIndexIns;
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

	public void setLisNoWbs(Integer lisNoWbs) {
		this.lisNoWbs = lisNoWbs;
	}

	public void setLisNoWbsGreaterThanOrEqual(Integer lisNoWbsGreaterThanOrEqual) {
		this.lisNoWbsGreaterThanOrEqual = lisNoWbsGreaterThanOrEqual;
	}

	public void setLisNoWbsLessThanOrEqual(Integer lisNoWbsLessThanOrEqual) {
		this.lisNoWbsLessThanOrEqual = lisNoWbsLessThanOrEqual;
	}

	public void setLisNoWbss(List<Integer> lisNoWbss) {
		this.lisNoWbss = lisNoWbss;
	}

	public void setSysIdAdd(String sysIdAdd) {
		this.sysIdAdd = sysIdAdd;
	}

	public void setSysIdAddLike(String sysIdAddLike) {
		this.sysIdAddLike = sysIdAddLike;
	}

	public void setSysIdAdds(List<String> sysIdAdds) {
		this.sysIdAdds = sysIdAdds;
	}

	public void setIndexInAdd(Integer indexInAdd) {
		this.indexInAdd = indexInAdd;
	}

	public void setIndexInAddGreaterThanOrEqual(
			Integer indexInAddGreaterThanOrEqual) {
		this.indexInAddGreaterThanOrEqual = indexInAddGreaterThanOrEqual;
	}

	public void setIndexInAddLessThanOrEqual(Integer indexInAddLessThanOrEqual) {
		this.indexInAddLessThanOrEqual = indexInAddLessThanOrEqual;
	}

	public void setIndexInAdds(List<Integer> indexInAdds) {
		this.indexInAdds = indexInAdds;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public void setCreateByLike(String createByLike) {
		this.createByLike = createByLike;
	}

	public void setCreateBys(List<String> createBys) {
		this.createBys = createBys;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setCreateDateGreaterThanOrEqual(
			Date createDateGreaterThanOrEqual) {
		this.createDateGreaterThanOrEqual = createDateGreaterThanOrEqual;
	}

	public void setCreateDateLessThanOrEqual(Date createDateLessThanOrEqual) {
		this.createDateLessThanOrEqual = createDateLessThanOrEqual;
	}

	public void setUpdateDateGreaterThanOrEqual(
			Date updateDateGreaterThanOrEqual) {
		this.updateDateGreaterThanOrEqual = updateDateGreaterThanOrEqual;
	}

	public void setUpdateDateLessThanOrEqual(Date updateDateLessThanOrEqual) {
		this.updateDateLessThanOrEqual = updateDateLessThanOrEqual;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public void setUpdateByLike(String updateByLike) {
		this.updateByLike = updateByLike;
	}

	public void setUpdateBys(List<String> updateBys) {
		this.updateBys = updateBys;
	}

	public void setIdLikeList(List<String> idLikeList) {
		this.idLikeList = idLikeList;
	}

	public void setBdatesIsNotNull(Boolean bdatesIsNotNull) {
		this.bdatesIsNotNull = bdatesIsNotNull;
	}

	public void setConditionString(String conditionString) {
		this.conditionString = conditionString;
	}

	public void setProjTypeNotEqual(String projTypeNotEqual) {
		this.projTypeNotEqual = projTypeNotEqual;
	}

	public TreeProjectInfoQuery id(String id) {
		if (id == null) {
			throw new RuntimeException("id is null");
		}
		this.id = id;
		return this;
	}

	public TreeProjectInfoQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public TreeProjectInfoQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public TreeProjectInfoQuery num(String num) {
		if (num == null) {
			throw new RuntimeException("num is null");
		}
		this.num = num;
		return this;
	}

	public TreeProjectInfoQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreeProjectInfoQuery nums(List<String> nums) {
		if (nums == null) {
			throw new RuntimeException("nums is empty ");
		}
		this.nums = nums;
		return this;
	}

	public TreeProjectInfoQuery topId(Integer topId) {
		if (topId == null) {
			throw new RuntimeException("topId is null");
		}
		this.topId = topId;
		return this;
	}

	public TreeProjectInfoQuery topIdGreaterThanOrEqual(
			Integer topIdGreaterThanOrEqual) {
		if (topIdGreaterThanOrEqual == null) {
			throw new RuntimeException("topId is null");
		}
		this.topIdGreaterThanOrEqual = topIdGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery topIdLessThanOrEqual(
			Integer topIdLessThanOrEqual) {
		if (topIdLessThanOrEqual == null) {
			throw new RuntimeException("topId is null");
		}
		this.topIdLessThanOrEqual = topIdLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery topIds(List<Integer> topIds) {
		if (topIds == null) {
			throw new RuntimeException("topIds is empty ");
		}
		this.topIds = topIds;
		return this;
	}

	public TreeProjectInfoQuery indexName(String indexName) {
		if (indexName == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexName = indexName;
		return this;
	}

	public TreeProjectInfoQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	public TreeProjectInfoQuery indexNames(List<String> indexNames) {
		if (indexNames == null) {
			throw new RuntimeException("indexNames is empty ");
		}
		this.indexNames = indexNames;
		return this;
	}

	public TreeProjectInfoQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreeProjectInfoQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery nlevelLessThanOrEqual(
			Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreeProjectInfoQuery nodeType(String nodeType) {
		if (nodeType == null) {
			throw new RuntimeException("nodeType is null");
		}
		this.nodeType = nodeType;
		return this;
	}

	public TreeProjectInfoQuery nodeTypeLike(String nodeTypeLike) {
		if (nodeTypeLike == null) {
			throw new RuntimeException("nodeType is null");
		}
		this.nodeTypeLike = nodeTypeLike;
		return this;
	}

	public TreeProjectInfoQuery nodeTypes(List<String> nodeTypes) {
		if (nodeTypes == null) {
			throw new RuntimeException("nodeTypes is empty ");
		}
		this.nodeTypes = nodeTypes;
		return this;
	}

	public TreeProjectInfoQuery fromId(Integer fromId) {
		if (fromId == null) {
			throw new RuntimeException("fromId is null");
		}
		this.fromId = fromId;
		return this;
	}

	public TreeProjectInfoQuery fromIdGreaterThanOrEqual(
			Integer fromIdGreaterThanOrEqual) {
		if (fromIdGreaterThanOrEqual == null) {
			throw new RuntimeException("fromId is null");
		}
		this.fromIdGreaterThanOrEqual = fromIdGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fromIdLessThanOrEqual(
			Integer fromIdLessThanOrEqual) {
		if (fromIdLessThanOrEqual == null) {
			throw new RuntimeException("fromId is null");
		}
		this.fromIdLessThanOrEqual = fromIdLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fromIds(List<Integer> fromIds) {
		if (fromIds == null) {
			throw new RuntimeException("fromIds is empty ");
		}
		this.fromIds = fromIds;
		return this;
	}

	public TreeProjectInfoQuery partId(Integer partId) {
		if (partId == null) {
			throw new RuntimeException("partId is null");
		}
		this.partId = partId;
		return this;
	}

	public TreeProjectInfoQuery partIdGreaterThanOrEqual(
			Integer partIdGreaterThanOrEqual) {
		if (partIdGreaterThanOrEqual == null) {
			throw new RuntimeException("partId is null");
		}
		this.partIdGreaterThanOrEqual = partIdGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery partIdLessThanOrEqual(
			Integer partIdLessThanOrEqual) {
		if (partIdLessThanOrEqual == null) {
			throw new RuntimeException("partId is null");
		}
		this.partIdLessThanOrEqual = partIdLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery partIds(List<Integer> partIds) {
		if (partIds == null) {
			throw new RuntimeException("partIds is empty ");
		}
		this.partIds = partIds;
		return this;
	}

	public TreeProjectInfoQuery showId(Integer showId) {
		if (showId == null) {
			throw new RuntimeException("showId is null");
		}
		this.showId = showId;
		return this;
	}

	public TreeProjectInfoQuery showIdGreaterThanOrEqual(
			Integer showIdGreaterThanOrEqual) {
		if (showIdGreaterThanOrEqual == null) {
			throw new RuntimeException("showId is null");
		}
		this.showIdGreaterThanOrEqual = showIdGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery showIdLessThanOrEqual(
			Integer showIdLessThanOrEqual) {
		if (showIdLessThanOrEqual == null) {
			throw new RuntimeException("showId is null");
		}
		this.showIdLessThanOrEqual = showIdLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery showIds(List<Integer> showIds) {
		if (showIds == null) {
			throw new RuntimeException("showIds is empty ");
		}
		this.showIds = showIds;
		return this;
	}

	public TreeProjectInfoQuery sindexName(String sindexName) {
		if (sindexName == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexName = sindexName;
		return this;
	}

	public TreeProjectInfoQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public TreeProjectInfoQuery sindexNames(List<String> sindexNames) {
		if (sindexNames == null) {
			throw new RuntimeException("sindexNames is empty ");
		}
		this.sindexNames = sindexNames;
		return this;
	}

	public TreeProjectInfoQuery fileNum(Integer fileNum) {
		if (fileNum == null) {
			throw new RuntimeException("fileNum is null");
		}
		this.fileNum = fileNum;
		return this;
	}

	public TreeProjectInfoQuery fileNumGreaterThanOrEqual(
			Integer fileNumGreaterThanOrEqual) {
		if (fileNumGreaterThanOrEqual == null) {
			throw new RuntimeException("fileNum is null");
		}
		this.fileNumGreaterThanOrEqual = fileNumGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fileNumLessThanOrEqual(
			Integer fileNumLessThanOrEqual) {
		if (fileNumLessThanOrEqual == null) {
			throw new RuntimeException("fileNum is null");
		}
		this.fileNumLessThanOrEqual = fileNumLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fileNums(List<Integer> fileNums) {
		if (fileNums == null) {
			throw new RuntimeException("fileNums is empty ");
		}
		this.fileNums = fileNums;
		return this;
	}

	public TreeProjectInfoQuery fileNum0(Integer fileNum0) {
		if (fileNum0 == null) {
			throw new RuntimeException("fileNum0 is null");
		}
		this.fileNum0 = fileNum0;
		return this;
	}

	public TreeProjectInfoQuery fileNum0GreaterThanOrEqual(
			Integer fileNum0GreaterThanOrEqual) {
		if (fileNum0GreaterThanOrEqual == null) {
			throw new RuntimeException("fileNum0 is null");
		}
		this.fileNum0GreaterThanOrEqual = fileNum0GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fileNum0LessThanOrEqual(
			Integer fileNum0LessThanOrEqual) {
		if (fileNum0LessThanOrEqual == null) {
			throw new RuntimeException("fileNum0 is null");
		}
		this.fileNum0LessThanOrEqual = fileNum0LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fileNum0s(List<Integer> fileNum0s) {
		if (fileNum0s == null) {
			throw new RuntimeException("fileNum0s is empty ");
		}
		this.fileNum0s = fileNum0s;
		return this;
	}

	public TreeProjectInfoQuery fileNum1(Integer fileNum1) {
		if (fileNum1 == null) {
			throw new RuntimeException("fileNum1 is null");
		}
		this.fileNum1 = fileNum1;
		return this;
	}

	public TreeProjectInfoQuery fileNum1GreaterThanOrEqual(
			Integer fileNum1GreaterThanOrEqual) {
		if (fileNum1GreaterThanOrEqual == null) {
			throw new RuntimeException("fileNum1 is null");
		}
		this.fileNum1GreaterThanOrEqual = fileNum1GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fileNum1LessThanOrEqual(
			Integer fileNum1LessThanOrEqual) {
		if (fileNum1LessThanOrEqual == null) {
			throw new RuntimeException("fileNum1 is null");
		}
		this.fileNum1LessThanOrEqual = fileNum1LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fileNum1s(List<Integer> fileNum1s) {
		if (fileNum1s == null) {
			throw new RuntimeException("fileNum1s is empty ");
		}
		this.fileNum1s = fileNum1s;
		return this;
	}

	public TreeProjectInfoQuery fileNum2(Integer fileNum2) {
		if (fileNum2 == null) {
			throw new RuntimeException("fileNum2 is null");
		}
		this.fileNum2 = fileNum2;
		return this;
	}

	public TreeProjectInfoQuery fileNum2GreaterThanOrEqual(
			Integer fileNum2GreaterThanOrEqual) {
		if (fileNum2GreaterThanOrEqual == null) {
			throw new RuntimeException("fileNum2 is null");
		}
		this.fileNum2GreaterThanOrEqual = fileNum2GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fileNum2LessThanOrEqual(
			Integer fileNum2LessThanOrEqual) {
		if (fileNum2LessThanOrEqual == null) {
			throw new RuntimeException("fileNum2 is null");
		}
		this.fileNum2LessThanOrEqual = fileNum2LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fileNum2s(List<Integer> fileNum2s) {
		if (fileNum2s == null) {
			throw new RuntimeException("fileNum2s is empty ");
		}
		this.fileNum2s = fileNum2s;
		return this;
	}

	public TreeProjectInfoQuery projType(String projType) {
		if (projType == null) {
			throw new RuntimeException("projType is null");
		}
		this.projType = projType;
		return this;
	}

	public TreeProjectInfoQuery projTypeLike(String projTypeLike) {
		if (projTypeLike == null) {
			throw new RuntimeException("projType is null");
		}
		this.projTypeLike = projTypeLike;
		return this;
	}

	public TreeProjectInfoQuery projTypes(List<String> projTypes) {
		if (projTypes == null) {
			throw new RuntimeException("projTypes is empty ");
		}
		this.projTypes = projTypes;
		return this;
	}

	public TreeProjectInfoQuery cid(String cid) {
		if (cid == null) {
			throw new RuntimeException("cid is null");
		}
		this.cid = cid;
		return this;
	}

	public TreeProjectInfoQuery cidLike(String cidLike) {
		if (cidLike == null) {
			throw new RuntimeException("cid is null");
		}
		this.cidLike = cidLike;
		return this;
	}

	public TreeProjectInfoQuery cids(List<String> cids) {
		if (cids == null) {
			throw new RuntimeException("cids is empty ");
		}
		this.cids = cids;
		return this;
	}

	public TreeProjectInfoQuery dwid(Integer dwid) {
		if (dwid == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwid = dwid;
		return this;
	}

	public TreeProjectInfoQuery dwidGreaterThanOrEqual(
			Integer dwidGreaterThanOrEqual) {
		if (dwidGreaterThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidGreaterThanOrEqual = dwidGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery dwidLessThanOrEqual(Integer dwidLessThanOrEqual) {
		if (dwidLessThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidLessThanOrEqual = dwidLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery dwids(List<Integer> dwids) {
		if (dwids == null) {
			throw new RuntimeException("dwids is empty ");
		}
		this.dwids = dwids;
		return this;
	}

	public TreeProjectInfoQuery fxid(Integer fxid) {
		if (fxid == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxid = fxid;
		return this;
	}

	public TreeProjectInfoQuery fxidGreaterThanOrEqual(
			Integer fxidGreaterThanOrEqual) {
		if (fxidGreaterThanOrEqual == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxidGreaterThanOrEqual = fxidGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fxidLessThanOrEqual(Integer fxidLessThanOrEqual) {
		if (fxidLessThanOrEqual == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxidLessThanOrEqual = fxidLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fxids(List<Integer> fxids) {
		if (fxids == null) {
			throw new RuntimeException("fxids is empty ");
		}
		this.fxids = fxids;
		return this;
	}

	public TreeProjectInfoQuery fbid(Integer fbid) {
		if (fbid == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbid = fbid;
		return this;
	}

	public TreeProjectInfoQuery fbidGreaterThanOrEqual(
			Integer fbidGreaterThanOrEqual) {
		if (fbidGreaterThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidGreaterThanOrEqual = fbidGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fbidLessThanOrEqual(Integer fbidLessThanOrEqual) {
		if (fbidLessThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidLessThanOrEqual = fbidLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery fbids(List<Integer> fbids) {
		if (fbids == null) {
			throw new RuntimeException("fbids is empty ");
		}
		this.fbids = fbids;
		return this;
	}

	public TreeProjectInfoQuery jid(String jid) {
		if (jid == null) {
			throw new RuntimeException("jid is null");
		}
		this.jid = jid;
		return this;
	}

	public TreeProjectInfoQuery jidLike(String jidLike) {
		if (jidLike == null) {
			throw new RuntimeException("jid is null");
		}
		this.jidLike = jidLike;
		return this;
	}

	public TreeProjectInfoQuery jids(List<String> jids) {
		if (jids == null) {
			throw new RuntimeException("jids is empty ");
		}
		this.jids = jids;
		return this;
	}

	public TreeProjectInfoQuery flid(String flid) {
		if (flid == null) {
			throw new RuntimeException("flid is null");
		}
		this.flid = flid;
		return this;
	}

	public TreeProjectInfoQuery flidLike(String flidLike) {
		if (flidLike == null) {
			throw new RuntimeException("flid is null");
		}
		this.flidLike = flidLike;
		return this;
	}

	public TreeProjectInfoQuery flids(List<String> flids) {
		if (flids == null) {
			throw new RuntimeException("flids is empty ");
		}
		this.flids = flids;
		return this;
	}

	public TreeProjectInfoQuery topNode(String topNode) {
		if (topNode == null) {
			throw new RuntimeException("topNode is null");
		}
		this.topNode = topNode;
		return this;
	}

	public TreeProjectInfoQuery topNodeLike(String topNodeLike) {
		if (topNodeLike == null) {
			throw new RuntimeException("topNode is null");
		}
		this.topNodeLike = topNodeLike;
		return this;
	}

	public TreeProjectInfoQuery topNodes(List<String> topNodes) {
		if (topNodes == null) {
			throw new RuntimeException("topNodes is empty ");
		}
		this.topNodes = topNodes;
		return this;
	}

	public TreeProjectInfoQuery nodeIco(Integer nodeIco) {
		if (nodeIco == null) {
			throw new RuntimeException("nodeIco is null");
		}
		this.nodeIco = nodeIco;
		return this;
	}

	public TreeProjectInfoQuery nodeIcoGreaterThanOrEqual(
			Integer nodeIcoGreaterThanOrEqual) {
		if (nodeIcoGreaterThanOrEqual == null) {
			throw new RuntimeException("nodeIco is null");
		}
		this.nodeIcoGreaterThanOrEqual = nodeIcoGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery nodeIcoLessThanOrEqual(
			Integer nodeIcoLessThanOrEqual) {
		if (nodeIcoLessThanOrEqual == null) {
			throw new RuntimeException("nodeIco is null");
		}
		this.nodeIcoLessThanOrEqual = nodeIcoLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery nodeIcos(List<Integer> nodeIcos) {
		if (nodeIcos == null) {
			throw new RuntimeException("nodeIcos is empty ");
		}
		this.nodeIcos = nodeIcos;
		return this;
	}

	public TreeProjectInfoQuery outFlag(String outFlag) {
		if (outFlag == null) {
			throw new RuntimeException("outFlag is null");
		}
		this.outFlag = outFlag;
		return this;
	}

	public TreeProjectInfoQuery outFlagLike(String outFlagLike) {
		if (outFlagLike == null) {
			throw new RuntimeException("outFlag is null");
		}
		this.outFlagLike = outFlagLike;
		return this;
	}

	public TreeProjectInfoQuery outFlags(List<String> outFlags) {
		if (outFlags == null) {
			throw new RuntimeException("outFlags is empty ");
		}
		this.outFlags = outFlags;
		return this;
	}

	public TreeProjectInfoQuery inFlag(String inFlag) {
		if (inFlag == null) {
			throw new RuntimeException("inFlag is null");
		}
		this.inFlag = inFlag;
		return this;
	}

	public TreeProjectInfoQuery inFlagLike(String inFlagLike) {
		if (inFlagLike == null) {
			throw new RuntimeException("inFlag is null");
		}
		this.inFlagLike = inFlagLike;
		return this;
	}

	public TreeProjectInfoQuery inFlags(List<String> inFlags) {
		if (inFlags == null) {
			throw new RuntimeException("inFlags is empty ");
		}
		this.inFlags = inFlags;
		return this;
	}

	public TreeProjectInfoQuery password(String password) {
		if (password == null) {
			throw new RuntimeException("password is null");
		}
		this.password = password;
		return this;
	}

	public TreeProjectInfoQuery passwordLike(String passwordLike) {
		if (passwordLike == null) {
			throw new RuntimeException("password is null");
		}
		this.passwordLike = passwordLike;
		return this;
	}

	public TreeProjectInfoQuery passwords(List<String> passwords) {
		if (passwords == null) {
			throw new RuntimeException("passwords is empty ");
		}
		this.passwords = passwords;
		return this;
	}

	public TreeProjectInfoQuery listNum(String listNum) {
		if (listNum == null) {
			throw new RuntimeException("listNum is null");
		}
		this.listNum = listNum;
		return this;
	}

	public TreeProjectInfoQuery listNumLike(String listNumLike) {
		if (listNumLike == null) {
			throw new RuntimeException("listNum is null");
		}
		this.listNumLike = listNumLike;
		return this;
	}

	public TreeProjectInfoQuery listNums(List<String> listNums) {
		if (listNums == null) {
			throw new RuntimeException("listNums is empty ");
		}
		this.listNums = listNums;
		return this;
	}

	public TreeProjectInfoQuery wcompany(String wcompany) {
		if (wcompany == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompany = wcompany;
		return this;
	}

	public TreeProjectInfoQuery wcompanyLike(String wcompanyLike) {
		if (wcompanyLike == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompanyLike = wcompanyLike;
		return this;
	}

	public TreeProjectInfoQuery wcompanys(List<String> wcompanys) {
		if (wcompanys == null) {
			throw new RuntimeException("wcompanys is empty ");
		}
		this.wcompanys = wcompanys;
		return this;
	}

	public TreeProjectInfoQuery listNo(Integer listNo) {
		if (listNo == null) {
			throw new RuntimeException("listNo is null");
		}
		this.listNo = listNo;
		return this;
	}

	public TreeProjectInfoQuery listNoGreaterThanOrEqual(
			Integer listNoGreaterThanOrEqual) {
		if (listNoGreaterThanOrEqual == null) {
			throw new RuntimeException("listNo is null");
		}
		this.listNoGreaterThanOrEqual = listNoGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery listNoLessThanOrEqual(
			Integer listNoLessThanOrEqual) {
		if (listNoLessThanOrEqual == null) {
			throw new RuntimeException("listNo is null");
		}
		this.listNoLessThanOrEqual = listNoLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery listNos(List<Integer> listNos) {
		if (listNos == null) {
			throw new RuntimeException("listNos is empty ");
		}
		this.listNos = listNos;
		return this;
	}

	public TreeProjectInfoQuery usernmu(String usernmu) {
		if (usernmu == null) {
			throw new RuntimeException("usernmu is null");
		}
		this.usernmu = usernmu;
		return this;
	}

	public TreeProjectInfoQuery usernmuLike(String usernmuLike) {
		if (usernmuLike == null) {
			throw new RuntimeException("usernmu is null");
		}
		this.usernmuLike = usernmuLike;
		return this;
	}

	public TreeProjectInfoQuery usernmus(List<String> usernmus) {
		if (usernmus == null) {
			throw new RuntimeException("usernmus is empty ");
		}
		this.usernmus = usernmus;
		return this;
	}

	public TreeProjectInfoQuery indexIdOld(Integer indexIdOld) {
		if (indexIdOld == null) {
			throw new RuntimeException("indexIdOld is null");
		}
		this.indexIdOld = indexIdOld;
		return this;
	}

	public TreeProjectInfoQuery indexIdOldGreaterThanOrEqual(
			Integer indexIdOldGreaterThanOrEqual) {
		if (indexIdOldGreaterThanOrEqual == null) {
			throw new RuntimeException("indexIdOld is null");
		}
		this.indexIdOldGreaterThanOrEqual = indexIdOldGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery indexIdOldLessThanOrEqual(
			Integer indexIdOldLessThanOrEqual) {
		if (indexIdOldLessThanOrEqual == null) {
			throw new RuntimeException("indexIdOld is null");
		}
		this.indexIdOldLessThanOrEqual = indexIdOldLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery indexIdOlds(List<Integer> indexIdOlds) {
		if (indexIdOlds == null) {
			throw new RuntimeException("indexIdOlds is empty ");
		}
		this.indexIdOlds = indexIdOlds;
		return this;
	}

	public TreeProjectInfoQuery pindexId(Integer pindexId) {
		if (pindexId == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexId = pindexId;
		return this;
	}

	public TreeProjectInfoQuery pindexIdGreaterThanOrEqual(
			Integer pindexIdGreaterThanOrEqual) {
		if (pindexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexIdGreaterThanOrEqual = pindexIdGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery pindexIdLessThanOrEqual(
			Integer pindexIdLessThanOrEqual) {
		if (pindexIdLessThanOrEqual == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexIdLessThanOrEqual = pindexIdLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery pindexIds(List<Integer> pindexIds) {
		if (pindexIds == null) {
			throw new RuntimeException("pindexIds is empty ");
		}
		this.pindexIds = pindexIds;
		return this;
	}

	public TreeProjectInfoQuery finishInt(Integer finishInt) {
		if (finishInt == null) {
			throw new RuntimeException("finishInt is null");
		}
		this.finishInt = finishInt;
		return this;
	}

	public TreeProjectInfoQuery finishIntGreaterThanOrEqual(
			Integer finishIntGreaterThanOrEqual) {
		if (finishIntGreaterThanOrEqual == null) {
			throw new RuntimeException("finishInt is null");
		}
		this.finishIntGreaterThanOrEqual = finishIntGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery finishIntLessThanOrEqual(
			Integer finishIntLessThanOrEqual) {
		if (finishIntLessThanOrEqual == null) {
			throw new RuntimeException("finishInt is null");
		}
		this.finishIntLessThanOrEqual = finishIntLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery finishInts(List<Integer> finishInts) {
		if (finishInts == null) {
			throw new RuntimeException("finishInts is empty ");
		}
		this.finishInts = finishInts;
		return this;
	}

	public TreeProjectInfoQuery typeTableName(String typeTableName) {
		if (typeTableName == null) {
			throw new RuntimeException("typeTableName is null");
		}
		this.typeTableName = typeTableName;
		return this;
	}

	public TreeProjectInfoQuery typeTableNameLike(String typeTableNameLike) {
		if (typeTableNameLike == null) {
			throw new RuntimeException("typeTableName is null");
		}
		this.typeTableNameLike = typeTableNameLike;
		return this;
	}

	public TreeProjectInfoQuery typeTableNames(List<String> typeTableNames) {
		if (typeTableNames == null) {
			throw new RuntimeException("typeTableNames is empty ");
		}
		this.typeTableNames = typeTableNames;
		return this;
	}

	public TreeProjectInfoQuery treedListStr(String treedListStr) {
		if (treedListStr == null) {
			throw new RuntimeException("treedListStr is null");
		}
		this.treedListStr = treedListStr;
		return this;
	}

	public TreeProjectInfoQuery treedListStrLike(String treedListStrLike) {
		if (treedListStrLike == null) {
			throw new RuntimeException("treedListStr is null");
		}
		this.treedListStrLike = treedListStrLike;
		return this;
	}

	public TreeProjectInfoQuery treedListStrs(List<String> treedListStrs) {
		if (treedListStrs == null) {
			throw new RuntimeException("treedListStrs is empty ");
		}
		this.treedListStrs = treedListStrs;
		return this;
	}

	public TreeProjectInfoQuery pfilesIndex(Integer pfilesIndex) {
		if (pfilesIndex == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndex = pfilesIndex;
		return this;
	}

	public TreeProjectInfoQuery pfilesIndexGreaterThanOrEqual(
			Integer pfilesIndexGreaterThanOrEqual) {
		if (pfilesIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndexGreaterThanOrEqual = pfilesIndexGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery pfilesIndexLessThanOrEqual(
			Integer pfilesIndexLessThanOrEqual) {
		if (pfilesIndexLessThanOrEqual == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndexLessThanOrEqual = pfilesIndexLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery pfilesIndexs(List<Integer> pfilesIndexs) {
		if (pfilesIndexs == null) {
			throw new RuntimeException("pfilesIndexs is empty ");
		}
		this.pfilesIndexs = pfilesIndexs;
		return this;
	}

	public TreeProjectInfoQuery bdate(Date bdate) {
		if (bdate == null) {
			throw new RuntimeException("bdate is null");
		}
		this.bdate = bdate;
		return this;
	}

	public TreeProjectInfoQuery bdateGreaterThanOrEqual(
			Date bdateGreaterThanOrEqual) {
		if (bdateGreaterThanOrEqual == null) {
			throw new RuntimeException("bdate is null");
		}
		this.bdateGreaterThanOrEqual = bdateGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery bdateLessThanOrEqual(Date bdateLessThanOrEqual) {
		if (bdateLessThanOrEqual == null) {
			throw new RuntimeException("bdate is null");
		}
		this.bdateLessThanOrEqual = bdateLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery edate(Date edate) {
		if (edate == null) {
			throw new RuntimeException("edate is null");
		}
		this.edate = edate;
		return this;
	}

	public TreeProjectInfoQuery edateGreaterThanOrEqual(
			Date edateGreaterThanOrEqual) {
		if (edateGreaterThanOrEqual == null) {
			throw new RuntimeException("edate is null");
		}
		this.edateGreaterThanOrEqual = edateGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery edateLessThanOrEqual(Date edateLessThanOrEqual) {
		if (edateLessThanOrEqual == null) {
			throw new RuntimeException("edate is null");
		}
		this.edateLessThanOrEqual = edateLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery wbsIndex(Integer wbsIndex) {
		if (wbsIndex == null) {
			throw new RuntimeException("wbsIndex is null");
		}
		this.wbsIndex = wbsIndex;
		return this;
	}

	public TreeProjectInfoQuery wbsIndexGreaterThanOrEqual(
			Integer wbsIndexGreaterThanOrEqual) {
		if (wbsIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("wbsIndex is null");
		}
		this.wbsIndexGreaterThanOrEqual = wbsIndexGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery wbsIndexLessThanOrEqual(
			Integer wbsIndexLessThanOrEqual) {
		if (wbsIndexLessThanOrEqual == null) {
			throw new RuntimeException("wbsIndex is null");
		}
		this.wbsIndexLessThanOrEqual = wbsIndexLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery wbsIndexs(List<Integer> wbsIndexs) {
		if (wbsIndexs == null) {
			throw new RuntimeException("wbsIndexs is empty ");
		}
		this.wbsIndexs = wbsIndexs;
		return this;
	}

	public TreeProjectInfoQuery bdates(Date bdates) {
		if (bdates == null) {
			throw new RuntimeException("bdates is null");
		}
		this.bdates = bdates;
		return this;
	}

	public TreeProjectInfoQuery bdatesGreaterThanOrEqual(
			Date bdatesGreaterThanOrEqual) {
		if (bdatesGreaterThanOrEqual == null) {
			throw new RuntimeException("bdates is null");
		}
		this.bdatesGreaterThanOrEqual = bdatesGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery bdatesLessThanOrEqual(Date bdatesLessThanOrEqual) {
		if (bdatesLessThanOrEqual == null) {
			throw new RuntimeException("bdates is null");
		}
		this.bdatesLessThanOrEqual = bdatesLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery bdatess(List<Date> bdatess) {
		if (bdatess == null) {
			throw new RuntimeException("bdatess is empty ");
		}
		this.bdatess = bdatess;
		return this;
	}

	public TreeProjectInfoQuery edates(Date edates) {
		if (edates == null) {
			throw new RuntimeException("edates is null");
		}
		this.edates = edates;
		return this;
	}

	public TreeProjectInfoQuery edatesGreaterThanOrEqual(
			Date edatesGreaterThanOrEqual) {
		if (edatesGreaterThanOrEqual == null) {
			throw new RuntimeException("edates is null");
		}
		this.edatesGreaterThanOrEqual = edatesGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery edatesLessThanOrEqual(Date edatesLessThanOrEqual) {
		if (edatesLessThanOrEqual == null) {
			throw new RuntimeException("edates is null");
		}
		this.edatesLessThanOrEqual = edatesLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery edatess(List<Date> edatess) {
		if (edatess == null) {
			throw new RuntimeException("edatess is empty ");
		}
		this.edatess = edatess;
		return this;
	}

	public TreeProjectInfoQuery typeId(String typeId) {
		if (typeId == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeId = typeId;
		return this;
	}

	public TreeProjectInfoQuery typeIdLike(String typeIdLike) {
		if (typeIdLike == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeIdLike = typeIdLike;
		return this;
	}

	public TreeProjectInfoQuery typeIds(List<String> typeIds) {
		if (typeIds == null) {
			throw new RuntimeException("typeIds is empty ");
		}
		this.typeIds = typeIds;
		return this;
	}

	public TreeProjectInfoQuery cell1(Integer cell1) {
		if (cell1 == null) {
			throw new RuntimeException("cell1 is null");
		}
		this.cell1 = cell1;
		return this;
	}

	public TreeProjectInfoQuery cell1GreaterThanOrEqual(
			Integer cell1GreaterThanOrEqual) {
		if (cell1GreaterThanOrEqual == null) {
			throw new RuntimeException("cell1 is null");
		}
		this.cell1GreaterThanOrEqual = cell1GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery cell1LessThanOrEqual(
			Integer cell1LessThanOrEqual) {
		if (cell1LessThanOrEqual == null) {
			throw new RuntimeException("cell1 is null");
		}
		this.cell1LessThanOrEqual = cell1LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery cell1s(List<Integer> cell1s) {
		if (cell1s == null) {
			throw new RuntimeException("cell1s is empty ");
		}
		this.cell1s = cell1s;
		return this;
	}

	public TreeProjectInfoQuery cell2(Integer cell2) {
		if (cell2 == null) {
			throw new RuntimeException("cell2 is null");
		}
		this.cell2 = cell2;
		return this;
	}

	public TreeProjectInfoQuery cell2GreaterThanOrEqual(
			Integer cell2GreaterThanOrEqual) {
		if (cell2GreaterThanOrEqual == null) {
			throw new RuntimeException("cell2 is null");
		}
		this.cell2GreaterThanOrEqual = cell2GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery cell2LessThanOrEqual(
			Integer cell2LessThanOrEqual) {
		if (cell2LessThanOrEqual == null) {
			throw new RuntimeException("cell2 is null");
		}
		this.cell2LessThanOrEqual = cell2LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery cell2s(List<Integer> cell2s) {
		if (cell2s == null) {
			throw new RuntimeException("cell2s is empty ");
		}
		this.cell2s = cell2s;
		return this;
	}

	public TreeProjectInfoQuery cell3(Integer cell3) {
		if (cell3 == null) {
			throw new RuntimeException("cell3 is null");
		}
		this.cell3 = cell3;
		return this;
	}

	public TreeProjectInfoQuery cell3GreaterThanOrEqual(
			Integer cell3GreaterThanOrEqual) {
		if (cell3GreaterThanOrEqual == null) {
			throw new RuntimeException("cell3 is null");
		}
		this.cell3GreaterThanOrEqual = cell3GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery cell3LessThanOrEqual(
			Integer cell3LessThanOrEqual) {
		if (cell3LessThanOrEqual == null) {
			throw new RuntimeException("cell3 is null");
		}
		this.cell3LessThanOrEqual = cell3LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery cell3s(List<Integer> cell3s) {
		if (cell3s == null) {
			throw new RuntimeException("cell3s is empty ");
		}
		this.cell3s = cell3s;
		return this;
	}

	public TreeProjectInfoQuery strFileLocate(String strFileLocate) {
		if (strFileLocate == null) {
			throw new RuntimeException("strFileLocate is null");
		}
		this.strFileLocate = strFileLocate;
		return this;
	}

	public TreeProjectInfoQuery strFileLocateLike(String strFileLocateLike) {
		if (strFileLocateLike == null) {
			throw new RuntimeException("strFileLocate is null");
		}
		this.strFileLocateLike = strFileLocateLike;
		return this;
	}

	public TreeProjectInfoQuery strFileLocates(List<String> strFileLocates) {
		if (strFileLocates == null) {
			throw new RuntimeException("strFileLocates is empty ");
		}
		this.strFileLocates = strFileLocates;
		return this;
	}

	public TreeProjectInfoQuery intpFile1(Integer intpFile1) {
		if (intpFile1 == null) {
			throw new RuntimeException("intpFile1 is null");
		}
		this.intpFile1 = intpFile1;
		return this;
	}

	public TreeProjectInfoQuery intpFile1GreaterThanOrEqual(
			Integer intpFile1GreaterThanOrEqual) {
		if (intpFile1GreaterThanOrEqual == null) {
			throw new RuntimeException("intpFile1 is null");
		}
		this.intpFile1GreaterThanOrEqual = intpFile1GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intpFile1LessThanOrEqual(
			Integer intpFile1LessThanOrEqual) {
		if (intpFile1LessThanOrEqual == null) {
			throw new RuntimeException("intpFile1 is null");
		}
		this.intpFile1LessThanOrEqual = intpFile1LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intpFile1s(List<Integer> intpFile1s) {
		if (intpFile1s == null) {
			throw new RuntimeException("intpFile1s is empty ");
		}
		this.intpFile1s = intpFile1s;
		return this;
	}

	public TreeProjectInfoQuery intpFile2(Integer intpFile2) {
		if (intpFile2 == null) {
			throw new RuntimeException("intpFile2 is null");
		}
		this.intpFile2 = intpFile2;
		return this;
	}

	public TreeProjectInfoQuery intpFile2GreaterThanOrEqual(
			Integer intpFile2GreaterThanOrEqual) {
		if (intpFile2GreaterThanOrEqual == null) {
			throw new RuntimeException("intpFile2 is null");
		}
		this.intpFile2GreaterThanOrEqual = intpFile2GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intpFile2LessThanOrEqual(
			Integer intpFile2LessThanOrEqual) {
		if (intpFile2LessThanOrEqual == null) {
			throw new RuntimeException("intpFile2 is null");
		}
		this.intpFile2LessThanOrEqual = intpFile2LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intpFile2s(List<Integer> intpFile2s) {
		if (intpFile2s == null) {
			throw new RuntimeException("intpFile2s is empty ");
		}
		this.intpFile2s = intpFile2s;
		return this;
	}

	public TreeProjectInfoQuery intpFile3(Integer intpFile3) {
		if (intpFile3 == null) {
			throw new RuntimeException("intpFile3 is null");
		}
		this.intpFile3 = intpFile3;
		return this;
	}

	public TreeProjectInfoQuery intpFile3GreaterThanOrEqual(
			Integer intpFile3GreaterThanOrEqual) {
		if (intpFile3GreaterThanOrEqual == null) {
			throw new RuntimeException("intpFile3 is null");
		}
		this.intpFile3GreaterThanOrEqual = intpFile3GreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intpFile3LessThanOrEqual(
			Integer intpFile3LessThanOrEqual) {
		if (intpFile3LessThanOrEqual == null) {
			throw new RuntimeException("intpFile3 is null");
		}
		this.intpFile3LessThanOrEqual = intpFile3LessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intpFile3s(List<Integer> intpFile3s) {
		if (intpFile3s == null) {
			throw new RuntimeException("intpFile3s is empty ");
		}
		this.intpFile3s = intpFile3s;
		return this;
	}

	public TreeProjectInfoQuery intCellFinish(Integer intCellFinish) {
		if (intCellFinish == null) {
			throw new RuntimeException("intCellFinish is null");
		}
		this.intCellFinish = intCellFinish;
		return this;
	}

	public TreeProjectInfoQuery intCellFinishGreaterThanOrEqual(
			Integer intCellFinishGreaterThanOrEqual) {
		if (intCellFinishGreaterThanOrEqual == null) {
			throw new RuntimeException("intCellFinish is null");
		}
		this.intCellFinishGreaterThanOrEqual = intCellFinishGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intCellFinishLessThanOrEqual(
			Integer intCellFinishLessThanOrEqual) {
		if (intCellFinishLessThanOrEqual == null) {
			throw new RuntimeException("intCellFinish is null");
		}
		this.intCellFinishLessThanOrEqual = intCellFinishLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intCellFinishs(List<Integer> intCellFinishs) {
		if (intCellFinishs == null) {
			throw new RuntimeException("intCellFinishs is empty ");
		}
		this.intCellFinishs = intCellFinishs;
		return this;
	}

	public TreeProjectInfoQuery sysId(String sysId) {
		if (sysId == null) {
			throw new RuntimeException("sysId is null");
		}
		this.sysId = sysId;
		return this;
	}

	public TreeProjectInfoQuery sysIdLike(String sysIdLike) {
		if (sysIdLike == null) {
			throw new RuntimeException("sysId is null");
		}
		this.sysIdLike = sysIdLike;
		return this;
	}

	public TreeProjectInfoQuery sysIds(List<String> sysIds) {
		if (sysIds == null) {
			throw new RuntimeException("sysIds is empty ");
		}
		this.sysIds = sysIds;
		return this;
	}

	public TreeProjectInfoQuery indexIn(Integer indexIn) {
		if (indexIn == null) {
			throw new RuntimeException("indexIn is null");
		}
		this.indexIn = indexIn;
		return this;
	}

	public TreeProjectInfoQuery indexInGreaterThanOrEqual(
			Integer indexInGreaterThanOrEqual) {
		if (indexInGreaterThanOrEqual == null) {
			throw new RuntimeException("indexIn is null");
		}
		this.indexInGreaterThanOrEqual = indexInGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery indexInLessThanOrEqual(
			Integer indexInLessThanOrEqual) {
		if (indexInLessThanOrEqual == null) {
			throw new RuntimeException("indexIn is null");
		}
		this.indexInLessThanOrEqual = indexInLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery indexIns(List<Integer> indexIns) {
		if (indexIns == null) {
			throw new RuntimeException("indexIns is empty ");
		}
		this.indexIns = indexIns;
		return this;
	}

	public TreeProjectInfoQuery strButtonStar(String strButtonStar) {
		if (strButtonStar == null) {
			throw new RuntimeException("strButtonStar is null");
		}
		this.strButtonStar = strButtonStar;
		return this;
	}

	public TreeProjectInfoQuery strButtonStarLike(String strButtonStarLike) {
		if (strButtonStarLike == null) {
			throw new RuntimeException("strButtonStar is null");
		}
		this.strButtonStarLike = strButtonStarLike;
		return this;
	}

	public TreeProjectInfoQuery strButtonStars(List<String> strButtonStars) {
		if (strButtonStars == null) {
			throw new RuntimeException("strButtonStars is empty ");
		}
		this.strButtonStars = strButtonStars;
		return this;
	}

	public TreeProjectInfoQuery intIsuse(Integer intIsuse) {
		if (intIsuse == null) {
			throw new RuntimeException("intIsuse is null");
		}
		this.intIsuse = intIsuse;
		return this;
	}

	public TreeProjectInfoQuery intIsuseGreaterThanOrEqual(
			Integer intIsuseGreaterThanOrEqual) {
		if (intIsuseGreaterThanOrEqual == null) {
			throw new RuntimeException("intIsuse is null");
		}
		this.intIsuseGreaterThanOrEqual = intIsuseGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intIsuseLessThanOrEqual(
			Integer intIsuseLessThanOrEqual) {
		if (intIsuseLessThanOrEqual == null) {
			throw new RuntimeException("intIsuse is null");
		}
		this.intIsuseLessThanOrEqual = intIsuseLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery intIsuses(List<Integer> intIsuses) {
		if (intIsuses == null) {
			throw new RuntimeException("intIsuses is empty ");
		}
		this.intIsuses = intIsuses;
		return this;
	}

	public TreeProjectInfoQuery wbsIndexIn(Integer wbsIndexIn) {
		if (wbsIndexIn == null) {
			throw new RuntimeException("wbsIndexIn is null");
		}
		this.wbsIndexIn = wbsIndexIn;
		return this;
	}

	public TreeProjectInfoQuery wbsIndexInGreaterThanOrEqual(
			Integer wbsIndexInGreaterThanOrEqual) {
		if (wbsIndexInGreaterThanOrEqual == null) {
			throw new RuntimeException("wbsIndexIn is null");
		}
		this.wbsIndexInGreaterThanOrEqual = wbsIndexInGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery wbsIndexInLessThanOrEqual(
			Integer wbsIndexInLessThanOrEqual) {
		if (wbsIndexInLessThanOrEqual == null) {
			throw new RuntimeException("wbsIndexIn is null");
		}
		this.wbsIndexInLessThanOrEqual = wbsIndexInLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery wbsIndexIns(List<Integer> wbsIndexIns) {
		if (wbsIndexIns == null) {
			throw new RuntimeException("wbsIndexIns is empty ");
		}
		this.wbsIndexIns = wbsIndexIns;
		return this;
	}

	public TreeProjectInfoQuery uindexId(Integer uindexId) {
		if (uindexId == null) {
			throw new RuntimeException("uindexId is null");
		}
		this.uindexId = uindexId;
		return this;
	}

	public TreeProjectInfoQuery uindexIdGreaterThanOrEqual(
			Integer uindexIdGreaterThanOrEqual) {
		if (uindexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("uindexId is null");
		}
		this.uindexIdGreaterThanOrEqual = uindexIdGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery uindexIdLessThanOrEqual(
			Integer uindexIdLessThanOrEqual) {
		if (uindexIdLessThanOrEqual == null) {
			throw new RuntimeException("uindexId is null");
		}
		this.uindexIdLessThanOrEqual = uindexIdLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery uindexIds(List<Integer> uindexIds) {
		if (uindexIds == null) {
			throw new RuntimeException("uindexIds is empty ");
		}
		this.uindexIds = uindexIds;
		return this;
	}

	public TreeProjectInfoQuery lisNoWbs(Integer lisNoWbs) {
		if (lisNoWbs == null) {
			throw new RuntimeException("lisNoWbs is null");
		}
		this.lisNoWbs = lisNoWbs;
		return this;
	}

	public TreeProjectInfoQuery lisNoWbsGreaterThanOrEqual(
			Integer lisNoWbsGreaterThanOrEqual) {
		if (lisNoWbsGreaterThanOrEqual == null) {
			throw new RuntimeException("lisNoWbs is null");
		}
		this.lisNoWbsGreaterThanOrEqual = lisNoWbsGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery lisNoWbsLessThanOrEqual(
			Integer lisNoWbsLessThanOrEqual) {
		if (lisNoWbsLessThanOrEqual == null) {
			throw new RuntimeException("lisNoWbs is null");
		}
		this.lisNoWbsLessThanOrEqual = lisNoWbsLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery lisNoWbss(List<Integer> lisNoWbss) {
		if (lisNoWbss == null) {
			throw new RuntimeException("lisNoWbss is empty ");
		}
		this.lisNoWbss = lisNoWbss;
		return this;
	}

	public TreeProjectInfoQuery sysIdAdd(String sysIdAdd) {
		if (sysIdAdd == null) {
			throw new RuntimeException("sysIdAdd is null");
		}
		this.sysIdAdd = sysIdAdd;
		return this;
	}

	public TreeProjectInfoQuery sysIdAddLike(String sysIdAddLike) {
		if (sysIdAddLike == null) {
			throw new RuntimeException("sysIdAdd is null");
		}
		this.sysIdAddLike = sysIdAddLike;
		return this;
	}

	public TreeProjectInfoQuery sysIdAdds(List<String> sysIdAdds) {
		if (sysIdAdds == null) {
			throw new RuntimeException("sysIdAdds is empty ");
		}
		this.sysIdAdds = sysIdAdds;
		return this;
	}

	public TreeProjectInfoQuery indexInAdd(Integer indexInAdd) {
		if (indexInAdd == null) {
			throw new RuntimeException("indexInAdd is null");
		}
		this.indexInAdd = indexInAdd;
		return this;
	}

	public TreeProjectInfoQuery indexInAddGreaterThanOrEqual(
			Integer indexInAddGreaterThanOrEqual) {
		if (indexInAddGreaterThanOrEqual == null) {
			throw new RuntimeException("indexInAdd is null");
		}
		this.indexInAddGreaterThanOrEqual = indexInAddGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery indexInAddLessThanOrEqual(
			Integer indexInAddLessThanOrEqual) {
		if (indexInAddLessThanOrEqual == null) {
			throw new RuntimeException("indexInAdd is null");
		}
		this.indexInAddLessThanOrEqual = indexInAddLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery indexInAdds(List<Integer> indexInAdds) {
		if (indexInAdds == null) {
			throw new RuntimeException("indexInAdds is empty ");
		}
		this.indexInAdds = indexInAdds;
		return this;
	}

	public TreeProjectInfoQuery createBy(String createBy) {
		if (createBy == null) {
			throw new RuntimeException("createBy is null");
		}
		this.createBy = createBy;
		return this;
	}

	public TreeProjectInfoQuery createByLike(String createByLike) {
		if (createByLike == null) {
			throw new RuntimeException("createBy is null");
		}
		this.createByLike = createByLike;
		return this;
	}

	public TreeProjectInfoQuery createBys(List<String> createBys) {
		if (createBys == null) {
			throw new RuntimeException("createBys is empty ");
		}
		this.createBys = createBys;
		return this;
	}

	public TreeProjectInfoQuery createDateGreaterThanOrEqual(
			Date createDateGreaterThanOrEqual) {
		if (createDateGreaterThanOrEqual == null) {
			throw new RuntimeException("createDate is null");
		}
		this.createDateGreaterThanOrEqual = createDateGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery createDateLessThanOrEqual(
			Date createDateLessThanOrEqual) {
		if (createDateLessThanOrEqual == null) {
			throw new RuntimeException("createDate is null");
		}
		this.createDateLessThanOrEqual = createDateLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery updateDateGreaterThanOrEqual(
			Date updateDateGreaterThanOrEqual) {
		if (updateDateGreaterThanOrEqual == null) {
			throw new RuntimeException("updateDate is null");
		}
		this.updateDateGreaterThanOrEqual = updateDateGreaterThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery updateDateLessThanOrEqual(
			Date updateDateLessThanOrEqual) {
		if (updateDateLessThanOrEqual == null) {
			throw new RuntimeException("updateDate is null");
		}
		this.updateDateLessThanOrEqual = updateDateLessThanOrEqual;
		return this;
	}

	public TreeProjectInfoQuery updateBy(String updateBy) {
		if (updateBy == null) {
			throw new RuntimeException("updateBy is null");
		}
		this.updateBy = updateBy;
		return this;
	}

	public TreeProjectInfoQuery updateByLike(String updateByLike) {
		if (updateByLike == null) {
			throw new RuntimeException("updateBy is null");
		}
		this.updateByLike = updateByLike;
		return this;
	}

	public TreeProjectInfoQuery updateBys(List<String> updateBys) {
		if (updateBys == null) {
			throw new RuntimeException("updateBys is empty ");
		}
		this.updateBys = updateBys;
		return this;
	}

	public String getOrderBy() {
		if (this.sortColumn != null) {
			String a_x = " asc ";
			if (this.sortOrder != null) {
				a_x = this.sortOrder;
			}

			if ("id".equals(this.sortColumn)) {
				this.orderBy = "E.ID" + a_x;
			}

			if ("num".equals(this.sortColumn)) {
				this.orderBy = "E.NUM" + a_x;
			}

			if ("topId".equals(this.sortColumn)) {
				this.orderBy = "E.TOP_ID" + a_x;
			}

			if ("indexName".equals(this.sortColumn)) {
				this.orderBy = "E.INDEX_NAME" + a_x;
			}

			if ("nlevel".equals(this.sortColumn)) {
				this.orderBy = "E.NLEVEL" + a_x;
			}

			if ("nodeType".equals(this.sortColumn)) {
				this.orderBy = "E.NODETYPE" + a_x;
			}

			if ("fromId".equals(this.sortColumn)) {
				this.orderBy = "E.FROMID" + a_x;
			}

			if ("partId".equals(this.sortColumn)) {
				this.orderBy = "E.PART_ID" + a_x;
			}

			if ("showId".equals(this.sortColumn)) {
				this.orderBy = "E.SHOWID" + a_x;
			}

			if ("sindexName".equals(this.sortColumn)) {
				this.orderBy = "E.SINDEX_NAME" + a_x;
			}

			if ("fileNum".equals(this.sortColumn)) {
				this.orderBy = "E.FILENUM" + a_x;
			}

			if ("fileNum0".equals(this.sortColumn)) {
				this.orderBy = "E.FILENUM0" + a_x;
			}

			if ("fileNum1".equals(this.sortColumn)) {
				this.orderBy = "E.FILENUM1" + a_x;
			}

			if ("fileNum2".equals(this.sortColumn)) {
				this.orderBy = "E.FILENUM2" + a_x;
			}

			if ("projType".equals(this.sortColumn)) {
				this.orderBy = "E.PROJTYPE" + a_x;
			}

			if ("cid".equals(this.sortColumn)) {
				this.orderBy = "E.CID" + a_x;
			}

			if ("dwid".equals(this.sortColumn)) {
				this.orderBy = "E.DWID" + a_x;
			}

			if ("fxid".equals(this.sortColumn)) {
				this.orderBy = "E.FXID" + a_x;
			}

			if ("fbid".equals(this.sortColumn)) {
				this.orderBy = "E.FBID" + a_x;
			}

			if ("jid".equals(this.sortColumn)) {
				this.orderBy = "E.JID" + a_x;
			}

			if ("flid".equals(this.sortColumn)) {
				this.orderBy = "E.FLID" + a_x;
			}

			if ("topNode".equals(this.sortColumn)) {
				this.orderBy = "E.TOPNODE" + a_x;
			}

			if ("nodeIco".equals(this.sortColumn)) {
				this.orderBy = "E.NODEICO" + a_x;
			}

			if ("outFlag".equals(this.sortColumn)) {
				this.orderBy = "E.OUTFLAG" + a_x;
			}

			if ("inFlag".equals(this.sortColumn)) {
				this.orderBy = "E.INFLAG" + a_x;
			}

			if ("password".equals(this.sortColumn)) {
				this.orderBy = "E.PASSWORD" + a_x;
			}

			if ("listNum".equals(this.sortColumn)) {
				this.orderBy = "E.LISTNUM" + a_x;
			}

			if ("wcompany".equals(this.sortColumn)) {
				this.orderBy = "E.WCOMPANY" + a_x;
			}

			if ("listNo".equals(this.sortColumn)) {
				this.orderBy = "E.LISTNO" + a_x;
			}

			if ("usernmu".equals(this.sortColumn)) {
				this.orderBy = "E.USERNMU" + a_x;
			}

			if ("indexIdOld".equals(this.sortColumn)) {
				this.orderBy = "E.INDEX_ID_OLD" + a_x;
			}

			if ("pindexId".equals(this.sortColumn)) {
				this.orderBy = "E.PINDEX_ID" + a_x;
			}

			if ("finishInt".equals(this.sortColumn)) {
				this.orderBy = "E.FINISHINT" + a_x;
			}

			if ("typeTableName".equals(this.sortColumn)) {
				this.orderBy = "E.TYPE_TABLENAME" + a_x;
			}

			if ("treedListStr".equals(this.sortColumn)) {
				this.orderBy = "E.TREE_DLISTSTR" + a_x;
			}

			if ("pfilesIndex".equals(this.sortColumn)) {
				this.orderBy = "E.PFILES_INDEX" + a_x;
			}

			if ("bdate".equals(this.sortColumn)) {
				this.orderBy = "E.BDATE" + a_x;
			}

			if ("edate".equals(this.sortColumn)) {
				this.orderBy = "E.EDATE" + a_x;
			}

			if ("wbsIndex".equals(this.sortColumn)) {
				this.orderBy = "E.WBSINDEX" + a_x;
			}

			if ("bdates".equals(this.sortColumn)) {
				this.orderBy = "E.BDATE_S" + a_x;
			}

			if ("edates".equals(this.sortColumn)) {
				this.orderBy = "E.EDATE_S" + a_x;
			}

			if ("typeId".equals(this.sortColumn)) {
				this.orderBy = "E.TYPE_ID" + a_x;
			}

			if ("cell1".equals(this.sortColumn)) {
				this.orderBy = "E.CELL1" + a_x;
			}

			if ("cell2".equals(this.sortColumn)) {
				this.orderBy = "E.CELL2" + a_x;
			}

			if ("cell3".equals(this.sortColumn)) {
				this.orderBy = "E.CELL3" + a_x;
			}

			if ("strFileLocate".equals(this.sortColumn)) {
				this.orderBy = "E.STRFILELOCATE" + a_x;
			}

			if ("intpFile1".equals(this.sortColumn)) {
				this.orderBy = "E.INTPFILE1" + a_x;
			}

			if ("intpFile2".equals(this.sortColumn)) {
				this.orderBy = "E.INTPFILE2" + a_x;
			}

			if ("intpFile3".equals(this.sortColumn)) {
				this.orderBy = "E.INTPFILE3" + a_x;
			}

			if ("intCellFinish".equals(this.sortColumn)) {
				this.orderBy = "E.INTCELLFINISH" + a_x;
			}

			if ("sysId".equals(this.sortColumn)) {
				this.orderBy = "E.SYS_ID" + a_x;
			}

			if ("indexIn".equals(this.sortColumn)) {
				this.orderBy = "E.INDEX_IN" + a_x;
			}

			if ("strButtonStar".equals(this.sortColumn)) {
				this.orderBy = "E.STRBUTTONSTAR" + a_x;
			}

			if ("intIsuse".equals(this.sortColumn)) {
				this.orderBy = "E.INTISUSE" + a_x;
			}

			if ("wbsIndexIn".equals(this.sortColumn)) {
				this.orderBy = "E.WBSINDEX_IN" + a_x;
			}

			if ("uindexId".equals(this.sortColumn)) {
				this.orderBy = "E.UINDEX_ID" + a_x;
			}

			if ("lisNoWbs".equals(this.sortColumn)) {
				this.orderBy = "E.LISNO_WBS" + a_x;
			}

			if ("sysIdAdd".equals(this.sortColumn)) {
				this.orderBy = "E.SYS_ID_ADD" + a_x;
			}

			if ("indexInAdd".equals(this.sortColumn)) {
				this.orderBy = "E.INDEX_IN_ADD" + a_x;
			}

			if ("createBy".equals(this.sortColumn)) {
				this.orderBy = "E.createBy" + a_x;
			}

			if ("createDate".equals(this.sortColumn)) {
				this.orderBy = "E.createDate" + a_x;
			}

			if ("updateDate".equals(this.sortColumn)) {
				this.orderBy = "E.updateDate" + a_x;
			}

			if ("updateBy".equals(this.sortColumn)) {
				this.orderBy = "E.updateBy" + a_x;
			}
		}

		return this.orderBy;
	}

	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("indexId", "INDEX_ID");
		addColumn("id", "ID");
		addColumn("num", "NUM");
		addColumn("topId", "TOP_ID");
		addColumn("indexName", "INDEX_NAME");
		addColumn("nlevel", "NLEVEL");
		addColumn("nodeType", "NODETYPE");
		addColumn("fromId", "FROMID");
		addColumn("partId", "PART_ID");
		addColumn("showId", "SHOWID");
		addColumn("sindexName", "SINDEX_NAME");
		addColumn("fileNum", "FILENUM");
		addColumn("fileNum0", "FILENUM0");
		addColumn("fileNum1", "FILENUM1");
		addColumn("fileNum2", "FILENUM2");
		addColumn("projType", "PROJTYPE");
		addColumn("cid", "CID");
		addColumn("dwid", "DWID");
		addColumn("fxid", "FXID");
		addColumn("fbid", "FBID");
		addColumn("jid", "JID");
		addColumn("flid", "FLID");
		addColumn("topNode", "TOPNODE");
		addColumn("nodeIco", "NODEICO");
		addColumn("outFlag", "OUTFLAG");
		addColumn("inFlag", "INFLAG");
		addColumn("password", "PASSWORD");
		addColumn("listNum", "LISTNUM");
		addColumn("wcompany", "WCOMPANY");
		addColumn("listNo", "LISTNO");
		addColumn("usernmu", "USERNMU");
		addColumn("indexIdOld", "INDEX_ID_OLD");
		addColumn("pindexId", "PINDEX_ID");
		addColumn("finishInt", "FINISHINT");
		addColumn("typeTableName", "TYPE_TABLENAME");
		addColumn("treedListStr", "TREE_DLISTSTR");
		addColumn("pfilesIndex", "PFILES_INDEX");
		addColumn("bdate", "BDATE");
		addColumn("edate", "EDATE");
		addColumn("wbsIndex", "WBSINDEX");
		addColumn("bdates", "BDATE_S");
		addColumn("edates", "EDATE_S");
		addColumn("typeId", "TYPE_ID");
		addColumn("cell1", "CELL1");
		addColumn("cell2", "CELL2");
		addColumn("cell3", "CELL3");
		addColumn("strFileLocate", "STRFILELOCATE");
		addColumn("intpFile1", "INTPFILE1");
		addColumn("intpFile2", "INTPFILE2");
		addColumn("intpFile3", "INTPFILE3");
		addColumn("intCellFinish", "INTCELLFINISH");
		addColumn("sysId", "SYS_ID");
		addColumn("indexIn", "INDEX_IN");
		addColumn("strButtonStar", "STRBUTTONSTAR");
		addColumn("intIsuse", "INTISUSE");
		addColumn("wbsIndexIn", "WBSINDEX_IN");
		addColumn("uindexId", "UINDEX_ID");
		addColumn("lisNoWbs", "LISNO_WBS");
		addColumn("sysIdAdd", "SYS_ID_ADD");
		addColumn("indexInAdd", "INDEX_IN_ADD");
		addColumn("createBy", "createBy");
		addColumn("createDate", "createDate");
		addColumn("updateDate", "updateDate");
		addColumn("updateBy", "updateBy");
	}
}
