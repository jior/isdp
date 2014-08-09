package com.glaf.isdp.service;

import java.util.List;

import com.glaf.base.modules.sys.model.ITree;
import com.glaf.isdp.query.BaseTreeQuery;
import com.glaf.isdp.query.IsdpTreeQuery;

public interface IsdpTreeService {

	/**
	 * 根据查询获取节点树，其中查询Sql是必须的
	 * 
	 * @param query
	 * @return
	 */
	List<ITree> getIsdpTreesByQueryCriteria(IsdpTreeQuery query);

	/**
	 * 根据查询获取节点树，其中表名是必须的
	 * 
	 * @param query
	 * @return
	 */
	List<ITree> getTreesByQueryCriteria(BaseTreeQuery query);

}
