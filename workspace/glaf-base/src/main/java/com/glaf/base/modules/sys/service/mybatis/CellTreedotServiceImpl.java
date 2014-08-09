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

package com.glaf.base.modules.sys.service.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.mapper.CellTreedotMapper;
import com.glaf.base.modules.sys.query.CellTreedotQuery;
import com.glaf.base.modules.sys.service.ICellTreedotService;

@Service("cellTreedotService")
@Transactional(readOnly = true)
public class CellTreedotServiceImpl implements ICellTreedotService {
	protected static final Log logger = LogFactory
			.getLog(CellTreedotServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellTreedotMapper cellTreedotMapper;

	public CellTreedotServiceImpl() {

	}

	public int count(CellTreedotQuery query) {
		query.ensureInitialized();
		return cellTreedotMapper.getCellTreedotCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellTreedotMapper.deleteCellTreedotById(id);
	}

	public void deleteByPrimaryKey(int indexId) {
		cellTreedotMapper.deleteCellTreedotByIndexId(indexId);
	}

	public CellTreedot getCellTreedotById(String id) {
		CellTreedot cellTreedot = cellTreedotMapper.getCellTreedotById(id);
		return cellTreedot;
	}

	public CellTreedot getCellTreedotByPrimaryKey(int indexId) {
		return cellTreedotMapper.getCellTreedotByIndexId(indexId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreedotCount(Map<String, Object> parameter) {
		return cellTreedotMapper.getCellTreedotCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreedotCountByQueryCriteria(CellTreedotQuery query) {
		return cellTreedotMapper.getCellTreedotCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellTreedot> getCellTreedots(Map<String, Object> parameter) {
		return cellTreedotMapper.getCellTreedots(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellTreedot> getCellTreedotsByQueryCriteria(int start,
			int pageSize, CellTreedotQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellTreedot> rows = sqlSession.selectList(
				"getCellTreedotsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellTreedot> getCellTreedotsByTopId(String topId) {
		return cellTreedotMapper.getCellTreedotsByTopId(topId);
	}

	/**
	 * 根据父ID获取二级菜单
	 * 
	 * @param parentId
	 * @return
	 */
	public List<CellTreedot> getChildrenCellTreedots(int parentId) {
		return cellTreedotMapper.getChildrenCellTreedots(parentId);
	}

	public List<CellTreedot> getSystemInitCellTreedots() {
		return cellTreedotMapper.getCellTreedotsByTopId("system_init");
	}

	/**
	 * 根据topId获取顶层菜单
	 * 
	 * @param topId
	 * @return
	 */
	public List<CellTreedot> getTopLevelCellTreedotsByTopId(String topId) {
		return cellTreedotMapper.getTopLevelCellTreedotsByTopId(topId);
	}

	public List<CellTreedot> list(CellTreedotQuery query) {
		query.ensureInitialized();
		List<CellTreedot> list = cellTreedotMapper
				.getCellTreedotsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellTreedot cellTreedot) {
		if (cellTreedot.getIndexId() == 0) {
			cellTreedot.setIndexId(idGenerator.nextId().intValue());
			// cellTreedot.setIndexId(idGenerator.getNextId());
			// cellTreedot.setCreateDate(new Date());
			cellTreedotMapper.insertCellTreedot(cellTreedot);
		} else {
			CellTreedot model = this.getCellTreedotByPrimaryKey(cellTreedot
					.getIndexId());
			if (model != null) {
				if (cellTreedot.getId() != null) {
					model.setId(cellTreedot.getId());
				}
				if (cellTreedot.getIndexName() != null) {
					model.setIndexName(cellTreedot.getIndexName());
				}
				model.setNlevel(cellTreedot.getNlevel());
				if (cellTreedot.getNum() != null) {
					model.setNum(cellTreedot.getNum());
				}
				if (cellTreedot.getContent() != null) {
					model.setContent(cellTreedot.getContent());
				}
				model.setNodeico(cellTreedot.getNodeico());
				if (cellTreedot.getSindexName() != null) {
					model.setSindexName(cellTreedot.getSindexName());
				}
				model.setListno(cellTreedot.getListno());
				model.setViewtype(cellTreedot.getViewtype());
				if (cellTreedot.getIsmode() != null) {
					model.setIsmode(cellTreedot.getIsmode());
				}
				if (cellTreedot.getModetableId() != null) {
					model.setModetableId(cellTreedot.getModetableId());
				}
				model.setIssystem(cellTreedot.getIssystem());
				if (cellTreedot.getCustomData() != null) {
					model.setCustomData(cellTreedot.getCustomData());
				}
				model.setIntsystemselect(cellTreedot.getIntsystemselect());
				model.setIntused(cellTreedot.getIntused());
				model.setIntdel(cellTreedot.getIntdel());
				if (cellTreedot.getTypeTablename() != null) {
					model.setTypeTablename(cellTreedot.getTypeTablename());
				}
				model.setIntoperation(cellTreedot.getIntoperation());
				if (cellTreedot.getPicfile() != null) {
					model.setPicfile(cellTreedot.getPicfile());
				}
				model.setFileContent(cellTreedot.getFileContent());
				model.setIntMuiFrm(cellTreedot.getIntMuiFrm());
				model.setIntnoshow(cellTreedot.getIntnoshow());
				if (cellTreedot.getTypeBasetable() != null) {
					model.setTypeBasetable(cellTreedot.getTypeBasetable());
				}
				model.setTypeIndex(cellTreedot.getTypeIndex());
				if (cellTreedot.getGid() != null) {
					model.setGid(cellTreedot.getGid());
				}
				cellTreedotMapper.updateCellTreedot(model);
			}
		}
	}

	@javax.annotation.Resource(name = "com.glaf.base.modules.sys.mapper.CellTreedotMapper")
	public void setCellTreedotMapper(CellTreedotMapper cellTreedotMapper) {
		this.cellTreedotMapper = cellTreedotMapper;
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
