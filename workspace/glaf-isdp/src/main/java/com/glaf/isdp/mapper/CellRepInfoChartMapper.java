package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellRepInfoChartMapper {

	void deleteCellRepInfoCharts(CellRepInfoChartQuery query);

	void deleteCellRepInfoChartById(String id);

	CellRepInfoChart getCellRepInfoChartById(String id);

	int getCellRepInfoChartCount(Map<String, Object> parameter);

	int getCellRepInfoChartCountByQueryCriteria(CellRepInfoChartQuery query);

	List<CellRepInfoChart> getCellRepInfoCharts(Map<String, Object> parameter);

	List<Map<String, Object>> getCellRepInfoChartMapList(
			Map<String, Object> parameter);

	List<CellRepInfoChart> getCellRepInfoChartsByQueryCriteria(
			CellRepInfoChartQuery query);

	void insertCellRepInfoChart(CellRepInfoChart model);

	void updateCellRepInfoChart(CellRepInfoChart model);

}
