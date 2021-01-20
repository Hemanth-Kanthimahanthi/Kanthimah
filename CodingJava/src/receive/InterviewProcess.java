package receive;

public class InterviewProcess extends Interview
{
	public InterviewProcess(String name, String emailId, int batchCode, String company1, String company2) 
	{
		super(name, emailId, batchCode, company1, company2);
		
	}
	public void interviewInfo()
	{
		if(company1!=null)
		{
			System.out.println("Name of the candidate is "+this.name+" with EmailId "+this.emailId+" & Batchcode "+this.batchCode+" is selected for further rounds of interview in "+this.company1);
			
		}
		else
		{
			System.out.println("Name of the candidate is "+this.name+" with EmailId "+this.emailId+" & Batchcode "+this.batchCode+" is selected for  further rounds of interview in "+this.company2);
			
		}
		
	}

	public static void main(String[] args) 
	{
		InterviewProcess i1=new InterviewProcess("Harsha","h1rsh1@gmail.com",1235,company1,"Amazon");
		i1.interviewInfo();
		InterviewProcess i2=new InterviewProcess("Lavudu","L123@gmail.com",1285,"Flipkart", company2);
        i2.interviewInfo();
	}
}
