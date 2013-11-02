package com.glaf.isdp.render;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.core.context.ContextFactory;

public class RenderBeanFactory {
	protected static final Log logger = LogFactory
			.getLog(RenderBeanFactory.class);

	public static Object getBean(String name) {
		return ContextFactory.getBean(name);
	}

	public static Renderer getRenderer(String name) {
		Object bean = getBean(name);
		if (bean != null && bean instanceof Renderer) {
			return (Renderer) bean;
		}
		return null;
	}

}
