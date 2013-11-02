package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.MyCellTask;
import com.glaf.isdp.query.MyCellTaskQuery;

@Component
public interface MyCellTaskMapper {

	void deleteMyCellTask(MyCellTaskQuery query);

	void deleteMyCellTaskById(String id);

	MyCellTask getMyCellTaskById(String id);

	int getMyCellTaskCount(Map<String, Object> parameter);

	int getMyCellTaskCountByQueryCriteria(MyCellTaskQuery query);

	List<MyCellTask> getMyCellTasks(Map<String, Object> parameter);

	List<MyCellTask> getMyCellTasksByIndexId(Map<String, Object> parameter);

	List<MyCellTask> getMyCellTasksByQueryCriteria(MyCellTaskQuery query);

	void insertMyCellTask(MyCellTask model);

	void updateMyCellTask(MyCellTask model);

}
