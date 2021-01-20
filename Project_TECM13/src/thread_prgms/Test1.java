package thread_prgms;

public class Test1 extends Thread
{
	CommonResource cr;

	public Test1() 
	{
		this.cr = cr;
	}
	public void run()
	{
		cr.resource1();
	}
	
}
