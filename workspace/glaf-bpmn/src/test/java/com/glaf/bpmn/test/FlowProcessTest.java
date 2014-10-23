package com.glaf.bpmn.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.bpmn.domain.FlowProcessEntity;
import com.glaf.bpmn.query.FlowProcessQuery;
import com.glaf.bpmn.service.BpmnProcessService;
 

public class FlowProcessTest extends AbstractTest {

	protected BpmnProcessService bpmnProcessService;

	@Test
	public void testList() {
		bpmnProcessService = super.getBean("bpmnProcessService");
		FlowProcessQuery query = new FlowProcessQuery();
		//query.nameLike("工程");
		List<FlowProcessEntity> rows = bpmnProcessService
				.getFlowProcessesByQueryCriteria(0, 10, query);
		for (FlowProcessEntity row : rows) {
			bpmnProcessService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
