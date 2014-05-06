package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.MailRecAtt;
import com.glaf.isdp.query.MailRecAttQuery;
import com.glaf.isdp.service.IMailRecAttService;

public class MailRecAttTest extends AbstractTest {

	protected IMailRecAttService mailRecAttService;

	@Test
	public void testList() {
		mailRecAttService = super.getBean("mailRecAttService");
		MailRecAttQuery query = new MailRecAttQuery();
		// query.nameLike("工程");
		List<MailRecAtt> rows = mailRecAttService
				.getMailRecAttsByQueryCriteria(0, 10, query);
		for (MailRecAtt row : rows) {
			mailRecAttService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
