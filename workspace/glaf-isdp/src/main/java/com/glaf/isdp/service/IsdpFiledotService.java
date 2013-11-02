package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpFiledotService {

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
	IsdpFiledot getFiledot(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFiledotCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFiledotCountByQueryCriteria(FiledotQuery query);
	
	
	List<IsdpFiledot> getMyCellTaskFiles(int indexId, int intistasks);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpFiledot> getFiledots(Map<String, Object> parameter);
	
	/**
	 * 获取挂接到某个分类的文件定义
	 * @param indexId
	 * @return
	 */
	List<IsdpFiledot> getFiledotsOfTreedot(int indexId);
	
	
	List<IsdpFiledot> getFiledotsByCheckItemId(String proj_chkitem_id);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<IsdpFiledot> getFiledotsByQueryCriteria(int start, int pageSize,
			FiledotQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpFiledot> list(FiledotQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpFiledot filedot);

}
