package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface CellUseDataInfoMapper {

	void deleteCellUseDataInfos(CellUseDataInfoQuery query);

	void deleteCellUseDataInfoById(String id);

	CellUseDataInfo getCellUseDataInfoById(String id);

	int getCellUseDataInfoCount(Map<String, Object> parameter);

	int getCellUseDataInfoCountByQueryCriteria(CellUseDataInfoQuery query);

	List<CellUseDataInfo> getCellUseDataInfos(Map<String, Object> parameter);

	List<Map<String,Object>> getCellUseDataInfoMapList(Map<String, Object> parameter);

	List<CellUseDataInfo> getCellUseDataInfosByQueryCriteria(CellUseDataInfoQuery query);

	void insertCellUseDataInfo(CellUseDataInfo model);

	void updateCellUseDataInfo(CellUseDataInfo model);

}
