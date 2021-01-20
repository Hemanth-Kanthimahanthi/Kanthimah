package basic_logics;

public class NestedFor 
{
	public static void main(String[] args) 
	{
		System.out.println("Start Exercise");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i<=2)
				{
					System.out.println("Push Up...........");
				}
				else
				{
					System.out.println("Take 1min Rest........");
				}
			}
		}	
	}
}
