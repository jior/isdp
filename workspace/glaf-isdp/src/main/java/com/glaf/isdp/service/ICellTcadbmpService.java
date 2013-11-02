package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface ICellTcadbmpService {
	 
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
	 List<CellTcadbmp> list(CellTcadbmpQuery query);

    /**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getCellTcadbmpCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getCellTcadbmpCountByQueryCriteria(CellTcadbmpQuery query);


    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<CellTcadbmp> getCellTcadbmps(Map<String, Object> parameter);


	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	 List<CellTcadbmp> getCellTcadbmpsByQueryCriteria(int start, int pageSize,
			CellTcadbmpQuery query);


    /**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	 CellTcadbmp getCellTcadbmp(String id);

    /**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void save(CellTcadbmp cellTcadbmp);

}
