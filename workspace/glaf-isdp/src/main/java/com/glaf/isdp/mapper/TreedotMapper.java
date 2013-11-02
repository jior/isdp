package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.ObjectEntity;
import com.glaf.isdp.domain.Treedot;
import com.glaf.isdp.query.TreedotQuery;

@Component
public interface TreedotMapper {

	void deleteTreedotById(String id);

	void deleteTreedotByIndexId(int indexId);

	void deleteTreedots(TreedotQuery query);

	Treedot getTreedotById(String id);

	Treedot getTreedotByIndexId(int indexId);
	
	List<ObjectEntity> getTreedotIdsByIndexId(int indexId);

	int getTreedotCount(Map<String, Object> parameter);

	int getTreedotCountByQueryCriteria(TreedotQuery query);

	List<Treedot> getTreedots(Map<String, Object> parameter);
	
	List<Treedot> getTreedotsByIdLike(Map<String, Object> parameter);

	List<Treedot> getTreedotsByQueryCriteria(TreedotQuery query);

	void insertTreedot(Treedot model);

	void updateTreedot(Treedot model);

}
