package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.IsdpPinfo;
import com.glaf.isdp.query.PinfoQuery;
import com.glaf.isdp.service.IsdpPinfoService;
 

public class PinfoTest extends AbstractTest {

	protected IsdpPinfoService pinfoService;

	@Test
	public void testList() {
		pinfoService = super.getBean("pinfoService");
		PinfoQuery query = new PinfoQuery();
		//query.nameLike("¹¤³Ì");
		List<IsdpPinfo> rows = pinfoService
				.getPinfosByQueryCriteria(0, 10, query);
		for (IsdpPinfo row : rows) {
			pinfoService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
