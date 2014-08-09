package com.glaf.isdp.web.springmvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.service.ICellTreedotService;
import com.glaf.core.util.RequestUtils;
import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.service.IFieldInterfaceService;
import com.glaf.isdp.util.EncodeUtils;

/**
 * 清单信息
 * 
 */
@Controller
@RequestMapping("/isdp/inventory")
public class IsdpInventoryController {

	protected static final Log logger = LogFactory
			.getLog(IsdpInventoryController.class);

	protected ICellTreedotService cellTreedotService;

	protected IFieldInterfaceService fieldInterfaceService;

	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		String moduleId = request.getParameter("moduleId");
		if (StringUtils.isNotEmpty(moduleId)) {
			logger.debug("->moduleId:" + moduleId);
			moduleId = EncodeUtils.decode(moduleId);
			logger.debug("moduleId:" + moduleId);
			CellTreedot cellTreedot = cellTreedotService
					.getCellTreedotById(moduleId);
			if (cellTreedot != null) {
				logger.debug(cellTreedot.toObjectNode().toString());
				if (cellTreedot.getModetableId() != null) {
					List<FieldInterface> fields = fieldInterfaceService
							.getListShowFieldsByFrmType(cellTreedot
									.getModetableId());
					request.setAttribute("fields", fields);
				}

				request.setAttribute("cellTreedot", cellTreedot);
			}

		}
		return new ModelAndView("/isdp/inventory/list");
	}

	@javax.annotation.Resource
	public void setCellTreedotService(ICellTreedotService cellTreedotService) {
		this.cellTreedotService = cellTreedotService;
	}

	@javax.annotation.Resource
	public void setFieldInterfaceService(
			IFieldInterfaceService fieldInterfaceService) {
		this.fieldInterfaceService = fieldInterfaceService;
	}

}
