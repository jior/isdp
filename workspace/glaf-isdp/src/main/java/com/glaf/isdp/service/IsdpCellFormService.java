package com.glaf.isdp.service;

import com.glaf.isdp.domain.CellForm;

public interface IsdpCellFormService {

	/**
	 * 根据文件定义编号获取表单定义信息
	 * @param filedotId
	 * @return
	 */
	CellForm getCellFormByFiledotId(String filedotId);

}
