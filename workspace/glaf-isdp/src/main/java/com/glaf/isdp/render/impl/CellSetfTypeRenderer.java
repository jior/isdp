package com.glaf.isdp.render.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.core.util.ParamUtils;
import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.query.FieldInterfaceQuery;
import com.glaf.isdp.render.RenderContext;
import com.glaf.isdp.render.Renderer;

public class CellSetfTypeRenderer implements Renderer {
	protected static final Log logger = LogFactory
			.getLog(CellSetfTypeRenderer.class);

	public String render(RenderContext ctx) {
		logger.debug("--------------CellSetfTypeRenderer.render----------------");
		String frmtype = "pfile";
		List<FieldInterface> fields = null;

		Map<String, Object> params = ctx.getParameterMap();
		int treetopIndexId = 0;
		if (params != null && params.containsKey("treetopIndexId")) {
			treetopIndexId = ParamUtils.getInt(params, "treetopIndexId");
		}
		
		logger.debug("treetopIndexId="+treetopIndexId);

		if (treetopIndexId > 0) {
			fields = ctx.getFieldInterfaceService().getListShowFields(frmtype,
					treetopIndexId);
		} else {
			FieldInterfaceQuery query = new FieldInterfaceQuery();
			query.frmtype(frmtype).issystem("1").isListShow("1");
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
				if (f.getDataItems() != null && !f.getDataItems().isEmpty()) {
					ctx.setAttribute(f.getHintID() + "_field", f);
					ctx.setAttribute(f.getHintID() + "_dataitems",
							f.getDataItems());
				}
			}
			logger.debug("fields size:" + fields.size());
			ctx.setAttribute("fields", fields);
		}
		return null;
	}

}
