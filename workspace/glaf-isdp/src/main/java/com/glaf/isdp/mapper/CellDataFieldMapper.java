package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellDataField;
import com.glaf.isdp.query.CellDataFieldQuery;

@Component
public interface CellDataFieldMapper {

	void deleteCellDataFieldById(String id);

	void deleteCellDataFields(CellDataFieldQuery query);

	CellDataField getCellDataFieldById(String id);

	int getCellDataFieldCount(Map<String, Object> parameter);

	int getCellDataFieldCountByQueryCriteria(CellDataFieldQuery query);

	List<CellDataField> getCellDataFields(Map<String, Object> parameter);
	
	List<CellDataField> getCellDataFieldsByTableId(String tableId);
	
	List<CellDataField> getCellDataFieldsByFiledotId(String filedotId);

	List<CellDataField> getCellDataFieldsByQueryCriteria(
			CellDataFieldQuery query);

	void insertCellDataField(CellDataField model);

	void updateCellDataField(CellDataField model);

}
