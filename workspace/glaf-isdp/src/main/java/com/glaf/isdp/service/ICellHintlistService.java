package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface ICellHintlistService {
	 
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
	 List<CellHintlist> list(CellHintlistQuery query);

    /**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getCellHintlistCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getCellHintlistCountByQueryCriteria(CellHintlistQuery query);


    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<CellHintlist> getCellHintlists(Map<String, Object> parameter);


	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	 List<CellHintlist> getCellHintlistsByQueryCriteria(int start, int pageSize,
			CellHintlistQuery query);


    /**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	 CellHintlist getCellHintlist(String id);

    /**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void save(CellHintlist cellHintlist);

}
