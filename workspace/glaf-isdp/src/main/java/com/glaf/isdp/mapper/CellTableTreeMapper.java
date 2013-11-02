package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellTableTreeMapper {

	void deleteCellTableTrees(CellTableTreeQuery query);

	void deleteCellTableTreeById(Integer id);

	CellTableTree getCellTableTreeById(Integer id);

	int getCellTableTreeCount(Map<String, Object> parameter);

	int getCellTableTreeCountByQueryCriteria(CellTableTreeQuery query);

	List<CellTableTree> getCellTableTrees(Map<String, Object> parameter);

	List<Map<String,Object>> getCellTableTreeMapList(Map<String, Object> parameter);

	List<CellTableTree> getCellTableTreesByQueryCriteria(CellTableTreeQuery query);

	void insertCellTableTree(CellTableTree model);

	void updateCellTableTree(CellTableTree model);

}
