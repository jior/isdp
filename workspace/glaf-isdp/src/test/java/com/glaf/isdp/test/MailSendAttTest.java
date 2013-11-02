package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.MailSendAtt;
import com.glaf.isdp.query.MailSendAttQuery;
import com.glaf.isdp.service.IMailSendAttService;

public class MailSendAttTest extends AbstractTest {

	protected IMailSendAttService mailSendAttService;

	@Test
	public void testList() {
		mailSendAttService = super.getBean("mailSendAttService");
		MailSendAttQuery query = new MailSendAttQuery();
		// query.nameLike("¹¤³Ì");
		List<MailSendAtt> rows = mailSendAttService
				.getMailSendAttsByQueryCriteria(0, 10, query);
		for (MailSendAtt row : rows) {
			mailSendAttService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
