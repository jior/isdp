package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IFieldInterfaceService {

	/**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	FieldInterface getFieldInterface(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFieldInterfaceCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFieldInterfaceCountByQueryCriteria(FieldInterfaceQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<FieldInterface> getFieldInterfaces(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<FieldInterface> getFieldInterfacesByQueryCriteria(int start,
			int pageSize, FieldInterfaceQuery query);

	/**
	 * ���ݱ�����ͻ�ȡ�ֶ���Ϣ
	 * 
	 * @param frmType
	 * @return
	 */
	List<FieldInterface> getFieldsByFrmType(String frmType);

	List<FieldInterface> getListShowFields(String frmType, int indexId);

	/**
	 * ���ݱ�����ͻ�ȡ�б���ʾ�ֶ���Ϣ
	 * 
	 * @param frmType
	 * @return
	 */
	List<FieldInterface> getListShowFieldsByFrmType(String frmType);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<FieldInterface> list(FieldInterfaceQuery query);

	/**
	 * ת���ֶεĻ������ݶ����б�
	 * 
	 * @param fields
	 */
	void loadFieldHintList(List<FieldInterface> fields);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(FieldInterface fieldInterface);

}
