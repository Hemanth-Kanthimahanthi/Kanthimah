package run;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Plan 
{
	@Test//(dependsOnMethods= {"pPost"})
	public void think()
	{
		System.out.println("Think before while writing the code ");
	}
	
	@Test(dataProvider="data")  //(enabled=false)
	public void pPost(String username,String password)
	{
		System.out.println("Ppost");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] data()
	{
		/*we have to create multidimensional dataect array to pass the values
		1st=username,password with good credit history
		2nd username ,password with no credit history
		3rd username, password with fraudulent credit history
		*/
		Object[][] obj=new Object[3][2];
		//1stset
		obj[0][0]="YUP";
		obj[0][1]="1048";
		
		//2nd set
		obj[1][0]="demo";
		obj[1][1]="2589";
		
		//3rd set
				obj[2][0]="enable";
				obj[2][1]="by569";
				return obj;
	}
}
