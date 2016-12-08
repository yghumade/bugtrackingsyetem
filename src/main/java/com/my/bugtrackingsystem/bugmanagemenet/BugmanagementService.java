package com.my.bugtrackingsystem.bugmanagemenet;

public interface BugmanagementService
{

	public void addNewBug(String bugTitle, String bugDetails, String foundIn, String assignedTo);

	public void searchBugById(int bugID);

	public void updateBug(int bugID, String bugTitle, String bugDetails, String foundIn, String assignedTo);

	public void deleteBug(int bugtodelete);
	
	public void searchAllBugs();

}
