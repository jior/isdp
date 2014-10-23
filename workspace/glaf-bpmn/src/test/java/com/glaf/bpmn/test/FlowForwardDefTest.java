package com.glaf.bpmn.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.bpmn.domain.FlowForwardDefEntity;
import com.glaf.bpmn.query.FlowForwardDefQuery;
import com.glaf.bpmn.service.BpmnForwardDefService;
 

public class FlowForwardDefTest extends AbstractTest {

	protected BpmnForwardDefService bpmnForwardDefService;

	@Test
	public void testList() {
		bpmnForwardDefService = super.getBean("bpmnForwardDefService");
		FlowForwardDefQuery query = new FlowForwardDefQuery();
		//query.nameLike("工程");
		List<FlowForwardDefEntity> rows = bpmnForwardDefService
				.getFlowForwardEntitiesByQueryCriteria(0, 10, query);
		for (FlowForwardDefEntity row : rows) {
			bpmnForwardDefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
