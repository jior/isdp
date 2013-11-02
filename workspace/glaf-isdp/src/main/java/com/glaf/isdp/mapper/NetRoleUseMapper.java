package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.NetRoleUse;
import com.glaf.isdp.query.NetRoleUseQuery;

@Component
public interface NetRoleUseMapper {

	void deleteNetRoleUseById(int id);

	void deleteNetRoleUses(NetRoleUseQuery query);

	NetRoleUse getNetRoleUseById(int id);

	int getNetRoleUseCount(Map<String, Object> parameter);

	int getNetRoleUseCountByQueryCriteria(NetRoleUseQuery query);
	
	List<NetRoleUse> getNetRoleUsesByUserId(String userId);

	List<NetRoleUse> getNetRoleUses(Map<String, Object> parameter);

	List<NetRoleUse> getNetRoleUsesByQueryCriteria(NetRoleUseQuery query);

	void insertNetRoleUse(NetRoleUse model);

	void updateNetRoleUse(NetRoleUse model);

}
