package com.glaf.isdp.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.NetRole;

@Component
public interface IsdpIdmMapper {

	List<NetRole> getUserNetRoleList(String actorId);

}
