package org.jsp.jdbc.car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionCarData_1 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=hemu";
		
		String query="Select * from test.cardata";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			
			System.out.println("Step1");
			Statement statement=connection.createStatement();
			System.out.println("Step2");
			
			ResultSet resultSet=statement.executeQuery(query);
			System.out.println("Step3");
			
			while(resultSet.next())
			{
				resultSet.next();
				String carno=resultSet.getString("Carno");
				String carcolour=resultSet.getString("Carcolour");
				String carbrand=resultSet.getString("Carbrand");
				System.out.println(carno+" "+carcolour+" "+carbrand);
			}
			System.out.println("Step4");
			
			connection.close();
			System.out.println("Step5");
		} 
		catch (SQLException e)
		{
		
			e.printStackTrace();
		}
	}
}
