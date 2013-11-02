package com.glaf.isdp.domain;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;

public interface ITree extends JSONable {

	/**
	 * 是否处于选中状态
	 * 
	 * @return
	 */
	boolean isChecked();

	/**
	 * 编号，包含父子关系，例如：19756|19852|20076|20151|20155|20158|
	 * 
	 * @return
	 */
	String getId();

	/**
	 * 主键
	 * 
	 * @return
	 */
	int getIndexId();

	/**
	 * 名称
	 * 
	 * @return
	 */
	String getIndexName();

	/**
	 * 层级，从0开始，0为第一级，1为第二级，依次类推
	 * 
	 * @return
	 */
	int getLevel();

	/**
	 * 顺序号
	 * 
	 * @return
	 */
	int getListno();

	/**
	 * 父节点编号
	 * 
	 * @return
	 */
	int getParentId();

	/**
	 * 设置选中状态
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
