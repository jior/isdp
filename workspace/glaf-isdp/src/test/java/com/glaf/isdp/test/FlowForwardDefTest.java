package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FlowForwardDef;
import com.glaf.isdp.query.FlowForwardDefQuery;
import com.glaf.isdp.service.IFlowForwardDefService;
 

public class FlowForwardDefTest extends AbstractTest {

	protected IFlowForwardDefService flowForwardDefService;

	@Test
	public void testList() {
		flowForwardDefService = super.getBean("flowForwardDefService");
		FlowForwardDefQuery query = new FlowForwardDefQuery();
		//query.nameLike("¹¤³Ì");
		List<FlowForwardDef> rows = flowForwardDefService
				.getFlowForwardDefsByQueryCriteria(0, 10, query);
		for (FlowForwardDef row : rows) {
			flowForwardDefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
