package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class MailSendAttQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected String fileName;
	protected String fileNameLike;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected Integer filesizeGreaterThanOrEqual;
	protected Integer filesizeLessThanOrEqual;

	

	public MailSendAttQuery() {

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

	public String getFileName() {
		return fileName;
	}

	public String getFileNameLike() {
		if (fileNameLike != null && fileNameLike.trim().length() > 0) {
			if (!fileNameLike.startsWith("%")) {
				fileNameLike = "%" + fileNameLike;
			}
			if (!fileNameLike.endsWith("%")) {
				fileNameLike = fileNameLike + "%";
			}
		}
		return fileNameLike;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public Integer getFilesizeGreaterThanOrEqual() {
		return filesizeGreaterThanOrEqual;
	}

	public Integer getFilesizeLessThanOrEqual() {
		return filesizeLessThanOrEqual;
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

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileNameLike(String fileNameLike) {
		this.fileNameLike = fileNameLike;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setFilesizeGreaterThanOrEqual(Integer filesizeGreaterThanOrEqual) {
		this.filesizeGreaterThanOrEqual = filesizeGreaterThanOrEqual;
	}

	public void setFilesizeLessThanOrEqual(Integer filesizeLessThanOrEqual) {
		this.filesizeLessThanOrEqual = filesizeLessThanOrEqual;
	}

	public MailSendAttQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public MailSendAttQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public MailSendAttQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public MailSendAttQuery fileName(String fileName) {
		if (fileName == null) {
			throw new RuntimeException("fileName is null");
		}
		this.fileName = fileName;
		return this;
	}

	public MailSendAttQuery fileNameLike(String fileNameLike) {
		if (fileNameLike == null) {
			throw new RuntimeException("fileName is null");
		}
		this.fileNameLike = fileNameLike;
		return this;
	}

	public MailSendAttQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public MailSendAttQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public MailSendAttQuery filesizeGreaterThanOrEqual(
			Integer filesizeGreaterThanOrEqual) {
		if (filesizeGreaterThanOrEqual == null) {
			throw new RuntimeException("filesize is null");
		}
		this.filesizeGreaterThanOrEqual = filesizeGreaterThanOrEqual;
		return this;
	}

	public MailSendAttQuery filesizeLessThanOrEqual(
			Integer filesizeLessThanOrEqual) {
		if (filesizeLessThanOrEqual == null) {
			throw new RuntimeException("filesize is null");
		}
		this.filesizeLessThanOrEqual = filesizeLessThanOrEqual;
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
		addColumn("fileId", "fileId");
		addColumn("topid", "topid");
		addColumn("fileName", "file_name");
		addColumn("ctime", "ctime");
		addColumn("filesize", "filesize");
	}

}