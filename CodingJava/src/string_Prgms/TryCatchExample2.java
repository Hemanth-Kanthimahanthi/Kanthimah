package string_Prgms;

public class TryCatchExample2 
{  
	  
    public static void main(String[] args) 
    {  

        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println("Catch the data from try block");  
        }  
        System.out.println("rest of the code");  
    }  
      
}  