package com.glaf.isdp.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.mapper.IsdpIdmMapper;
import com.glaf.isdp.mapper.IsdpTaskMapper;
import com.glaf.isdp.service.IsdpTaskService;

@Service("isdpTaskService")
@Transactional(readOnly = true)
public class MxIsdpTaskServiceImpl implements IsdpTaskService {
	protected static final Log logger = LogFactory
			.getLog(MxIsdpTaskServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IsdpTaskMapper isdpTaskMapper;

	protected IsdpIdmMapper isdpIdmMapper;

	public MxIsdpTaskServiceImpl() {

	}

	public List<Map<String, Object>> getAllTaskList(String actorId,
			Map<String, Object> params) {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		return isdpTaskMapper.getAllTaskList(params);
	}

	public int getAllTaskListCount(String actorId, Map<String, Object> params) {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		return isdpTaskMapper.getAllTaskListCount(params);
	}

	public List<Map<String, Object>> getFallbackTaskList(String actorId,
			Map<String, Object> params) {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		return isdpTaskMapper.getFallbackTaskList(params);
	}

	public int getFallbackTaskListCount(String actorId,
			Map<String, Object> params) {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		return isdpTaskMapper.getFallbackTaskListCount(params);
	}

	public List<Map<String, Object>> getTodoTaskList(String actorId,
			Map<String, Object> params) {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		return isdpTaskMapper.getTodoTaskList(params);
	}

	public int getTodoTaskListCount(String actorId, Map<String, Object> params) {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		return isdpTaskMapper.getTodoTaskListCount(params);
	}

	public List<Integer> getUserNetRoleIds(String actorId) {
		List<Integer> roleIds = new ArrayList<Integer>();
		List<NetRole> roles = this.getUserNetRoleList(actorId);
		if (roles != null && !roles.isEmpty()) {
			for (NetRole r : roles) {
				roleIds.add(r.getId());
			}
		}
		logger.debug("==actorId==" + actorId);
		logger.debug("==roleIds==" + roleIds);
		return roleIds;
	}

	public List<NetRole> getUserNetRoleList(String actorId) {
		return isdpIdmMapper.getUserNetRoleList(actorId);
	}

	public List<Map<String, Object>> getWorkedTaskList(String actorId,
			Map<String, Object> params) {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		return isdpTaskMapper.getWorkedTaskList(params);
	}

	public int getWorkedTaskListCount(String actorId, Map<String, Object> params) {
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		params.put("actorId", actorId);
		params.put("roleIds", this.getUserNetRoleIds(actorId));
		return isdpTaskMapper.getWorkedTaskListCount(params);
	}

 
	@javax.annotation.Resource(name="myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@Resource
	public void setIsdpIdmMapper(IsdpIdmMapper isdpIdmMapper) {
		this.isdpIdmMapper = isdpIdmMapper;
	}

	@Resource
	public void setIsdpTaskMapper(IsdpTaskMapper isdpTaskMapper) {
		this.isdpTaskMapper = isdpTaskMapper;
	}

}
