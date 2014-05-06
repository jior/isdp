package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.MailNew;
import com.glaf.isdp.query.MailNewQuery;
import com.glaf.isdp.service.IMailNewService;

public class MailNewTest extends AbstractTest {

	protected IMailNewService mailNewService;

	@Test
	public void testList() {
		mailNewService = super.getBean("mailNewService");
		MailNewQuery query = new MailNewQuery();
		// query.nameLike("工程");
		List<MailNew> rows = mailNewService.getMailNewsByQueryCriteria(0, 10,
				query);
		for (MailNew row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
