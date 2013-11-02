package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class MailNewQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String email;
	protected String emailLike;
	protected List<String> emails;
	protected String emailId;
	protected String emailIdLike;
	protected List<String> emailIds;
	protected Integer intrec;
	protected Integer intrecGreaterThanOrEqual;
	protected Integer intrecLessThanOrEqual;
	protected List<Integer> intrecs;
	

	public MailNewQuery() {

	}

	public String getEmail() {
		return email;
	}

	public String getEmailLike() {
		if (emailLike != null && emailLike.trim().length() > 0) {
			if (!emailLike.startsWith("%")) {
				emailLike = "%" + emailLike;
			}
			if (!emailLike.endsWith("%")) {
				emailLike = emailLike + "%";
			}
		}
		return emailLike;
	}

	public List<String> getEmails() {
		return emails;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getEmailIdLike() {
		if (emailIdLike != null && emailIdLike.trim().length() > 0) {
			if (!emailIdLike.startsWith("%")) {
				emailIdLike = "%" + emailIdLike;
			}
			if (!emailIdLike.endsWith("%")) {
				emailIdLike = emailIdLike + "%";
			}
		}
		return emailIdLike;
	}

	public List<String> getEmailIds() {
		return emailIds;
	}

	public Integer getIntrec() {
		return intrec;
	}

	public Integer getIntrecGreaterThanOrEqual() {
		return intrecGreaterThanOrEqual;
	}

	public Integer getIntrecLessThanOrEqual() {
		return intrecLessThanOrEqual;
	}

	public List<Integer> getIntrecs() {
		return intrecs;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmailLike(String emailLike) {
		this.emailLike = emailLike;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setEmailIdLike(String emailIdLike) {
		this.emailIdLike = emailIdLike;
	}

	public void setEmailIds(List<String> emailIds) {
		this.emailIds = emailIds;
	}

	public void setIntrec(Integer intrec) {
		this.intrec = intrec;
	}

	public void setIntrecGreaterThanOrEqual(Integer intrecGreaterThanOrEqual) {
		this.intrecGreaterThanOrEqual = intrecGreaterThanOrEqual;
	}

	public void setIntrecLessThanOrEqual(Integer intrecLessThanOrEqual) {
		this.intrecLessThanOrEqual = intrecLessThanOrEqual;
	}

	public void setIntrecs(List<Integer> intrecs) {
		this.intrecs = intrecs;
	}

	public MailNewQuery email(String email) {
		if (email == null) {
			throw new RuntimeException("email is null");
		}
		this.email = email;
		return this;
	}

	public MailNewQuery emailLike(String emailLike) {
		if (emailLike == null) {
			throw new RuntimeException("email is null");
		}
		this.emailLike = emailLike;
		return this;
	}

	public MailNewQuery emails(List<String> emails) {
		if (emails == null) {
			throw new RuntimeException("emails is empty ");
		}
		this.emails = emails;
		return this;
	}

	public MailNewQuery emailId(String emailId) {
		if (emailId == null) {
			throw new RuntimeException("emailId is null");
		}
		this.emailId = emailId;
		return this;
	}

	public MailNewQuery emailIdLike(String emailIdLike) {
		if (emailIdLike == null) {
			throw new RuntimeException("emailId is null");
		}
		this.emailIdLike = emailIdLike;
		return this;
	}

	public MailNewQuery emailIds(List<String> emailIds) {
		if (emailIds == null) {
			throw new RuntimeException("emailIds is empty ");
		}
		this.emailIds = emailIds;
		return this;
	}

	public MailNewQuery intrec(Integer intrec) {
		if (intrec == null) {
			throw new RuntimeException("intrec is null");
		}
		this.intrec = intrec;
		return this;
	}

	public MailNewQuery intrecGreaterThanOrEqual(
			Integer intrecGreaterThanOrEqual) {
		if (intrecGreaterThanOrEqual == null) {
			throw new RuntimeException("intrec is null");
		}
		this.intrecGreaterThanOrEqual = intrecGreaterThanOrEqual;
		return this;
	}

	public MailNewQuery intrecLessThanOrEqual(Integer intrecLessThanOrEqual) {
		if (intrecLessThanOrEqual == null) {
			throw new RuntimeException("intrec is null");
		}
		this.intrecLessThanOrEqual = intrecLessThanOrEqual;
		return this;
	}

	public MailNewQuery intrecs(List<Integer> intrecs) {
		if (intrecs == null) {
			throw new RuntimeException("intrecs is empty ");
		}
		this.intrecs = intrecs;
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
		addColumn("email", "email");
		addColumn("emailId", "email_Id");
		addColumn("intrec", "intrec");
	}

}