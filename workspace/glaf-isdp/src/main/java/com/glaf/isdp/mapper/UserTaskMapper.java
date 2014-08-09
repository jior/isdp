package com.glaf.isdp.mapper;

import java.util.*;

import org.springframework.stereotype.Component;

import com.glaf.base.modules.sys.model.BaseTree;
import com.glaf.base.modules.sys.model.ObjectEntity;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface UserTaskMapper {

	void deleteUserTaskById(int id);

	void deleteUserTasks(String actorId);

	List<IsdpTaskItem> getAllMyTaskItemMap(Map<String, Object> parameter);

	List<BaseTree> getMyBaseTaskTrees(ObjectEntity objectEntity);

	List<ObjectEntity> getMyCellTaskDates(Map<String, Object> parameter);

	List<ObjectEntity> getMyCellTaskIds(Map<String, Object> parameter);

	List<ObjectEntity> getMyCellTaskIndexIds(Map<String, Object> parameter);

	List<IsdpTaskItem> getMyTaskItemMap(Map<String, Object> parameter);

	List<BaseTree> getMyTaskTreepinfos(Map<String, Object> parameter);

	List<BaseTree> getMyTaskTrees(int indexId);
	
	List<BaseTree> getMyTaskTreesOfTypeA(int indexId);

	List<UserTask> getUserTaskByActorId(String actorId);

	UserTask getUserTaskById(int id);

	int getUserTaskCount(Map<String, Object> parameter);

	int getUserTaskCountByQueryCriteria(UserTaskQuery query);

	List<UserTask> getUserTasks(Map<String, Object> parameter);

	List<UserTask> getUserTasksByQueryCriteria(UserTaskQuery query);

	void insertUserTask(UserTask model);

	void updateUserTask(UserTask model);

}
