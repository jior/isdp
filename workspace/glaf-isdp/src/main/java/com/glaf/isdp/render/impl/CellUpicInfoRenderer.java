package com.glaf.isdp.render.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.render.RenderContext;
import com.glaf.isdp.render.Renderer;

public class CellUpicInfoRenderer implements Renderer {
	protected static final Log logger = LogFactory
			.getLog(CellUpicInfoRenderer.class);

	public String render(RenderContext ctx) {
		String frmtype = "cell_upicinfo";
		List<FieldInterface> fields = ctx.getFieldInterfaceService()
				.getFieldsByFrmType(frmtype);
		if (fields != null && !fields.isEmpty()) {
			for (FieldInterface f : fields) {
				if (f.getListweigth() <= 0) {
					f.setListweigth(120);
				}
				if (f.getListweigth() > 500) {
					f.setListweigth(500);
				}

			}
			logger.debug("fields size:" + fields.size());
			ctx.setAttribute("fields", fields);
		}
		return null;
	}

}
