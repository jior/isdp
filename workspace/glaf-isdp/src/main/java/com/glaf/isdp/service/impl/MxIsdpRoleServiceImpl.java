package com.glaf.isdp.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.Role;
import com.glaf.isdp.mapper.IsdpRoleMapper;
import com.glaf.isdp.query.RoleQuery;
import com.glaf.isdp.service.IsdpRoleService;

@Service("isdpRoleService")
@Transactional(readOnly = true)
public class MxIsdpRoleServiceImpl implements IsdpRoleService {
	protected static final Log logger = LogFactory
			.getLog(MxIsdpRoleServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpRoleMapper isdpRoleMapper;

	public MxIsdpRoleServiceImpl() {

	}

	public int count(RoleQuery query) {
		query.ensureInitialized();
		return isdpRoleMapper.getIsdpRoleCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpRoleMapper.deleteIsdpRoleById(id);
	}

	public Role getRole(String id) {
		Role role = isdpRoleMapper.getIsdpRoleById(id);
		return role;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getRoleCount(Map<String, Object> parameter) {
		return isdpRoleMapper.getIsdpRoleCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getRoleCountByQueryCriteria(RoleQuery query) {
		return isdpRoleMapper.getIsdpRoleCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<Role> getRoles(Map<String, Object> parameter) {
		return isdpRoleMapper.getIsdpRoles(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<Role> getRolesByQueryCriteria(int start, int pageSize,
			RoleQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<Role> rows = sqlSession.selectList("getIsdpRoles", query,
				rowBounds);
		return rows;
	}

	public List<Role> list(RoleQuery query) {
		query.ensureInitialized();
		List<Role> list = isdpRoleMapper
				.getIsdpRolesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(Role role) {
		if (StringUtils.isEmpty(role.getId())) {
			role.setId(idGenerator.getNextId());
			// role.setID(idGenerator.getNextId());
			// role.setCreateDate(new Date());
			isdpRoleMapper.insertIsdpRole(role);
		} else {
			Role model = this.getRole(role.getId());
			if (model != null) {
				if (role.getRoleName() != null) {
					model.setRoleName(role.getRoleName());
				}
				if (role.getRoletype() != null) {
					model.setRoletype(role.getRoletype());
				}
				if (role.getContent() != null) {
					model.setContent(role.getContent());
				}
				if (role.getAlldata() != null) {
					model.setAlldata(role.getAlldata());
				}
				isdpRoleMapper.updateIsdpRole(model);
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
	public void setIsdpRoleMapper(IsdpRoleMapper isdpRoleMapper) {
		this.isdpRoleMapper = isdpRoleMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
