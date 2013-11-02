package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellHintlistMapper {

	void deleteCellHintlists(CellHintlistQuery query);

	void deleteCellHintlistById(String id);

	CellHintlist getCellHintlistById(String id);

	int getCellHintlistCount(Map<String, Object> parameter);

	int getCellHintlistCountByQueryCriteria(CellHintlistQuery query);

	List<CellHintlist> getCellHintlists(Map<String, Object> parameter);

	List<Map<String,Object>> getCellHintlistMapList(Map<String, Object> parameter);

	List<CellHintlist> getCellHintlistsByQueryCriteria(CellHintlistQuery query);

	void insertCellHintlist(CellHintlist model);

	void updateCellHintlist(CellHintlist model);

}
