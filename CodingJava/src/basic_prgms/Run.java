package basic_prgms;

public class Run 
{
	public boolean check(int A[])
	{
		boolean c=false;
		for (int i : A) 
		{
		
			if(i!=44)
			{
				c=false;
			}
			else 
			{
				c=true;
				break;
			}	
		}
		
		return c;
	}
	public static void main(String[] args) 
	{
		int A[]= {22,41,55,66};
		Run r1=new Run();
		System.out.println("The result is "+r1.check(A));
	}
}
