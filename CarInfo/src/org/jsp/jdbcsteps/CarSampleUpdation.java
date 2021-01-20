package org.jsp.jdbcsteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CarSampleUpdation 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=hemu";

		String query1="update test.carinfo set Car Brand='Maruthi 800' where Car No='AP36E2565'";
		
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Step1");
			Statement statement =connection.createStatement();
			System.out.println("Step 2");
			statement.executeUpdate(query1);
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
