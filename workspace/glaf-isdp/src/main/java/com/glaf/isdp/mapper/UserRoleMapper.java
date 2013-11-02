package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.UserRole;
import com.glaf.isdp.query.UserRoleQuery;

@Component
public interface UserRoleMapper {

	void deleteUserRoleById(String id);

	void deleteUserRoles(UserRoleQuery query);

	UserRole getUserRoleById(String id);

	int getUserRoleCount(Map<String, Object> parameter);

	int getUserRoleCountByQueryCriteria(UserRoleQuery query);

	List<UserRole> getUserRoles(Map<String, Object> parameter);

	List<UserRole> getUserRolesByQueryCriteria(UserRoleQuery query);

	void insertUserRole(UserRole model);

	void updateUserRole(UserRole model);

}
