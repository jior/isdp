package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.Volume;
import com.glaf.isdp.query.VolumeQuery;
import com.glaf.isdp.service.IVolumeService;
 

public class VolumeTest extends AbstractTest {

	protected IVolumeService volumeService;

	@Test
	public void testList() {
		volumeService = super.getBean("volumeService");
		VolumeQuery query = new VolumeQuery();
		//query.nameLike("¹¤³Ì");
		List<Volume> rows = volumeService
				.getVolumesByQueryCriteria(0, 10, query);
		for (Volume row : rows) {
			volumeService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
