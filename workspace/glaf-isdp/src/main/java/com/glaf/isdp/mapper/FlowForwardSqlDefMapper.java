package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FlowForwardSqlDef;
import com.glaf.isdp.query.FlowForwardSqlDefQuery;

@Component
public interface FlowForwardSqlDefMapper {

	void deleteFlowForwardSqlDefById(String id);

	void deleteFlowForwardSqlDefs(FlowForwardSqlDefQuery query);

	FlowForwardSqlDef getFlowForwardSqlDefById(String id);

	int getFlowForwardSqlDefCount(Map<String, Object> parameter);

	int getFlowForwardSqlDefCountByQueryCriteria(FlowForwardSqlDefQuery query);

	List<FlowForwardSqlDef> getFlowForwardSqlDefs(Map<String, Object> parameter);

	List<FlowForwardSqlDef> getFlowForwardSqlDefsByQueryCriteria(
			FlowForwardSqlDefQuery query);

	void insertFlowForwardSqlDef(FlowForwardSqlDef model);

	void updateFlowForwardSqlDef(FlowForwardSqlDef model);

}
