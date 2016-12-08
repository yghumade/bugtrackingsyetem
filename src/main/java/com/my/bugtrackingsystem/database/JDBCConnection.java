package com.my.bugtrackingsystem.database;

import java.sql.*;

import com.my.bugtrackingsystem.utility.PropertyFileReader;

public class JDBCConnection
{

	// defining driver name
	public static String driverName = "com.mysql.jdbc.Driver";
	Connection con = null;

	// database URL with host and port name on which it is running
	public static String url = "jdbc:mysql://localhost:3307/";
	PropertyFileReader prreader = new PropertyFileReader();
	private String dbServer = prreader.getPropertyvalues("Database_Serve");
	private String dbName = prreader.getPropertyvalues("Database_Name");
	private String dbUser = prreader.getPropertyvalues("DBUser_Name");
	private String dbPassword = prreader.getPropertyvalues("DBPassword");

	/**
	 * 
	 * @param dbName
	 * @param userName
	 * @param password
	 * @return
	 */
	public Connection getConnection()
	{

		// creating connection URL
		String connectionUrl = url + dbName;

		try
		{
			// registers the specified driver class into memory
			Class.forName(driverName);
		}

		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		try
		{
			// returns a connection object
			con = DriverManager.getConnection(connectionUrl, dbUser, dbPassword);

		}

		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return con;
	}

}
