package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.Hint;
import com.glaf.isdp.query.HintQuery;

@Component
public interface HintMapper {

	void deleteHintById(String id);

	void deleteHints(HintQuery query);

	Hint getHintById(String id);

	int getHintCount(Map<String, Object> parameter);

	int getHintCountByQueryCriteria(HintQuery query);

	List<Hint> getHints(Map<String, Object> parameter);

	List<Hint> getHintsByQueryCriteria(HintQuery query);

	void insertHint(Hint model);

	void updateHint(Hint model);

}
