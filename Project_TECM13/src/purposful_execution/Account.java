package purposful_execution;

public class Account 
{
	private int id;
	private String accounttype;
	private double balance;
	 public Account(int id,String accounttype,double balance)
	{
		this.id=id;
		this.accounttype=accounttype;
		this.balance=balance;
	}
	public int getId()
	{
		return this.id;
	}
	public String getAccountType()
	{
		return this.accounttype;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public int setId(int id)
	{
		return this.id;
	}
	public String setAccountType(String accounttype)
	{
		return this.accounttype;
	}
	public double setBalance(double balance)
	{
		return this.balance;
	}
	public boolean withDrawn(double amount)
	{
		if(amount<balance)
		{
			System.out.println("balance: "+this.balance);
			balance=balance-amount;
			System.out.println("New balance: "+this.balance);
			return true;
		}
		else
		{
			//System.out.println("your entered amount is more than present balance");
			System.out.println("balance:"+balance);
			return false;
		}
	}
		public String getDetails()
		{
			return "Account ID :"+this.id+"\nAccount Type :"+this.accounttype;
		}
	}
