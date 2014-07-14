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
import org.apache.commons.lang3.StringUtils;
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
import com.glaf.dms.service.DmsFileattService;

@Service("dmsFileattService")
@Transactional(readOnly = true)
public class DmsFileattServiceImpl implements DmsFileattService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected DmsFileattMapper dmsFileattMapper;

	public DmsFileattServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		if (id != null) {
			dmsFileattMapper.deleteDmsFileattById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<String> fileIds) {
		if (fileIds != null && !fileIds.isEmpty()) {
			for (String id : fileIds) {
				dmsFileattMapper.deleteDmsFileattById(id);
			}
		}
	}

	public int count(DmsFileattQuery query) {
		query.ensureInitialized();
		return dmsFileattMapper.getDmsFileattCount(query);
	}

	public List<DmsFileatt> list(DmsFileattQuery query) {
		query.ensureInitialized();
		List<DmsFileatt> list = dmsFileattMapper.getDmsFileatts(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getDmsFileattCountByQueryCriteria(DmsFileattQuery query) {
		return dmsFileattMapper.getDmsFileattCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<DmsFileatt> getDmsFileattsByQueryCriteria(int start,
			int pageSize, DmsFileattQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<DmsFileatt> rows = sqlSessionTemplate.selectList("getDmsFileatts",
				query, rowBounds);
		return rows;
	}

	public DmsFileatt getDmsFileatt(String id) {
		if (id == null) {
			return null;
		}
		DmsFileatt dmsFileatt = dmsFileattMapper.getDmsFileattById(id);
		return dmsFileatt;
	}

	@Transactional
	public void save(DmsFileatt dmsFileatt) {
		if (StringUtils.isEmpty(dmsFileatt.getFileId())) {
			dmsFileatt.setFileId(idGenerator.getNextId("FILEATT"));
			// dmsFileatt.setCreateDate(new Date());
			// dmsFileatt.setDeleteFlag(0);
			dmsFileattMapper.insertDmsFileatt(dmsFileatt);
		} else {
			dmsFileattMapper.updateDmsFileatt(dmsFileatt);
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
	public void setDmsFileattMapper(DmsFileattMapper dmsFileattMapper) {
		this.dmsFileattMapper = dmsFileattMapper;
	}

	@javax.annotation.Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
