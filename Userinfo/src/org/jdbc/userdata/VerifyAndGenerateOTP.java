package org.jdbc.userdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class VerifyAndGenerateOTP 
{
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=hemu";
		
		String query="Select name from test.userinfo where PhoneNumber = ?";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter Phone Number :");
			String phonenumber=scanner.next();
			preparedStatement.setString(1,phonenumber);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				Random random=new Random();
				int otp=random.nextInt(10000);
				System.out.println(otp);
				if(otp<0)
				{
					otp=otp*-1;
				}
				if(otp<1000)
				{
					otp=otp+1000;
				}
				System.out.println("Enter OTP :");
				
				int userOtp=scanner.nextInt();
				
				if(userOtp==otp)
				{
					System.out.println("OTP is verified.......");
				}
				else
				{
					System.out.println("Invalid OTP..........");
				}
			}
			else
			{
				System.out.println("Invalid Phone Number......");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
