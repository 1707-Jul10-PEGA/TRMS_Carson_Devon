package com.revature.events;

public class EventType {
	
	private int evtID;
	private String Type;
	private double coverage;
	
	public EventType() {
		this.setEvtID(0);
		this.setType(null);
		this.setCoverage(0.0);
	}
	
	public EventType(int id, String t, double c) {
		this.setEvtID(id);
		this.setType(t);
		this.setCoverage(c);
	}

	public int getEvtID() {
		return evtID;
	}

	public void setEvtID(int evtID) {
		this.evtID = evtID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
}
