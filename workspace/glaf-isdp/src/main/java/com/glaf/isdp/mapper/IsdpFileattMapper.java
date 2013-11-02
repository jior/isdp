package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.IsdpFileatt;
import com.glaf.isdp.query.FileattQuery;

@Component
public interface IsdpFileattMapper {

	void deleteFileattById(String id);

	void deleteFileatts(FileattQuery query);

	IsdpFileatt getFileattById(String id);
	
	IsdpFileatt getFileattById_postgres(String id);

	int getFileattCount(Map<String, Object> parameter);

	int getFileattCountByQueryCriteria(FileattQuery query);

	List<IsdpFileatt> getFileatts(Map<String, Object> parameter);

	List<IsdpFileatt> getFileattsByQueryCriteria(FileattQuery query);

	void insertFileatt(IsdpFileatt model);

	void updateFileatt(IsdpFileatt model);

}
