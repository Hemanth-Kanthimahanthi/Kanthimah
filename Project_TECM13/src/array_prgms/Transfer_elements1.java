package array_prgms;

import java.util.Scanner;

public class Transfer_elements1 
{
 public static void main(String[] args) 
 {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1st Array Size :");
	int size1=scan.nextInt();
	int [] a1=new int[size1];
	System.out.println("Enter "+size1+" elements :");
	System.out.println("Enter 2nd Array Size :");
	int size2=scan.nextInt();
	int [] a2=new int[size2];
	System.out.println("Enter "+size2+" elements :");
	int [] a3=new int[a1.length+a2.length];
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.nextInt();
		a3[i]=a1[i];
	}
	int k=a3.length;
	for(int j=0;j<=a1.length-1;j++)
	{
		a2[j]=scan.nextInt();
		a3[k]=a2[j];
		k++;
	}
	System.out.println(a1[k]);
	System.out.println(a2[k]);
	System.out.println(a3[k]);
 }
}
