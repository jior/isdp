package com.glaf.isdp.render.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.query.FieldInterfaceQuery;
import com.glaf.isdp.render.RenderContext;
import com.glaf.isdp.render.Renderer;

public class ProjectInspectionRenderer implements Renderer {
	protected static final Log logger = LogFactory
			.getLog(ProjectInspectionRenderer.class);

	public String render(RenderContext ctx) {
		logger.debug("--------------ProjectInspectionRenderer.render----------------");
		String frmtype = "proj_Inspection";
		List<FieldInterface> fields = null;

		FieldInterfaceQuery query = new FieldInterfaceQuery();
		query.frmtype(frmtype).issystem("1").isListShow("1");
		fields = ctx.getFieldInterfaceService().list(query);

		if (fields != null && !fields.isEmpty()) {
			for (FieldInterface f : fields) {
				if (f.getListweigth() <= 0) {
					f.setListweigth(120);
				}
				if (f.getListweigth() > 500) {
					f.setListweigth(500);
				}
				if (f.getListweigth() < 60) {
					f.setListweigth(60);
				}
			}
			logger.debug("fields size:" + fields.size());
			ctx.setAttribute("fields", fields);
		}
		return null;
	}

}
