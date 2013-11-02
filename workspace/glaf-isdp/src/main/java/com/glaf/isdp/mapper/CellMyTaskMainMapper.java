package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellMyTaskMain;
import com.glaf.isdp.query.CellMyTaskMainQuery;

@Component
public interface CellMyTaskMainMapper {

	void deleteCellMyTaskMainById(String id);

	void deleteCellMyTaskMains(CellMyTaskMainQuery query);

	CellMyTaskMain getCellMyTaskMainById(String id);

	int getCellMyTaskMainCount(Map<String, Object> parameter);

	int getCellMyTaskMainCountByQueryCriteria(CellMyTaskMainQuery query);
	
	int getCellMyTaskMainIndexIdByFlowActId(String actId);
	
	List<CellMyTaskMain> getCellMyTaskMainByFlowActId(String actId);

	List<CellMyTaskMain> getCellMyTaskMains(Map<String, Object> parameter);

	List<CellMyTaskMain> getCellMyTaskMainsByQueryCriteria(
			CellMyTaskMainQuery query);

	void insertCellMyTaskMain(CellMyTaskMain model);

	void updateCellMyTaskMain(CellMyTaskMain model);

}
