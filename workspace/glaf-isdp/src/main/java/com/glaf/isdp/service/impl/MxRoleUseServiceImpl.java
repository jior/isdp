package com.glaf.isdp.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.RoleUse;
import com.glaf.isdp.mapper.RoleUseMapper;
import com.glaf.isdp.query.RoleUseQuery;
import com.glaf.isdp.service.IRoleUseService;

@Service("roleUseService")
@Transactional(readOnly = true)
public class MxRoleUseServiceImpl implements IRoleUseService {
	protected static final Log logger = LogFactory
			.getLog(MxRoleUseServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected RoleUseMapper roleUseMapper;

	public MxRoleUseServiceImpl() {

	}

	public int count(RoleUseQuery query) {
		query.ensureInitialized();
		return roleUseMapper.getRoleUseCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		roleUseMapper.deleteRoleUseById(id);
	}

	public RoleUse getRoleUse(String id) {
		RoleUse roleUse = roleUseMapper.getRoleUseById(id);
		return roleUse;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getRoleUseCount(Map<String, Object> parameter) {
		return roleUseMapper.getRoleUseCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getRoleUseCountByQueryCriteria(RoleUseQuery query) {
		return roleUseMapper.getRoleUseCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<RoleUse> getRoleUses(Map<String, Object> parameter) {
		return roleUseMapper.getRoleUses(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<RoleUse> getRoleUsesByQueryCriteria(int start, int pageSize,
			RoleUseQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<RoleUse> rows = sqlSession.selectList(
				"getRoleUsesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<RoleUse> list(RoleUseQuery query) {
		query.ensureInitialized();
		List<RoleUse> list = roleUseMapper
				.getRoleUsesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(RoleUse roleUse) {
		if (StringUtils.isEmpty(roleUse.getId())) {
			roleUse.setId(idGenerator.getNextId());
			// roleUse.setId(idGenerator.getNextId());
			// roleUse.setCreateDate(new Date());
			roleUseMapper.insertRoleUse(roleUse);
		} else {
			RoleUse model = this.getRoleUse(roleUse.getId());
			if (model != null) {
				if (roleUse.getRoleId() != null) {
					model.setRoleId(roleUse.getRoleId());
				}
				if (roleUse.getUsetype() != null) {
					model.setUsetype(roleUse.getUsetype());
				}
				model.setPid(roleUse.getPid());
				roleUseMapper.updateRoleUse(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setRoleUseMapper(RoleUseMapper roleUseMapper) {
		this.roleUseMapper = roleUseMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
