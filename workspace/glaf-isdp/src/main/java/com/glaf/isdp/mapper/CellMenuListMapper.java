package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellMenuListMapper {

	void deleteCellMenuLists(CellMenuListQuery query);

	void deleteCellMenuListById(String id);

	CellMenuList getCellMenuListById(String id);

	int getCellMenuListCount(Map<String, Object> parameter);

	int getCellMenuListCountByQueryCriteria(CellMenuListQuery query);

	List<CellMenuList> getCellMenuLists(Map<String, Object> parameter);

	List<Map<String, Object>> getCellMenuListMapList(
			Map<String, Object> parameter);

	List<CellMenuList> getCellMenuListsByQueryCriteria(CellMenuListQuery query);

	void insertCellMenuList(CellMenuList model);

	void updateCellMenuList(CellMenuList model);

}
