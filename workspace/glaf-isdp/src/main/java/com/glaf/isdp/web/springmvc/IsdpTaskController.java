package com.glaf.isdp.web.springmvc;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.glaf.core.service.EntityService;
import com.glaf.core.util.DateUtils;

import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;
import com.glaf.isdp.service.IsdpTaskService;

@Controller
@RequestMapping("/isdp/task")
public class IsdpTaskController {

	protected static final Log logger = LogFactory
			.getLog(IsdpTaskController.class);

	protected EntityService entityService;

	protected IsdpTaskService isdpTaskService;

	public IsdpTaskController() {

	}

	@javax.annotation.Resource 
	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}

	@javax.annotation.Resource
	public void setIsdpTaskService(IsdpTaskService isdpTaskService) {
		this.isdpTaskService = isdpTaskService;
	}

	@RequestMapping("/taskList")
	public ModelAndView taskList(HttpServletRequest request) {
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		String actorId = RequestUtils.getActorId(request);
		String taskType = request.getParameter("taskType");

		if (StringUtils.isNotEmpty(actorId)) {
			int taskCount = 0;
			List<Map<String, Object>> taskList = null;
			if ("ALL".equals(taskType)) {
				taskCount = isdpTaskService.getAllTaskListCount(actorId,
						paramMap);
				if (taskCount > 0) {
					taskList = isdpTaskService
							.getAllTaskList(actorId, paramMap);
				}
			} else if ("FB".equals(taskType)) {
				taskCount = isdpTaskService.getFallbackTaskListCount(actorId,
						paramMap);
				if (taskCount > 0) {
					taskList = isdpTaskService.getFallbackTaskList(actorId,
							paramMap);
				}
			} else if ("WD".equals(taskType)) {
				taskCount = isdpTaskService.getWorkedTaskListCount(actorId,
						paramMap);
				if (taskCount > 0) {
					taskList = isdpTaskService.getWorkedTaskList(actorId,
							paramMap);
				}
			} else {
				taskCount = isdpTaskService.getTodoTaskListCount(actorId,
						paramMap);
				if (taskCount > 0) {
					taskList = isdpTaskService.getTodoTaskList(actorId,
							paramMap);
				}
			}
			request.setAttribute("taskCount", taskCount);
			if (taskList != null) {
				request.setAttribute("taskList", taskList);
			}
		}
		return new ModelAndView("/isdp/task/taskList");
	}

	@ResponseBody
	@RequestMapping("/taskListJson")
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public byte[] taskListJson(HttpServletRequest request) {
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		String actorId = RequestUtils.getActorId(request);
		paramMap.put("actorId", actorId);
		String taskType = request.getParameter("taskType");
		logger.debug("paramMap:" + paramMap);
		JSONObject root = new JSONObject();
		if (StringUtils.isNotEmpty(actorId)) {
			int taskCount = 0;

			List<Map<String, Object>> taskList = null;
			if ("ALL".equals(taskType)) {
				taskCount = isdpTaskService.getAllTaskListCount(actorId,
						paramMap);
				if (taskCount > 0) {
					taskList = isdpTaskService
							.getAllTaskList(actorId, paramMap);
				}
			} else if ("FB".equals(taskType)) {
				taskCount = isdpTaskService.getFallbackTaskListCount(actorId,
						paramMap);
				if (taskCount > 0) {
					taskList = isdpTaskService.getFallbackTaskList(actorId,
							paramMap);
				}
			} else if ("WD".equals(taskType)) {
				taskCount = isdpTaskService.getWorkedTaskListCount(actorId,
						paramMap);
				if (taskCount > 0) {
					taskList = isdpTaskService.getWorkedTaskList(actorId,
							paramMap);
				}
			} else {
				taskCount = isdpTaskService.getTodoTaskListCount(actorId,
						paramMap);
				if (taskCount > 0) {
					taskList = isdpTaskService.getTodoTaskList(actorId,
							paramMap);
				}
			}
			if (taskList != null) {
				root.put("total", taskCount);
				root.put("totalCount", taskCount);
				root.put("start", 1);
				int ordinal = 1;
				if (taskList != null && !taskList.isEmpty()) {
					JSONArray result = new JSONArray();
					for (Object object : taskList) {
						Map dataMap = null;
						if (object instanceof Map) {
							dataMap = (Map) object;
						} else {
							dataMap = Tools.getDataMap(object);
						}
						JSONObject json = new JSONObject();
						json.put("ordinal", ordinal++);
						Set<Entry<String, Object>> entrySet = dataMap
								.entrySet();
						for (Entry<String, Object> entry : entrySet) {
							String name = entry.getKey();
							Object value = entry.getValue();
							if (value != null) {
								if (value instanceof Date) {
									Date date = (Date) value;
									json.put(name, DateUtils.getDate(date));
									json.put(name + "_datetime",
											DateUtils.getDateTime(date));
								} else {
									json.put(name, value);
								}
								if ("state".equals(name)) {
									if ("0".equals(value.toString())) {
										json.put(name, "待办");
										if (dataMap.get("intback") != null
												&& "1".equals(dataMap.get(
														"intback").toString())) {
											json.put(name, "退回");
										}
									} else {
										json.put(name, "已办");
									}
								}
							}
						}

						result.add(json);
					}
					root.put("rows", result);

				}

			}
		}
		try {
			return root.toJSONString().getBytes("UTF-8");
		} catch (IOException ex) {
			return root.toJSONString().getBytes();
		}
	}

	@RequestMapping("/taskMain")
	public ModelAndView taskMain(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		request.setAttribute("contextPath", request.getContextPath());

		String serviceKey = request.getParameter("serviceKey");
		if (StringUtils.isNotEmpty(serviceKey)) {

		}

		return new ModelAndView("/isdp/task/taskMain");
	}

}
