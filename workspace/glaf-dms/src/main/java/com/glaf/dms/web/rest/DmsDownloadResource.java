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

package com.glaf.dms.web.rest;

import java.io.InputStream;
import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glaf.core.config.Configuration;
import com.glaf.core.jdbc.DBConnectionFactory;

import com.glaf.core.util.IOUtils;
import com.glaf.core.util.JdbcUtils;
import com.glaf.core.util.LogUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;
import com.glaf.dms.config.DmsConfiguration;

/**
 * 
 * /rs/dms/download/file?fileId=20100410/lmy-0000001
 * 
 */
@Controller
@Path("/rs/dms/download")
public class DmsDownloadResource {
	protected final static Log logger = LogFactory
			.getLog(DmsDownloadResource.class);

	protected static Configuration cfg = DmsConfiguration.create();

	@GET
	@POST
	@Path("file")
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	@ResponseBody
	public void file(@Context HttpServletRequest request,
			@Context HttpServletResponse response) {
		String fileId = request.getParameter("fileId");
		String filename = request.getParameter("filename");
		String systemName = RequestUtils.getSystemName(request);
		fileId = RequestUtils.decodeString(fileId);
		logger.debug("fileId:" + fileId);
		logger.debug("filename:" + filename);
		String sql = "select FILE_CONTENT from fileatt where FILEID = ? ";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		InputStream inputStream = null;
		try {
			conn = DBConnectionFactory.getConnection(systemName);
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, fileId);
			rs = stmt.executeQuery();
			if (rs.next()) {
				inputStream = rs.getBinaryStream(1);
				if (inputStream != null) {
					ResponseUtils.download(request, response, inputStream,
							filename);
				}
			}
			rs.close();
			stmt.close();
			rs = null;
			stmt = null;
		} catch (Exception ex) {
			LogUtils.error(ex);
		} finally {
			JdbcUtils.close(conn);
			IOUtils.closeStream(inputStream);
			inputStream = null;
		}
	}

}
