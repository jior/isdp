package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.FlowForward;
import com.glaf.isdp.query.FlowForwardQuery;

@Component
public interface FlowForwardMapper {

	void deleteFlowForwardById(String id);

	void deleteFlowForwards(FlowForwardQuery query);

	FlowForward getFlowForwardById(String id);

	int getFlowForwardCount(Map<String, Object> parameter);

	int getFlowForwardCountByQueryCriteria(FlowForwardQuery query);

	List<FlowForward> getFlowForwards(Map<String, Object> parameter);

	List<FlowForward> getFlowForwardsByQueryCriteria(FlowForwardQuery query);

	void insertFlowForward(FlowForward model);

	void updateFlowForward(FlowForward model);

}
