package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellSysDatalinkMapper {

	void deleteCellSysDatalinks(CellSysDatalinkQuery query);

	void deleteCellSysDatalinkById(String id);

	CellSysDatalink getCellSysDatalinkById(String id);

	int getCellSysDatalinkCount(Map<String, Object> parameter);

	int getCellSysDatalinkCountByQueryCriteria(CellSysDatalinkQuery query);

	List<CellSysDatalink> getCellSysDatalinks(Map<String, Object> parameter);

	List<Map<String, Object>> getCellSysDatalinkMapList(
			Map<String, Object> parameter);

	List<CellSysDatalink> getCellSysDatalinksByQueryCriteria(
			CellSysDatalinkQuery query);

	void insertCellSysDatalink(CellSysDatalink model);

	void updateCellSysDatalink(CellSysDatalink model);

}
