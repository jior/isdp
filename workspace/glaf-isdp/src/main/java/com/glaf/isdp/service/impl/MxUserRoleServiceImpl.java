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
import com.glaf.isdp.domain.UserRole;
import com.glaf.isdp.mapper.UserRoleMapper;
import com.glaf.isdp.query.UserRoleQuery;
import com.glaf.isdp.service.IUserRoleService;

@Service("userRoleService")
@Transactional(readOnly = true)
public class MxUserRoleServiceImpl implements IUserRoleService {
	protected static final Log logger = LogFactory
			.getLog(MxUserRoleServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected UserRoleMapper userRoleMapper;

	public MxUserRoleServiceImpl() {

	}

	public int count(UserRoleQuery query) {
		query.ensureInitialized();
		return userRoleMapper.getUserRoleCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		userRoleMapper.deleteUserRoleById(id);
	}

	public UserRole getUserRole(String id) {
		UserRole userRole = userRoleMapper.getUserRoleById(id);
		return userRole;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getUserRoleCount(Map<String, Object> parameter) {
		return userRoleMapper.getUserRoleCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getUserRoleCountByQueryCriteria(UserRoleQuery query) {
		return userRoleMapper.getUserRoleCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<UserRole> getUserRoles(Map<String, Object> parameter) {
		return userRoleMapper.getUserRoles(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<UserRole> getUserRolesByQueryCriteria(int start, int pageSize,
			UserRoleQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<UserRole> rows = sqlSession.selectList(
				"getUserRolesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<UserRole> list(UserRoleQuery query) {
		query.ensureInitialized();
		List<UserRole> list = userRoleMapper
				.getUserRolesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(UserRole userRole) {
		if (StringUtils.isEmpty(userRole.getId())) {
			userRole.setId(idGenerator.getNextId());
			// userRole.setID(idGenerator.getNextId());
			// userRole.setCreateDate(new Date());
			userRoleMapper.insertUserRole(userRole);
		} else {
			UserRole model = this.getUserRole(userRole.getId());
			if (model != null) {
				if (userRole.getRoleid() != null) {
					model.setRoleid(userRole.getRoleid());
				}
				if (userRole.getUserid() != null) {
					model.setUserid(userRole.getUserid());
				}
				if (userRole.getRsysid() != null) {
					model.setRsysid(userRole.getRsysid());
				}
				if (userRole.getRuserid() != null) {
					model.setRuserid(userRole.getRuserid());
				}
				userRoleMapper.updateUserRole(model);
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
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setUserRoleMapper(UserRoleMapper userRoleMapper) {
		this.userRoleMapper = userRoleMapper;
	}

}
