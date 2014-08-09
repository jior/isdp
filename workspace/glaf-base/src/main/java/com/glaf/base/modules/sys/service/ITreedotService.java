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

package com.glaf.base.modules.sys.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.base.modules.sys.model.*;
import com.glaf.base.modules.sys.query.*;

@Transactional(readOnly = true)
public interface ITreedotService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteByPrimaryKey(int indexId);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	Treedot getTreedotById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	Treedot getTreedotByPrimaryKey(int indexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreedotCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreedotCountByQueryCriteria(TreedotQuery query);

	List<String> getTreedotIdsByIndexId(int indexId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<Treedot> getTreedots(Map<String, Object> parameter);

	List<Treedot> getTreedotsByIdLike(String idLike);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<Treedot> getTreedotsByQueryCriteria(int start, int pageSize,
			TreedotQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<Treedot> list(TreedotQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(Treedot treedot);

}
