package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FlowActivity;
import com.glaf.isdp.query.FlowActivityQuery;
import com.glaf.isdp.service.IFlowActivityService;
 

public class FlowActivityTest extends AbstractTest {

	protected IFlowActivityService flowActivityService;

	@Test
	public void testList() {
		flowActivityService = super.getBean("flowActivityService");
		FlowActivityQuery query = new FlowActivityQuery();
		//query.nameLike("¹¤³Ì");
		List<FlowActivity> rows = flowActivityService
				.getFlowActivitiesByQueryCriteria(0, 10, query);
		for (FlowActivity row : rows) {
			flowActivityService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
