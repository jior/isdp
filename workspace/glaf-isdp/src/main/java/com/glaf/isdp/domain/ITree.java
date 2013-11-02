package com.glaf.isdp.domain;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;

public interface ITree extends JSONable {

	/**
	 * �Ƿ���ѡ��״̬
	 * 
	 * @return
	 */
	boolean isChecked();

	/**
	 * ��ţ��������ӹ�ϵ�����磺19756|19852|20076|20151|20155|20158|
	 * 
	 * @return
	 */
	String getId();

	/**
	 * ����
	 * 
	 * @return
	 */
	int getIndexId();

	/**
	 * ����
	 * 
	 * @return
	 */
	String getIndexName();

	/**
	 * �㼶����0��ʼ��0Ϊ��һ����1Ϊ�ڶ�������������
	 * 
	 * @return
	 */
	int getLevel();

	/**
	 * ˳���
	 * 
	 * @return
	 */
	int getListno();

	/**
	 * ���ڵ���
	 * 
	 * @return
	 */
	int getParentId();

	/**
	 * ����ѡ��״̬
	 * 
	 * @param checked
	 */
	void setChecked(boolean checked);

	void setId(String id);

	void setIndexId(int indexId);

	void setIndexName(String indexName);

	void setLevel(int level);

	void setListno(int listno);

	void setParentId(int parentId);

	ObjectNode toObjectNode();

}
