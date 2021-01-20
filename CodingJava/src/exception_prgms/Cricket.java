package exception_prgms;

import java.math.*;
import java.text.*;
import java.util.*;

public class Cricket 
{
	
	public static void add(long array[],int limit)
	{
		DecimalFormat df=new DecimalFormat("0.0");
		df.setRoundingMode(RoundingMode.DOWN);
		long sum=0;
		for(int i=0;i<limit;i++)
		{
			sum=array[i]+sum;
		}
		if(limit<=5)
		{
			double j=0.1;
			j=j*limit;
			System.out.println("For "+ df.format(j) + " overs the score is "+sum);
		}
		else if(limit==6)
		{
			int j=1;
			System.out.println("After "+ j+" over the score is "+ sum);
		}
		else if(limit==12)
		{
			int j=2;
			System.out.println("After "+ j+" overs the total score is "+ sum);
		}
		else
		{
			double j=0.1;
			j=j*limit+0.4;
			System.out.println("After "+ j+" overs the score is "+ sum);
		}
	}
	
	public static long push(long array[],long i ,int j)
	{
		int top=j-1;
		long val=i;
		return array[top]=val;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("                       INDIA VS AUSTRALIA                ");
		System.out.println("*************************************************************************************");
		System.out.println("                       INDIA won the toss and elected to BAT first                                   ");
		
		DecimalFormat df=new DecimalFormat("0.0");
		df.setRoundingMode(RoundingMode.DOWN);
		long a[]=new long[12];
		Scanner sc=new Scanner(System.in);
		int limit=1;
		for(limit=1;limit<13;limit++)
		{
			boolean name=true;
			while(name)
			{
				try 
				{
					if (limit<=5)
					{
						double k=0.1*limit;
						System.out.println("\n\n Please enter the runs for balls "+ df.format(k));
					}
					else if(limit==6)
					{
						int j=1;
						System.out.println("Please enter the runs for the over"+ j);
					}
					else if(limit==12)
					{
						int j=2;
						System.out.println("Please enter the runs for the over"+ j);
					}
					else
					{
						double k=0.1;
						k=k*limit+0.4;
						System.out.println("Please enter the runs for balls"+ df.format(k));
					}
					boolean check=true;
					while(check)
					{
						long run=sc.nextLong();
						if(run<7 && run>=0)
						{
							push(a,run,limit);
							add(a,limit);
							check=false;
						}
						else
						{
							System.out.println("Please enter the runs between 0 and 6");
						}
					}
					name=false;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Enter only numbers or Integers");
					sc.next();
				}
			}
		}
		
	}
}
