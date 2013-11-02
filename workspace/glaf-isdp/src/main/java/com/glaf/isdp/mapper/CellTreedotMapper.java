package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellTreedot;
import com.glaf.isdp.query.CellTreedotQuery;

@Component
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
