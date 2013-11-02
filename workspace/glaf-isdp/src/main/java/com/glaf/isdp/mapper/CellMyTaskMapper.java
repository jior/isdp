package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellMyTask;
import com.glaf.isdp.query.CellMyTaskQuery;

@Component
public interface CellMyTaskMapper {

	void deleteCellMyTaskById(String id);

	void deleteCellMyTasks(CellMyTaskQuery query);

	CellMyTask getCellMyTaskById(String id);

	int getCellMyTaskCount(Map<String, Object> parameter);

	int getCellMyTaskCountByQueryCriteria(CellMyTaskQuery query);

	List<CellMyTask> getCellMyTasks(Map<String, Object> parameter);

	List<CellMyTask> getCellMyTasksByQueryCriteria(CellMyTaskQuery query);

	void insertCellMyTask(CellMyTask model);

	void updateCellMyTask(CellMyTask model);

}
