package com.glaf.bpmn.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.bpmn.domain.FlowActivityDefEntity;
import com.glaf.bpmn.query.FlowActivityDefQuery;
import com.glaf.bpmn.service.BpmnActivityDefService;
 

public class FlowActivityDefTest extends AbstractTest {

	protected BpmnActivityDefService bpmnActivityDefService;

	@Test
	public void testList() {
		bpmnActivityDefService = super.getBean("bpmnActivityDefService");
		FlowActivityDefQuery query = new FlowActivityDefQuery();
		//query.nameLike("工程");
		List<FlowActivityDefEntity> rows = bpmnActivityDefService
				.getFlowActivityEntitiesByQueryCriteria(0, 10, query);
		for (FlowActivityDefEntity row : rows) {
			bpmnActivityDefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
