package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellRepInfo;
import com.glaf.isdp.query.CellRepInfoQuery;

@Component
public interface CellRepInfoMapper {

	void deleteCellRepInfoById(String id);

	void deleteCellRepInfos(CellRepInfoQuery query);

	CellRepInfo getCellRepInfoById(String id);

	int getCellRepInfoCount(Map<String, Object> parameter);

	int getCellRepInfoCountByQueryCriteria(CellRepInfoQuery query);

	List<CellRepInfo> getCellRepInfos(Map<String, Object> parameter);
	
	List<CellRepInfo> getRoleUseExistsCellRepInfos(Map<String, Object> parameter);
	
	List<CellRepInfo> getRoleUseNotExistsCellRepInfos(Map<String, Object> parameter);
	
	List<CellRepInfo> getCellRepInfosByFiledotId(String filedotId);

	List<CellRepInfo> getCellRepInfosByQueryCriteria(CellRepInfoQuery query);

	void insertCellRepInfo(CellRepInfo model);

	void updateCellRepInfo(CellRepInfo model);

}
