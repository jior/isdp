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
package com.glaf.auth.init;

import java.util.Map;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.Initiator;

import com.glaf.auth.Constants;
import com.glaf.base.utils.Authentication;
import com.glaf.core.identity.User;

public class AuthenticationInit implements Initiator {

	public void doInit(Page page, Map<String, Object> args) throws Exception {
		Session session = Sessions.getCurrent();
		User user = (User) session.getAttribute(Constants.LOGIN_USER);
		if (user == null) {
			Executions.sendRedirect("/login.zul");
			return;
		}
		Authentication.setAuthenticatedAccount(user.getActorId());
	}
}