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
import com.glaf.dms.service.DmsTreevmainService;

@Service("dmsTreevmainService")
@Transactional(readOnly = true)
public class DmsTreevmainServiceImpl implements DmsTreevmainService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected DmsTreevmainMapper dmsTreevmainMapper;

	public DmsTreevmainServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		if (id != null) {
			dmsTreevmainMapper.deleteDmsTreevmainById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<String> ids) {
		if (ids != null && !ids.isEmpty()) {
			for (String id : ids) {
				dmsTreevmainMapper.deleteDmsTreevmainById(id);
			}
		}
	}

	public int count(DmsTreevmainQuery query) {
		query.ensureInitialized();
		return dmsTreevmainMapper.getDmsTreevmainCount(query);
	}

	public List<DmsTreevmain> list(DmsTreevmainQuery query) {
		query.ensureInitialized();
		List<DmsTreevmain> list = dmsTreevmainMapper.getDmsTreevmains(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getDmsTreevmainCountByQueryCriteria(DmsTreevmainQuery query) {
		return dmsTreevmainMapper.getDmsTreevmainCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<DmsTreevmain> getDmsTreevmainsByQueryCriteria(int start,
			int pageSize, DmsTreevmainQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<DmsTreevmain> rows = sqlSessionTemplate.selectList(
				"getDmsTreevmains", query, rowBounds);
		return rows;
	}

	public DmsTreevmain getDmsTreevmainById(String id) {
		if (id == null) {
			return null;
		}
		DmsTreevmain dmsTreevmain = dmsTreevmainMapper.getDmsTreevmainById(id);
		return dmsTreevmain;
	}
	
	public DmsTreevmain getDmsTreevmainByIndexId(int indexId) {
		if (indexId == 0) {
			return null;
		}
		DmsTreevmain dmsTreevmain = dmsTreevmainMapper.getDmsTreevmainByIndexId(indexId);
		return dmsTreevmain;
	}

	@Transactional
	public void save(DmsTreevmain dmsTreevmain) {
		if (StringUtils.isEmpty(dmsTreevmain.getId())) {
			dmsTreevmain.setId(idGenerator.getNextId("TREEVMAIN"));
			// dmsTreevmain.setCreateDate(new Date());
			// dmsTreevmain.setDeleteFlag(0);
			dmsTreevmainMapper.insertDmsTreevmain(dmsTreevmain);
		} else {
			dmsTreevmainMapper.updateDmsTreevmain(dmsTreevmain);
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
	public void setDmsTreevmainMapper(DmsTreevmainMapper dmsTreevmainMapper) {
		this.dmsTreevmainMapper = dmsTreevmainMapper;
	}

	@javax.annotation.Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
