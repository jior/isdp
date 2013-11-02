package com.glaf.isdp.domain;

public class SelectItem implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	protected String name;

	protected String title;

	protected String value;

	public SelectItem() {

	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
