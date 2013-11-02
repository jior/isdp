package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FlowStation;
import com.glaf.isdp.query.FlowStationQuery;
import com.glaf.isdp.service.IFlowStationService;
 

public class FlowStationTest extends AbstractTest {

	protected IFlowStationService flowStationService;

	@Test
	public void testList() {
		flowStationService = super.getBean("flowStationService");
		FlowStationQuery query = new FlowStationQuery();
		//query.nameLike("¹¤³Ì");
		List<FlowStation> rows = flowStationService
				.getFlowStationsByQueryCriteria(0, 10, query);
		for (FlowStation row : rows) {
			flowStationService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
