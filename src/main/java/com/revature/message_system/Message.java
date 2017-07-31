package com.revature.message_system;

public class Message {
	private int meID;	//message ID
	private int eID;	//recipient ID
	private int sID;	//sender ID
	private int trfID;	//form ID
	private int evID;	//event ID
	private boolean approval; //approval status
	private String title;
	private String content;
	private String filename;
	
	public Message() {
		this.setMeID(0);
		this.seteID(0);
		this.setsID(0);
		this.setTrfID(0);
		this.setEvID(0);
		this.setApproval(false);
		this.setTitle(null);
		this.setContent(null);
		this.setFilename(null);
	}
	
	public Message(int m, int e, int s, int trf, int ev, boolean app, String t, String c, String fn) {
		this.setMeID(m);
		this.seteID(e);
		this.setsID(s);
		this.setTrfID(trf);
		this.setEvID(ev);
		this.setApproval(app);
		this.setTitle(t);
		this.setContent(c);
		this.setFilename(fn);
	}

	public int getMeID() {
		return meID;
	}

	public void setMeID(int meID) {
		this.meID = meID;
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public int getTrfID() {
		return trfID;
	}

	public void setTrfID(int trfID) {
		this.trfID = trfID;
	}

	public int getEvID() {
		return evID;
	}

	public void setEvID(int evID) {
		this.evID = evID;
	}

	public boolean isApproval() {
		return approval;
	}

	public void setApproval(boolean approval) {
		this.approval = approval;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
