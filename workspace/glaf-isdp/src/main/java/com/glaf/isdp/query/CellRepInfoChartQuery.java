package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellRepInfoChartQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected String nameLine;
	protected String nameLineLike;
	protected List<String> nameLines;
	protected String dnameX;
	protected String dnameXLike;
	protected List<String> dnameXs;
	protected String dnameY;
	protected String dnameYLike;
	protected List<String> dnameYs;
	

	public CellRepInfoChartQuery() {

	}

	public String getTopid() {
		return topid;
	}

	public String getTopidLike() {
		if (topidLike != null && topidLike.trim().length() > 0) {
			if (!topidLike.startsWith("%")) {
				topidLike = "%" + topidLike;
			}
			if (!topidLike.endsWith("%")) {
				topidLike = topidLike + "%";
			}
		}
		return topidLike;
	}

	public List<String> getTopids() {
		return topids;
	}

	public String getNameLine() {
		return nameLine;
	}

	public String getNameLineLike() {
		if (nameLineLike != null && nameLineLike.trim().length() > 0) {
			if (!nameLineLike.startsWith("%")) {
				nameLineLike = "%" + nameLineLike;
			}
			if (!nameLineLike.endsWith("%")) {
				nameLineLike = nameLineLike + "%";
			}
		}
		return nameLineLike;
	}

	public List<String> getNameLines() {
		return nameLines;
	}

	public String getDnameX() {
		return dnameX;
	}

	public String getDnameXLike() {
		if (dnameXLike != null && dnameXLike.trim().length() > 0) {
			if (!dnameXLike.startsWith("%")) {
				dnameXLike = "%" + dnameXLike;
			}
			if (!dnameXLike.endsWith("%")) {
				dnameXLike = dnameXLike + "%";
			}
		}
		return dnameXLike;
	}

	public List<String> getDnameXs() {
		return dnameXs;
	}

	public String getDnameY() {
		return dnameY;
	}

	public String getDnameYLike() {
		if (dnameYLike != null && dnameYLike.trim().length() > 0) {
			if (!dnameYLike.startsWith("%")) {
				dnameYLike = "%" + dnameYLike;
			}
			if (!dnameYLike.endsWith("%")) {
				dnameYLike = dnameYLike + "%";
			}
		}
		return dnameYLike;
	}

	public List<String> getDnameYs() {
		return dnameYs;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTopidLike(String topidLike) {
		this.topidLike = topidLike;
	}

	public void setTopids(List<String> topids) {
		this.topids = topids;
	}

	public void setNameLine(String nameLine) {
		this.nameLine = nameLine;
	}

	public void setNameLineLike(String nameLineLike) {
		this.nameLineLike = nameLineLike;
	}

	public void setNameLines(List<String> nameLines) {
		this.nameLines = nameLines;
	}

	public void setDnameX(String dnameX) {
		this.dnameX = dnameX;
	}

	public void setDnameXLike(String dnameXLike) {
		this.dnameXLike = dnameXLike;
	}

	public void setDnameXs(List<String> dnameXs) {
		this.dnameXs = dnameXs;
	}

	public void setDnameY(String dnameY) {
		this.dnameY = dnameY;
	}

	public void setDnameYLike(String dnameYLike) {
		this.dnameYLike = dnameYLike;
	}

	public void setDnameYs(List<String> dnameYs) {
		this.dnameYs = dnameYs;
	}

	public CellRepInfoChartQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public CellRepInfoChartQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public CellRepInfoChartQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public CellRepInfoChartQuery nameLine(String nameLine) {
		if (nameLine == null) {
			throw new RuntimeException("nameLine is null");
		}
		this.nameLine = nameLine;
		return this;
	}

	public CellRepInfoChartQuery nameLineLike(String nameLineLike) {
		if (nameLineLike == null) {
			throw new RuntimeException("nameLine is null");
		}
		this.nameLineLike = nameLineLike;
		return this;
	}

	public CellRepInfoChartQuery nameLines(List<String> nameLines) {
		if (nameLines == null) {
			throw new RuntimeException("nameLines is empty ");
		}
		this.nameLines = nameLines;
		return this;
	}

	public CellRepInfoChartQuery dnameX(String dnameX) {
		if (dnameX == null) {
			throw new RuntimeException("dnameX is null");
		}
		this.dnameX = dnameX;
		return this;
	}

	public CellRepInfoChartQuery dnameXLike(String dnameXLike) {
		if (dnameXLike == null) {
			throw new RuntimeException("dnameX is null");
		}
		this.dnameXLike = dnameXLike;
		return this;
	}

	public CellRepInfoChartQuery dnameXs(List<String> dnameXs) {
		if (dnameXs == null) {
			throw new RuntimeException("dnameXs is empty ");
		}
		this.dnameXs = dnameXs;
		return this;
	}

	public CellRepInfoChartQuery dnameY(String dnameY) {
		if (dnameY == null) {
			throw new RuntimeException("dnameY is null");
		}
		this.dnameY = dnameY;
		return this;
	}

	public CellRepInfoChartQuery dnameYLike(String dnameYLike) {
		if (dnameYLike == null) {
			throw new RuntimeException("dnameY is null");
		}
		this.dnameYLike = dnameYLike;
		return this;
	}

	public CellRepInfoChartQuery dnameYs(List<String> dnameYs) {
		if (dnameYs == null) {
			throw new RuntimeException("dnameYs is empty ");
		}
		this.dnameYs = dnameYs;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getOrderBy() {
		if (sortField != null) {
			String a_x = " asc ";
			if (getSortOrder()!= null) {
				a_x = " desc ";
			}

			if (columns.get(sortField) != null) {
				orderBy = " E." + columns.get(sortField) + a_x;
			}
		}
		return orderBy;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("topid", "topid");
		addColumn("nameLine", "name_line");
		addColumn("dnameX", "dname_x");
		addColumn("dnameY", "dname_y");
	}

}