package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface RoleUse2Mapper {

	void deleteRoleUse2s(RoleUse2Query query);

	void deleteRoleUse2ById(String id);

	RoleUse2 getRoleUse2ById(String id);

	int getRoleUse2Count(Map<String, Object> parameter);

	int getRoleUse2CountByQueryCriteria(RoleUse2Query query);

	List<RoleUse2> getRoleUse2s(Map<String, Object> parameter);

	List<Map<String,Object>> getRoleUse2MapList(Map<String, Object> parameter);

	List<RoleUse2> getRoleUse2sByQueryCriteria(RoleUse2Query query);

	void insertRoleUse2(RoleUse2 model);

	void updateRoleUse2(RoleUse2 model);

}
