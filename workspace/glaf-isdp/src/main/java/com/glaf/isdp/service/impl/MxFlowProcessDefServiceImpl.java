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

import com.glaf.core.config.Environment;
import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.util.DBUtils;
import com.glaf.isdp.domain.FlowProcessDef;
import com.glaf.isdp.mapper.FlowProcessDefMapper;
import com.glaf.isdp.query.FlowProcessDefQuery;
import com.glaf.isdp.service.IFlowProcessDefService;

@Service("flowProcessDefService")
@Transactional(readOnly = true)
public class MxFlowProcessDefServiceImpl implements IFlowProcessDefService {
	protected static final Log logger = LogFactory
			.getLog(MxFlowProcessDefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowProcessDefMapper flowProcessDefMapper;

	public MxFlowProcessDefServiceImpl() {

	}

	public int count(FlowProcessDefQuery query) {
		query.ensureInitialized();
		return flowProcessDefMapper
				.getFlowProcessDefCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowProcessDefMapper.deleteFlowProcessDefById(id);
	}

	public FlowProcessDef getFlowProcessDef(String id) {
		FlowProcessDef flowProcessDef = null;
		if (StringUtils
				.equals(DBUtils.POSTGRESQL, Environment.getCurrentDatabaseType())) {
			flowProcessDef = flowProcessDefMapper
					.getFlowProcessDefById_postgres(id);
		} else {
			flowProcessDef = flowProcessDefMapper
					.getFlowProcessDefById(id);
		}
		return flowProcessDef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowProcessDefCount(Map<String, Object> parameter) {
		return flowProcessDefMapper.getFlowProcessDefCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowProcessDefCountByQueryCriteria(FlowProcessDefQuery query) {
		return flowProcessDefMapper
				.getFlowProcessDefCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowProcessDef> getFlowProcessDefs(Map<String, Object> parameter) {
		return flowProcessDefMapper.getFlowProcessDefs(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<FlowProcessDef> getFlowProcessDefsByQueryCriteria(int start,
			int pageSize, FlowProcessDefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowProcessDef> rows = sqlSession.selectList(
				"getFlowProcessDefsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowProcessDef> list(FlowProcessDefQuery query) {
		query.ensureInitialized();
		List<FlowProcessDef> list = flowProcessDefMapper
				.getFlowProcessDefsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowProcessDef flowProcessDef) {
		if (StringUtils.isEmpty(flowProcessDef.getId())) {
			flowProcessDef.setId(idGenerator.getNextId());
			// flowProcessDef.setId(idGenerator.getNextId());
			// flowProcessDef.setCreateDate(new Date());
			flowProcessDefMapper.insertFlowProcessDef(flowProcessDef);
		} else {
			FlowProcessDef model = this.getFlowProcessDef(flowProcessDef
					.getId());
			if (model != null) {
				if (flowProcessDef.getMainId() != null) {
					model.setMainId(flowProcessDef.getMainId());
				}
				if (flowProcessDef.getFileid() != null) {
					model.setFileid(flowProcessDef.getFileid());
				}
				if (flowProcessDef.getName() != null) {
					model.setName(flowProcessDef.getName());
				}
				if (flowProcessDef.getContent() != null) {
					model.setContent(flowProcessDef.getContent());
				}
				if (flowProcessDef.getActor() != null) {
					model.setActor(flowProcessDef.getActor());
				}
				if (flowProcessDef.getCtime() != null) {
					model.setCtime(flowProcessDef.getCtime());
				}
				if (flowProcessDef.getVersion() != null) {
					model.setVersion(flowProcessDef.getVersion());
				}
				model.setTcadfile(flowProcessDef.getTcadfile());
				model.setIssave(flowProcessDef.getIssave());
				model.setIntflag(flowProcessDef.getIntflag());
				flowProcessDefMapper.updateFlowProcessDef(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowProcessDefMapper(
			FlowProcessDefMapper flowProcessDefMapper) {
		this.flowProcessDefMapper = flowProcessDefMapper;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
