package com.my.bugtrackingsystem.main;

import java.util.*;

import com.my.bugtrackingsystem.bugmanagemenet.*;

public class App
{

	public static void main(String[] args)
	{

		BugManagementImpl bugmanage = new BugManagementImpl();
		Bug bug = new Bug();
		Scanner scanner = new Scanner(System.in);
		System.out.println("***************Welcome TO Bug Tracking System****************");
		System.out.println("Choose the correct option from below....");
		System.out.println("1.Add a new bug" + "\n" + "2.Update Existing bug " + "\n" + "3.Search for a bug " + "\n"
				+ "4.List All bugs" + "\n" + "5. Delete Bug");
		System.out.println("**************************************************************");
		int option = (scanner.nextInt());
		scanner.nextLine();
		switch (option)
		{
		case 1:
			System.out.println("Please Enter Bug Title..");
			String title = (scanner.nextLine());
			bug.setBugTitle(title);
			System.out.println("Please Enter Bug Details..");
			String description = (scanner.nextLine());
			bug.setBugDescription(description);
			System.out.println("Please Enter Found In Build details..");
			String foundInBuild = (scanner.nextLine());
			bug.setFoundIn(foundInBuild);
			System.out.println("Please Enter Name of the developer whom you want to assign this bug..");
			String assignedTo = (scanner.nextLine());
			bug.setAssignedTo(assignedTo);
			bugmanage.addNewBug(bug.getBugTitle(), bug.getBugDescription(), bug.getFoundIn(), bug.getAssignedTO());
			break;
		case 2:
			System.out.println("Enter the Bug ID you want to update..");
			int id = scanner.nextInt();
			System.out.println("Please Enter Bug Title.. ");
			String title1 = scanner.next();
			bug.setBugTitle(title1);
			System.out.println("Please Enter Bug Details.. ");
			String description1 = scanner.next();
			bug.setBugDescription(description1);
			System.out.println("Please Enter Found In Build details.. ");
			String foundInBuild1 = scanner.next();
			bug.setFoundIn(foundInBuild1);
			System.out.println("Please Enter Name of the developer whom you want to assign this bug.. ");
			String assignedTo1 = scanner.next();
			bug.setAssignedTo(assignedTo1);
			bugmanage.updateBug(id, bug.getBugTitle(), bug.getBugDescription(), bug.getFoundIn(), bug.getAssignedTO());
			break;
		case 3:
			System.out.println("Please enter Bug ID to search");
			int bugid = scanner.nextInt();
			bugmanage.searchBugById(bugid);
			break;
		case 4:
			bugmanage.searchAllBugs();
			break;
		case 5:
			System.out.println("Enter the Bug ID to delete");
			int bugtodelete = scanner.nextInt();
			bugmanage.deleteBug(bugtodelete);
			break;

		default:
			System.out.println("Please enter correct option");

		}
		scanner.close();

	}

}
