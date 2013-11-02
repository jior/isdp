package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.Treepur;
import com.glaf.isdp.query.TreepurQuery;

@Component
public interface TreepurMapper {

	void deleteTreepurById(String id);

	void deleteTreepurs(TreepurQuery query);

	Treepur getTreepurById(String id);

	int getTreepurCount(Map<String, Object> parameter);

	int getTreepurCountByQueryCriteria(TreepurQuery query);

	List<Treepur> getTreepurs(Map<String, Object> parameter);

	List<Treepur> getTreepursByQueryCriteria(TreepurQuery query);

	void insertTreepur(Treepur model);

	void updateTreepur(Treepur model);

}
