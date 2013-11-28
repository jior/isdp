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
import com.glaf.isdp.domain.FlowActivityDef;
import com.glaf.isdp.mapper.FlowActivityDefMapper;
import com.glaf.isdp.query.FlowActivityDefQuery;
import com.glaf.isdp.service.IFlowActivityDefService;

@Service("flowActivityDefService")
@Transactional(readOnly = true)
public class MxFlowActivityDefServiceImpl implements IFlowActivityDefService {
	protected static final Log logger = LogFactory
			.getLog(MxFlowActivityDefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowActivityDefMapper flowActivityDefMapper;

	public MxFlowActivityDefServiceImpl() {

	}

	public int count(FlowActivityDefQuery query) {
		query.ensureInitialized();
		return flowActivityDefMapper
				.getFlowActivityDefCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowActivityDefMapper.deleteFlowActivityDefById(id);
	}

	/**
	 * 根据流程编号获取流程活跃节点的信息(正在运行中的节点信息)
	 * 
	 * @param processId
	 * @return
	 */
	public List<FlowActivityDef> getCurrentActiveFlowActivityDefsByProcessId(
			String processId) {
		return flowActivityDefMapper
				.getCurrentActiveFlowActivityDefsByProcessId(processId);
	}

	public FlowActivityDef getFlowActivityDef(String id) {
		FlowActivityDef flowActivityDef = flowActivityDefMapper
				.getFlowActivityDefById(id);
		return flowActivityDef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowActivityDefCount(Map<String, Object> parameter) {
		return flowActivityDefMapper.getFlowActivityDefCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowActivityDefCountByQueryCriteria(FlowActivityDefQuery query) {
		return flowActivityDefMapper
				.getFlowActivityDefCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowActivityDef> getFlowActivityDefs(
			Map<String, Object> parameter) {
		return flowActivityDefMapper.getFlowActivityDefs(parameter);
	}

	public List<FlowActivityDef> getFlowActivityDefsByMainId(String mainId) {
		return flowActivityDefMapper.getFlowActivityDefsByMainId(mainId);
	}

	public List<FlowActivityDef> getFlowActivityDefsByProcessDefId(
			String processDefId) {
		return flowActivityDefMapper
				.getFlowActivityDefsByProcessDefId(processDefId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<FlowActivityDef> getFlowActivityDefsByQueryCriteria(int start,
			int pageSize, FlowActivityDefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowActivityDef> rows = sqlSession.selectList(
				"getFlowActivityDefsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowActivityDef> list(FlowActivityDefQuery query) {
		query.ensureInitialized();
		List<FlowActivityDef> list = flowActivityDefMapper
				.getFlowActivityDefsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowActivityDef flowActivityDef) {
		if (StringUtils.isEmpty(flowActivityDef.getId())) {
			flowActivityDef.setId(idGenerator.getNextId());
			// flowActivityDef.setId(idGenerator.getNextId());
			// flowActivityDef.setCreateDate(new Date());
			flowActivityDefMapper.insertFlowActivityDef(flowActivityDef);
		} else {
			FlowActivityDef model = this.getFlowActivityDef(flowActivityDef
					.getId());
			if (model != null) {
				if (flowActivityDef.getProcessId() != null) {
					model.setProcessId(flowActivityDef.getProcessId());
				}
				if (flowActivityDef.getTypeofact() != null) {
					model.setTypeofact(flowActivityDef.getTypeofact());
				}
				if (flowActivityDef.getName() != null) {
					model.setName(flowActivityDef.getName());
				}
				if (flowActivityDef.getContent() != null) {
					model.setContent(flowActivityDef.getContent());
				}
				if (flowActivityDef.getStrfuntion() != null) {
					model.setStrfuntion(flowActivityDef.getStrfuntion());
				}
				if (flowActivityDef.getNetroleid() != null) {
					model.setNetroleid(flowActivityDef.getNetroleid());
				}
				model.setListno(flowActivityDef.getListno());
				model.setTimelimit(flowActivityDef.getTimelimit());
				model.setIssave(flowActivityDef.getIssave());
				model.setIsdel(flowActivityDef.getIsdel());
				model.setIntselectuser(flowActivityDef.getIntselectuser());
				model.setIntusedomain(flowActivityDef.getIntusedomain());
				flowActivityDefMapper.updateFlowActivityDef(model);
			}
		}
	}
 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowActivityDefMapper(
			FlowActivityDefMapper flowActivityDefMapper) {
		this.flowActivityDefMapper = flowActivityDefMapper;
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
