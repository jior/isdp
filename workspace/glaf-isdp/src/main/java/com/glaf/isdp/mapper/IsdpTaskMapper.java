package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public interface IsdpTaskMapper {

	List<Map<String, Object>> getAllTaskList(Map<String, Object> params);

	int getAllTaskListCount(Map<String, Object> params);

	List<Map<String, Object>> getFallbackTaskList(Map<String, Object> params);

	int getFallbackTaskListCount(Map<String, Object> params);

	List<Map<String, Object>> getTodoTaskList(Map<String, Object> params);

	int getTodoTaskListCount(Map<String, Object> params);

	List<Map<String, Object>> getWorkedTaskList(Map<String, Object> params);

	int getWorkedTaskListCount(Map<String, Object> params);

}
