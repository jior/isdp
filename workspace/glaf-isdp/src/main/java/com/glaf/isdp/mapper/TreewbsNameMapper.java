package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreewbsName;
import com.glaf.isdp.query.TreewbsNameQuery;

@Component
public interface TreewbsNameMapper {

	void deleteTreewbsNameById(String id);

	void deleteTreewbsNames(TreewbsNameQuery query);

	TreewbsName getTreewbsNameById(String id);

	int getTreewbsNameCount(Map<String, Object> parameter);

	int getTreewbsNameCountByQueryCriteria(TreewbsNameQuery query);

	List<TreewbsName> getTreewbsNames(Map<String, Object> parameter);

	List<TreewbsName> getTreewbsNamesByQueryCriteria(TreewbsNameQuery query);

	void insertTreewbsName(TreewbsName model);

	void updateTreewbsName(TreewbsName model);

}
