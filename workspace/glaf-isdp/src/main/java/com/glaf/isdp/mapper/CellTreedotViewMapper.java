package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellTreedotView;
import com.glaf.isdp.query.CellTreedotViewQuery;

@Component
public interface CellTreedotViewMapper {

	void deleteCellTreedotViewById(String id);

	void deleteCellTreedotViews(CellTreedotViewQuery query);

	CellTreedotView getCellTreedotViewById(String id);

	int getCellTreedotViewCount(Map<String, Object> parameter);

	int getCellTreedotViewCountByQueryCriteria(CellTreedotViewQuery query);

	List<CellTreedotView> getCellTreedotViews(Map<String, Object> parameter);

	List<CellTreedotView> getCellTreedotViewsByQueryCriteria(
			CellTreedotViewQuery query);

	void insertCellTreedotView(CellTreedotView model);

	void updateCellTreedotView(CellTreedotView model);

}
