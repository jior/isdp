package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface ICellUseDataInfoService {
	 
    /**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void deleteById(String id);

    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<CellUseDataInfo> list(CellUseDataInfoQuery query);

    /**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getCellUseDataInfoCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getCellUseDataInfoCountByQueryCriteria(CellUseDataInfoQuery query);


    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<CellUseDataInfo> getCellUseDataInfos(Map<String, Object> parameter);


	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	 List<CellUseDataInfo> getCellUseDataInfosByQueryCriteria(int start, int pageSize,
			CellUseDataInfoQuery query);


    /**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	 CellUseDataInfo getCellUseDataInfo(String id);

    /**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void save(CellUseDataInfo cellUseDataInfo);

}
