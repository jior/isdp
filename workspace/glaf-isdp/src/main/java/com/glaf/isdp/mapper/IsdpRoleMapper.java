package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.Role;
import com.glaf.isdp.query.RoleQuery;

@Component
public interface IsdpRoleMapper {

	void deleteIsdpRoleById(String id);

	void deleteIsdpRoles(RoleQuery query);

	Role getIsdpRoleById(String id);

	int getIsdpRoleCount(Map<String, Object> parameter);

	int getIsdpRoleCountByQueryCriteria(RoleQuery query);

	List<Role> getIsdpRoles(Map<String, Object> parameter);

	List<Role> getIsdpRolesByQueryCriteria(RoleQuery query);

	void insertIsdpRole(Role model);

	void updateIsdpRole(Role model);

}
