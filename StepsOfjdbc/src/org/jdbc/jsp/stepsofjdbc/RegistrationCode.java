package org.jdbc.jsp.stepsofjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegistrationCode 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=hemu";
		
		String query="insert into test.userinfo values(?,?,?,?)";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Name :");
			String name=scanner.next();
			preparedStatement.setString(1,name);
			
			System.out.println("Enter Phone Number :");
			String phone=scanner.next();
			preparedStatement.setString(2,phone);
			
			System.out.println("Enter Password :");
			String pass=scanner.next();
			preparedStatement.setString(3,pass);
			
			System.out.println("Enter ID :");
			String id=scanner.next();
			preparedStatement.setString(4,id);
			
			preparedStatement.executeUpdate();
			
			connection.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
