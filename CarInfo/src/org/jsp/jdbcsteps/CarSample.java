package org.jsp.jdbcsteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CarSample 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=hemu";

		String query1="insert into test.carinfo values('AP36E2565','Blue','Baleno')";
		String query2="insert into test.carinfo values('AP31AC1818','Red','Polo')";
		String query3="insert into test.carinfo values('AP43BD3555','Black','i10')";
		  
		
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Step1");
			Statement statement =connection.createStatement();
			System.out.println("Step 2");
			statement.executeUpdate(query2);
			statement.executeUpdate(query3);
			System.out.println("Step3");
			
			connection.close();
			System.out.println("Step5");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
