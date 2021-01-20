package receive;

public class Interview 
{
	public String name;
	public String emailId;
	public int batchCode;
	protected static String company1;
	protected static String company2;
	public Interview(String name, String emailId, int batchCode, String company1) 
	{
	
		this.name = name;
		this.emailId = emailId;
		this.batchCode = batchCode;
		this.company1 = company1;
	}
	public Interview(String name, String emailId, int batchCode, String company1,String company2) 
	{
		
		this(name,emailId,batchCode,company1);
		this.company2 = company2;
		
	}
	
	public String getCompany1() 
	{
		return company1;
	}
	public void setCompany1(String company1) 
	{
		this.company1 = company1;
	}
	public String getCompany2() 
	{
		return company2;
	}
	public void setCompany2(String company2) 
	{
		this.company2 = company2;
	}

}