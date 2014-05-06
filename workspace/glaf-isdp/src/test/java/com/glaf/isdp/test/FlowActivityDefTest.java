package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FlowActivityDef;
import com.glaf.isdp.query.FlowActivityDefQuery;
import com.glaf.isdp.service.IFlowActivityDefService;
 

public class FlowActivityDefTest extends AbstractTest {

	protected IFlowActivityDefService flowActivityDefService;

	@Test
	public void testList() {
		flowActivityDefService = super.getBean("flowActivityDefService");
		FlowActivityDefQuery query = new FlowActivityDefQuery();
		//query.nameLike("工程");
		List<FlowActivityDef> rows = flowActivityDefService
				.getFlowActivityDefsByQueryCriteria(0, 10, query);
		for (FlowActivityDef row : rows) {
			flowActivityDefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
