package com.revature.events;

public class GradingFormat
{
	private int gfID;
	private double passGrade;
	private boolean presentation;
	
	public GradingFormat(int gfID, double passGrade, boolean presentation)
	{
		super();
		this.gfID = gfID;
		this.passGrade = passGrade;
		this.presentation = presentation;
	}

	public int getGfID()
	{
		return gfID;
	}

	public void setGfID(int gfID)
	{
		this.gfID = gfID;
	}

	public double getPassGrade()
	{
		return passGrade;
	}

	public void setPassGrade(double passGrade)
	{
		this.passGrade = passGrade;
	}

	public boolean isPresentation()
	{
		return presentation;
	}

	public void setPresentation(boolean presentation)
	{
		this.presentation = presentation;
	}
	
	
}
