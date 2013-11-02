package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreewbsAutoindex;
import com.glaf.isdp.query.TreewbsAutoindexQuery;

@Component
public interface TreewbsAutoindexMapper {

	void deleteTreewbsAutoindexById(String id);

	void deleteTreewbsAutoindexs(TreewbsAutoindexQuery query);

	TreewbsAutoindex getTreewbsAutoindexById(String id);

	int getTreewbsAutoindexCount(Map<String, Object> parameter);

	int getTreewbsAutoindexCountByQueryCriteria(TreewbsAutoindexQuery query);

	List<TreewbsAutoindex> getTreewbsAutoindexs(Map<String, Object> parameter);

	List<TreewbsAutoindex> getTreewbsAutoindexsByQueryCriteria(
			TreewbsAutoindexQuery query);

	void insertTreewbsAutoindex(TreewbsAutoindex model);

	void updateTreewbsAutoindex(TreewbsAutoindex model);

}
