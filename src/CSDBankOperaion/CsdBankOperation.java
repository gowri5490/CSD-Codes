package CSDBankOperaion;

import java.util.Scanner;
public class CsdBankOperation implements IBankAccountOperation{
	private int initialBalance=0;
	public static void main(String args[])
	{
		CsdBankOperation bankOperations= new CsdBankOperation();
		bankOperations.showBalance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to deposit:");
		int depositAmount=sc.nextInt();
		bankOperations.depositFunds(depositAmount);
		
		System.out.println("Enter the amount of withdraw:");
		int withdrawAmount=sc.nextInt();
		bankOperations.withdrawFunds(withdrawAmount);
		
		sc.close();
	}
 
	public void showBalance()
	{
		System.out.println("Your current balance is:" +initialBalance);
	}
	public void depositFunds(int amount)
	{
		initialBalance+=amount;
		System.out.println("You have deposited" +amount+".Your current balance is:"+initialBalance);
	}
	public void withdrawFunds(int amount)
	{
		if(amount>initialBalance)
		{
			System.out.println("insufficiant balance.Withdrawal canceled.");
		}
		else
		{
			initialBalance-=amount;
			System.out.println("You have withdraw"+amount+".Your current balance:"+initialBalance);
		}
	}
 
}
