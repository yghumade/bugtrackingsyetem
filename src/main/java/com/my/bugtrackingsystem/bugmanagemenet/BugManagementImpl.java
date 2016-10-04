package com.my.bugtrackingsystem.bugmanagemenet;

import java.sql.*;

import com.my.bugtrackingsystem.database.JDBCConnection;
import com.my.bugtrackingsystem.utility.PropertyFileReader;

public class BugManagementImpl implements BugmanagementService
{
	JDBCConnection jdbccon = new JDBCConnection();
	PropertyFileReader prreader = new PropertyFileReader();
	Bug bug = new Bug();

	public void addNewBug(String bugTitle, String bugDetails, String foundIn, String assignedTo)
	{
		
		
		
		Connection con= null;
		Statement stmt = null;
		try{
		//con = jdbccon.getConnection("dbseserver", "username", "password");
		con =	jdbccon.getConnection();
		stmt = con.createStatement();
		String sql = "insert into buglist(bugtitle,bugdetails,foundinbuild,assignedto)" +
				"values('"+bugTitle+"','"+bugDetails+"','"+foundIn+"','"+assignedTo+"')";
		stmt.executeUpdate(sql);
		System.out.println("query executed?");
		con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}

	public void searchBugById(int bugID)
	{
		//JDBCConnection jdbccon = new JDBCConnection();
		Connection con=null;
		Statement stmt = null;
		try{
			
			String propertyValue= 	prreader.getPropertyvalues("Database_Server");
			System.out.println(propertyValue);
			con = jdbccon.getConnection();
			stmt = con.createStatement();
			String sql = "Select * from buglist where bugid ="+bugID+"";
			ResultSet r= stmt.executeQuery(sql);
			while(r.next())
			{
			int bugid1 = r.getInt("bugid");
			String bugTitle1 = r.getString("bugtitle");
			String bugDetails = r.getString("bugdetails");
			String foundIn = r.getString("foundinbuild");
			String assignedTo= r.getString("assignedto");
			//System.out.println("BugID"+":"+ "BugTilte"+ ":"+ "BugDetails"+ ":"+"FoundIn"+":"+"AssignedTo");
			System.out.println(bugid1+":"+ bugTitle1+ ":"+ bugDetails+ ":"+foundIn+":"+assignedTo);
			
			}
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

	public void deleteBug(int bugtodelete) 
	{
		try{
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt = null;
		con = jdbccon.getConnection();
		stmt = con.createStatement();
		String sql = "DELETE from buglist where bugid="+bugtodelete+"";
		int r = stmt.executeUpdate(sql);
		if(r==1)
		{
			System.out.println("Record deleted successfully");
		}
		else
		{
			System.out.println("could not delete the record");
		}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	public void updateBug(int bugID)
	{
		Connection con= null;
		Statement stmt = null;
		try{
		//con = jdbccon.getConnection("dbseserver", "username", "password");
		con =	jdbccon.getConnection();
		stmt = con.createStatement();
		//String sql = "insert into buglist(bugtitle,bugdetails,foundinbuild,assignedto)" +
				//"values('"+bugTitle+"','"+bugDetails+"','"+foundIn+"','"+assignedTo+"')";
		//stmt.executeUpdate(sql);
		System.out.println("query executed?");
		con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
