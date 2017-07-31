package com.revature.events;

import java.sql.Date;

public class Event {
	
	private int evID;
	private Date start;
	private Date end;
	private String location;
	private String description;
	private double cost;
	private int evtID;
	private int gfID;
	
	public Event() {
		this.setEvID(0);
		this.setStart(null);
		this.setEnd(null);
		this.setLocation(null);
		this.setDescription(null);
		this.setCost(0.0);
		this.setEvtID(0);
		this.setGfID(1);
	}
	
	public Event(int ev, Date s, Date e, String l, String d, double c, int evt, int gf) {
		this.setEvID(ev);
		this.setStart(s);
		this.setEnd(e);
		this.setLocation(l);
		this.setDescription(d);
		this.setCost(c);
		this.setEvtID(evt);
		this.setGfID(gf);
	}

	public int getEvID() {
		return evID;
	}
	
	public int getGfID() {
		return gfID;
	}

	public void setEvID(int evID) {
		this.evID = evID;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getEvtID() {
		return evtID;
	}

	public void setEvtID(int evtID) {
		this.evtID = evtID;
	}
	
	public void setGfID(int gfID) {
		this.gfID = gfID;
	}
}
