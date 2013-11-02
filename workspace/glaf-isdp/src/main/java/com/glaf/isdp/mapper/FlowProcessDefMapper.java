package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FlowProcessDef;
import com.glaf.isdp.query.FlowProcessDefQuery;

@Component
public interface FlowProcessDefMapper {

	void deleteFlowProcessDefById(String id);

	void deleteFlowProcessDefs(FlowProcessDefQuery query);

	FlowProcessDef getFlowProcessDefById(String id);
	
	FlowProcessDef getFlowProcessDefById_postgres(String id);

	int getFlowProcessDefCount(Map<String, Object> parameter);

	int getFlowProcessDefCountByQueryCriteria(FlowProcessDefQuery query);

	List<FlowProcessDef> getFlowProcessDefs(Map<String, Object> parameter);

	List<FlowProcessDef> getFlowProcessDefsByQueryCriteria(
			FlowProcessDefQuery query);

	void insertFlowProcessDef(FlowProcessDef model);

	void updateFlowProcessDef(FlowProcessDef model);

}
