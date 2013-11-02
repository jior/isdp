package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.RoleUse;
import com.glaf.isdp.query.RoleUseQuery;

@Component
public interface RoleUseMapper {

	void deleteRoleUseById(String id);

	void deleteRoleUses(RoleUseQuery query);

	RoleUse getRoleUseById(String id);

	int getRoleUseCount(Map<String, Object> parameter);

	int getRoleUseCountByQueryCriteria(RoleUseQuery query);

	List<RoleUse> getRoleUses(Map<String, Object> parameter);

	List<RoleUse> getRoleUsesByQueryCriteria(RoleUseQuery query);

	void insertRoleUse(RoleUse model);

	void updateRoleUse(RoleUse model);

}
