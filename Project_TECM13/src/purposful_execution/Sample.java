package purposful_execution;

public class Sample 
{
	 public static void main(String[] args) 
	 {
	 String s = "ramu";
	 int a=0,i=0,e=0,o=0,u=0;
	 
	 for(int i1=0;i1<=s.length()-1;i1++)
	 {
		 char ch = s.charAt(i1);
			  //System.out.println(ch);
			  if(ch=='a'||ch=='A')
			  {
				  a++;
			  }
			
	 }
	  System.out.println("char a is having"+a);
	}
}
