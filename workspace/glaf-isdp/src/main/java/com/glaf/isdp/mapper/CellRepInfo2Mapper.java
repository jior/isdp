package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellRepInfo2;
import com.glaf.isdp.query.CellRepInfo2Query;

@Component
public interface CellRepInfo2Mapper {

	void deleteCellRepInfo2ById(String id);

	void deleteCellRepInfo2s(CellRepInfo2Query query);

	CellRepInfo2 getCellRepInfo2ById(String id);

	int getCellRepInfo2Count(Map<String, Object> parameter);

	int getCellRepInfo2CountByQueryCriteria(CellRepInfo2Query query);

	List<CellRepInfo2> getCellRepInfo2s(Map<String, Object> parameter);

	List<CellRepInfo2> getCellRepInfo2sByQueryCriteria(CellRepInfo2Query query);

	void insertCellRepInfo2(CellRepInfo2 model);

	void updateCellRepInfo2(CellRepInfo2 model);

}
