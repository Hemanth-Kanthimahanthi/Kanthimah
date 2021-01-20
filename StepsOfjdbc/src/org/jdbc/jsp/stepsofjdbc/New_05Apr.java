package org.jdbc.jsp.stepsofjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class New_05Apr 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=hemu";
		
		String query="insert into test.userinfo values(?,?,?,?)";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
