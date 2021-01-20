package demo_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=hemu";
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Step 1..............");
			
			connection.close();
			System.out.println("Step 5.........");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
