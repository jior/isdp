package com.glaf.isdp.service;

import com.glaf.isdp.domain.RolePrivilege;

public interface IsdpIdentityService {

	RolePrivilege getRolePrivilege(String topId, int roleId);

}
