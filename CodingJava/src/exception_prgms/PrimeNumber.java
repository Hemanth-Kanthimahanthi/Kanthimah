package exception_prgms;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		  int remainder;
		  boolean isPrime=true;
		  int numberToCheck=20;
		  for(int i=2;i<=numberToCheck/2;i++)
		  {
		  
		            remainder=numberToCheck%i;
		            System.out.println(numberToCheck+" Divided by "+ i + " gives a remainder "+remainder);
		            
		       //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
		     if(remainder==0)
		     {
		        isPrime=false;
		        break;
		     }
		  }
		  
		  		if(isPrime)
		  			System.out.println(numberToCheck + " is a Prime number");
		  		else
		  			System.out.println(numberToCheck + " is not a Prime number");
		    
	}

}
