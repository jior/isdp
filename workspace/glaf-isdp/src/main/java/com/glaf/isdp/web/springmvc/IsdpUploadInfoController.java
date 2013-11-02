package com.glaf.isdp.web.springmvc;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import com.glaf.core.util.DateUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.isdp.domain.CellUpicInfo;
import com.glaf.isdp.domain.FieldInterface;

import com.glaf.isdp.service.ICellUpicInfoService;
import com.glaf.isdp.service.IFieldInterfaceService;

@Controller
@RequestMapping("/isdp/file/upload")
public class IsdpUploadInfoController {

	protected static final Log logger = LogFactory
			.getLog(IsdpUploadInfoController.class);

	protected IFieldInterfaceService fieldInterfaceService;

	protected ICellUpicInfoService cellUpicInfoService;

	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);

		JSONObject jsonObject = null;
		String fileId = request.getParameter("fileId");
		if (StringUtils.isNotEmpty(fileId)) {
			CellUpicInfo info = cellUpicInfoService.getCellUpicInfo(fileId);
			if (info != null) {
				jsonObject = info.toJsonObject();
			}
		}

		List<FieldInterface> fields = fieldInterfaceService
				.getFieldsByFrmType("cell_upicinfo");
		if (jsonObject != null && fields != null && !fields.isEmpty()) {
			for (FieldInterface f : fields) {
				if (jsonObject.containsKey(f.getDname())) {
					if ("i4".equalsIgnoreCase(f.getDtype())
							|| "int".equalsIgnoreCase(f.getDtype())) {
						f.setValue(jsonObject.get(f.getDname()));
					} else if ("i8".equalsIgnoreCase(f.getDtype())
							|| "long".equalsIgnoreCase(f.getDtype())) {
						f.setValue(jsonObject.get(f.getDname()));
					} else if ("r8".equalsIgnoreCase(f.getDtype())
							|| "double".equalsIgnoreCase(f.getDtype())) {
						f.setValue(jsonObject.get(f.getDname()));
					} else if ("date".equalsIgnoreCase(f.getDtype())
							|| "datetime".equalsIgnoreCase(f.getDtype())) {
						Object value = jsonObject.get(f.getDname());
						if (value instanceof Date) {
							Date date = (Date) value;
							f.setValue(DateUtils.getDateTime(date));
						} else {
							f.setValue(jsonObject.get(f.getDname()));
						}
					} else {
						f.setValue(jsonObject.get(f.getDname()));
					}
				}
			}
		}
		request.setAttribute("fields", fields);

		return new ModelAndView("/isdp/file/upload/edit");
	}

	@javax.annotation.Resource
	public void setCellUpicInfoService(ICellUpicInfoService cellUpicInfoService) {
		this.cellUpicInfoService = cellUpicInfoService;
	}

	@javax.annotation.Resource
	public void setFieldInterfaceService(
			IFieldInterfaceService fieldInterfaceService) {
		this.fieldInterfaceService = fieldInterfaceService;
	}

}
