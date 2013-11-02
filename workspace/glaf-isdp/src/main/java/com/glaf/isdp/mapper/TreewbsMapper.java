package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.Treewbs;
import com.glaf.isdp.query.TreewbsQuery;

@Component
public interface TreewbsMapper {

	void deleteTreewbsById(String id);

	void deleteTreewbsByIndexId(int indexId);

	Treewbs getTreewbsById(String id);

	Treewbs getTreewbsByIndexId(int indexId);

	int getTreewbsCount(Map<String, Object> parameter);

	int getTreewbsCountByQueryCriteria(TreewbsQuery query);

	List<Treewbs> getTreewbss(Map<String, Object> parameter);

	List<Treewbs> getTreewbssByQueryCriteria(TreewbsQuery query);

	void insertTreewbs(Treewbs model);

	void updateTreewbs(Treewbs model);

}
