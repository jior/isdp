package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellMenuMapper {

	void deleteCellMenus(CellMenuQuery query);

	void deleteCellMenuById(String id);

	CellMenu getCellMenuById(String id);

	int getCellMenuCount(Map<String, Object> parameter);

	int getCellMenuCountByQueryCriteria(CellMenuQuery query);

	List<CellMenu> getCellMenus(Map<String, Object> parameter);

	List<Map<String,Object>> getCellMenuMapList(Map<String, Object> parameter);

	List<CellMenu> getCellMenusByQueryCriteria(CellMenuQuery query);

	void insertCellMenu(CellMenu model);

	void updateCellMenu(CellMenu model);

}
