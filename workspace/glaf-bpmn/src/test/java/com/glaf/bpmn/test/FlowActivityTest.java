package com.glaf.bpmn.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.bpmn.domain.FlowActivityEntity;
import com.glaf.bpmn.query.FlowActivityQuery;
import com.glaf.bpmn.service.BpmnActivityService;
 

public class FlowActivityTest extends AbstractTest {

	protected BpmnActivityService bpmnActivityService;

	@Test
	public void testList() {
		bpmnActivityService = super.getBean("bpmnActivityService");
		FlowActivityQuery query = new FlowActivityQuery();
		//query.nameLike("工程");
		List<FlowActivityEntity> rows = bpmnActivityService
				.getFlowActivitiesByQueryCriteria(0, 10, query);
		for (FlowActivityEntity row : rows) {
			bpmnActivityService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
