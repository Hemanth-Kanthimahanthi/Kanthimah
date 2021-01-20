package thread_prgms;

public class Test2 extends Thread
{
	CommonResource cr;

	public Test2() 
	{
		this.cr = cr;
	}
	public void run()
	{
		cr.resource2();
	}
	
}
