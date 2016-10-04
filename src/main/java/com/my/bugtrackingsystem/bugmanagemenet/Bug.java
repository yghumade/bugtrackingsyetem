package com.my.bugtrackingsystem.bugmanagemenet;

public class Bug
{
	private int bugID;
	private String bugTitle;
	private String bugDescription;
	private String foundIn;
	private String assignedTo;
	
	public int getBugId()
	{
		return bugID;
	}
	
	public String getBugTitle()
	{
		return bugTitle;
		
	}
	
	public String getBugDescription()
	{
		return bugDescription;
		
	}
	
	public String getFoundIn()
	{
		return foundIn;
		
	}
	
	public String getAssignedTO()
	{
		return assignedTo;
		
	}

	public void setBugTitle(String title)
	{
		bugTitle = title;
	}
	
	public void setBugDescription(String desc )
	{
		bugDescription = desc;
	}
	
	public void setFoundIn(String foundin)
	{
		foundIn = foundin;
	}
	
	public void setAssignedTo(String assignedto)
	{
		assignedTo = assignedto;
	}
}
