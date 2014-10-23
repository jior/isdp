package com.glaf.bpmn.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.bpmn.domain.FlowProcessDefEntity;
import com.glaf.bpmn.query.FlowProcessDefQuery;
import com.glaf.bpmn.service.BpmnProcessDefService;
 

public class FlowProcessDefTest extends AbstractTest {

	protected BpmnProcessDefService bpmnProcessDefService;

	@Test
	public void testList() {
		bpmnProcessDefService = super.getBean("bpmnProcessDefService");
		FlowProcessDefQuery query = new FlowProcessDefQuery();
		//query.nameLike("工程");
		List<FlowProcessDefEntity> rows = bpmnProcessDefService
				.getFlowProcessEntitiesByQueryCriteria(0, 10, query);
		for (FlowProcessDefEntity row : rows) {
			bpmnProcessDefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
