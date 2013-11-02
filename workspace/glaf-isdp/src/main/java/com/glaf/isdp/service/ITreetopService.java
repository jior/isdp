package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface ITreetopService {
	 
    /**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void deleteById(Integer id);

    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<Treetop> list(TreetopQuery query);

    /**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getTreetopCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getTreetopCountByQueryCriteria(TreetopQuery query);


    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<Treetop> getTreetops(Map<String, Object> parameter);


	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	 List<Treetop> getTreetopsByQueryCriteria(int start, int pageSize,
			TreetopQuery query);


    /**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	 Treetop getTreetop(Integer id);

    /**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void save(Treetop treetop);

}
