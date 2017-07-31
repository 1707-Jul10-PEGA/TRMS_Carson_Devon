package com.revature.message_system;

public class FileType {
	
	private int ftID;
	private String extension;
	private String description;
	
	public FileType() {
		this.setExtension(null);
		this.setDescription(null);
	}

	public FileType(String ex, String d) {
		this.setExtension(ex);
		this.setDescription(d);
	}

	public int getFtID() {
		return ftID;
	}

	public void setFtID(int ftID) {
		this.ftID = ftID;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
