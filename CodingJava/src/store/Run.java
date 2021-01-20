package store;

public class Run implements Demo,Demo1
{

	@Override
	public void gamma() 
	{

	    System.out.println("I am gamma");
		
	}

	@Override
	public void delta() 
	{
		System.out.println("I am Delta");
	}

	@Override
	public void alpha() 
	{
		System.out.println("I am alpha");
	}

	@Override
	public void beta() 
	{
		System.out.println("I am Beta");
	}
	public static void main(String[] args) 
	{
		Run r1=new Run(); 
		r1.gamma();
		r1.alpha();
		r1.beta();
		r1.delta();
	}

}
