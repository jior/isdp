package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.IsdpCellFillForm;
import com.glaf.isdp.query.CellFillFormQuery;

@Component
public interface IsdpCellFillFormMapper {

	void deleteCellFillFormById(String id);

	void deleteCellFillForms(CellFillFormQuery query);

	IsdpCellFillForm getCellFillFormById(String id);

	int getCellFillFormCount(Map<String, Object> parameter);

	int getFileCellFillFormCount(Map<String, Object> parameter);

	int getCellFillFormCountByQueryCriteria(CellFillFormQuery query);

	List<IsdpCellFillForm> getCellFillForms(Map<String, Object> parameter);

	List<IsdpCellFillForm> getCellFillFormsByQueryCriteria(CellFillFormQuery query);

	List<IsdpCellFillForm> getFileCellFillFormList(Map<String, Object> parameter);

	void insertCellFillForm(IsdpCellFillForm model);

	void updateCellFillForm(IsdpCellFillForm model);

}
