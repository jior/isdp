package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IFlowForwardDefService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	FlowForwardDef getFlowForwardDef(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowForwardDefCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowForwardDefCountByQueryCriteria(FlowForwardDefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowForwardDef> getFlowForwardDefs(Map<String, Object> parameter);
	
	
	/**
	 * 根据流程编号获取活动之间的转移关系
	 * @param processDefId
	 * @return
	 */
	List<FlowForwardDef> getFlowForwardDefsByProcessDefId(String processDefId);
	
	
	/**
	 * 根据流程编号获取已经处理的活动之间的转移关系
	 * @param processId 流程编号
	 * @param processInstanceId 流程实例编号
	 * @return
	 */
	List<FlowForwardDef> getProcessedFlowForwardDefsByProcessId(String processId, String processInstanceId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<FlowForwardDef> getFlowForwardDefsByQueryCriteria(int start,
			int pageSize, FlowForwardDefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowForwardDef> list(FlowForwardDefQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(FlowForwardDef flowForwardDef);

}
