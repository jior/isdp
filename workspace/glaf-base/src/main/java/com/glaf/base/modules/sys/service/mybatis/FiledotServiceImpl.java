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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.config.Environment;
import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.util.DBUtils;
import com.glaf.base.modules.sys.model.Filedot;
import com.glaf.base.modules.sys.mapper.FiledotMapper;
import com.glaf.base.modules.sys.query.FiledotQuery;
import com.glaf.base.modules.sys.service.IFiledotService;

@Service("filedotService")
@Transactional(readOnly = true)
public class FiledotServiceImpl implements IFiledotService {
	protected static final Log logger = LogFactory
			.getLog(FiledotServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FiledotMapper filedotMapper;

	public FiledotServiceImpl() {

	}

	public int count(FiledotQuery query) {
		query.ensureInitialized();
		return filedotMapper.getFiledotCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		filedotMapper.deleteFiledotById(id);
	}

	public Filedot getFiledot(String id) {
		Filedot filedot = null;
		if (StringUtils.equals(DBUtils.POSTGRESQL,
				Environment.getCurrentDatabaseType())) {
			filedot = filedotMapper.getFiledotById_postgres(id);
		} else {
			filedot = filedotMapper.getFiledotById(id);
		}
		return filedot;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFiledotCount(Map<String, Object> parameter) {
		return filedotMapper.getFiledotCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFiledotCountByQueryCriteria(FiledotQuery query) {
		return filedotMapper.getFiledotCountByQueryCriteria(query);
	}

	public List<Filedot> getMyCellTaskFiles(int indexId, int intistasks) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("indexId", indexId);
		parameter.put("intistasks", intistasks);
		return filedotMapper.getMyCellTaskFiles(parameter);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<Filedot> getFiledots(Map<String, Object> parameter) {
		return filedotMapper.getFiledots(parameter);
	}

	public List<Filedot> getFiledotsByCheckItemId(String proj_chkitem_id) {
		return filedotMapper.getFiledotsByCheckItemId(proj_chkitem_id);
	}

	/**
	 * 获取挂接到某个分类的文件定义
	 * 
	 * @param indexId
	 * @return
	 */
	public List<Filedot> getFiledotsOfTreedot(int indexId) {
		return filedotMapper.getFiledotsOfTreedot(indexId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<Filedot> getFiledotsByQueryCriteria(int start, int pageSize,
			FiledotQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<Filedot> rows = sqlSession.selectList(
				"getFiledotsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<Filedot> list(FiledotQuery query) {
		query.ensureInitialized();
		List<Filedot> list = filedotMapper.getFiledotsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(Filedot filedot) {
		if (StringUtils.isEmpty(filedot.getFileID())) {
			filedot.setFileID(idGenerator.getNextId());
			// filedot.setFileID(idGenerator.getNextId());
			// filedot.setCreateDate(new Date());
			filedotMapper.insertFiledot(filedot);
		} else {
			Filedot model = this.getFiledot(filedot.getFileID());
			if (model != null) {
				model.setIndexId(filedot.getIndexId());
				if (filedot.getFbelong() != null) {
					model.setFbelong(filedot.getFbelong());
				}
				if (filedot.getFnum() != null) {
					model.setFnum(filedot.getFnum());
				}
				if (filedot.getPbelong() != null) {
					model.setPbelong(filedot.getPbelong());
				}
				if (filedot.getNum() != null) {
					model.setNum(filedot.getNum());
				}
				if (filedot.getFname() != null) {
					model.setFname(filedot.getFname());
				}
				if (filedot.getDotname() != null) {
					model.setDotname(filedot.getDotname());
				}
				if (filedot.getCtime() != null) {
					model.setCtime(filedot.getCtime());
				}
				if (filedot.getDtime() != null) {
					model.setDtime(filedot.getDtime());
				}
				if (filedot.getFileName() != null) {
					model.setFileName(filedot.getFileName());
				}
				model.setFileContent(filedot.getFileContent());
				model.setFilesize(filedot.getFilesize());
				model.setDwid(filedot.getDwid());
				model.setFbid(filedot.getFbid());
				model.setFxid(filedot.getFxid());
				if (filedot.getJid() != null) {
					model.setJid(filedot.getJid());
				}
				if (filedot.getFlid() != null) {
					model.setFlid(filedot.getFlid());
				}
				if (filedot.getTopnode() != null) {
					model.setTopnode(filedot.getTopnode());
				}
				if (filedot.getCman() != null) {
					model.setCman(filedot.getCman());
				}
				if (filedot.getContent() != null) {
					model.setContent(filedot.getContent());
				}
				if (filedot.getListflag() != null) {
					model.setListflag(filedot.getListflag());
				}
				model.setTofile(filedot.getTofile());
				if (filedot.getIsink() != null) {
					model.setIsink(filedot.getIsink());
				}
				model.setDottype(filedot.getDottype());
				if (filedot.getCtimedname() != null) {
					model.setCtimedname(filedot.getCtimedname());
				}
				model.setType(filedot.getType());
				model.setListno(filedot.getListno());
				model.setUtreeIndex(filedot.getUtreeIndex());
				if (filedot.getIsquan() != null) {
					model.setIsquan(filedot.getIsquan());
				}
				model.setIntsysform(filedot.getIntsysform());
				filedotMapper.updateFiledot(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name = "com.glaf.base.modules.sys.mapper.FiledotMapper")
	public void setFiledotMapper(FiledotMapper filedotMapper) {
		this.filedotMapper = filedotMapper;
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
