package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.MyCellBusiess;
import com.glaf.isdp.query.MyCellBusiessQuery;

@Component
public interface MyCellBusiessMapper {

	void deleteMyCellBusiessById(String id);

	void deleteMyCellBusiesss(MyCellBusiessQuery query);

	MyCellBusiess getMyCellBusiessById(String id);
	
	MyCellBusiess getMyCellBusiessById_postgres(String id);

	int getMyCellBusiessCount(Map<String, Object> parameter);

	int getMyCellBusiessCountByQueryCriteria(MyCellBusiessQuery query);

	List<MyCellBusiess> getMyCellBusiesss(Map<String, Object> parameter);

	List<MyCellBusiess> getMyCellBusiesssByQueryCriteria(
			MyCellBusiessQuery query);

	void insertMyCellBusiess(MyCellBusiess model);

	void updateMyCellBusiess(MyCellBusiess model);

}
