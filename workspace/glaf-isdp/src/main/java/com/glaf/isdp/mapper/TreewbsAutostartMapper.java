package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreewbsAutostart;
import com.glaf.isdp.query.TreewbsAutostartQuery;

@Component
public interface TreewbsAutostartMapper {

	void deleteTreewbsAutostartById(String id);

	void deleteTreewbsAutostarts(TreewbsAutostartQuery query);

	TreewbsAutostart getTreewbsAutostartById(String id);

	int getTreewbsAutostartCount(Map<String, Object> parameter);

	int getTreewbsAutostartCountByQueryCriteria(TreewbsAutostartQuery query);

	List<TreewbsAutostart> getTreewbsAutostarts(Map<String, Object> parameter);

	List<TreewbsAutostart> getTreewbsAutostartsByQueryCriteria(
			TreewbsAutostartQuery query);

	void insertTreewbsAutostart(TreewbsAutostart model);

	void updateTreewbsAutostart(TreewbsAutostart model);

}
