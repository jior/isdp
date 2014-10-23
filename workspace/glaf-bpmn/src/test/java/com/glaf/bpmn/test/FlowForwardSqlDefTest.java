package com.glaf.bpmn.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.bpmn.domain.FlowForwardSqlDefEntity;
import com.glaf.bpmn.query.FlowForwardSqlDefQuery;
import com.glaf.bpmn.service.BpmnForwardSqlDefService;
 

public class FlowForwardSqlDefTest extends AbstractTest {

	protected BpmnForwardSqlDefService bpmnForwardSqlDefService;

	@Test
	public void testList() {
		bpmnForwardSqlDefService = super.getBean("bpmnForwardSqlDefService");
		FlowForwardSqlDefQuery query = new FlowForwardSqlDefQuery();
		//query.nameLike("工程");
		List<FlowForwardSqlDefEntity> rows = bpmnForwardSqlDefService
				.getFlowForwardSqlEntitiesByQueryCriteria(0, 10, query);
		for (FlowForwardSqlDefEntity row : rows) {
			bpmnForwardSqlDefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
