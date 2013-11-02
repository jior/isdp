package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellTreedotPer;
import com.glaf.isdp.query.CellTreedotPerQuery;

@Component
public interface CellTreedotPerMapper {

	void deleteCellTreedotPerById(String id);

	void deleteCellTreedotPers(CellTreedotPerQuery query);

	CellTreedotPer getCellTreedotPerById(String id);

	int getCellTreedotPerCount(Map<String, Object> parameter);

	int getCellTreedotPerCountByQueryCriteria(CellTreedotPerQuery query);

	List<CellTreedotPer> getCellTreedotPers(Map<String, Object> parameter);

	List<CellTreedotPer> getCellTreedotPersByQueryCriteria(
			CellTreedotPerQuery query);

	void insertCellTreedotPer(CellTreedotPer model);

	void updateCellTreedotPer(CellTreedotPer model);

}
