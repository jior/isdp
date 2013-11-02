package com.glaf.isdp.test;

import org.junit.Test;
import com.glaf.isdp.domain.CellForm;
import com.glaf.isdp.service.IsdpCellFormService;
import com.glaf.test.AbstractTest;

public class CellFormTest extends AbstractTest {

	protected IsdpCellFormService isdpCellFormService;

	@Test
	public void testCellForm() {
		isdpCellFormService = super.getBean("isdpCellFormService");
		CellForm cellForm = isdpCellFormService
				.getCellFormByFiledotId("20120322/admin-0000001");
		if (cellForm != null) {

		}
	}

}
