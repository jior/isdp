package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.IsdpPfile;
import com.glaf.isdp.query.PfileQuery;

@Component
public interface IsdpPfileMapper {

	void deletePfileById(String id);

	void deletePfiles(PfileQuery query);

	IsdpPfile getPfileById(String id);

	int getPfileCount(Map<String, Object> parameter);

	int getPfileCountByQueryCriteria(PfileQuery query);

	List<IsdpPfile> getPfiles(Map<String, Object> parameter);

	List<IsdpPfile> getPfilesByQueryCriteria(PfileQuery query);

	int getTreePfileCount(Map<String, Object> parameter);

	List<IsdpPfile> getTreePfiles(Map<String, Object> parameter);

	void insertPfile(IsdpPfile model);

	void updatePfile(IsdpPfile model);

}
