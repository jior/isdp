package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.*;

public class CellForm implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ���ݱ���Ϣ
	 */
	protected Collection<CellDataTable> dataTables;

	/**
	 * �ֶζ�����Ϣ
	 */
	protected Collection<CellDataField> dataFields;

	/**
	 * �������Ϣ
	 */
	protected Collection<CellRepInfo> masterRepInfos;

	/**
	 * �ӱ���������Ϣ
	 */
	protected Collection<CellRepInfo2> slaveRepInfos;

	public CellForm() {

	}

	public Collection<CellDataField> getDataFields() {
		return dataFields;
	}

	public Collection<CellDataTable> getDataTables() {
		return dataTables;
	}

	public Collection<CellRepInfo> getMasterRepInfos() {
		return masterRepInfos;
	}

	public Collection<CellRepInfo2> getSlaveRepInfos() {
		return slaveRepInfos;
	}

	public void setDataFields(Collection<CellDataField> dataFields) {
		this.dataFields = dataFields;
	}

	public void setDataTables(Collection<CellDataTable> dataTables) {
		this.dataTables = dataTables;
	}

	public void setMasterRepInfos(Collection<CellRepInfo> masterRepInfos) {
		this.masterRepInfos = masterRepInfos;
	}

	public void setSlaveRepInfos(Collection<CellRepInfo2> slaveRepInfos) {
		this.slaveRepInfos = slaveRepInfos;
	}

}
