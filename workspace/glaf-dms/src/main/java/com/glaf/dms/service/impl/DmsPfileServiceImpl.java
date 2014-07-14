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
import com.glaf.dms.service.DmsPfileService;

@Service("dmsPfileService")
@Transactional(readOnly = true)
public class DmsPfileServiceImpl implements DmsPfileService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected DmsPfileMapper dmsPfileMapper;

	public DmsPfileServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		if (id != null) {
			dmsPfileMapper.deleteDmsPfileById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<String> ids) {
		if (ids != null && !ids.isEmpty()) {
			for (String id : ids) {
				dmsPfileMapper.deleteDmsPfileById(id);
			}
		}
	}

	public int count(DmsPfileQuery query) {
		query.ensureInitialized();
		return dmsPfileMapper.getDmsPfileCount(query);
	}

	public List<DmsPfile> list(DmsPfileQuery query) {
		query.ensureInitialized();
		List<DmsPfile> list = dmsPfileMapper.getDmsPfiles(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getDmsPfileCountByQueryCriteria(DmsPfileQuery query) {
		return dmsPfileMapper.getDmsPfileCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<DmsPfile> getDmsPfilesByQueryCriteria(int start, int pageSize,
			DmsPfileQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<DmsPfile> rows = sqlSessionTemplate.selectList("getDmsPfiles",
				query, rowBounds);
		return rows;
	}

	public DmsPfile getDmsPfile(String id) {
		if (id == null) {
			return null;
		}
		DmsPfile dmsPfile = dmsPfileMapper.getDmsPfileById(id);
		return dmsPfile;
	}

	@Transactional
	public void save(DmsPfile dmsPfile) {
		if (StringUtils.isEmpty(dmsPfile.getId())) {
			dmsPfile.setId(idGenerator.getNextId("PFILE"));
			// dmsPfile.setCreateDate(new Date());
			// dmsPfile.setDeleteFlag(0);
			dmsPfileMapper.insertDmsPfile(dmsPfile);
		} else {
			dmsPfileMapper.updateDmsPfile(dmsPfile);
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
	public void setDmsPfileMapper(DmsPfileMapper dmsPfileMapper) {
		this.dmsPfileMapper = dmsPfileMapper;
	}

	@javax.annotation.Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
