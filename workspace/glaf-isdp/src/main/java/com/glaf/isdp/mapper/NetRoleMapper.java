package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.query.NetRoleQuery;

@Component
public interface NetRoleMapper {

	void deleteNetRoleById(int id);

	void deleteNetRoles(NetRoleQuery query);

	NetRole getNetRoleById(int id);

	int getNetRoleCount(Map<String, Object> parameter);

	int getNetRoleCountByQueryCriteria(NetRoleQuery query);
	
	List<NetRole> getNetRolesByUserId(String userId);

	List<NetRole> getNetRoles(Map<String, Object> parameter);

	List<NetRole> getNetRolesByQueryCriteria(NetRoleQuery query);

	void insertNetRole(NetRole model);

	void updateNetRole(NetRole model);

}
