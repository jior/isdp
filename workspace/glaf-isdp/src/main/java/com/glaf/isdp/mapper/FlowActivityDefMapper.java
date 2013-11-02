package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FlowActivityDef;
import com.glaf.isdp.query.FlowActivityDefQuery;

@Component
public interface FlowActivityDefMapper {

	void deleteFlowActivityDefById(String id);

	void deleteFlowActivityDefs(FlowActivityDefQuery query);

	FlowActivityDef getFlowActivityDefById(String id);

	int getFlowActivityDefCount(Map<String, Object> parameter);

	int getFlowActivityDefCountByQueryCriteria(FlowActivityDefQuery query);

	List<FlowActivityDef> getFlowActivityDefs(Map<String, Object> parameter);

	List<FlowActivityDef> getFlowActivityDefsByProcessDefId(String processDefId);

	List<FlowActivityDef> getFlowActivityDefsByMainId(String mainId);

	List<FlowActivityDef> getCurrentActiveFlowActivityDefsByProcessId(
			String processId);

	List<FlowActivityDef> getFlowActivityDefsByQueryCriteria(
			FlowActivityDefQuery query);

	void insertFlowActivityDef(FlowActivityDef model);

	void updateFlowActivityDef(FlowActivityDef model);

}
