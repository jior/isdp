package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellCriterionTree;
import com.glaf.isdp.query.CellCriterionTreeQuery;

@Component
public interface CellCriterionTreeMapper {

	void deleteCellCriterionTreeById(String id);

	void deleteCellCriterionTreeByIndexId(int indexId);

	void deleteCellCriterionTrees(CellCriterionTreeQuery query);

	CellCriterionTree getCellCriterionTreeById(String id);

	CellCriterionTree getCellCriterionTreeByIndexId(int indexId);

	int getCellCriterionTreeCount(Map<String, Object> parameter);

	int getCellCriterionTreeCountByQueryCriteria(CellCriterionTreeQuery query);

	List<CellCriterionTree> getCellCriterionTrees(Map<String, Object> parameter);

	List<CellCriterionTree> getCellCriterionTreesByTasksIndexId(
			Map<String, Object> parameter);

	List<CellCriterionTree> getCellCriterionTreesByQueryCriteria(
			CellCriterionTreeQuery query);

	void insertCellCriterionTree(CellCriterionTree model);

	void updateCellCriterionTree(CellCriterionTree model);

}
