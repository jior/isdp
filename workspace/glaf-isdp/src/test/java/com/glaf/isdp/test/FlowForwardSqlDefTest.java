package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FlowForwardSqlDef;
import com.glaf.isdp.query.FlowForwardSqlDefQuery;
import com.glaf.isdp.service.IFlowForwardSqlDefService;
 

public class FlowForwardSqlDefTest extends AbstractTest {

	protected IFlowForwardSqlDefService flowForwardSqlDefService;

	@Test
	public void testList() {
		flowForwardSqlDefService = super.getBean("flowForwardSqlDefService");
		FlowForwardSqlDefQuery query = new FlowForwardSqlDefQuery();
		//query.nameLike("工程");
		List<FlowForwardSqlDef> rows = flowForwardSqlDefService
				.getFlowForwardSqlDefsByQueryCriteria(0, 10, query);
		for (FlowForwardSqlDef row : rows) {
			flowForwardSqlDefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
