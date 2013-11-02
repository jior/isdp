package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellTcadbmpMapper {

	void deleteCellTcadbmps(CellTcadbmpQuery query);

	void deleteCellTcadbmpById(String id);

	CellTcadbmp getCellTcadbmpById(String id);

	int getCellTcadbmpCount(Map<String, Object> parameter);

	int getCellTcadbmpCountByQueryCriteria(CellTcadbmpQuery query);

	List<CellTcadbmp> getCellTcadbmps(Map<String, Object> parameter);

	List<Map<String, Object>> getCellTcadbmpMapList(
			Map<String, Object> parameter);

	List<CellTcadbmp> getCellTcadbmpsByQueryCriteria(CellTcadbmpQuery query);

	void insertCellTcadbmp(CellTcadbmp model);

	void updateCellTcadbmp(CellTcadbmp model);

}
