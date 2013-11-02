package com.glaf.isdp.render.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.core.util.ParamUtils;
import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.render.RenderContext;
import com.glaf.isdp.render.Renderer;

public class PlanProjRenderer implements Renderer {
	protected static final Log logger = LogFactory
			.getLog(PlanProjRenderer.class);

	public String render(RenderContext ctx) {
		logger.debug("--------------PlanProjRenderer.render----------------");
		String frmtype = "pinfo";
		List<FieldInterface> fields = null;

		Map<String, Object> params = ctx.getParameterMap();
		int treepIndexId = 3;
		if (params != null && params.containsKey("treepIndexId")) {
			treepIndexId = ParamUtils.getInt(params, "treepIndexId");
		}

		fields = ctx.getFieldInterfaceService().getListShowFields(frmtype,
				treepIndexId);

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
