package com.glaf.isdp.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class UserRoleTransferJob implements Job {
	protected static final Log logger = LogFactory
			.getLog(UserRoleTransferJob.class);

	public void execute(JobExecutionContext context)
			throws JobExecutionException {
         
	}

}
