package pattern_programs;

public class TrianglePattern6 
{
	public static void main(String[] args) 
	{
		int space=5;
		int star=-1;
		for(int i=1;i<=5;i++)
		{
			space--;
			star+=2;
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
 
 
    *
   ***
  *****
 *******
*********

 */