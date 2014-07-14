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
import com.glaf.dms.service.DmsVolumeService;

@Service("dmsVolumeService")
@Transactional(readOnly = true)
public class DmsVolumeServiceImpl implements DmsVolumeService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected DmsVolumeMapper dmsVolumeMapper;

	public DmsVolumeServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		if (id != null) {
			dmsVolumeMapper.deleteDmsVolumeById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<String> ids) {
		if (ids != null && !ids.isEmpty()) {
			for (String id : ids) {
				dmsVolumeMapper.deleteDmsVolumeById(id);
			}
		}
	}

	public int count(DmsVolumeQuery query) {
		return dmsVolumeMapper.getDmsVolumeCount(query);
	}

	public List<DmsVolume> list(DmsVolumeQuery query) {
		List<DmsVolume> list = dmsVolumeMapper.getDmsVolumes(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getDmsVolumeCountByQueryCriteria(DmsVolumeQuery query) {
		return dmsVolumeMapper.getDmsVolumeCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<DmsVolume> getDmsVolumesByQueryCriteria(int start,
			int pageSize, DmsVolumeQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<DmsVolume> rows = sqlSessionTemplate.selectList("getDmsVolumes",
				query, rowBounds);
		return rows;
	}

	public DmsVolume getDmsVolume(String id) {
		if (id == null) {
			return null;
		}
		DmsVolume dmsVolume = dmsVolumeMapper.getDmsVolumeById(id);
		if (dmsVolume == null) {
			DmsVolumeQuery query = new DmsVolumeQuery();
			query.setVid(id);
			List<DmsVolume> list = dmsVolumeMapper.getDmsVolumes(query);
			if (list != null && !list.isEmpty()) {
				dmsVolume = list.get(0);
			}
		}
		if (dmsVolume == null) {
			DmsVolumeQuery query = new DmsVolumeQuery();
			query.setVnum(id);
			List<DmsVolume> list = dmsVolumeMapper.getDmsVolumes(query);
			if (list != null && !list.isEmpty()) {
				dmsVolume = list.get(0);
			}
		}
		return dmsVolume;
	}

	@Transactional
	public void save(DmsVolume dmsVolume) {
		if (StringUtils.isEmpty(dmsVolume.getId())) {
			dmsVolume.setId(idGenerator.getNextId("VOLUME"));
			// dmsVolume.setCreateDate(new Date());
			// dmsVolume.setDeleteFlag(0);
			dmsVolumeMapper.insertDmsVolume(dmsVolume);
		} else {
			dmsVolumeMapper.updateDmsVolume(dmsVolume);
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
	public void setDmsVolumeMapper(DmsVolumeMapper dmsVolumeMapper) {
		this.dmsVolumeMapper = dmsVolumeMapper;
	}

	@javax.annotation.Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
