package com.glaf.isdp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.glaf.test.AbstractTest;
import com.glaf.core.util.FileUtils;
 
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.domain.UserTask;
import com.glaf.isdp.helper.IsdpJacksonTreeHelper;
import com.glaf.isdp.query.UserTaskQuery;
import com.glaf.isdp.service.IUserTaskService;

public class UserTaskTestByTime extends AbstractTest {

	protected IUserTaskService userTaskService;

	@Test
	public void testUserAllTaskByTime() {
		System.out
				.println("开始测试testUserAllTaskByTime..................................");
		start = System.currentTimeMillis();
		userTaskService = super.getBean("userTaskService");
		String actorId = "薛萌";
		String taskType = "ALL";
		userTaskService.deleteUserTasks(actorId);
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

		logger.debug("size=" + rows.size());

		IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
		ArrayNode result = treeHelper.getTreeArrayNode(treeModels);
		try {
			FileUtils.save("data/tasklist_all.json", result.toString()
					.getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		UserTaskQuery query2 = new UserTaskQuery();

		query2.actorId(actorId);
		query2.name("activ");

		int total = userTaskService.getUserTaskCountByQueryCriteria(query2);

		logger.debug(actorId + "任务项是:" + total);

		long times = System.currentTimeMillis() - start;
		System.out.println("testUserAllTaskByTime总共耗时(毫秒):" + times);
	}

}
