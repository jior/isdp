package com.glaf.isdp.query;

public class IsdpTreeQuery extends BaseTreeQuery {

	private static final long serialVersionUID = 1L;

	protected String selectSql;

	public String getSelectSql() {
		return selectSql;
	}

	public void setSelectSql(String selectSql) {
		this.selectSql = selectSql;
	}

}
