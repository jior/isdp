package com.glaf.isdp.config;

import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.core.config.Configuration;

/**
 * Adds Base configuration files to a Configuration
 */
public class IsdpBaseConfiguration extends Configuration {

	protected final static Log LOG = LogFactory
			.getLog(IsdpBaseConfiguration.class);

	private IsdpBaseConfiguration() {
		super();
		addCustomResources(this);
	}

	public static Configuration addCustomResources(Configuration conf) {
		conf.addResource("isdp-base-default.xml");
		conf.addResource("isdp-base-site.xml");
		return conf;
	}

	/**
	 * Creates a Configuration with Base resources
	 * 
	 * @return a Configuration with Base resources
	 */
	public static Configuration create() {
		Configuration conf = new Configuration();
		return addCustomResources(conf);
	}

	/**
	 * Creates a clone of passed configuration.
	 * 
	 * @param that
	 *            Configuration to clone.
	 * @return a Configuration created with the platform-base-*.xml files plus
	 *         the given configuration.
	 */
	public static Configuration create(final Configuration that) {
		Configuration conf = create();
		merge(conf, that);
		return conf;
	}

	/**
	 * Merge two configurations.
	 * 
	 * @param destConf
	 *            the configuration that will be overwritten with items from the
	 *            srcConf
	 * @param srcConf
	 *            the source configuration
	 **/
	public static void merge(Configuration destConf, Configuration srcConf) {
		for (Entry<String, String> e : srcConf) {
			destConf.set(e.getKey(), e.getValue());
		}
	}
}
