package com.revature.message_system;

import java.sql.Date;

public class TRF {	//stands for Tuition Reimbursement Form
	
	private int trfID;
	private int eID;
	private int evID;
	private int bcID;
	private String just;
	private String overMsg;
	private double projected;
	private double actual;
	private int hoursMissed;
	private boolean dsApp;
	private boolean dhApp;
	private boolean bcApp;
	private boolean eApp;
	private boolean activity;
	private boolean urgency;
	private String grade;
	private Date last;
	
	public TRF() {
		this.setTrfID(0);
		this.seteID(0);
		this.setEvID(0);
		this.setBcID(0);
		this.setJust(null);
		this.setOverMsg(null);
		this.setProjected(0.0);
		this.setActual(0.0);
		this.setHoursMissed(0);
		this.setDsApp(false);
		this.setDhApp(false);
		this.setBcApp(false);
		this.seteApp(true);
		this.setActivity(true);
		this.setUrgency(false);
		this.setLast(null);
	}
	
	public TRF(int trf, int e, int ev, int bc, String j, String om, double p, double a, int hm, boolean dsa, boolean dha, boolean bca, boolean ea, boolean active, boolean u, Date lu) {
		this.setTrfID(trf);
		this.seteID(e);
		this.setEvID(ev);
		this.setBcID(bc);
		this.setJust(j);
		this.setOverMsg(om);
		this.setProjected(p);
		this.setActual(a);
		this.setHoursMissed(hm);
		this.setDsApp(dsa);
		this.setDhApp(dha);
		this.setBcApp(bca);
		this.seteApp(ea);
		this.setActivity(active);
		this.setUrgency(u);
		this.setLast(lu);
	}

	public int getTrfID() {
		return trfID;
	}

	public void setTrfID(int trfID) {
		this.trfID = trfID;
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public int getEvID() {
		return evID;
	}

	public void setEvID(int evID) {
		this.evID = evID;
	}

	public int getBcID() {
		return bcID;
	}

	public void setBcID(int bcID) {
		this.bcID = bcID;
	}

	public String getJust() {
		return just;
	}

	public void setJust(String just) {
		this.just = just;
	}

	public String getOverMsg() {
		return overMsg;
	}

	public void setOverMsg(String overMsg) {
		this.overMsg = overMsg;
	}

	public double getProjected() {
		return projected;
	}

	public void setProjected(double projected) {
		this.projected = projected;
	}

	public double getActual() {
		return actual;
	}

	public void setActual(double actual) {
		this.actual = actual;
	}

	public int getHoursMissed() {
		return hoursMissed;
	}

	public void setHoursMissed(int hoursMissed) {
		this.hoursMissed = hoursMissed;
	}

	public boolean isDsApp() {
		return dsApp;
	}

	public void setDsApp(boolean dsApp) {
		this.dsApp = dsApp;
	}

	public boolean isDhApp() {
		return dhApp;
	}

	public void setDhApp(boolean dhApp) {
		this.dhApp = dhApp;
	}

	public boolean isBcApp() {
		return bcApp;
	}

	public void setBcApp(boolean bcApp) {
		this.bcApp = bcApp;
	}

	public boolean iseApp() {
		return eApp;
	}

	public void seteApp(boolean eApp) {
		this.eApp = eApp;
	}

	public boolean isActivity() {
		return activity;
	}

	public void setActivity(boolean activity) {
		this.activity = activity;
	}

	public boolean isUrgency() {
		return urgency;
	}

	public void setUrgency(boolean urgency) {
		this.urgency = urgency;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getLast() {
		return last;
	}

	public void setLast(Date last) {
		this.last = last;
	}
}
