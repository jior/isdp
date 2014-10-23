package com.glaf.isdp.render.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.base.modules.sys.model.FieldInterface;
import com.glaf.base.modules.sys.query.FieldInterfaceQuery;
import com.glaf.core.util.ParamUtils;
import com.glaf.isdp.render.RenderContext;
import com.glaf.isdp.render.Renderer;

public class CellSetpDataTypeRenderer implements Renderer {
	protected static final Log logger = LogFactory
			.getLog(CellSetpDataTypeRenderer.class);

	public String render(RenderContext ctx) {
		logger.debug("--------------CellSetpDataTypeRenderer.render----------------");
		String frmtype = "pfile";
		List<FieldInterface> fields = null;

		Map<String, Object> params = ctx.getParameterMap();
		int pfileIndexId = 0;
		if (params != null && params.containsKey("pfileIndexId")) {
			pfileIndexId = ParamUtils.getInt(params, "pfileIndexId");
		}

		if (pfileIndexId > 0) {
			fields = ctx.getFieldInterfaceService().getListShowFields(frmtype,
					pfileIndexId);
		} else {
			FieldInterfaceQuery query = new FieldInterfaceQuery();
			query.frmtype(frmtype);
			fields = ctx.getFieldInterfaceService().list(query);
		}

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
				//if (f.getDataItems() != null && !f.getDataItems().isEmpty()) {
				//	ctx.setAttribute(f.getHintID() + "_field", f);
				//	ctx.setAttribute(f.getHintID() + "_dataitems",
				//			f.getDataItems());
				//}
			}
			logger.debug("fields size:" + fields.size());
			ctx.setAttribute("fields", fields);
		}
		return null;
	}

}
