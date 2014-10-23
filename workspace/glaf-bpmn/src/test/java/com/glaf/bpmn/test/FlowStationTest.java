package com.glaf.bpmn.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.bpmn.domain.FlowStationEntity;
import com.glaf.bpmn.query.FlowStationQuery;
import com.glaf.bpmn.service.BpmnStationService;

public class FlowStationTest extends AbstractTest {

	protected BpmnStationService bpmnStationService;

	@Test
	public void testList() {
		bpmnStationService = super.getBean("bpmnStationService");
		FlowStationQuery query = new FlowStationQuery();
		// query.nameLike("工程");
		List<FlowStationEntity> rows = bpmnStationService
				.getFlowStationsByQueryCriteria(0, 10, query);
		for (FlowStationEntity row : rows) {
			bpmnStationService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
