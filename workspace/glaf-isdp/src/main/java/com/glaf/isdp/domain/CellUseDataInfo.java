package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.util.CellUseDataInfoJsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "cell_usedatainfo")
public class CellUseDataInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * tableName
	 */
	@Column(name = "table_name", length = 50)
	protected String tablename;

	/**
	 * tableId
	 */
	@Column(name = "table_id", length = 50)
	protected String tableId;

	/**
	 * ostTablename
	 */
	@Column(name = "ost_tablename")
	protected int ostTablename;

	/**
	 * ostRow
	 */
	@Column(name = "ost_row")
	protected int ostRow;

	/**
	 * ostCol
	 */
	@Column(name = "ost_col")
	protected int ostCol;

	/**
	 * flag
	 */
	@Column(name = "flag")
	protected int flag;

	/**
	 * treenlevel
	 */
	@Column(name = "treenlevel")
	protected int level;

	/**
	 * useTablename
	 */
	@Column(name = "use_tablename", length = 50)
	protected String useTablename;

	/**
	 * useId
	 */
	@Column(name = "use_id", length = 50)
	protected String useId;

	/**
	 * useIndexId
	 */
	@Column(name = "use_index_id")
	protected int useIndexId;

	public CellUseDataInfo() {

	}

	public int getFlag() {
		return this.flag;
	}

	public String getId() {
		return this.id;
	}

	public int getLevel() {
		return this.level;
	}

	public int getOstCol() {
		return this.ostCol;
	}

	public int getOstRow() {
		return this.ostRow;
	}

	public int getOstTablename() {
		return this.ostTablename;
	}

	public String getTableId() {
		return this.tableId;
	}

	public String getTablename() {
		return this.tablename;
	}

	public String getUseId() {
		return this.useId;
	}

	public int getUseIndexId() {
		return this.useIndexId;
	}

	public String getUseTablename() {
		return this.useTablename;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setOstCol(int ostCol) {
		this.ostCol = ostCol;
	}

	public void setOstRow(int ostRow) {
		this.ostRow = ostRow;
	}

	public void setOstTablename(int ostTablename) {
		this.ostTablename = ostTablename;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setUseId(String useId) {
		this.useId = useId;
	}

	public void setUseIndexId(int useIndexId) {
		this.useIndexId = useIndexId;
	}

	public void setUseTablename(String useTablename) {
		this.useTablename = useTablename;
	}

	public CellUseDataInfo jsonToObject(JSONObject jsonObject) {
		return CellUseDataInfoJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellUseDataInfoJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellUseDataInfoJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
