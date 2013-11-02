package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FlowStation;
import com.glaf.isdp.query.FlowStationQuery;

@Component
public interface FlowStationMapper {

	void deleteFlowStationById(String id);

	void deleteFlowStations(FlowStationQuery query);

	FlowStation getFlowStationById(String id);

	int getFlowStationCount(Map<String, Object> parameter);

	int getFlowStationCountByQueryCriteria(FlowStationQuery query);

	List<FlowStation> getFlowStations(Map<String, Object> parameter);

	List<FlowStation> getFlowStationsByQueryCriteria(FlowStationQuery query);

	void insertFlowStation(FlowStation model);

	void updateFlowStation(FlowStation model);

}
