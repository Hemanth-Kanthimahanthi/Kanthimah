package basic_prgms;

public class Sample 
{
	public void add()
	{
		int x=10,y=50;
		int z=x+y;
		System.out.println("Sum of two no's ="+z);
	}
	
    public void charValue()
    {
    	char ch='J';
    	System.out.println(ch);
    }
    public void booleanValue()
    {
    	boolean b=false;
    	System.out.println(b);
    }
    
    public void floatValue()
    {
    	float f=2;
    	System.out.println(f);
    }
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.add();
		s1.charValue();
		s1.booleanValue();
		s1.floatValue();
	}
}
