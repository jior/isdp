package com.glaf.bpmn.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.bpmn.domain.FlowForwardEntity;
import com.glaf.bpmn.query.FlowForwardQuery;
import com.glaf.bpmn.service.BpmnForwardService;

public class FlowForwardTest extends AbstractTest {

	protected BpmnForwardService bpmnForwardService;

	@Test
	public void testList() {
		bpmnForwardService = super.getBean("bpmnForwardService");
		FlowForwardQuery query = new FlowForwardQuery();
		// query.nameLike("工程");
		List<FlowForwardEntity> rows = bpmnForwardService
				.getFlowForwardsByQueryCriteria(0, 10, query);
		for (FlowForwardEntity row : rows) {
			bpmnForwardService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
