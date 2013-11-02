package com.glaf.isdp.web.springmvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.node.ArrayNode;

import com.glaf.core.service.EntityService;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.domain.UserTask;
import com.glaf.isdp.helper.IsdpJacksonTreeHelper;
import com.glaf.isdp.query.UserTaskQuery;
import com.glaf.isdp.service.IUserTaskService;

@Controller
@RequestMapping("/isdp/todo")
public class IsdpTodoController {

	private static ConcurrentMap<String, Object> cache = new ConcurrentHashMap<String, Object>();

	protected static final Log logger = LogFactory
			.getLog(IsdpTodoController.class);

	protected EntityService entityService;

	protected IUserTaskService userTaskService;

	@javax.annotation.Resource(name = "myBatisEntityService")
	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}

	@javax.annotation.Resource
	public void setUserTaskService(IUserTaskService userTaskService) {
		this.userTaskService = userTaskService;
	}

	@RequestMapping("/taskList")
	public ModelAndView taskList(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		String actorId = RequestUtils.getActorId(request);
		String taskType = request.getParameter("taskType");
		String orderCondition = request.getParameter("orderCondition");
		String keyword = request.getParameter("keyword");
		if (StringUtils.isEmpty(orderCondition)) {
			orderCondition = RequestUtils.getCookieValue(request,
					"isdp_taskList_orderCondition");
		}

		String cacheKey = "TASK_" + actorId + "_" + taskType;
		try {
			if (cache.get(cacheKey) == null) {
				cache.put(cacheKey, "1");
				long start = System.currentTimeMillis();
				userTaskService.deleteUserTasks(actorId);

				if ("WBS".equals(orderCondition)) {
					userTaskService
							.reloadUserTasksGroupByWBS(actorId, taskType);
				} else {
					userTaskService.reloadUserTasksGroupByTime(actorId,
							taskType);
				}

				long times = System.currentTimeMillis() - start;
				logger.debug("创建任务耗时(毫秒):" + times);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			cache.remove(cacheKey);
		}

		UserTaskQuery query = new UserTaskQuery();
		Tools.populate(query, paramMap);
		query.actorId(actorId);
		query.name("activ");
		query.setIndexNameLike(keyword);
		int total = userTaskService.getUserTaskCountByQueryCriteria(query);
		request.setAttribute("total", total);
		logger.debug(actorId + "任务项是" + total);
		if (total > 0) {
			List<UserTask> rows = userTaskService.list(query);
			request.setAttribute("tasks", rows);
		}

		return new ModelAndView("/isdp/todo/taskList");
	}

	@ResponseBody
	@RequestMapping("/json")
	public byte[] taskListJson(HttpServletRequest request) {
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		String actorId = RequestUtils.getActorId(request);
		logger.debug("paramMap:" + paramMap);
		String keyword = request.getParameter("keyword");
		UserTaskQuery query = new UserTaskQuery();
		Tools.populate(query, paramMap);
		query.actorId(actorId);
		query.setIndexNameLike(keyword);

		int total = userTaskService.getUserTaskCountByQueryCriteria(query);

		int pageNo = ParamUtils.getInt(paramMap, "page");
		int limit = ParamUtils.getInt(paramMap, "rows");

		if (pageNo <= 0) {
			pageNo = 1;
		}

		if (limit <= 0) {
			limit = 100;
		}

		if (limit > total) {
			limit = total;
		}

		int begin = (pageNo - 1) * limit;

		if (total > limit) {
			query.parentIdNotEqual(-1);
		}

		query.setOrderBy(" E.parent_id asc ");

		List<UserTask> rows = userTaskService.getUserTasksByQueryCriteria(
				begin, limit, query);
		List<ITree> treeModels = new ArrayList<ITree>();
		for (UserTask row : rows) {
			treeModels.add(row);
		}

		if (total > limit) {
			query.setParentIdNotEqual(null);
			query.parentId(-1L);
			List<UserTask> tops = userTaskService.list(query);
			for (UserTask row : tops) {
				row.setCls("folder");
				treeModels.add(row);
			}
		}

		logger.debug("treeModels size:" + treeModels.size());
		IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
		ArrayNode result = treeHelper.getTreeArrayNode(treeModels, false);
		try {
			// logger.debug(result.toString());
			return result.toString().getBytes("UTF-8");
		} catch (IOException ex) {
			return result.toString().getBytes();
		}
	}

	@RequestMapping("/taskMain")
	public ModelAndView taskMain(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		String actorId = RequestUtils.getActorId(request);
		userTaskService.deleteUserTasks(actorId);
		return new ModelAndView("/isdp/todo/taskMain");
	}

	@RequestMapping("/todoList")
	public ModelAndView todoList(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		String actorId = RequestUtils.getActorId(request);
		String taskType = "RN";
		String orderCondition = request.getParameter("orderCondition");
		String keyword = request.getParameter("keyword");
		if (StringUtils.isEmpty(orderCondition)) {
			orderCondition = RequestUtils.getCookieValue(request,
					"isdp_taskList_orderCondition");
		}

		String cacheKey = "TASK_" + actorId + "_" + taskType;
		try {
			if (cache.get(cacheKey) == null) {
				cache.put(cacheKey, "1");
				long start = System.currentTimeMillis();
				userTaskService.deleteUserTasks(actorId);

				if ("WBS".equals(orderCondition)) {
					userTaskService
							.reloadUserTasksGroupByWBS(actorId, taskType);
				} else {
					userTaskService.reloadUserTasksGroupByTime(actorId,
							taskType);
				}

				long times = System.currentTimeMillis() - start;
				logger.debug("创建任务耗时(毫秒):" + times);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			cache.remove(cacheKey);
		}

		UserTaskQuery query = new UserTaskQuery();
		Tools.populate(query, paramMap);
		query.actorId(actorId);
		query.name("activ");
		query.setIndexNameLike(keyword);
		int total = userTaskService.getUserTaskCountByQueryCriteria(query);
		request.setAttribute("total", total);
		logger.debug(actorId + "任务项是" + total);
		if (total > 0) {
			List<UserTask> rows = userTaskService.list(query);
			request.setAttribute("tasks", rows);
		}

		return new ModelAndView("/isdp/todo/todoList");
	}

}
