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

import com.glaf.base.modules.sys.model.CellTreedotDot;
import com.glaf.base.modules.sys.query.CellTreedotDotQuery;

@Component("com.glaf.base.modules.sys.mapper.CellTreedotDotMapper")
public interface CellTreedotDotMapper {

	void deleteCellTreedotDotById(String id);

	void deleteCellTreedotDots(CellTreedotDotQuery query);

	CellTreedotDot getCellTreedotDotById(String id);

	int getCellTreedotDotCount(Map<String, Object> parameter);

	int getCellTreedotDotCountByQueryCriteria(CellTreedotDotQuery query);

	List<CellTreedotDot> getCellTreedotDots(Map<String, Object> parameter);

	List<CellTreedotDot> getCellTreedotDotsByQueryCriteria(
			CellTreedotDotQuery query);

	void insertCellTreedotDot(CellTreedotDot model);

	void updateCellTreedotDot(CellTreedotDot model);

}
