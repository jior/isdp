package com.glaf.isdp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.mapper.NetRoleMapper;
import com.glaf.isdp.query.NetRoleQuery;
import com.glaf.isdp.service.INetRoleService;

@Service("netRoleService")
@Transactional(readOnly = true)
public class MxNetRoleServiceImpl implements INetRoleService {
	protected static final Log logger = LogFactory
			.getLog(MxNetRoleServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected NetRoleMapper netRoleMapper;

	public MxNetRoleServiceImpl() {

	}

	public int count(NetRoleQuery query) {
		query.ensureInitialized();
		return netRoleMapper.getNetRoleCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(int id) {
		netRoleMapper.deleteNetRoleById(id);
	}

	public NetRole getNetRole(int id) {
		NetRole netRole = netRoleMapper.getNetRoleById(id);
		return netRole;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getNetRoleCount(Map<String, Object> parameter) {
		return netRoleMapper.getNetRoleCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getNetRoleCountByQueryCriteria(NetRoleQuery query) {
		return netRoleMapper.getNetRoleCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<NetRole> getNetRoles(Map<String, Object> parameter) {
		return netRoleMapper.getNetRoles(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<NetRole> getNetRolesByQueryCriteria(int start, int pageSize,
			NetRoleQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<NetRole> rows = sqlSession.selectList(
				"getNetRolesByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 获取用户的角色信息
	 * 
	 * @param userId
	 * @return
	 */
	public List<NetRole> getNetRolesByUserId(String userId) {
		return netRoleMapper.getNetRolesByUserId(userId);
	}

	public Map<Integer, NetRole> getRoleMap() {
		Map<Integer, NetRole> roleMap = new HashMap<Integer, NetRole>();
		NetRoleQuery query = new NetRoleQuery();
		List<NetRole> roles = this.list(query);
		if (roles != null && !roles.isEmpty()) {
			for (NetRole r : roles) {
				roleMap.put(r.getId(), r);
			}
		}
		return roleMap;
	}

	public List<NetRole> list(NetRoleQuery query) {
		query.ensureInitialized();
		List<NetRole> list = netRoleMapper
				.getNetRolesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(NetRole netRole) {
		if (netRole.getId() == 0) {
			netRole.setId(idGenerator.nextId().intValue());
			// netRole.setId(idGenerator.getNextId());
			// netRole.setCreateDate(new Date());
			netRoleMapper.insertNetRole(netRole);
		} else {
			NetRole model = this.getNetRole(netRole.getId());
			if (model != null) {
				model.setListno(netRole.getListno());
				if (netRole.getRolename() != null) {
					model.setRolename(netRole.getRolename());
				}
				model.setRoleuse(netRole.getRoleuse());
				if (netRole.getContent() != null) {
					model.setContent(netRole.getContent());
				}
				model.setRoletype(netRole.getRoletype());
				if (netRole.getBusiessId() != null) {
					model.setBusiessId(netRole.getBusiessId());
				}
				model.setTasksort(netRole.getTasksort());
				model.setDomainIndex(netRole.getDomainIndex());
				netRoleMapper.updateNetRole(model);
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
	public void setNetRoleMapper(NetRoleMapper netRoleMapper) {
		this.netRoleMapper = netRoleMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
