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

package com.glaf.dms.service.impl;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.id.*;
import com.glaf.core.dao.*;
import com.glaf.dms.mapper.*;
import com.glaf.dms.domain.*;
import com.glaf.dms.query.*;
import com.glaf.dms.service.DmsTreevmainCommService;

@Service("dmsTreevmainCommService")
@Transactional(readOnly = true)
public class DmsTreevmainCommServiceImpl implements DmsTreevmainCommService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected DmsTreevmainCommMapper dmsTreevmainCommMapper;

	public DmsTreevmainCommServiceImpl() {

	}

	@Transactional
	public void deleteById(Integer id) {
		if (id != null) {
			dmsTreevmainCommMapper.deleteDmsTreevmainCommById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<Integer> indexIds) {
		if (indexIds != null && !indexIds.isEmpty()) {
			for (Integer id : indexIds) {
				dmsTreevmainCommMapper.deleteDmsTreevmainCommById(id);
			}
		}
	}

	public int count(DmsTreevmainCommQuery query) {
		query.ensureInitialized();
		return dmsTreevmainCommMapper.getDmsTreevmainCommCount(query);
	}

	public List<DmsTreevmainComm> list(DmsTreevmainCommQuery query) {
		query.ensureInitialized();
		List<DmsTreevmainComm> list = dmsTreevmainCommMapper
				.getDmsTreevmainComms(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getDmsTreevmainCommCountByQueryCriteria(
			DmsTreevmainCommQuery query) {
		return dmsTreevmainCommMapper.getDmsTreevmainCommCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<DmsTreevmainComm> getDmsTreevmainCommsByQueryCriteria(
			int start, int pageSize, DmsTreevmainCommQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<DmsTreevmainComm> rows = sqlSessionTemplate.selectList(
				"getDmsTreevmainComms", query, rowBounds);
		return rows;
	}

	public DmsTreevmainComm getDmsTreevmainComm(Integer id) {
		if (id == null) {
			return null;
		}
		DmsTreevmainComm dmsTreevmainComm = dmsTreevmainCommMapper
				.getDmsTreevmainCommById(id);
		return dmsTreevmainComm;
	}

	@Transactional
	public void save(DmsTreevmainComm dmsTreevmainComm) {
		if (dmsTreevmainComm.getIndexId() == null) {
			dmsTreevmainComm.setIndexId(idGenerator.nextId("TREEVMAIN_COMM")
					.intValue());
			// dmsTreevmainComm.setCreateDate(new Date());
			// dmsTreevmainComm.setDeleteFlag(0);
			dmsTreevmainCommMapper.insertDmsTreevmainComm(dmsTreevmainComm);
		} else {
			dmsTreevmainCommMapper.updateDmsTreevmainComm(dmsTreevmainComm);
		}
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
	public void setDmsTreevmainCommMapper(
			DmsTreevmainCommMapper dmsTreevmainCommMapper) {
		this.dmsTreevmainCommMapper = dmsTreevmainCommMapper;
	}

	@javax.annotation.Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
