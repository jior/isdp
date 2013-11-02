package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellTreedotDot;
import com.glaf.isdp.query.CellTreedotDotQuery;

@Component
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
