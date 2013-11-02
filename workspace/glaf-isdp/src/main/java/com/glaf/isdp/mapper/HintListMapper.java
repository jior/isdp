package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.HintList;
import com.glaf.isdp.query.HintListQuery;

@Component
public interface HintListMapper {

	void deleteHintListById(String id);

	void deleteHintLists(HintListQuery query);

	HintList getHintListById(String id);

	int getHintListCount(Map<String, Object> parameter);

	int getHintListCountByQueryCriteria(HintListQuery query);

	List<HintList> getHintLists(Map<String, Object> parameter);

	List<HintList> getHintListsByQueryCriteria(HintListQuery query);

	void insertHintList(HintList model);

	void updateHintList(HintList model);

}
