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

package com.glaf.dms.export;

import java.util.*;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.glaf.core.config.SystemProperties;
import com.glaf.core.context.ContextFactory;

import com.glaf.core.service.EntityService;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.Dom4jUtils;
import com.glaf.core.util.FileUtils;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.StringTools;

import com.glaf.dms.domain.DmsFileatt;

import com.glaf.dms.domain.DmsVolume;
import com.glaf.dms.query.DmsVolumeQuery;

/**
 * 导出XML
 */
public class VolumeXmlExport {
	protected final static Log logger = LogFactory
			.getLog(VolumeXmlExport.class);

	private static EntityService entityService;

	public static void main(String[] args) throws Exception {
		System.out.println(SystemProperties.getConfigRootPath());
		VolumeXmlExport export = new VolumeXmlExport();
		// export.exportExcel("c:\\tmp\\xls", new FileInputStream(
		// "./war/WEB-INF/dms/xls/volume.xls"), 12);
		export.doVolumeExport("c:\\tmp\\xml", 15, 1,
				"1.1.4 水土保持方案报告书、合同（协议）、评审及报批文件");
		// export.exportXml("c:\\tmp\\xml", 1);
	}

	protected String convertEncoding(String s) {
		String s1 = s;
		try {
			s1 = new String(s.getBytes("GBK"), "8859_1");
		} catch (Exception exception) {
		}
		return s1;
	}

	public void doVolumeExport(String rootDir, int topid, int diskNo,
			String index_name) throws Exception {
		DmsVolumeQuery q = new DmsVolumeQuery();
		q.setTopid(topid);
		if (diskNo > 0) {
			q.setPublishdiskid(diskNo);
		}
		logger.debug("query:" + q);
		List<Object> vlist2 = getEntityService().getList("selectMyVolumes", q);
		logger.debug("volumes :" + vlist2);

		if (vlist2 != null && !vlist2.isEmpty()) {
			logger.debug("volume size:" + vlist2.size());

			for (Object object : vlist2) {
				DmsVolume m = (DmsVolume) object;
				String vnum = m.getVnum();
				Document doc = this.writeVolumeXml(m, false);
				String filename = rootDir
						+ FileUtils.sp
						+ StringTools.replace(index_name, " ", "")
						+ FileUtils.sp
						+ StringTools.replace(vnum, " ", "")
						+ FileUtils.replaceWin32FileName(StringTools.replace(
								m.getVname(), " ", "")) + ".xml";
				filename = StringTools.replace(filename, "　", "");
				byte[] bytes = Dom4jUtils
						.getBytesFromPrettyDocument(doc, "GBK");
				FileUtils.save(filename, bytes);
				logger.debug("save file:" + filename);
			}
		}
	}

	public EntityService getEntityService() {
		if (entityService == null) {
			entityService = ContextFactory.getBean("entityService");
		}
		return entityService;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Document writeVolumeXml(DmsVolume m, boolean includeElasticFiles) {
		Document doc = DocumentHelper.createDocument();

		Element M201 = doc.addElement("电子文件封装包");
		Element M202 = M201.addElement("封装包格式描述");
		M202.setText("参考电子文件封装包相关规范");
		Element M203 = M201.addElement("版本");
		M203.setText("5.0");
		Element M204 = M201.addElement("被签名对象 ");
		Element M209 = M204.addElement("封装内容");
		Element M210 = M209.addElement("文件实体块");
		Element M211 = M210.addElement("文件实体");
		Element M8 = M211.addElement("档号");
		M8.addAttribute("编号 ", m.getVnum());
		M8.addAttribute("分类码 ", m.getTopid() + "");
		if (m.getEndday() != null) {
			Element M11 = M8.addElement("年度");
			M11.setText(DateUtils.getDate(m.getEndday()));
		}
		if (m.getSavetime() != null) {
			Element M12 = M8.addElement("年度");
			M12.setText(m.getSavetime());
		}

		Element M21 = M211.addElement("内容描述");
		Element M22 = M21.addElement("题名");
		M22.setText(m.getVname());

		if (m.getThematic() != null) {
			Element M26 = M21.addElement("主题词");
			M26.setText(m.getThematic());
		}

		if (m.getWdate() != null) {
			Element M33 = M21.addElement("日期");
			M33.setText(DateUtils.getDate(m.getWdate()));
		}

		if (m.getSlevel() != null) {
			Element M38 = M21.addElement("密级");
			M38.setText(m.getSlevel());
		}

		Element M213 = M21.addElement("文件数据");

		List<Object> fileAtts = (List<Object>) getEntityService().getList(
				"selectFileAtts", m.getId());

		if (fileAtts != null && !fileAtts.isEmpty()) {
			for (Object object : fileAtts) {
				Map dataMap = (Map) object;
				String fileId = ParamUtils.getString(dataMap, "fileId");
				String fileName = ParamUtils.getString(dataMap, "filename");
				String fileExt = FileUtils.getFileExt(fileName);

				if (StringUtils.isNotEmpty(fileId)
						&& StringUtils.isNotEmpty(fileName)
						&& StringUtils.isNotEmpty(fileExt)) {
					Element M214 = M213.addElement("文档");

					Element M22x = M214.addElement("题名");
					M22x.setText(ParamUtils.getString(dataMap, "name"));

					Element M215 = M214.addElement("文档标识符");
					M215.setText(ParamUtils.getString(dataMap, "fileId"));

					Element M217 = M214.addElement("文档数据");
					Element M218 = M217.addElement("编码");
					Element M46 = M218.addElement("电子属性");
					Element M47 = M46.addElement("格式信息");
					M47.setText(fileExt);

					if (includeElasticFiles) {
						DmsFileatt att = (DmsFileatt) getEntityService()
								.getById("selectFileAttByFileId", fileId);
						if (att != null && att.getFileContent() != null) {
							Element M219 = M46.addElement("编码描述");
							M219.setText("使用Base64进行编码");
							Element M221 = M46.addElement("编码数据");
							M221.setText(Base64.encodeBase64String(att
									.getFileContent()));

							Element M2222 = M46.addElement("SHA512Hex");
							M2222.setText(org.apache.commons.codec.digest.DigestUtils
									.sha512Hex(att.getFileContent()));
							Element M2223 = M46.addElement("MD5Hex");
							M2223.setText(org.apache.commons.codec.digest.DigestUtils
									.md5Hex(att.getFileContent()));
						}
					} else {
						Element M48 = M46.addElement("计算机文件名");
						String filePath = "files/" + m.getVid() + "/"
								+ fileId.replace('/', '_') + "." + fileExt;
						M48.setText(filePath);
					}

					Element M49 = M46.addElement("计算机文件大小");
					M49.setText(ParamUtils.getString(dataMap, "filesize"));
				}
			}
		}
		return doc;
	}

	public Document writeVolumeXml(String id, boolean includeElasticFiles) {
		DmsVolume m = (DmsVolume) getEntityService().getById(
				"selectVolumeByVolumeId", id);
		Document doc = this.writeVolumeXml(m, includeElasticFiles);
		return doc;
	}

}
