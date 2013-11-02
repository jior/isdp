package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellDataVirtableMapper {

	void deleteCellDataVirtables(CellDataVirtableQuery query);

	void deleteCellDataVirtableById(String id);

	CellDataVirtable getCellDataVirtableById(String id);

	int getCellDataVirtableCount(Map<String, Object> parameter);

	int getCellDataVirtableCountByQueryCriteria(CellDataVirtableQuery query);

	List<CellDataVirtable> getCellDataVirtables(Map<String, Object> parameter);

	List<Map<String, Object>> getCellDataVirtableMapList(
			Map<String, Object> parameter);

	List<CellDataVirtable> getCellDataVirtablesByQueryCriteria(
			CellDataVirtableQuery query);

	void insertCellDataVirtable(CellDataVirtable model);

	void updateCellDataVirtable(CellDataVirtable model);

}
