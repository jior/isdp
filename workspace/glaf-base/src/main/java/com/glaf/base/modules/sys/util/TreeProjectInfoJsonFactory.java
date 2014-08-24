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

package com.glaf.base.modules.sys.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.TreeProjectInfo;
import com.glaf.core.util.DateUtils;

public class TreeProjectInfoJsonFactory {

	public static TreeProjectInfo jsonToObject(JSONObject jsonObject) {
            TreeProjectInfo model = new TreeProjectInfo();
            if (jsonObject.containsKey("indexId")) {
		    model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("topId")) {
			model.setTopId(jsonObject.getInteger("topId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("nlevel")) {
			model.setNlevel(jsonObject.getInteger("nlevel"));
		}
		if (jsonObject.containsKey("nodeType")) {
			model.setNodeType(jsonObject.getString("nodeType"));
		}
		if (jsonObject.containsKey("fromId")) {
			model.setFromId(jsonObject.getInteger("fromId"));
		}
		if (jsonObject.containsKey("partId")) {
			model.setPartId(jsonObject.getInteger("partId"));
		}
		if (jsonObject.containsKey("showId")) {
			model.setShowId(jsonObject.getInteger("showId"));
		}
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
		}
		if (jsonObject.containsKey("fileNum")) {
			model.setFileNum(jsonObject.getInteger("fileNum"));
		}
		if (jsonObject.containsKey("fileNum0")) {
			model.setFileNum0(jsonObject.getInteger("fileNum0"));
		}
		if (jsonObject.containsKey("fileNum1")) {
			model.setFileNum1(jsonObject.getInteger("fileNum1"));
		}
		if (jsonObject.containsKey("fileNum2")) {
			model.setFileNum2(jsonObject.getInteger("fileNum2"));
		}
		if (jsonObject.containsKey("projType")) {
			model.setProjType(jsonObject.getString("projType"));
		}
		if (jsonObject.containsKey("cid")) {
			model.setCid(jsonObject.getString("cid"));
		}
		if (jsonObject.containsKey("dwid")) {
			model.setDwid(jsonObject.getInteger("dwid"));
		}
		if (jsonObject.containsKey("fxid")) {
			model.setFxid(jsonObject.getInteger("fxid"));
		}
		if (jsonObject.containsKey("fbid")) {
			model.setFbid(jsonObject.getInteger("fbid"));
		}
		if (jsonObject.containsKey("jid")) {
			model.setJid(jsonObject.getString("jid"));
		}
		if (jsonObject.containsKey("flid")) {
			model.setFlid(jsonObject.getString("flid"));
		}
		if (jsonObject.containsKey("topNode")) {
			model.setTopNode(jsonObject.getString("topNode"));
		}
		if (jsonObject.containsKey("nodeIco")) {
			model.setNodeIco(jsonObject.getInteger("nodeIco"));
		}
		if (jsonObject.containsKey("outFlag")) {
			model.setOutFlag(jsonObject.getString("outFlag"));
		}
		if (jsonObject.containsKey("inFlag")) {
			model.setInFlag(jsonObject.getString("inFlag"));
		}
		if (jsonObject.containsKey("password")) {
			model.setPassword(jsonObject.getString("password"));
		}
		if (jsonObject.containsKey("listNum")) {
			model.setListNum(jsonObject.getString("listNum"));
		}
		if (jsonObject.containsKey("wcompany")) {
			model.setWcompany(jsonObject.getString("wcompany"));
		}
		if (jsonObject.containsKey("listNo")) {
			model.setListNo(jsonObject.getInteger("listNo"));
		}
		if (jsonObject.containsKey("usernmu")) {
			model.setUsernmu(jsonObject.getString("usernmu"));
		}
		if (jsonObject.containsKey("indexIdOld")) {
			model.setIndexIdOld(jsonObject.getInteger("indexIdOld"));
		}
		if (jsonObject.containsKey("pindexId")) {
			model.setPindexId(jsonObject.getInteger("pindexId"));
		}
		if (jsonObject.containsKey("finishInt")) {
			model.setFinishInt(jsonObject.getInteger("finishInt"));
		}
		if (jsonObject.containsKey("typeTableName")) {
			model.setTypeTableName(jsonObject.getString("typeTableName"));
		}
		if (jsonObject.containsKey("treedListStr")) {
			model.setTreedListStr(jsonObject.getString("treedListStr"));
		}
		if (jsonObject.containsKey("pfilesIndex")) {
			model.setPfilesIndex(jsonObject.getInteger("pfilesIndex"));
		}
		if (jsonObject.containsKey("bdate")) {
			model.setBdate(jsonObject.getDate("bdate"));
		}
		if (jsonObject.containsKey("edate")) {
			model.setEdate(jsonObject.getDate("edate"));
		}
		if (jsonObject.containsKey("wbsIndex")) {
			model.setWbsIndex(jsonObject.getInteger("wbsIndex"));
		}
		if (jsonObject.containsKey("bdates")) {
			model.setBdates(jsonObject.getDate("bdates"));
		}
		if (jsonObject.containsKey("edates")) {
			model.setEdates(jsonObject.getDate("edates"));
		}
		if (jsonObject.containsKey("typeId")) {
			model.setTypeId(jsonObject.getString("typeId"));
		}
		if (jsonObject.containsKey("cell1")) {
			model.setCell1(jsonObject.getInteger("cell1"));
		}
		if (jsonObject.containsKey("cell2")) {
			model.setCell2(jsonObject.getInteger("cell2"));
		}
		if (jsonObject.containsKey("cell3")) {
			model.setCell3(jsonObject.getInteger("cell3"));
		}
		if (jsonObject.containsKey("strFileLocate")) {
			model.setStrFileLocate(jsonObject.getString("strFileLocate"));
		}
		if (jsonObject.containsKey("intpFile1")) {
			model.setIntpFile1(jsonObject.getInteger("intpFile1"));
		}
		if (jsonObject.containsKey("intpFile2")) {
			model.setIntpFile2(jsonObject.getInteger("intpFile2"));
		}
		if (jsonObject.containsKey("intpFile3")) {
			model.setIntpFile3(jsonObject.getInteger("intpFile3"));
		}
		if (jsonObject.containsKey("intCellFinish")) {
			model.setIntCellFinish(jsonObject.getInteger("intCellFinish"));
		}
		if (jsonObject.containsKey("sysId")) {
			model.setSysId(jsonObject.getString("sysId"));
		}
		if (jsonObject.containsKey("indexIn")) {
			model.setIndexIn(jsonObject.getInteger("indexIn"));
		}
		if (jsonObject.containsKey("strButtonStar")) {
			model.setStrButtonStar(jsonObject.getString("strButtonStar"));
		}
		if (jsonObject.containsKey("intIsuse")) {
			model.setIntIsuse(jsonObject.getInteger("intIsuse"));
		}
		if (jsonObject.containsKey("wbsIndexIn")) {
			model.setWbsIndexIn(jsonObject.getInteger("wbsIndexIn"));
		}
		if (jsonObject.containsKey("uindexId")) {
			model.setUindexId(jsonObject.getInteger("uindexId"));
		}
		if (jsonObject.containsKey("lisNoWbs")) {
			model.setLisNoWbs(jsonObject.getInteger("lisNoWbs"));
		}
		if (jsonObject.containsKey("sysIdAdd")) {
			model.setSysIdAdd(jsonObject.getString("sysIdAdd"));
		}
		if (jsonObject.containsKey("indexInAdd")) {
			model.setIndexInAdd(jsonObject.getInteger("indexInAdd"));
		}
		if (jsonObject.containsKey("createBy")) {
			model.setCreateBy(jsonObject.getString("createBy"));
		}
		if (jsonObject.containsKey("createDate")) {
			model.setCreateDate(jsonObject.getDate("createDate"));
		}
		if (jsonObject.containsKey("updateDate")) {
			model.setUpdateDate(jsonObject.getDate("updateDate"));
		}
		if (jsonObject.containsKey("updateBy")) {
			model.setUpdateBy(jsonObject.getString("updateBy"));
		}

            return model;
	}

	public static JSONObject toJsonObject(TreeProjectInfo model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
                        jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		} 
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		} 
        jsonObject.put("topId", model.getTopId());
        jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		} 
        jsonObject.put("nlevel", model.getNlevel());
		if (model.getNodeType() != null) {
			jsonObject.put("nodeType", model.getNodeType());
		} 
        jsonObject.put("fromId", model.getFromId());
        jsonObject.put("partId", model.getPartId());
        jsonObject.put("showId", model.getShowId());
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		} 
        jsonObject.put("fileNum", model.getFileNum());
        jsonObject.put("fileNum0", model.getFileNum0());
        jsonObject.put("fileNum1", model.getFileNum1());
        jsonObject.put("fileNum2", model.getFileNum2());
		if (model.getProjType() != null) {
			jsonObject.put("projType", model.getProjType());
		} 
		if (model.getCid() != null) {
			jsonObject.put("cid", model.getCid());
		} 
        jsonObject.put("dwid", model.getDwid());
        jsonObject.put("fxid", model.getFxid());
        jsonObject.put("fbid", model.getFbid());
		if (model.getJid() != null) {
			jsonObject.put("jid", model.getJid());
		} 
		if (model.getFlid() != null) {
			jsonObject.put("flid", model.getFlid());
		} 
		if (model.getTopNode() != null) {
			jsonObject.put("topNode", model.getTopNode());
		} 
        jsonObject.put("nodeIco", model.getNodeIco());
		if (model.getOutFlag() != null) {
			jsonObject.put("outFlag", model.getOutFlag());
		} 
		if (model.getInFlag() != null) {
			jsonObject.put("inFlag", model.getInFlag());
		} 
		if (model.getPassword() != null) {
			jsonObject.put("password", model.getPassword());
		} 
		if (model.getListNum() != null) {
			jsonObject.put("listNum", model.getListNum());
		} 
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		} 
        jsonObject.put("listNo", model.getListNo());
		if (model.getUsernmu() != null) {
			jsonObject.put("usernmu", model.getUsernmu());
		} 
        jsonObject.put("indexIdOld", model.getIndexIdOld());
        jsonObject.put("pindexId", model.getPindexId());
        jsonObject.put("finishInt", model.getFinishInt());
		if (model.getTypeTableName() != null) {
			jsonObject.put("typeTableName", model.getTypeTableName());
		} 
		if (model.getTreedListStr() != null) {
			jsonObject.put("treedListStr", model.getTreedListStr());
		} 
        jsonObject.put("pfilesIndex", model.getPfilesIndex());
                if (model.getBdate() != null) {
                      jsonObject.put("bdate", DateUtils.getDate(model.getBdate()));
		      jsonObject.put("bdate_date", DateUtils.getDate(model.getBdate()));
		      jsonObject.put("bdate_datetime", DateUtils.getDateTime(model.getBdate()));
                }
                if (model.getEdate() != null) {
                      jsonObject.put("edate", DateUtils.getDate(model.getEdate()));
		      jsonObject.put("edate_date", DateUtils.getDate(model.getEdate()));
		      jsonObject.put("edate_datetime", DateUtils.getDateTime(model.getEdate()));
                }
        jsonObject.put("wbsIndex", model.getWbsIndex());
                if (model.getBdates() != null) {
                      jsonObject.put("bdates", DateUtils.getDate(model.getBdates()));
		      jsonObject.put("bdates_date", DateUtils.getDate(model.getBdates()));
		      jsonObject.put("bdates_datetime", DateUtils.getDateTime(model.getBdates()));
                }
                if (model.getEdates() != null) {
                      jsonObject.put("edates", DateUtils.getDate(model.getEdates()));
		      jsonObject.put("edates_date", DateUtils.getDate(model.getEdates()));
		      jsonObject.put("edates_datetime", DateUtils.getDateTime(model.getEdates()));
                }
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		} 
        jsonObject.put("cell1", model.getCell1());
        jsonObject.put("cell2", model.getCell2());
        jsonObject.put("cell3", model.getCell3());
		if (model.getStrFileLocate() != null) {
			jsonObject.put("strFileLocate", model.getStrFileLocate());
		} 
        jsonObject.put("intpFile1", model.getIntpFile1());
        jsonObject.put("intpFile2", model.getIntpFile2());
        jsonObject.put("intpFile3", model.getIntpFile3());
        jsonObject.put("intCellFinish", model.getIntCellFinish());
		if (model.getSysId() != null) {
			jsonObject.put("sysId", model.getSysId());
		} 
        jsonObject.put("indexIn", model.getIndexIn());
		if (model.getStrButtonStar() != null) {
			jsonObject.put("strButtonStar", model.getStrButtonStar());
		} 
        jsonObject.put("intIsuse", model.getIntIsuse());
        jsonObject.put("wbsIndexIn", model.getWbsIndexIn());
        jsonObject.put("uindexId", model.getUindexId());
        jsonObject.put("lisNoWbs", model.getLisNoWbs());
		if (model.getSysIdAdd() != null) {
			jsonObject.put("sysIdAdd", model.getSysIdAdd());
		} 
        jsonObject.put("indexInAdd", model.getIndexInAdd());
		if (model.getCreateBy() != null) {
			jsonObject.put("createBy", model.getCreateBy());
		} 
                if (model.getCreateDate() != null) {
                      jsonObject.put("createDate", DateUtils.getDate(model.getCreateDate()));
		      jsonObject.put("createDate_date", DateUtils.getDate(model.getCreateDate()));
		      jsonObject.put("createDate_datetime", DateUtils.getDateTime(model.getCreateDate()));
                }
                if (model.getUpdateDate() != null) {
                      jsonObject.put("updateDate", DateUtils.getDate(model.getUpdateDate()));
		      jsonObject.put("updateDate_date", DateUtils.getDate(model.getUpdateDate()));
		      jsonObject.put("updateDate_datetime", DateUtils.getDateTime(model.getUpdateDate()));
                }
		if (model.getUpdateBy() != null) {
			jsonObject.put("updateBy", model.getUpdateBy());
		} 
		return jsonObject;
	}


	public static ObjectNode toObjectNode(TreeProjectInfo model){
                ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
                if (model.getId() != null) {
                     jsonObject.put("id", model.getId());
                     jsonObject.put("_id_", model.getId());
		     jsonObject.put("_oid_", model.getId());
                } 
                if (model.getNum() != null) {
                     jsonObject.put("num", model.getNum());
                } 
                jsonObject.put("topId", model.getTopId());
                jsonObject.put("parentId", model.getParentId());
                if (model.getIndexName() != null) {
                     jsonObject.put("indexName", model.getIndexName());
                } 
                jsonObject.put("nlevel", model.getNlevel());
                if (model.getNodeType() != null) {
                     jsonObject.put("nodeType", model.getNodeType());
                } 
                jsonObject.put("fromId", model.getFromId());
                jsonObject.put("partId", model.getPartId());
                jsonObject.put("showId", model.getShowId());
                if (model.getSindexName() != null) {
                     jsonObject.put("sindexName", model.getSindexName());
                } 
                jsonObject.put("fileNum", model.getFileNum());
                jsonObject.put("fileNum0", model.getFileNum0());
                jsonObject.put("fileNum1", model.getFileNum1());
                jsonObject.put("fileNum2", model.getFileNum2());
                if (model.getProjType() != null) {
                     jsonObject.put("projType", model.getProjType());
                } 
                if (model.getCid() != null) {
                     jsonObject.put("cid", model.getCid());
                } 
                jsonObject.put("dwid", model.getDwid());
                jsonObject.put("fxid", model.getFxid());
                jsonObject.put("fbid", model.getFbid());
                if (model.getJid() != null) {
                     jsonObject.put("jid", model.getJid());
                } 
                if (model.getFlid() != null) {
                     jsonObject.put("flid", model.getFlid());
                } 
                if (model.getTopNode() != null) {
                     jsonObject.put("topNode", model.getTopNode());
                } 
                jsonObject.put("nodeIco", model.getNodeIco());
                if (model.getOutFlag() != null) {
                     jsonObject.put("outFlag", model.getOutFlag());
                } 
                if (model.getInFlag() != null) {
                     jsonObject.put("inFlag", model.getInFlag());
                } 
                if (model.getPassword() != null) {
                     jsonObject.put("password", model.getPassword());
                } 
                if (model.getListNum() != null) {
                     jsonObject.put("listNum", model.getListNum());
                } 
                if (model.getWcompany() != null) {
                     jsonObject.put("wcompany", model.getWcompany());
                } 
                jsonObject.put("listNo", model.getListNo());
                if (model.getUsernmu() != null) {
                     jsonObject.put("usernmu", model.getUsernmu());
                } 
                jsonObject.put("indexIdOld", model.getIndexIdOld());
                jsonObject.put("pindexId", model.getPindexId());
                jsonObject.put("finishInt", model.getFinishInt());
                if (model.getTypeTableName() != null) {
                     jsonObject.put("typeTableName", model.getTypeTableName());
                } 
                if (model.getTreedListStr() != null) {
                     jsonObject.put("treedListStr", model.getTreedListStr());
                } 
                jsonObject.put("pfilesIndex", model.getPfilesIndex());
                if (model.getBdate() != null) {
                      jsonObject.put("bdate", DateUtils.getDate(model.getBdate()));
		      jsonObject.put("bdate_date", DateUtils.getDate(model.getBdate()));
		      jsonObject.put("bdate_datetime", DateUtils.getDateTime(model.getBdate()));
                }
                if (model.getEdate() != null) {
                      jsonObject.put("edate", DateUtils.getDate(model.getEdate()));
		      jsonObject.put("edate_date", DateUtils.getDate(model.getEdate()));
		      jsonObject.put("edate_datetime", DateUtils.getDateTime(model.getEdate()));
                }
                jsonObject.put("wbsIndex", model.getWbsIndex());
                if (model.getBdates() != null) {
                      jsonObject.put("bdates", DateUtils.getDate(model.getBdates()));
		      jsonObject.put("bdates_date", DateUtils.getDate(model.getBdates()));
		      jsonObject.put("bdates_datetime", DateUtils.getDateTime(model.getBdates()));
                }
                if (model.getEdates() != null) {
                      jsonObject.put("edates", DateUtils.getDate(model.getEdates()));
		      jsonObject.put("edates_date", DateUtils.getDate(model.getEdates()));
		      jsonObject.put("edates_datetime", DateUtils.getDateTime(model.getEdates()));
                }
                if (model.getTypeId() != null) {
                     jsonObject.put("typeId", model.getTypeId());
                } 
                jsonObject.put("cell1", model.getCell1());
                jsonObject.put("cell2", model.getCell2());
                jsonObject.put("cell3", model.getCell3());
                if (model.getStrFileLocate() != null) {
                     jsonObject.put("strFileLocate", model.getStrFileLocate());
                } 
                jsonObject.put("intpFile1", model.getIntpFile1());
                jsonObject.put("intpFile2", model.getIntpFile2());
                jsonObject.put("intpFile3", model.getIntpFile3());
                jsonObject.put("intCellFinish", model.getIntCellFinish());
                if (model.getSysId() != null) {
                     jsonObject.put("sysId", model.getSysId());
                } 
                jsonObject.put("indexIn", model.getIndexIn());
                if (model.getStrButtonStar() != null) {
                     jsonObject.put("strButtonStar", model.getStrButtonStar());
                } 
                jsonObject.put("intIsuse", model.getIntIsuse());
                jsonObject.put("wbsIndexIn", model.getWbsIndexIn());
                jsonObject.put("uindexId", model.getUindexId());
                jsonObject.put("lisNoWbs", model.getLisNoWbs());
                if (model.getSysIdAdd() != null) {
                     jsonObject.put("sysIdAdd", model.getSysIdAdd());
                } 
                jsonObject.put("indexInAdd", model.getIndexInAdd());
                if (model.getCreateBy() != null) {
                     jsonObject.put("createBy", model.getCreateBy());
                } 
                if (model.getCreateDate() != null) {
                      jsonObject.put("createDate", DateUtils.getDate(model.getCreateDate()));
		      jsonObject.put("createDate_date", DateUtils.getDate(model.getCreateDate()));
		      jsonObject.put("createDate_datetime", DateUtils.getDateTime(model.getCreateDate()));
                }
                if (model.getUpdateDate() != null) {
                      jsonObject.put("updateDate", DateUtils.getDate(model.getUpdateDate()));
		      jsonObject.put("updateDate_date", DateUtils.getDate(model.getUpdateDate()));
		      jsonObject.put("updateDate_datetime", DateUtils.getDateTime(model.getUpdateDate()));
                }
                if (model.getUpdateBy() != null) {
                     jsonObject.put("updateBy", model.getUpdateBy());
                } 
                return jsonObject;
	}

	
	public static JSONArray listToArray(java.util.List<TreeProjectInfo> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreeProjectInfo model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreeProjectInfo> arrayToList(JSONArray array) {
		java.util.List<TreeProjectInfo> list = new java.util.ArrayList<TreeProjectInfo>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreeProjectInfo model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}


	private TreeProjectInfoJsonFactory() {

	}

}
