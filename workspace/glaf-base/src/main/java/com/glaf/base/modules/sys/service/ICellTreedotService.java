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
public interface ICellTreedotService {

	/**
	 * 根据id删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据id删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteByPrimaryKey(int indexId);

	/**
	 * 根据id获取一条记录
	 * 
	 * @return
	 */
	CellTreedot getCellTreedotById(String id);

	/**
	 * 根据indexId获取一条记录
	 * 
	 * @return
	 */
	CellTreedot getCellTreedotByPrimaryKey(int indexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreedotCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreedotCountByQueryCriteria(CellTreedotQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreedot> getCellTreedots(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellTreedot> getCellTreedotsByQueryCriteria(int start, int pageSize,
			CellTreedotQuery query);

	/**
	 * 根据topId获取菜单项
	 * 
	 * @param topId
	 * @return
	 */
	List<CellTreedot> getCellTreedotsByTopId(String topId);
	
	/**
	 * 根据父ID获取二级菜单
	 * @param parentId
	 * @return
	 */
	List<CellTreedot> getChildrenCellTreedots(int parentId);
	
	/**
	 * 根据父ID获取全部菜单
	 * @param parentId
	 * @return
	 */
	List<CellTreedot> getAllChildrenCellTreedots(int parentId);

	/**
	 * 获取topId为system_init的系统菜单项
	 * 
	 * @return
	 */
	List<CellTreedot> getSystemInitCellTreedots();

	/**
	 * 根据topId获取顶层菜单
	 * 
	 * @param topId
	 * @return
	 */
	List<CellTreedot> getTopLevelCellTreedotsByTopId(String topId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreedot> list(CellTreedotQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellTreedot cellTreedot);

}
