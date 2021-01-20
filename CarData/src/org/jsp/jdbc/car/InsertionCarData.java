package org.jsp.jdbc.car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionCarData 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=hemu";
		
		String query1="insert into test.cardata values('AP36E2565','Blue','Baleno')";
		String query2="insert into test.cardata values('AP31AC1818','Red','Polo')";
		String query3="insert into test.cardata values('AP43BD3555','Black','i10')";
		String query4="insert into test.cardata values('AP21CD2556','Purple','i20')";
		String query5="insert into test.cardata values('AP22EF3556','Green','Vento')";
		String query6="insert into test.cardata values('AP23GH8888','White','Kia')";
		String query7="insert into test.cardata values('AP24IJ9999','Grey','Benz')";
		String query8="insert into test.cardata values('AP25KL7777','Yellow','Nano')";
		String query9="insert into test.cardata values('AP26MN6666','Violet','Audi')";
		String query10="insert into test.cardata values('AP27OP5555','Indigo','Bolero')";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			
			System.out.println("Step1");
			Statement statement=connection.createStatement();
			System.out.println("Step 2");
			statement.executeUpdate(query2);
			statement.executeUpdate(query3);
			statement.executeUpdate(query4);
			statement.executeUpdate(query5);
			statement.executeUpdate(query6);
			statement.executeUpdate(query7);
			statement.executeUpdate(query8);
			statement.executeUpdate(query9);
			statement.executeUpdate(query10);
						
			System.out.println("Step3");
			
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
