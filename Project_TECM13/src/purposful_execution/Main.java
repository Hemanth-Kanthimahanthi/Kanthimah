package purposful_execution;

import java.util.Scanner;

public class Main 
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the id");
		int id=scan.nextInt();
		System.out.println("enter the accout type");
		String acnt=scan.next();
		System.out.println("enter the balance");
		double bal=scan.nextDouble();
		System.out.println("enter the amount");
		double amt=scan.nextDouble();
		Account ac=new Account(id, acnt, bal);
		System.out.println(ac.getDetails());
		boolean status=ac.withDrawn(amt);
	}
}