package run;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority=6)
    public void c_method(){
    System.out.println("I'm in method 6");
    }
    @Test(priority=9)
    public void b_method(){
    System.out.println("I'm in method 9");
    }
    @Test(priority=1)
    public void a_method(){
    System.out.println("I'm in method 1");
    }
    @Test(priority=0)
    public void e_method(){
    System.out.println("I'm in method 0");
    }
    @Test(priority=3)
    public void d_method(){
    System.out.println("I'm in method 3");
    }
}
