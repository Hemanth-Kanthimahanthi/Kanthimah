package pattern_programs;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		int at=6;
		int star=-1;
		for(int i=1;i<=6;i++)
		{
			at--;
			star++;
			for(int x=1;x<=at;x++)
			{
				System.out.print('@');
			}
			for(int y=1;y<=star;y++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

/* 
OUTPUT
------

@@@@@
@@@@*
@@@**
@@***
@****
*****

------
*/