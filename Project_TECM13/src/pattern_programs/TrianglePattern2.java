package pattern_programs;

public class TrianglePattern2 
{
	public static void main(String[] args) 
	{
		int star=6;
		for(int i=1;i<=5;i++)
		{
			star--;
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
	
	*****
	****
	***
	**
	*
	
	------
*/