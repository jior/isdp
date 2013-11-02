package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.MailRec;
import com.glaf.isdp.query.MailRecQuery;
import com.glaf.isdp.service.IMailRecService;

public class MailRecTest extends AbstractTest {

	protected IMailRecService mailRecService;

	@Test
	public void testList() {
		mailRecService = super.getBean("mailRecService");
		MailRecQuery query = new MailRecQuery();
		// query.nameLike("¹¤³Ì");
		List<MailRec> rows = mailRecService.getMailRecsByQueryCriteria(0, 10,
				query);
		for (MailRec row : rows) {
			mailRecService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
