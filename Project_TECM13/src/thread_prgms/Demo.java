package thread_prgms;

public class Demo 
{
	public static void main(String[] args) 
	{
		CommonResource cr=new CommonResource();
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		t1.start();
		t2.start();
		
	}
}
