package com.glaf.fr.reportlet;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fr.main.TemplateWorkBook;
import com.fr.main.impl.WorkBook;
import com.fr.web.core.Reportlet;
import com.fr.web.request.ReportletRequest;
import com.glaf.core.config.DBConfiguration;
import com.glaf.core.config.SystemProperties;
import com.glaf.core.jdbc.DBConnectionFactory;
import com.glaf.core.security.SecurityUtils;
import com.glaf.core.util.JdbcUtils;

public class DatabasePrintReportlet extends Reportlet {
	protected static final Log logger = LogFactory
			.getLog(DatabasePrintReportlet.class);

	protected static ConcurrentMap<String, byte[]> templatesCache = new ConcurrentHashMap<String, byte[]>();

	public TemplateWorkBook createReport(ReportletRequest reportletRequest) {
		String fileId = reportletRequest.getParameter("printFileId").toString();
		if (templatesCache.containsKey(fileId)) {
			byte[] bytes = templatesCache.get(fileId);
			WorkBook workbook = new WorkBook();
			try {
				workbook.readStream(new BufferedInputStream(
						new ByteArrayInputStream(bytes)));
				logger.debug("read bytes from cache");
				return workbook;
			} catch (Exception ex) {
			}
		}

		WorkBook workbook = new WorkBook();
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			if (reportletRequest.getParameter("datasourceJson") != null) {
				String datasourceJson = reportletRequest.getParameter(
						"datasourceJson").toString();
				String key = SystemProperties.getDefaultSecurityKey();
				datasourceJson = SecurityUtils.decode(key, datasourceJson);
				JSONObject jsonObject = JSON.parseObject(datasourceJson);
				// 定义数据连接
				java.util.Properties props = new java.util.Properties();
				String name = jsonObject.getString(DBConfiguration.JDBC_NAME);
				String driver = jsonObject
						.getString(DBConfiguration.JDBC_DRIVER);
				String url = jsonObject.getString(DBConfiguration.JDBC_URL);
				String user = jsonObject.getString(DBConfiguration.JDBC_USER);
				String password = jsonObject
						.getString(DBConfiguration.JDBC_PASSWORD);

				Set<String> keySet = jsonObject.keySet();
				for (String x : keySet) {
					props.setProperty(x, jsonObject.getString(x));
				}

				props.setProperty(DBConfiguration.JDBC_NAME, name);
				props.setProperty(DBConfiguration.JDBC_DRIVER, driver);
				props.setProperty(DBConfiguration.JDBC_URL, url);
				props.setProperty(DBConfiguration.JDBC_USER, user);
				props.setProperty(DBConfiguration.JDBC_PASSWORD, password);
				conn = DBConnectionFactory.getConnection(props);
			} else {
				conn = DBConnectionFactory.getConnection();
			}
			// 从数据库中读模板
			String sql = "select DATA_ from SYS_LOB where FILEID_ = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, fileId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				byte[] bytes = rs.getBytes(1);
				templatesCache.put(fileId, bytes);
				workbook.readStream(new BufferedInputStream(
						new ByteArrayInputStream(bytes)));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			JdbcUtils.close(rs);
			JdbcUtils.close(psmt);
			JdbcUtils.close(conn);
		}
		return workbook;
	}

	@SuppressWarnings("rawtypes")
	public void setParameterMap(Map arg0) {

	}

	public void setTplPath(String arg0) {

	}

}