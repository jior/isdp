package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FlowProcess;
import com.glaf.isdp.query.FlowProcessQuery;

@Component
public interface FlowProcessMapper {

	void deleteFlowProcessById(String id);

	void deleteFlowProcesss(FlowProcessQuery query);

	FlowProcess getFlowProcessById(String id);

	int getFlowProcessCount(Map<String, Object> parameter);

	int getFlowProcessCountByQueryCriteria(FlowProcessQuery query);
	
	List<FlowProcess> getFlowProcessesByTaskMainId(String taskMainId);

	List<FlowProcess> getFlowProcesses(Map<String, Object> parameter);

	List<FlowProcess> getFlowProcessesByQueryCriteria(FlowProcessQuery query);

	List<FlowProcess> getFlowProcessesByTask(Map<String, Object> parameter);

	void insertFlowProcess(FlowProcess model);

	void updateFlowProcess(FlowProcess model);

}
