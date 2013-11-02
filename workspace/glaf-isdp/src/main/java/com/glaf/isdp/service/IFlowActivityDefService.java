package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IFlowActivityDefService {

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
	FlowActivityDef getFlowActivityDef(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowActivityDefCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowActivityDefCountByQueryCriteria(FlowActivityDefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowActivityDef> getFlowActivityDefs(Map<String, Object> parameter);
	
	
	List<FlowActivityDef> getFlowActivityDefsByMainId(String mainId);
	
	/**
	 * 根据流程编号获取流程的活动节点
	 * @param processDefId
	 * @return
	 */
	List<FlowActivityDef> getFlowActivityDefsByProcessDefId(String processDefId);
	
	/**
	 * 根据流程编号获取流程活跃节点的信息(正在运行中的节点信息)
	 * @param processId
	 * @return
	 */
	List<FlowActivityDef> getCurrentActiveFlowActivityDefsByProcessId(String processId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<FlowActivityDef> getFlowActivityDefsByQueryCriteria(int start,
			int pageSize, FlowActivityDefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowActivityDef> list(FlowActivityDefQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(FlowActivityDef flowActivityDef);

}
