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
import com.glaf.dms.service.DmsTreevmainUserService;

@Service("dmsTreevmainUserService")
@Transactional(readOnly = true)
public class DmsTreevmainUserServiceImpl implements DmsTreevmainUserService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected DmsTreevmainUserMapper dmsTreevmainUserMapper;

	public DmsTreevmainUserServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		if (id != null) {
			dmsTreevmainUserMapper.deleteDmsTreevmainUserById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<String> ids) {
		if (ids != null && !ids.isEmpty()) {
			for (String id : ids) {
				dmsTreevmainUserMapper.deleteDmsTreevmainUserById(id);
			}
		}
	}

	public int count(DmsTreevmainUserQuery query) {
		query.ensureInitialized();
		return dmsTreevmainUserMapper.getDmsTreevmainUserCount(query);
	}

	public List<DmsTreevmainUser> list(DmsTreevmainUserQuery query) {
		query.ensureInitialized();
		List<DmsTreevmainUser> list = dmsTreevmainUserMapper
				.getDmsTreevmainUsers(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getDmsTreevmainUserCountByQueryCriteria(
			DmsTreevmainUserQuery query) {
		return dmsTreevmainUserMapper.getDmsTreevmainUserCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<DmsTreevmainUser> getDmsTreevmainUsersByQueryCriteria(
			int start, int pageSize, DmsTreevmainUserQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<DmsTreevmainUser> rows = sqlSessionTemplate.selectList(
				"getDmsTreevmainUsers", query, rowBounds);
		return rows;
	}

	public DmsTreevmainUser getDmsTreevmainUserById(String id) {
		if (id == null) {
			return null;
		}
		DmsTreevmainUser dmsTreevmainUser = dmsTreevmainUserMapper
				.getDmsTreevmainUserById(id);
		return dmsTreevmainUser;
	}

	public DmsTreevmainUser getDmsTreevmainUserByIndexId(int indexId) {
		if (indexId > 0) {
			DmsTreevmainUser dmsTreevmainUser = dmsTreevmainUserMapper
					.getDmsTreevmainUserByIndexId(indexId);
			return dmsTreevmainUser;
		}
		return null;
	}

	@Transactional
	public void save(DmsTreevmainUser dmsTreevmainUser) {
		if (StringUtils.isEmpty(dmsTreevmainUser.getId())) {
			dmsTreevmainUser.setId(idGenerator.getNextId("DMSTREEVMAINUSER"));
			// dmsTreevmainUser.setCreateDate(new Date());
			// dmsTreevmainUser.setDeleteFlag(0);
			dmsTreevmainUserMapper.insertDmsTreevmainUser(dmsTreevmainUser);
		} else {
			dmsTreevmainUserMapper.updateDmsTreevmainUser(dmsTreevmainUser);
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
	public void setDmsTreevmainUserMapper(
			DmsTreevmainUserMapper dmsTreevmainUserMapper) {
		this.dmsTreevmainUserMapper = dmsTreevmainUserMapper;
	}

	@javax.annotation.Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
