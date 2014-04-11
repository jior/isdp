package com.glaf.isdp.render;

import org.apache.commons.lang3.StringUtils;

import com.glaf.core.config.Configuration;
import com.glaf.isdp.config.IsdpBaseConfiguration;

public class RenderContainer {

	private final static RenderContainer container = new RenderContainer();

	private static final Configuration conf = IsdpBaseConfiguration.create();

	private RenderContainer() {

	}

	public static RenderContainer getContainer() {
		return container;
	}

	public Renderer getRenderer(String name) {
		String beanFactory = conf.get("isdp.render.beanFactory", "spring");
		if (StringUtils.equals(beanFactory, "spring")) {
			return RenderBeanFactory.getRenderer(name);
		}
		return RenderBeanFactory.getRenderer(name);
	}

}
