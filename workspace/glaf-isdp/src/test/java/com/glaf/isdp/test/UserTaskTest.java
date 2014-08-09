package com.glaf.isdp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.glaf.test.AbstractTest;
import com.glaf.core.util.FileUtils;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.isdp.domain.UserTask;
import com.glaf.base.helper.JacksonTreeHelper;
import com.glaf.isdp.query.UserTaskQuery;
import com.glaf.isdp.service.IUserTaskService;

public class UserTaskTest extends AbstractTest {

	protected IUserTaskService userTaskService;

	@Test
	public void testList() {
		userTaskService = super.getBean("userTaskService");
		UserTaskQuery query = new UserTaskQuery();
		// query.nameLike("工程");
		List<UserTask> rows = userTaskService.getUserTasksByQueryCriteria(0,
				10, query);
		for (UserTask row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

	@Test
	public void testUserAllTaskByTime() {
		userTaskService = super.getBean("userTaskService");
		String actorId = "薛萌";
		String taskType = "ALL";
		userTaskService.reloadUserTasksGroupByTime(actorId, taskType);
		UserTaskQuery query = new UserTaskQuery();
		query.actorId(actorId);
		List<UserTask> rows = userTaskService.getUserTasksByQueryCriteria(0,
				1000, query);
		List<ITree> treeModels = new ArrayList<ITree>();
		for (UserTask row : rows) {
			// logger.debug(row.toJsonObject().toJSONString());
			treeModels.add(row);
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode result = treeHelper.getTreeArrayNode(treeModels);
		try {
			FileUtils.save("data/tasklist_all.json", result.toString()
					.getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUserFBTaskByTime() {
		userTaskService = super.getBean("userTaskService");
		String actorId = "薛萌";
		String taskType = "FB";
		userTaskService.reloadUserTasksGroupByTime(actorId, taskType);
		UserTaskQuery query = new UserTaskQuery();
		query.actorId(actorId);
		List<UserTask> rows = userTaskService.getUserTasksByQueryCriteria(0,
				1000, query);
		List<ITree> treeModels = new ArrayList<ITree>();
		for (UserTask row : rows) {
			// logger.debug(row.toJsonObject().toJSONString());
			treeModels.add(row);
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode result = treeHelper.getTreeArrayNode(treeModels);
		try {
			FileUtils.save("data/tasklist_fb.json",
					result.toString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUserRNTaskByTime() {
		userTaskService = super.getBean("userTaskService");
		String actorId = "薛萌";
		String taskType = "RN";
		userTaskService.reloadUserTasksGroupByTime(actorId, taskType);
		UserTaskQuery query = new UserTaskQuery();
		query.actorId(actorId);
		List<UserTask> rows = userTaskService.getUserTasksByQueryCriteria(0,
				1000, query);
		List<ITree> treeModels = new ArrayList<ITree>();
		for (UserTask row : rows) {
			// logger.debug(row.toJsonObject().toJSONString());
			treeModels.add(row);
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode result = treeHelper.getTreeArrayNode(treeModels);
		try {
			FileUtils.save("data/tasklist_rn.json",
					result.toString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUserWDTaskByTime() {
		userTaskService = super.getBean("userTaskService");
		String actorId = "薛萌";
		String taskType = "WD";
		userTaskService.reloadUserTasksGroupByTime(actorId, taskType);
		UserTaskQuery query = new UserTaskQuery();
		query.actorId(actorId);
		List<UserTask> rows = userTaskService.getUserTasksByQueryCriteria(0,
				1000, query);
		List<ITree> treeModels = new ArrayList<ITree>();
		for (UserTask row : rows) {
			// logger.debug(row.toJsonObject().toJSONString());
			treeModels.add(row);
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode result = treeHelper.getTreeArrayNode(treeModels);
		try {
			FileUtils.save("data/tasklist_wd.json",
					result.toString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
