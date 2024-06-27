package CsdBankAccountDetails2;

public class Account {
	
	private int accountId;
	private String accountType;
	private int balance;
	
	public Account(int accountId,String accountType,int balance)
	{
		this.accountId=accountId;
		this.accountType=accountType;
		this.balance=balance;
	}
	
	public int getAccountId()
	{
		return accountId;
	}
	
	public String getAccountType()
	{
		return accountType;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public boolean withdraw(int amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			
			System.out.println("Balance amount after withdraw:"+balance);
			return true;
		}
		else
		{
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}

}
