package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FlowActivity;
import com.glaf.isdp.query.FlowActivityQuery;

@Component
public interface FlowActivityMapper {

	void deleteFlowActivityById(String id);

	List<FlowActivity> getFlowActivities(Map<String, Object> parameter);

	List<FlowActivity> getFlowActivitiesByProcessInstanceId(
			String processInstanceId);
	
	List<FlowActivity> getFlowActivitiesByTaskId(Map<String, Object> parameter);

	List<FlowActivity> getFlowActivitiesByQueryCriteria(FlowActivityQuery query);

	FlowActivity getFlowActivityById(String id);

	int getFlowActivityCount(Map<String, Object> parameter);

	int getFlowActivityCountByQueryCriteria(FlowActivityQuery query);

	void insertFlowActivity(FlowActivity model);

	void updateFlowActivity(FlowActivity model);

}
