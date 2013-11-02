package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.CellDottofile;
import com.glaf.isdp.query.CellDottofileQuery;

@Component
public interface CellDottofileMapper {

	void deleteCellDottofileById(String id);

	void deleteCellDottofiles(CellDottofileQuery query);

	CellDottofile getCellDottofileById(String id);

	int getCellDottofileCount(Map<String, Object> parameter);

	int getCellDottofileCountByQueryCriteria(CellDottofileQuery query);

	List<CellDottofile> getCellDottofiles(Map<String, Object> parameter);

	List<CellDottofile> getCellDottofilesByQueryCriteria(
			CellDottofileQuery query);

	void insertCellDottofile(CellDottofile model);

	void updateCellDottofile(CellDottofile model);

}
