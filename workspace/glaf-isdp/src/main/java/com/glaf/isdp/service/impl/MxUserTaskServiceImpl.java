package com.glaf.isdp.service.impl;

import java.util.*;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.*;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.UUID32;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("userTaskService")
@Transactional(readOnly = true)
public class MxUserTaskServiceImpl implements IUserTaskService {
	protected static final Log logger = LogFactory
			.getLog(MxUserTaskServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected UserTaskMapper userTaskMapper;

	protected IsdpIdmMapper isdpIdmMapper;

	public MxUserTaskServiceImpl() {

	}

	public int count(UserTaskQuery query) {
		query.ensureInitialized();
		return userTaskMapper.getUserTaskCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(int id) {
		userTaskMapper.deleteUserTaskById(id);
	}

	@Transactional
	public void deleteUserTasks(String actorId) {
		userTaskMapper.deleteUserTasks(actorId);
	}

	public List<Integer> getUserNetRoleIds(String actorId) {
		List<Integer> roleIds = new ArrayList<Integer>();
		List<NetRole> roles = this.getUserNetRoleList(actorId);
		if (roles != null && !roles.isEmpty()) {
			for (NetRole r : roles) {
				roleIds.add(r.getId());
			}
		}
		logger.debug("==actorId==" + actorId);
		logger.debug("==roleIds==" + roleIds);
		return roleIds;
	}

	public List<NetRole> getUserNetRoleList(String actorId) {
		return isdpIdmMapper.getUserNetRoleList(actorId);
	}

	public UserTask getUserTask(int id) {
		UserTask userTask = userTaskMapper.getUserTaskById(id);
		return userTask;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getUserTaskCount(Map<String, Object> parameter) {
		return userTaskMapper.getUserTaskCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getUserTaskCountByQueryCriteria(UserTaskQuery query) {
		return userTaskMapper.getUserTaskCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<UserTask> getUserTasks(Map<String, Object> parameter) {
		return userTaskMapper.getUserTasks(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<UserTask> getUserTasksByQueryCriteria(int start, int pageSize,
			UserTaskQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<UserTask> rows = sqlSession.selectList(
				"getUserTasksByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<UserTask> list(UserTaskQuery query) {
		query.ensureInitialized();
		List<UserTask> list = userTaskMapper
				.getUserTasksByQueryCriteria(query);
		return list;
	}

	/**
	 * 重新装载用户的任务，按照传入时间做分组
	 * 
	 * @param actorId
	 * @param taskType
	 */
	@Transactional
	public void reloadUserTasksGroupByTime(String actorId, String taskType) {
		logger.debug("-----------------reloadUserTasksGroupByTime-----------------");
		logger.debug(actorId + " " + taskType);
		/**
		 * 首先删除用户的任务
		 */
		// userTaskMapper.deleteUserTasks(actorId);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		if ("RN".equals(taskType)) {
			/**
			 * 待办
			 */
			params.put("state", 0);
		} else if ("FB".equals(taskType)) {
			/**
			 * 已退回
			 */
			params.put("state", 0);
			params.put("intback", 1);
		} else if ("WD".equals(taskType)) {
			/**
			 * 已处理
			 */
			params.put("state", 1);
		}

		List<ObjectEntity> taskIds = userTaskMapper
				.getMyCellTaskIds(params);
		if (taskIds != null && !taskIds.isEmpty()) {
			logger.debug("#taskIds size:" + taskIds.size());
			Map<String, Integer> dateMap = new HashMap<String, Integer>();
			Collection<String> allDates = new LinkedHashSet<String>();
			List<String> tmpList = new ArrayList<String>();
			for (ObjectEntity o : taskIds) {
				tmpList.add(o.getStringValue());
				if (tmpList.size() % 500 == 0) {
					logger.debug("@@taskIds :" + tmpList);
					Map<String, Object> params2 = new HashMap<String, Object>();
					params2.put("taskIds", tmpList);
					List<ObjectEntity> taskDates = userTaskMapper
							.getMyCellTaskDates(params2);
					if (taskDates != null && !taskDates.isEmpty()) {
						for (ObjectEntity ox : taskDates) {
							String date = DateUtils.getDate(ox.getDateValue());
							if (!allDates.contains(date)) {
								UserTask userTask = new UserTask();
								userTask.setId(UUID32.getUUID());
								userTask.setIndexId(idGenerator.nextId()
										.intValue());
								userTask.setActorId(actorId);
								userTask.setActivityId("node");
								userTask.setParentId(-1);
								userTask.setIndexName(date);
								userTask.setName(date);
								userTask.setLevel(1);
								userTask.setState(-1);
								userTaskMapper.insertUserTask(userTask);
								allDates.add(date);
								dateMap.put(date, userTask.getIndexId());
							}
						}
					}
					tmpList.clear();
				}
			}

			if (tmpList.size() > 0) {
				// logger.debug("##taskIds :" + tmpList);
				Map<String, Object> params2 = new HashMap<String, Object>();
				params2.put("taskIds", tmpList);
				List<ObjectEntity> taskDates = userTaskMapper
						.getMyCellTaskDates(params2);
				if (taskDates != null && !taskDates.isEmpty()) {
					logger.debug("##taskDates size: " + taskDates.size());
					for (ObjectEntity ox : taskDates) {
						String date = DateUtils.getDate(ox.getDateValue());
						if (!allDates.contains(date)) {
							UserTask userTask = new UserTask();
							userTask.setId(UUID32.getUUID());
							userTask.setIndexId(idGenerator.nextId().intValue());
							userTask.setActorId(actorId);
							userTask.setActivityId("node");
							userTask.setParentId(-1);
							userTask.setIndexName(date);
							userTask.setName(date);
							userTask.setLevel(1);
							userTask.setState(-1);
							userTaskMapper.insertUserTask(userTask);
							allDates.add(date);
							dateMap.put(date, userTask.getIndexId());
						}
					}
				}
				tmpList.clear();
			}

			logger.debug("allDates=" + allDates);

			if (allDates.size() > 0) {
				tmpList.clear();
				for (String date : allDates) {
					tmpList.clear();
					for (ObjectEntity o : taskIds) {
						tmpList.add(o.getStringValue());
						if (tmpList.size() % 500 == 0) {
							params.put("taskIds", tmpList);
							Date startDate = DateUtils.toDate(date
									+ " 00:00:00");
							Date endDate = DateUtils.toDate(date + " 23:59:59");
							params.put("ctimeGreaterThanOrEqual", startDate);
							params.put("ctimeLessThanOrEqual", endDate);
							// logger.debug(date + " params=" + params);
							List<IsdpTaskItem> taskItems = userTaskMapper
									.getAllMyTaskItemMap(params);
							if (taskItems != null && !taskItems.isEmpty()) {
								for (IsdpTaskItem ti : taskItems) {
									UserTask userTask = new UserTask();
									userTask.setId(UUID32.getUUID());
									userTask.setIndexId(idGenerator.nextId()
											.intValue());
									userTask.setParentId(dateMap.get(date));
									userTask.setActivityId(ti.getActivityId());
									userTask.setActorId(actorId);
									userTask.setName("activ");
									userTask.setEndTime(ti.getEndTime());
									userTask.setStartTime(ti.getStartTime());
									userTask.setIndexName(ti.getSubject());
									userTask.setLevel(2);
									userTask.setState(ti.getState());
									userTask.setLastModified(System
											.currentTimeMillis());
									userTaskMapper
											.insertUserTask(userTask);
								}
							}
							// clear
							tmpList.clear();
						}
					}

					if (tmpList.size() > 0) {
						params.put("taskIds", tmpList);
						logger.debug(date + " task size:" + tmpList.size());
						Date startDate = DateUtils.toDate(date + " 00:00:00");
						Date endDate = DateUtils.toDate(date + " 23:59:59");
						params.put("ctimeGreaterThanOrEqual", startDate);
						params.put("ctimeLessThanOrEqual", endDate);
						// logger.debug(date + " params=" + params);
						List<IsdpTaskItem> taskItems = userTaskMapper
								.getAllMyTaskItemMap(params);
						if (taskItems != null && !taskItems.isEmpty()) {
							for (IsdpTaskItem ti : taskItems) {
								UserTask userTask = new UserTask();
								userTask.setId(UUID32.getUUID());
								userTask.setIndexId(idGenerator.nextId()
										.intValue());
								userTask.setParentId(dateMap.get(date));
								userTask.setActivityId(ti.getActivityId());
								userTask.setActorId(actorId);
								userTask.setName("activ");
								userTask.setEndTime(ti.getEndTime());
								userTask.setStartTime(ti.getStartTime());
								userTask.setIndexName(ti.getSubject());
								userTask.setLevel(2);
								userTask.setState(ti.getState());
								userTask.setLastModified(System
										.currentTimeMillis());
								userTaskMapper.insertUserTask(userTask);
							}
						}
					}
				}
			}
		}
	}

	@Transactional
	public void reloadUserTasksGroupByWBS(String actorId, String taskType) {
		/**
		 * 首先删除用户的任务
		 */
		// userTaskMapper.deleteUserTasks(actorId);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		if ("RN".equals(taskType)) {
			/**
			 * 待办
			 */
			params.put("state", 0);
		} else if ("FB".equals(taskType)) {
			/**
			 * 已退回
			 */
			params.put("state", 0);
			params.put("intback", 1);
		} else if ("WD".equals(taskType)) {
			/**
			 * 已处理
			 */
			params.put("state", 1);
		}

		/**
		 * size < 500 or size > 500
		 */
		List<ObjectEntity> taskIds = userTaskMapper
				.getMyCellTaskIds(params);
		if (taskIds != null && !taskIds.isEmpty()) {
			Collection<Integer> allIndexIds = new LinkedHashSet<Integer>();
			Collection<Integer> activIndexIds = new LinkedHashSet<Integer>();
			List<String> tmpList = new ArrayList<String>();
			for (ObjectEntity o : taskIds) {
				tmpList.add(o.getStringValue());
				if (tmpList.size() % 500 == 0) {
					Map<String, Object> params2 = new HashMap<String, Object>();
					params2.put("taskIds", tmpList);
					List<ObjectEntity> indexIds = userTaskMapper
							.getMyCellTaskIndexIds(params2);
					tmpList.clear();
					if (indexIds.size() > 0) {
						for (ObjectEntity ix : indexIds) {
							allIndexIds.add(ix.getIntValue());
						}
					}
				}
			}
			if (tmpList.size() > 0) {
				Map<String, Object> params2 = new HashMap<String, Object>();
				params2.put("taskIds", tmpList);
				List<ObjectEntity> indexIds = userTaskMapper
						.getMyCellTaskIndexIds(params2);
				tmpList.clear();
				if (indexIds.size() > 0) {
					for (ObjectEntity ix : indexIds) {
						allIndexIds.add(ix.getIntValue());
					}
				}
			}

			logger.debug("allIndexIds=" + allIndexIds);

			Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
			if (allIndexIds.size() > 0) {
				List<BaseTree> trees = null;
				for (Integer ix : allIndexIds) {
					trees = userTaskMapper.getMyTaskTrees(ix);
					if (trees == null || trees.isEmpty()) {
						trees = userTaskMapper.getMyTaskTreesOfTypeA(ix);
					}
					if (trees != null && !trees.isEmpty()) {
						if (trees.size() >= 2) {
							if (!activIndexIds.contains(trees.get(1)
									.getIndexId())) {
								UserTask userTask = new UserTask();
								userTask.setId(UUID32.getUUID());
								userTask.setIndexId(idGenerator.nextId()
										.intValue());
								userTask.setActivityId(String.valueOf(trees
										.get(1).getIndexId()));
								userTask.setActorId(actorId);
								userTask.setIndexName(trees.get(0)
										.getIndexName()
										+ "\\"
										+ trees.get(1).getIndexName());
								userTask.setName(userTask.getIndexName());
								userTask.setParentId(-1);
								userTask.setLevel(1);
								userTask.setState(-1);
								userTaskMapper.insertUserTask(userTask);
								intMap.put(trees.get(1).getIndexId(),
										userTask.getIndexId());
								activIndexIds.add(trees.get(1).getIndexId());
							}
						}
					}
				}

				tmpList.clear();

				logger.debug("index map:" + intMap);

				for (Integer ix : activIndexIds) {
					tmpList.clear();
					for (ObjectEntity o : taskIds) {
						tmpList.add(o.getStringValue());
						if (tmpList.size() % 500 == 0) {
							params.put("taskIds", tmpList);
							params.put("indexId", ix);
							List<IsdpTaskItem> taskItems = userTaskMapper
									.getMyTaskItemMap(params);
							if (taskItems != null && !taskItems.isEmpty()) {
								for (IsdpTaskItem ti : taskItems) {
									UserTask userTask = new UserTask();
									userTask.setId(UUID32.getUUID());
									userTask.setIndexId(idGenerator.nextId()
											.intValue());
									userTask.setParentId(intMap.get(ix));
									userTask.setActivityId(ti.getActivityId());
									userTask.setActorId(actorId);
									userTask.setName("activ");
									userTask.setEndTime(ti.getEndTime());
									userTask.setStartTime(ti.getStartTime());
									userTask.setIndexName(ti.getSubject());
									userTask.setLevel(2);
									userTask.setState(ti.getState());
									userTask.setLastModified(System
											.currentTimeMillis());
									userTaskMapper
											.insertUserTask(userTask);
								}
							}
							tmpList.clear();
						}
					}

					if (tmpList.size() > 0) {
						params.put("taskIds", tmpList);
						params.put("indexId", ix);
						List<IsdpTaskItem> taskItems = userTaskMapper
								.getMyTaskItemMap(params);
						if (taskItems != null && !taskItems.isEmpty()) {
							for (IsdpTaskItem ti : taskItems) {
								UserTask userTask = new UserTask();
								userTask.setId(UUID32.getUUID());
								userTask.setIndexId(idGenerator.nextId()
										.intValue());
								userTask.setParentId(intMap.get(ix));
								userTask.setActivityId(ti.getActivityId());
								userTask.setActorId(actorId);
								userTask.setName("activ");
								userTask.setEndTime(ti.getEndTime());
								userTask.setStartTime(ti.getStartTime());
								userTask.setIndexName(ti.getSubject());
								userTask.setLevel(2);
								userTask.setState(ti.getState());
								userTask.setLastModified(System
										.currentTimeMillis());
								userTaskMapper.insertUserTask(userTask);
							}
						}
					}
				}
			}
		}

	}

	@Transactional
	public void reloadUserTasksGroupByWBS2(String actorId, String taskType) {
		logger.debug("-----------------reloadUserTasksGroupByWBS-----------------");
		logger.debug(actorId + " " + taskType);
		/**
		 * 首先删除用户的任务
		 */
		// userTaskMapper.deleteUserTasks(actorId);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		if ("RN".equals(taskType)) {
			/**
			 * 待办
			 */
			params.put("state", 0);
		} else if ("FB".equals(taskType)) {
			/**
			 * 已退回
			 */
			params.put("state", 0);
			params.put("intback", 1);
		} else if ("WD".equals(taskType)) {
			/**
			 * 已处理
			 */
			params.put("state", 1);
		}

		logger.debug("#roles:" + params.get("roleIds"));

		/**
		 * size < 500 or size > 500
		 */
		List<ObjectEntity> taskIds = userTaskMapper
				.getMyCellTaskIds(params);
		if (taskIds != null && !taskIds.isEmpty()) {
			logger.debug("#all taskIds size:" + taskIds.size());
			Collection<Integer> allIndexIds = new LinkedHashSet<Integer>();
			Collection<Integer> activIndexIds = new LinkedHashSet<Integer>();
			List<String> tmpList = new ArrayList<String>();
			for (ObjectEntity o : taskIds) {
				tmpList.add(o.getStringValue());
				if (tmpList.size() % 500 == 0) {
					Map<String, Object> params2 = new HashMap<String, Object>();
					params2.put("taskIds", tmpList);
					List<ObjectEntity> indexIds = userTaskMapper
							.getMyCellTaskIndexIds(params2);
					tmpList.clear();
					if (indexIds.size() > 0) {
						logger.debug("--> indexIds size:" + indexIds.size());
						for (ObjectEntity ix : indexIds) {
							allIndexIds.add(ix.getIntValue());
						}
					}
				}
			}

			logger.debug("#allIndexIds size:" + allIndexIds.size());
			logger.debug("#activIndexIds size:" + activIndexIds.size());

			if (tmpList.size() > 0) {
				Map<String, Object> params2 = new HashMap<String, Object>();
				params2.put("taskIds", tmpList);
				List<ObjectEntity> indexIds = userTaskMapper
						.getMyCellTaskIndexIds(params2);
				tmpList.clear();
				logger.debug("----> indexIds size:" + indexIds.size());
				if (indexIds.size() > 0) {
					for (ObjectEntity ix : indexIds) {
						allIndexIds.add(ix.getIntValue());
					}
				}
			}

			logger.debug("allIndexIds=" + allIndexIds);
			logger.debug("allIndexIds size =" + allIndexIds.size());

			Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
			if (allIndexIds.size() > 0) {
				List<BaseTree> trees = null;
				// for (Integer ix : allIndexIds) {
				// logger.debug("process index:"+ix);
				ObjectEntity objectEntity = new ObjectEntity();
				objectEntity.setIntList(allIndexIds);
				trees = userTaskMapper.getMyBaseTaskTrees(objectEntity);
				if (trees == null || trees.isEmpty()) {
					// trees = userTaskMapper.getMyTaskTreesOfTypeA(ix);
				}
				if (trees != null && !trees.isEmpty()) {
					logger.debug("trees size:" + trees.size());
					if (trees.size() >= 2) {
						Map<Integer, ITree> treeMap = new HashMap<Integer, ITree>();
						Collection<Integer> indexIds = new HashSet<Integer>();
						for (ITree tree : trees) {
							treeMap.put(tree.getIndexId(), tree);
							indexIds.add(tree.getIndexId());
							indexIds.add(tree.getParentId());
							logger.debug(tree.toJsonObject().toJSONString());
						}

						Map<String, Object> params5 = new HashMap<String, Object>();
						params5.put("indexIds", indexIds);
						logger.debug(params5);
						List<BaseTree> trees5 = userTaskMapper
								.getMyTaskTreepinfos(params5);
						for (ITree tree : trees5) {
							treeMap.put(tree.getIndexId(), tree);
						}

						logger.debug(treeMap.keySet());
						for (ITree tree : trees) {
							ITree parent = treeMap.get(tree.getParentId());
							if (parent != null) {
								UserTask userTask = new UserTask();
								userTask.setId(UUID32.getUUID());
								userTask.setIndexId(idGenerator.nextId()
										.intValue());
								userTask.setActivityId(String.valueOf(tree
										.getIndexId()));
								userTask.setActorId(actorId);
								userTask.setIndexName(parent.getIndexName()
										+ "\\" + tree.getIndexName());
								userTask.setName(userTask.getIndexName());
								userTask.setParentId(-1);
								userTask.setLevel(1);
								userTask.setState(-1);
								userTaskMapper.insertUserTask(userTask);
								intMap.put(tree.getIndexId(),
										userTask.getIndexId());
								activIndexIds.add(tree.getIndexId());
							}
						}
					}
				}
				// }

				tmpList.clear();

				logger.debug("index map:" + intMap);
				logger.debug("activIndexIds:" + activIndexIds);
				logger.debug("activIndexIds size:" + activIndexIds.size());
				Collection<String> activityIds = new HashSet<String>();

				for (Integer ix : activIndexIds) {
					tmpList.clear();
					for (ObjectEntity o : taskIds) {
						tmpList.add(o.getStringValue());
						if (tmpList.size() % 500 == 0) {
							params.put("taskIds", tmpList);
							params.put("indexId", ix);
							logger.debug(ix + " task size:" + tmpList.size());
							List<IsdpTaskItem> taskItems = userTaskMapper
									.getMyTaskItemMap(params);
							if (taskItems != null && !taskItems.isEmpty()) {
								for (IsdpTaskItem ti : taskItems) {
									if (activityIds
											.contains(ti.getActivityId())) {
										continue;
									}
									UserTask userTask = new UserTask();
									userTask.setId(UUID32.getUUID());
									userTask.setIndexId(idGenerator.nextId()
											.intValue());
									userTask.setParentId(intMap.get(ix));
									userTask.setActivityId(ti.getActivityId());
									userTask.setActorId(actorId);
									userTask.setName("activ");
									userTask.setEndTime(ti.getEndTime());
									userTask.setStartTime(ti.getStartTime());
									userTask.setIndexName(ti.getSubject());
									userTask.setLevel(2);
									userTask.setState(ti.getState());
									userTask.setLastModified(System
											.currentTimeMillis());
									userTaskMapper
											.insertUserTask(userTask);
									activityIds.add(ti.getActivityId());
								}
							}
							tmpList.clear();
						}
					}

					if (tmpList.size() > 0) {
						params.put("taskIds", tmpList);
						params.put("indexId", ix);
						logger.debug("process index task:" + ix);
						List<IsdpTaskItem> taskItems = userTaskMapper
								.getMyTaskItemMap(params);
						if (taskItems != null && !taskItems.isEmpty()) {
							for (IsdpTaskItem ti : taskItems) {
								if (activityIds.contains(ti.getActivityId())) {
									continue;
								}
								UserTask userTask = new UserTask();
								userTask.setId(UUID32.getUUID());
								userTask.setIndexId(idGenerator.nextId()
										.intValue());
								userTask.setParentId(intMap.get(ix));
								userTask.setActivityId(ti.getActivityId());
								userTask.setActorId(actorId);
								userTask.setName("activ");
								userTask.setEndTime(ti.getEndTime());
								userTask.setStartTime(ti.getStartTime());
								userTask.setIndexName(ti.getSubject());
								userTask.setLevel(2);
								userTask.setState(ti.getState());
								userTask.setLastModified(System
										.currentTimeMillis());
								userTaskMapper.insertUserTask(userTask);
								activityIds.add(ti.getActivityId());
							}
						}
					}
				}
			}
		}

	}

	@Transactional
	public void save(UserTask userTask) {
		if (userTask.getIndexId() == 0) {
			userTask.setId(UUID32.getUUID());
			userTask.setIndexId(idGenerator.nextId().intValue());
			// userTask.setId(idGenerator.getNextId());
			// userTask.setCreateDate(new Date());
			userTaskMapper.insertUserTask(userTask);
		} else {
			UserTask model = this.getUserTask(userTask.getIndexId());
			if (model != null) {
				if (userTask.getParentId() == 0) {
					model.setParentId(userTask.getParentId());
				}
				if (userTask.getActorId() != null) {
					model.setActorId(userTask.getActorId());
				}
				if (userTask.getName() != null) {
					model.setName(userTask.getName());
				}
				if (userTask.getIndexName() != null) {
					model.setIndexName(userTask.getIndexName());
				}
				if (userTask.getActivityId() != null) {
					model.setActivityId(userTask.getActivityId());
				}
				if (userTask.getStartTime() != null) {
					model.setStartTime(userTask.getStartTime());
				}
				if (userTask.getEndTime() != null) {
					model.setEndTime(userTask.getEndTime());
				}
				model.setState(userTask.getState());
				model.setTimelimit(userTask.getTimelimit());
				model.setLastModified(userTask.getLastModified());
				userTaskMapper.updateUserTask(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@Resource
	public void setIsdpIdmMapper(IsdpIdmMapper isdpIdmMapper) {
		this.isdpIdmMapper = isdpIdmMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setUserTaskMapper(UserTaskMapper userTaskMapper) {
		this.userTaskMapper = userTaskMapper;
	}

}
