package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface ListShowMapper {

	void deleteListShows(ListShowQuery query);

	void deleteListShowById(String id);

	ListShow getListShowById(String id);

	int getListShowCount(Map<String, Object> parameter);

	int getListShowCountByQueryCriteria(ListShowQuery query);

	List<ListShow> getListShows(Map<String, Object> parameter);

	List<Map<String, Object>> getListShowMapList(Map<String, Object> parameter);

	List<ListShow> getListShowsByQueryCriteria(ListShowQuery query);

	void insertListShow(ListShow model);

	void updateListShow(ListShow model);

}
