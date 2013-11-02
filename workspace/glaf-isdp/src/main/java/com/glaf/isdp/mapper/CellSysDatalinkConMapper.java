package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellSysDatalinkConMapper {

	void deleteCellSysDatalinkCons(CellSysDatalinkConQuery query);

	void deleteCellSysDatalinkConById(String id);

	CellSysDatalinkCon getCellSysDatalinkConById(String id);

	int getCellSysDatalinkConCount(Map<String, Object> parameter);

	int getCellSysDatalinkConCountByQueryCriteria(CellSysDatalinkConQuery query);

	List<CellSysDatalinkCon> getCellSysDatalinkCons(
			Map<String, Object> parameter);

	List<Map<String, Object>> getCellSysDatalinkConMapList(
			Map<String, Object> parameter);

	List<CellSysDatalinkCon> getCellSysDatalinkConsByQueryCriteria(
			CellSysDatalinkConQuery query);

	void insertCellSysDatalinkCon(CellSysDatalinkCon model);

	void updateCellSysDatalinkCon(CellSysDatalinkCon model);

}
