package com.glaf.isdp.config;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.util.IOUtils;
import com.glaf.core.config.SystemProperties;
import com.glaf.template.Template;
import com.glaf.template.TemplateXmlReader;
import com.glaf.core.util.FileUtils;

public class IsdpTemplateConfig {
	protected final static Log LOG = LogFactory.getLog(IsdpTemplateConfig.class);

	private static final String DEFAULT_CONFIG = "/config/isdp/templates.xml";

	private static final Map<String, Template> templates = new java.util.concurrent.ConcurrentHashMap<String, Template>();

	static {
		reload();
	}

	public static String getContent(String key) {
		Template tpl = getTemplate(key);
		if (tpl != null) {
			if (StringUtils.isNotEmpty(tpl.getContent())) {
				return tpl.getContent();
			}
			if (tpl.getData() != null) {
				return new String(tpl.getData());
			}
		}
		return null;
	}

	public static Template getTemplate(String key) {
		if (templates != null && templates.containsKey(key)) {
			return templates.get(key);
		}
		return null;
	}

	public static void reload() {
		LOG.debug("---------------IsdpTemplateConfig.reload()----------");
		String configDir = SystemProperties.getConfigRootPath()
				+ "/config/isdp/templates";
		try {
			java.io.File dir = new java.io.File(configDir);
			if (dir.exists()) {
				File[] entries = dir.listFiles();
				for (int i = 0; i < entries.length; i++) {
					File file = entries[i];
					String filename = file.getName();
					if (StringUtils.endsWithIgnoreCase(filename, ".ftl")) {
						String key = filename.substring(0,
								filename.length() - 4);
						byte[] bytes = FileUtils.getBytes(file);
						Template tpl = new Template();
						tpl.setContent(new String(bytes));
						tpl.setName(key);
						templates.put(key, tpl);
						LOG.debug(key + " put into cache.");
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		InputStream inputStream = null;
		String filename = SystemProperties.getConfigRootPath() + DEFAULT_CONFIG;
		try {
			inputStream = FileUtils.getInputStream(filename);
			if (inputStream != null) {
				TemplateXmlReader reader = new TemplateXmlReader();
				Map<String, Template> tplMap = reader.getTemplates(inputStream);
				if (tplMap != null && !tplMap.isEmpty()) {
					Set<Entry<String, Template>> entrySet = tplMap.entrySet();
					for (Entry<String, Template> entry : entrySet) {
						String name = entry.getKey();
						Template tpl = entry.getValue();
						if (tpl != null
								&& (tpl.getContent() != null || tpl.getData() != null)) {
							templates.put(name, tpl);
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			IOUtils.close(inputStream);
			inputStream = null;
		}
	}

	private IsdpTemplateConfig() {

	}

}
