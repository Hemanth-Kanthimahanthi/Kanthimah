import java.io.IOException;
import java.util.ArrayList;

public class TestSample1 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		DataDriven1 d1=new DataDriven1();
		ArrayList data=d1.getData("Rishi");
		
		/*System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));*/
		System.out.println(data);
	}

}
