package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.*;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("roleUse2Service")
@Transactional(readOnly = true)
public class MxRoleUse2ServiceImpl implements IRoleUse2Service {
	protected static final Log logger = LogFactory
			.getLog(MxRoleUse2ServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected RoleUse2Mapper roleUse2Mapper;

	public MxRoleUse2ServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		roleUse2Mapper.deleteRoleUse2ById(id);
	}

	public int count(RoleUse2Query query) {
		query.ensureInitialized();
		return roleUse2Mapper.getRoleUse2CountByQueryCriteria(query);
	}

	public List<RoleUse2> list(RoleUse2Query query) {
		query.ensureInitialized();
		List<RoleUse2> list = roleUse2Mapper
				.getRoleUse2sByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getRoleUse2Count(Map<String, Object> parameter) {
		return roleUse2Mapper.getRoleUse2Count(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getRoleUse2CountByQueryCriteria(RoleUse2Query query) {
		return roleUse2Mapper.getRoleUse2CountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<RoleUse2> getRoleUse2sByQueryCriteria(int start, int pageSize,
			RoleUse2Query query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<RoleUse2> rows = sqlSession.selectList(
				"getRoleUse2sByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<RoleUse2> getRoleUse2s(Map<String, Object> parameter) {
		return roleUse2Mapper.getRoleUse2s(parameter);
	}

	public RoleUse2 getRoleUse2(String id) {
		RoleUse2 roleUse2 = roleUse2Mapper.getRoleUse2ById(id);
		return roleUse2;
	}

	@Transactional
	public void save(RoleUse2 roleUse2) {
		if (StringUtils.isEmpty(roleUse2.getId())) {
			roleUse2.setId(idGenerator.getNextId());
			// roleUse2.setId(idGenerator.getNextId());
			// roleUse2.setCreateDate(new Date());
			roleUse2Mapper.insertRoleUse2(roleUse2);
		} else {
			RoleUse2 model = this.getRoleUse2(roleUse2.getId());
			if (model != null) {
				if (roleUse2.getRoleId() != null) {
					model.setRoleId(roleUse2.getRoleId());
				}
				if (roleUse2.getUseType() != null) {
					model.setUseType(roleUse2.getUseType());
				}
				model.setPid(roleUse2.getPid());
				model.setTreeType(roleUse2.getTreeType());
				if (roleUse2.getUserchk() != null) {
					model.setUserchk(roleUse2.getUserchk());
				}
				if (roleUse2.getTreeId() != null) {
					model.setTreeId(roleUse2.getTreeId());
				}
				roleUse2Mapper.updateRoleUse2(model);
			}
		}
	}
 
	@javax.annotation.Resource(name="myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name="myBatisDbIdGenerator")
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setRoleUse2Mapper(RoleUse2Mapper roleUse2Mapper) {
		this.roleUse2Mapper = roleUse2Mapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
