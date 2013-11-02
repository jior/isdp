package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.IsdpFiledot;
import com.glaf.isdp.query.FiledotQuery;

@Component
public interface IsdpFiledotMapper {

	void deleteFiledotById(String id);

	void deleteFiledots(FiledotQuery query);

	IsdpFiledot getFiledotById(String id);
	
	IsdpFiledot getFiledotById_postgres(String id);

	int getFiledotCount(Map<String, Object> parameter);

	int getFiledotCountByQueryCriteria(FiledotQuery query);
	
	List<IsdpFiledot> getMyCellTaskFiles(Map<String, Object> parameter);
	
	List<IsdpFiledot> getFiledotsOfTreedot(int indexId);

	List<IsdpFiledot> getFiledots(Map<String, Object> parameter);
	
	List<IsdpFiledot> getFiledotsByCheckItemId(String proj_chkitem_id);

	List<IsdpFiledot> getFiledotsByQueryCriteria(FiledotQuery query);

	void insertFiledot(IsdpFiledot model);

	void updateFiledot(IsdpFiledot model);

}
