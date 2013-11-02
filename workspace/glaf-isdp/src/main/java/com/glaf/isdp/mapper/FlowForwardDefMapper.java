package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FlowForwardDef;
import com.glaf.isdp.query.FlowForwardDefQuery;

@Component
public interface FlowForwardDefMapper {

	void deleteFlowForwardDefById(String id);

	void deleteFlowForwardDefs(FlowForwardDefQuery query);

	FlowForwardDef getFlowForwardDefById(String id);

	int getFlowForwardDefCount(Map<String, Object> parameter);

	int getFlowForwardDefCountByQueryCriteria(FlowForwardDefQuery query);

	List<FlowForwardDef> getFlowForwardDefs(Map<String, Object> parameter);
	
	List<FlowForwardDef> getFlowActivityDefsByProcessDefId(String processDefId);
	
	List<FlowForwardDef> getProcessedFlowForwardDefsByProcessId(Map<String, Object> parameter);

	List<FlowForwardDef> getFlowForwardDefsByQueryCriteria(
			FlowForwardDefQuery query);

	void insertFlowForwardDef(FlowForwardDef model);

	void updateFlowForwardDef(FlowForwardDef model);

}
