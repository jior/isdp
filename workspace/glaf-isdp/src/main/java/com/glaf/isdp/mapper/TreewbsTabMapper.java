package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreewbsTab;
import com.glaf.isdp.query.TreewbsTabQuery;

@Component
public interface TreewbsTabMapper {

	void deleteTreewbsTabById(String id);

	void deleteTreewbsTabs(TreewbsTabQuery query);

	TreewbsTab getTreewbsTabById(String id);

	int getTreewbsTabCount(Map<String, Object> parameter);

	int getTreewbsTabCountByQueryCriteria(TreewbsTabQuery query);

	List<TreewbsTab> getTreewbsTabs(Map<String, Object> parameter);

	List<TreewbsTab> getTreewbsTabsByQueryCriteria(TreewbsTabQuery query);

	void insertTreewbsTab(TreewbsTab model);

	void updateTreewbsTab(TreewbsTab model);

}
