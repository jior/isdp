package com.glaf.isdp.domain;

public class IsdpDataFile {
	protected String id;

	protected String fileName;

	protected long fileSize;

	protected byte[] fileContent;

	public IsdpDataFile() {

	}

	public byte[] getFileContent() {
		return fileContent;
	}

	public String getFileName() {
		return fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public String getId() {
		return id;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public void setId(String id) {
		this.id = id;
	}

}
