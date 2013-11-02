package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellDataTable;
import com.glaf.isdp.query.CellDataTableQuery;

@Component
public interface CellDataTableMapper {

	void deleteCellDataTableById(String id);

	void deleteCellDataTables(CellDataTableQuery query);
	
	void deleteCellUserDataById(CellDataTableQuery query);

	CellDataTable getCellDataTableById(String id);

	CellDataTable getCellDataTableByTablename(String tablename);

	int getCellDataTableCount(Map<String, Object> parameter);

	int getCellDataTableCountByQueryCriteria(CellDataTableQuery query);

	List<CellDataTable> getCellDataTables(Map<String, Object> parameter);

	List<CellDataTable> getCellDataTablesByFiledotId(String filedotId);

	List<CellDataTable> getCellDataTablesByQueryCriteria(
			CellDataTableQuery query);

	int getCellUserDataCount( CellDataTableQuery query);

	int getTableRecordCount(CellDataTableQuery query);

	Map<String, Object> getTableRecord(CellDataTableQuery query);

	void insertCellDataTable(CellDataTable model);

	void insertCellUserData(CellDataTable model);

	void updateCellDataTable(CellDataTable model);

	void updateCellUserData(CellDataTable model);

}
