package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreeProjectPar;
import com.glaf.isdp.query.TreeProjectParQuery;

@Component
public interface TreeProjectParMapper {

	void deleteTreeProjectParById(String id);

	void deleteTreeProjectPars(TreeProjectParQuery query);

	TreeProjectPar getTreeProjectParById(String id);

	int getTreeProjectParCount(Map<String, Object> parameter);

	int getTreeProjectParCountByQueryCriteria(TreeProjectParQuery query);

	List<TreeProjectPar> getTreeProjectPars(Map<String, Object> parameter);

	List<TreeProjectPar> getTreeProjectParsByQueryCriteria(TreeProjectParQuery query);

	void insertTreeProjectPar(TreeProjectPar model);

	void updateTreeProjectPar(TreeProjectPar model);

}
