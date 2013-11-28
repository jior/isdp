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
import com.glaf.isdp.domain.NetDotRole;
import com.glaf.isdp.mapper.NetDotRoleMapper;
import com.glaf.isdp.query.NetDotRoleQuery;
import com.glaf.isdp.service.INetDotRoleService;

@Service("netDotRoleService")
@Transactional(readOnly = true)
public class MxNetDotRoleServiceImpl implements INetDotRoleService {
	protected static final Log logger = LogFactory
			.getLog(MxNetDotRoleServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected NetDotRoleMapper netDotRoleMapper;

	public MxNetDotRoleServiceImpl() {

	}

	public int count(NetDotRoleQuery query) {
		query.ensureInitialized();
		return netDotRoleMapper.getNetDotRoleCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		netDotRoleMapper.deleteNetDotRoleById(id);
	}

	public NetDotRole getNetDotRole(String id) {
		NetDotRole netDotRole = netDotRoleMapper.getNetDotRoleById(id);
		return netDotRole;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getNetDotRoleCount(Map<String, Object> parameter) {
		return netDotRoleMapper.getNetDotRoleCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getNetDotRoleCountByQueryCriteria(NetDotRoleQuery query) {
		return netDotRoleMapper.getNetDotRoleCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<NetDotRole> getNetDotRoles(Map<String, Object> parameter) {
		return netDotRoleMapper.getNetDotRoles(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<NetDotRole> getNetDotRolesByQueryCriteria(int start,
			int pageSize, NetDotRoleQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<NetDotRole> rows = sqlSession.selectList(
				"getNetDotRolesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<NetDotRole> list(NetDotRoleQuery query) {
		query.ensureInitialized();
		List<NetDotRole> list = netDotRoleMapper
				.getNetDotRolesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(NetDotRole netDotRole) {
		if (StringUtils.isEmpty(netDotRole.getId())) {
			netDotRole.setId(idGenerator.getNextId());
			// netDotRole.setId(idGenerator.getNextId());
			// netDotRole.setCreateDate(new Date());
			netDotRoleMapper.insertNetDotRole(netDotRole);
		} else {
			NetDotRole model = this.getNetDotRole(netDotRole.getId());
			if (model != null) {
				if (netDotRole.getFiledotFileid() != null) {
					model.setFiledotFileid(netDotRole.getFiledotFileid());
				}
				model.setRoleId(netDotRole.getRoleId());
				model.setListno(netDotRole.getListno());
				netDotRoleMapper.updateNetDotRole(model);
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
	public void setNetDotRoleMapper(
			NetDotRoleMapper netDotRoleMapper) {
		this.netDotRoleMapper = netDotRoleMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
