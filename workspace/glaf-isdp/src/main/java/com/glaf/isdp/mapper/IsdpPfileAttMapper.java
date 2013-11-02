package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.IsdpPfileAtt;
import com.glaf.isdp.query.PfileAttQuery;

@Component
public interface IsdpPfileAttMapper {

	void deletePfileAttById(String id);

	void deletePfileAtts(PfileAttQuery query);

	IsdpPfileAtt getPfileAttById(String id);

	int getPfileAttCount(Map<String, Object> parameter);

	int getPfileAttCountByQueryCriteria(PfileAttQuery query);

	List<IsdpPfileAtt> getPfileAtts(Map<String, Object> parameter);

	List<IsdpPfileAtt> getPfileAttsByQueryCriteria(PfileAttQuery query);

	void insertPfileAtt(IsdpPfileAtt model);

	void updatePfileAtt(IsdpPfileAtt model);

}
