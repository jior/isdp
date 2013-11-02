package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FlowForward;
import com.glaf.isdp.query.FlowForwardQuery;
import com.glaf.isdp.service.IFlowForwardService;
 

public class FlowForwardTest extends AbstractTest {

	protected IFlowForwardService flowForwardService;

	@Test
	public void testList() {
		flowForwardService = super.getBean("flowForwardService");
		FlowForwardQuery query = new FlowForwardQuery();
		//query.nameLike("¹¤³Ì");
		List<FlowForward> rows = flowForwardService
				.getFlowForwardsByQueryCriteria(0, 10, query);
		for (FlowForward row : rows) {
			flowForwardService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
