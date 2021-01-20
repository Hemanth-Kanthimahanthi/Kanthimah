package preparation;

public class StarPattern1 
{
	public static void main(String[] args) 
	{
		int space=5;
		int star1=0;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				space--;
				star1++;
			}
			else
			{
				space++;
				star1--;
			}
			for(int x=1;x<=space;x++)
			{
				System.out.print( ' ' );
			}
			for(int y=1;y<=star1;y++)
			{
				System.out.print('*');
			}
			System.out.println( ' ' ); 
		}
	}
}
