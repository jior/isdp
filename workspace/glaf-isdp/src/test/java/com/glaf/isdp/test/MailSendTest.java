package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.MailSend;
import com.glaf.isdp.query.MailSendQuery;
import com.glaf.isdp.service.IMailSendService;

public class MailSendTest extends AbstractTest {

	protected IMailSendService mailSendService;

	@Test
	public void testList() {
		mailSendService = super.getBean("mailSendService");
		MailSendQuery query = new MailSendQuery();
		// query.nameLike("工程");
		List<MailSend> rows = mailSendService.getMailSendsByQueryCriteria(0,
				10, query);
		for (MailSend row : rows) {
			mailSendService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
