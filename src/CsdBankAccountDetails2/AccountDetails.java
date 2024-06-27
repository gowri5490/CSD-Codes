package CsdBankAccountDetails2;
import java.util.Scanner;
public class AccountDetails 
	{
		public static Scanner input=new Scanner(System.in);
		
		public static Account getAccountDetails()
		{
			System.out.println("Enter account id:");
			int ac_id=input.nextInt();
			
			System.out.println("Enter account type:");
			String ac_type=input.next();
			
			boolean isBalance=true;
			int ac_balance;
			
			do
			{	
				System.out.println("Enter balance:");
				
				ac_balance=input.nextInt();
				
				if(ac_balance<=0)
				{
					System.out.println("Balance should be positive");
				}
			
			}while(ac_balance<=0);
			return new Account(ac_id,ac_type,ac_balance);
		}
		
		public static int getWithdrawAmount()
		{
	
			int wt_amount;
			
			do
			{
				System.out.println("Enter amount to be withdraw:");
				wt_amount=input.nextInt();
			
				if(wt_amount<=0)
				{
					System.out.println("Amount should be positive");
					
				}
				
			
			}while(wt_amount<=0);
			return wt_amount;
		}
		
		public static void main(String args[])
		{
			Account ac=getAccountDetails();
			int wthAmount=getWithdrawAmount();
			
			ac.withdraw(wthAmount);
		}
	

}
