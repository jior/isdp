package com.glaf.isdp.service.impl;

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
import com.glaf.isdp.domain.NetRoleUse;
import com.glaf.isdp.mapper.NetRoleUseMapper;
import com.glaf.isdp.query.NetRoleUseQuery;
import com.glaf.isdp.service.INetRoleUseService;

@Service("netRoleUseService")
@Transactional(readOnly = true)
public class MxNetRoleUseServiceImpl implements INetRoleUseService {
	protected static final Log logger = LogFactory
			.getLog(MxNetRoleUseServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected NetRoleUseMapper netRoleUseMapper;

	public MxNetRoleUseServiceImpl() {

	}

	public int count(NetRoleUseQuery query) {
		query.ensureInitialized();
		return netRoleUseMapper.getNetRoleUseCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(int id) {
		netRoleUseMapper.deleteNetRoleUseById(id);
	}

	public NetRoleUse getNetRoleUse(int id) {
		NetRoleUse netRoleUse = netRoleUseMapper.getNetRoleUseById(id);
		return netRoleUse;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getNetRoleUseCount(Map<String, Object> parameter) {
		return netRoleUseMapper.getNetRoleUseCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getNetRoleUseCountByQueryCriteria(NetRoleUseQuery query) {
		return netRoleUseMapper.getNetRoleUseCountByQueryCriteria(query);
	}

	/**
	 * 获取某个角色的角色树表引用
	 * 
	 * @param roleId
	 * @return
	 */
	public List<NetRoleUse> getNetRoleUsesByRoleId(int roleId) {
		NetRoleUseQuery query = new NetRoleUseQuery();
		query.roleid(roleId);
		return list(query);
	}

	/**
	 * 获取某个用户的角色引用
	 * 
	 * @param userId
	 * @return
	 */
	public List<NetRoleUse> getNetRoleUsesByUserId(String userId) {
		return netRoleUseMapper.getNetRoleUsesByUserId(userId);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<NetRoleUse> getNetRoleUses(Map<String, Object> parameter) {
		return netRoleUseMapper.getNetRoleUses(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<NetRoleUse> getNetRoleUsesByQueryCriteria(int start,
			int pageSize, NetRoleUseQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<NetRoleUse> rows = sqlSession.selectList(
				"getNetRoleUsesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<NetRoleUse> list(NetRoleUseQuery query) {
		query.ensureInitialized();
		List<NetRoleUse> list = netRoleUseMapper
				.getNetRoleUsesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(NetRoleUse netRoleUse) {
		if (netRoleUse.getId() == 0) {
			netRoleUse.setId(idGenerator.nextId().intValue());
			// netRoleUse.setId(idGenerator.getNextId());
			// netRoleUse.setCreateDate(new Date());
			netRoleUseMapper.insertNetRoleUse(netRoleUse);
		} else {
			NetRoleUse model = this.getNetRoleUse(netRoleUse.getId());
			if (model != null) {
				model.setRoleid(netRoleUse.getRoleid());
				model.setCelltreedotIndex(netRoleUse.getCelltreedotIndex());
				model.setIntuserper(netRoleUse.getIntuserper());
				netRoleUseMapper.updateNetRoleUse(model);
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
	public void setNetRoleUseMapper(
			NetRoleUseMapper netRoleUseMapper) {
		this.netRoleUseMapper = netRoleUseMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
