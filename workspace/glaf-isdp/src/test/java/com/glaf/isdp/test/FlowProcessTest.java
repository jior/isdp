package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FlowProcess;
import com.glaf.isdp.query.FlowProcessQuery;
import com.glaf.isdp.service.IFlowProcessService;
 

public class FlowProcessTest extends AbstractTest {

	protected IFlowProcessService flowProcessService;

	@Test
	public void testList() {
		flowProcessService = super.getBean("flowProcessService");
		FlowProcessQuery query = new FlowProcessQuery();
		//query.nameLike("工程");
		List<FlowProcess> rows = flowProcessService
				.getFlowProcessesByQueryCriteria(0, 10, query);
		for (FlowProcess row : rows) {
			flowProcessService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
