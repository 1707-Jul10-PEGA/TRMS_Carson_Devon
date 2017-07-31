package com.revature.users;

public class Employee {
	
	private String username;
	private String password;
	private String fName;
	private String lName;
	private int ds;
	private int dh;
	private int eID;
	
	public Employee() {
		this.setUsername(null);
		this.setPassword(null);
		this.setfName(null);
		this.setlName(null);
		this.setDs(-1);
		this.setDh(-1);
		this.seteID(-1);
	}
	
	public Employee(int e, String fn, String ln, int ds, int dh, String un, String pw) {
		this.setUsername(un);
		this.setPassword(null);
		this.setfName(fn);
		this.setlName(ln);
		this.setDs(ds);
		this.setDh(dh);
		this.seteID(e);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getDs() {
		return ds;
	}

	public void setDs(int ds) {
		this.ds = ds;
	}

	public int getDh() {
		return dh;
	}

	public void setDh(int dh) {
		this.dh = dh;
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}
}
