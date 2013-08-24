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

package com.glaf.base.listener;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.model.SysUser;

public class UserOnlineListener implements HttpSessionAttributeListener {
	private static Log logger = LogFactory.getLog(UserOnlineListener.class);
	private static Map<String, String> userList = new HashMap<String, String>();

	/**
	 * �����û���½ip
	 * 
	 * @param userId
	 * @return
	 */
	public static String findUser(String userId) {
		String ip = null;
		logger.info("find userId:" + userId);

		if (userList.containsKey(userId)) {// �û��Ƿ����
			ip = (String) userList.get(userId);
		}
		logger.info("ip:" + ip);
		return ip;
	}

	/**
	 * ��ӡ�û��б�
	 */
	public static void print() {
		Iterator<String> iter = userList.keySet().iterator();
		while (iter.hasNext()) {
			String userId = (String) iter.next();
			logger.info("userId:" + userId + ", ip:" + userList.get(userId));
		}
	}

	public void attributeAdded(HttpSessionBindingEvent se) {
		if (SysConstants.LOGIN.equals(se.getName())) {
			logger.info(se.getName() + ";" + se.getValue());
			inStack((SysUser) se.getValue());
		}
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
		if (SysConstants.LOGIN.equals(se.getName())) {
			logger.info(se.getName() + ";" + se.getValue());
			outStack((SysUser) se.getValue());
		}
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {

	}

	/**
	 * session�����ջ
	 * 
	 */
	private void inStack(SysUser user) {
		if (user == null) {
			return;
		}
		synchronized (this) {
			logger.info("in stack userId:" + user.getActorId());
			if (findUser(user.getActorId()) == null) {// �û�δ��½
				userList.put(user.getActorId(), user.getLoginIP());
			}
		}
	}

	/**
	 * session�����ջ
	 * 
	 */
	private void outStack(SysUser user) {
		if (user == null) {
			return;
		}
		synchronized (this) {
			logger.info("out stack userId:" + user.getActorId());
			userList.remove(user.getActorId());
		}
	}
}