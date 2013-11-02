package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellCriterion;
import com.glaf.isdp.query.CellCriterionQuery;

@Component
public interface CellCriterionMapper {

	void deleteCellCriterionById(String id);

	void deleteCellCriterions(CellCriterionQuery query);

	CellCriterion getCellCriterionById(String id);

	int getCellCriterionCount(Map<String, Object> parameter);

	int getCellCriterionCountByQueryCriteria(CellCriterionQuery query);

	List<CellCriterion> getCellCriterions(Map<String, Object> parameter);
	
	List<CellCriterion> getCellCriterionByWBS(Map<String, Object> parameter);

	List<CellCriterion> getCellCriterionsByQueryCriteria(
			CellCriterionQuery query);

	void insertCellCriterion(CellCriterion model);

	void updateCellCriterion(CellCriterion model);

}
