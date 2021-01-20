package pattern_programs;

public class TrianglePattern5 
{
	public static void main(String[] args) 
	{
		int space=-1;
		int star=6;
		for(int i=1;i<=5;i++)
		{
			space++;
			star--;
			for(int x=1;x<=space;x++)
			{
				System.out.print(' ');
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

*****
 ****
  ***
   **
    *

------
*/