package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.MyCellTaskSub;
import com.glaf.isdp.query.MyCellTaskSubQuery;

@Component
public interface MyCellTaskSubMapper {

	void deleteMyCellTaskSubById(String id);

	void deleteMyCellTaskSub(MyCellTaskSubQuery query);

	MyCellTaskSub getMyCellTaskSubById(String id);

	int getMyCellTaskSubCount(Map<String, Object> parameter);

	int getMyCellTaskSubCountByQueryCriteria(MyCellTaskSubQuery query);

	List<MyCellTaskSub> getMyCellTaskSubs(Map<String, Object> parameter);

	List<MyCellTaskSub> getMyCellTaskSubsByQueryCriteria(
			MyCellTaskSubQuery query);

	void insertMyCellTaskSub(MyCellTaskSub model);

	void updateMyCellTaskSub(MyCellTaskSub model);

}
