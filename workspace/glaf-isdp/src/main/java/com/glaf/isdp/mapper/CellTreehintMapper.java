package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellTreehintMapper {

	void deleteCellTreehintById(String id);

	void deleteCellTreehintByIndexId(int indexId);

	CellTreehint getCellTreehintById(String id);

	CellTreehint getCellTreehintByIndexId(int indexId);

	int getCellTreehintCount(Map<String, Object> parameter);

	int getCellTreehintCountByQueryCriteria(CellTreehintQuery query);

	List<CellTreehint> getCellTreehints(Map<String, Object> parameter);

	List<CellTreehint> getCellTreehintsByQueryCriteria(CellTreehintQuery query);

	void insertCellTreehint(CellTreehint model);

	void updateCellTreehint(CellTreehint model);

}
