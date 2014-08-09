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
public interface IFiledotService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	Filedot getFiledot(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFiledotCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFiledotCountByQueryCriteria(FiledotQuery query);

	List<Filedot> getMyCellTaskFiles(int indexId, int intistasks);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<Filedot> getFiledots(Map<String, Object> parameter);

	/**
	 * 获取挂接到某个分类的文件定义
	 * 
	 * @param indexId
	 * @return
	 */
	List<Filedot> getFiledotsOfTreedot(int indexId);

	List<Filedot> getFiledotsByCheckItemId(String proj_chkitem_id);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<Filedot> getFiledotsByQueryCriteria(int start, int pageSize,
			FiledotQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<Filedot> list(FiledotQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(Filedot filedot);

}
