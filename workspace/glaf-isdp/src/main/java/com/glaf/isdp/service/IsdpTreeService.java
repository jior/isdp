package com.glaf.isdp.service;

import java.util.List;

import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.query.BaseTreeQuery;
import com.glaf.isdp.query.IsdpTreeQuery;

public interface IsdpTreeService {

	/**
	 * ���ݲ�ѯ��ȡ�ڵ��������в�ѯSql�Ǳ����
	 * @param query
	 * @return
	 */
	List<ITree> getIsdpTreesByQueryCriteria(IsdpTreeQuery query);
	
	/**
	 * ���ݲ�ѯ��ȡ�ڵ��������б����Ǳ����
	 * @param query
	 * @return
	 */
	List<ITree> getTreesByQueryCriteria(BaseTreeQuery query);
	
}
