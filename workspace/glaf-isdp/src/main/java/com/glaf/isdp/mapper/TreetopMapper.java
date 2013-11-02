package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface TreetopMapper {

	void deleteTreetops(TreetopQuery query);

	void deleteTreetopById(Integer id);

	Treetop getTreetopById(Integer id);

	int getTreetopCount(Map<String, Object> parameter);

	int getTreetopCountByQueryCriteria(TreetopQuery query);

	List<Treetop> getTreetops(Map<String, Object> parameter);

	List<Map<String, Object>> getTreetopMapList(Map<String, Object> parameter);

	List<Treetop> getTreetopsByQueryCriteria(TreetopQuery query);

	void insertTreetop(Treetop model);

	void updateTreetop(Treetop model);

}
