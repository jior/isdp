package com.glaf.isdp.domain;

import java.util.Collection;

public class IsdpDataTable {

	/**
	 * 数据表信息
	 */
	protected CellDataTable cellDataTable;

	/**
	 * 字段定义信息
	 */
	protected Collection<CellDataField> dataFields;

	protected Collection<FieldInterface> fields;

	protected Collection<CellTableTree> cellTableTrees;

	protected Collection<FieldInterface> listshowFields;

	protected Collection<FieldInterface> tnameFields;

	protected Collection<CellRepInfo2> slaveRepInfos;

}
