package com.glaf.isdp.service;

import com.glaf.isdp.domain.CellForm;

public interface IsdpCellFormService {

	/**
	 * �����ļ������Ż�ȡ��������Ϣ
	 * @param filedotId
	 * @return
	 */
	CellForm getCellFormByFiledotId(String filedotId);

}
