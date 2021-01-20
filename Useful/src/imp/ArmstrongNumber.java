package imp;

public class ArmstrongNumber 
{
	 
	public static void main(String[] args)
	{
		
		 int i = 153; //Input number to check armstrong  
		 int t, d, c = 0;
 
	       t = i;
	        while (t != 0)
	        {
	        	
	        	/* On each iteration, remainder is powered by that of ds n
	        	 */
	            System.out.println("Current Number is "+t);
	            d =t % 10;
				System.out.println("Current digit is "+d);
	            //sum of cubes of each ds is equal to that itself
	            c = c + d*d*d;
				System.out.println("Current cube sum is "+c);
	            t /= 10;
	           
	        }
 
	        //check givent and c is equal to or not 
	        if(c == i)
	            System.out.println(i + " is an Armstrong Number");
	        else
	            System.out.println(i + " is not an Armstrong Number");
 
	}
 
}
