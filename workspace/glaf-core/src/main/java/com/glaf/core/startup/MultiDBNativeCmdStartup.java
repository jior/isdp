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

package com.glaf.core.startup;

import java.sql.*;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.glaf.core.config.DBConfiguration;
import com.glaf.core.config.Environment;
import com.glaf.core.el.ExpressionTools;
import com.glaf.core.jdbc.DBConnectionFactory;
import com.glaf.core.util.StringTools;
import com.glaf.core.util.threads.ThreadFactory;
import com.glaf.core.util.JdbcUtils;

public class MultiDBNativeCmdStartup implements Bootstrap {

	protected final static Log logger = LogFactory
			.getLog(MultiDBNativeCmdStartup.class);

	public void startup(ServletContext context, String text) {
		logger.debug("-----------------MultiDBNativeCmdStartup.startup----------------");
		if (StringUtils.isNotEmpty(text)) {
			JSONObject json = JSON.parseObject(text);
			logger.debug(json.toJSONString());
			String sql = json.getString("sql");
			String dbName = json.getString("dbName");
			String cmd = json.getString("cmd");
			if (StringUtils.isNotEmpty(sql) && StringUtils.isNotEmpty(dbName)
					&& StringUtils.isNotEmpty(cmd)) {
				Properties defaultProps = DBConfiguration
						.getTemplateProperties(Environment.DEFAULT_SYSTEM_NAME);
				Properties props = DBConfiguration
						.getTemplateProperties(dbName);
				logger.debug(dbName + " props:" + props);
				if (props != null
						&& StringUtils.isNotEmpty(props
								.getProperty(DBConfiguration.JDBC_URL))) {
					String old_url = props
							.getProperty(DBConfiguration.JDBC_URL);
					Connection conn = null;
					PreparedStatement stmt = null;
					ResultSet rs = null;
					try {
						conn = DBConnectionFactory.getConnection();
						if (conn != null) {
							DBNativeCmdThread t = new DBNativeCmdThread(cmd,
									defaultProps);
							ThreadFactory.run(t);
							stmt = conn.prepareStatement(sql);
							rs = stmt.executeQuery();
							while (rs.next()) {
								Map<String, Object> dataMap = new java.util.HashMap<String, Object>();
								Enumeration<?> e = props.keys();
								while (e.hasMoreElements()) {
									String key = (String) e.nextElement();
									String value = props.getProperty(key);
									dataMap.put(key, value);
								}
								String host = rs.getString(1);
								String databaseName = rs.getString(2);
								String user = rs.getString(3);
								String password = rs.getString(4);
								String name = rs.getString(5);
								if (databaseName.indexOf("$") != -1) {
									String url_xy = defaultProps
											.getProperty(DBConfiguration.JDBC_URL);
									String driver = defaultProps
											.getProperty(DBConfiguration.JDBC_DRIVER);
									String db = null;
									if (StringUtils
											.equals(driver,
													"com.microsoft.sqlserver.jdbc.SQLServerDriver")) {
										db = url_xy.substring(
												url_xy.lastIndexOf("=") + 1,
												url_xy.length());
									} else if (StringUtils.equals(driver,
											"net.sourceforge.jtds.jdbc.Driver")) {
										db = url_xy.substring(
												url_xy.lastIndexOf("/") + 1,
												url_xy.length());
									}
									if (db != null) {
										databaseName = StringTools
												.replaceIgnoreCase(
														databaseName, "self",
														db);
									}
								}
								logger.debug("databaseName:" + databaseName);
								dataMap.put(DBConfiguration.HOST, host);
								dataMap.put(DBConfiguration.DATABASE,
										databaseName);
								props.put(DBConfiguration.JDBC_USER,
										rs.getString(3));
								props.put(DBConfiguration.JDBC_PASSWORD,
										rs.getString(4));
								props.put(DBConfiguration.HOST, host);
								props.put(DBConfiguration.DATABASE,
										databaseName);
								props.put(DBConfiguration.JDBC_USER, user);
								props.put(DBConfiguration.JDBC_PASSWORD,
										password);

								logger.debug(dataMap);
								String url = ExpressionTools.evaluate(old_url,
										dataMap);
								props.put(DBConfiguration.JDBC_URL, url);
								host = StringTools.replace(host, ".", "_");
								props.put(DBConfiguration.JDBC_NAME, name);

								/**
								 * 检查连接信息，如果正确，保存配置
								 */
								if (DBConnectionFactory.checkConnection(props)) {
									logger.debug("准备执行更新脚本......");
									DBNativeCmdThread thread = new DBNativeCmdThread(
											cmd, props);
									ThreadFactory.run(thread);
								}
							}
						}
					} catch (Exception ex) {
						ex.printStackTrace();
						logger.error(ex);
					} finally {
						JdbcUtils.close(rs);
						JdbcUtils.close(stmt);
						JdbcUtils.close(conn);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=pMagic2013";
		System.out
				.println(url.substring(url.lastIndexOf("=") + 1, url.length()));
		url = "jdbc:jtds:sqlserver://127.0.0.1:1433/pMagic2013";
		System.out
				.println(url.substring(url.lastIndexOf("/") + 1, url.length()));
	}

}
