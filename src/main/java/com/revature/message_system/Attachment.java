package com.revature.message_system;

public class Attachment {

	private int atID;
	private int meID;
	private int trfID;
	private String filename;
	private int ftID;
	private String content;
	
	public Attachment() {
		this.setAtID(0);
		this.setMeID(0);
		this.setTrfID(0);
		this.setFilename(null);
		this.setFtID(0);
		this.setContent(null);
	}
	
	public Attachment(int a, int m, int trf, String fn, int ft, String c) {
		this.setAtID(a);
		this.setMeID(m);
		this.setTrfID(trf);
		this.setFilename(fn);
		this.setFtID(ft);
		this.setContent(c);
	}

	public int getAtID() {
		return atID;
	}

	public void setAtID(int atID) {
		this.atID = atID;
	}

	public int getMeID() {
		return meID;
	}

	public void setMeID(int meID) {
		this.meID = meID;
	}

	public int getTrfID() {
		return trfID;
	}

	public void setTrfID(int trfID) {
		this.trfID = trfID;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getFtID() {
		return ftID;
	}

	public void setFtID(int ftID) {
		this.ftID = ftID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
