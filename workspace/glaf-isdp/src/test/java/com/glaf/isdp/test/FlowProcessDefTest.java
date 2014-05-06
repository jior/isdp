package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FlowProcessDef;
import com.glaf.isdp.query.FlowProcessDefQuery;
import com.glaf.isdp.service.IFlowProcessDefService;
 

public class FlowProcessDefTest extends AbstractTest {

	protected IFlowProcessDefService flowProcessDefService;

	@Test
	public void testList() {
		flowProcessDefService = super.getBean("flowProcessDefService");
		FlowProcessDefQuery query = new FlowProcessDefQuery();
		//query.nameLike("工程");
		List<FlowProcessDef> rows = flowProcessDefService
				.getFlowProcessDefsByQueryCriteria(0, 10, query);
		for (FlowProcessDef row : rows) {
			flowProcessDefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
