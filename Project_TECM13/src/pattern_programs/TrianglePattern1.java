package pattern_programs;

public class TrianglePattern1 
{
	public static void main(String[] args) 
	{
		int star=0;
		for(int i=1;i<=4;i++)
		{
			star++;
			for(int x=1;x<=star;x++)
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
 	
 	*
 	**
 	***
 	****
 	
 	------
 */
 
