package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.IsdpDotuse;
import com.glaf.isdp.query.DotuseQuery;

@Component
public interface IsdpDotuseMapper {

	void deleteDotuseById(String id);

	void deleteDotuses(DotuseQuery query);

	IsdpDotuse getDotuseById(String id);
	
	IsdpDotuse getDotuseById_postgres(String id);

	int getDotuseCount(Map<String, Object> parameter);

	int getDotuseCountByQueryCriteria(DotuseQuery query);
	
	List<IsdpDotuse> getDotuses(Map<String, Object> parameter);

	List<IsdpDotuse> getDotusesByQueryCriteria(DotuseQuery query);

	void insertDotuse(IsdpDotuse model);

	void updateDotuse(IsdpDotuse model);

}
