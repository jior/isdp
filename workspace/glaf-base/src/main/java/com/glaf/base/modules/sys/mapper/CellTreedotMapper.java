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

package com.glaf.base.modules.sys.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.query.CellTreedotQuery;

@Component("com.glaf.base.modules.sys.mapper.CellTreedotMapper")
public interface CellTreedotMapper {

	void deleteCellTreedotById(String id);

	void deleteCellTreedotByIndexId(int indexId);

	void deleteCellTreedots(CellTreedotQuery query);

	CellTreedot getCellTreedotById(String id);

	CellTreedot getCellTreedotByIndexId(int indexId);

	int getCellTreedotCount(Map<String, Object> parameter);

	int getCellTreedotCountByQueryCriteria(CellTreedotQuery query);

	List<CellTreedot> getCellTreedots(Map<String, Object> parameter);

	List<CellTreedot> getCellTreedotsByQueryCriteria(CellTreedotQuery query);

	List<CellTreedot> getCellTreedotsByTopId(String topId);

	List<CellTreedot> getChildrenCellTreedots(int parentId);
	
	List<CellTreedot> getTopLevelCellTreedotsByTopId(String topId);

	void insertCellTreedot(CellTreedot model);

	void updateCellTreedot(CellTreedot model);

}
