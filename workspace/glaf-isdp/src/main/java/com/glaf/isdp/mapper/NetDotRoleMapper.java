package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.NetDotRole;
import com.glaf.isdp.query.NetDotRoleQuery;

@Component
public interface NetDotRoleMapper {

	void deleteNetDotRoleById(String id);

	void deleteNetDotRoles(NetDotRoleQuery query);

	NetDotRole getNetDotRoleById(String id);

	int getNetDotRoleCount(Map<String, Object> parameter);

	int getNetDotRoleCountByQueryCriteria(NetDotRoleQuery query);

	List<NetDotRole> getNetDotRoles(Map<String, Object> parameter);

	List<NetDotRole> getNetDotRolesByQueryCriteria(NetDotRoleQuery query);

	void insertNetDotRole(NetDotRole model);

	void updateNetDotRole(NetDotRole model);

}
