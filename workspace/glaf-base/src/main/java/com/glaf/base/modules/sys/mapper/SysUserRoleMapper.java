/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.base.modules.sys.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.base.modules.sys.model.*;
import com.glaf.base.modules.sys.query.*;

@Component
public interface SysUserRoleMapper {

	void deleteSysUserRoles(SysUserRoleQuery query);

	void deleteSysUserRoleById(String id);

	SysUserRole getSysUserRoleById(String id);

	List<Map<String, Object>> getProcessByUser(String userId);

	int getSysUserRoleCount(SysUserRoleQuery query);
	
	List<SysUserRole> getSysUserRolesByUserId(String userId);

	List<SysUserRole> getSysUserRoles(SysUserRoleQuery query);

	void insertSysUserRole(SysUserRole model);

	void updateSysUserRole(SysUserRole model);

}
