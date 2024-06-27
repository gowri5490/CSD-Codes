package CsdAccountManipulation;
import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int accountNumber=sc.nextInt();
        double balance=sc.nextDouble();
        double minimumBalance=sc.nextDouble();
        
        
        int customerId=sc.nextInt();
        String customerName=sc.next();
        String emailId=sc.next();
        
        double amount=sc.nextDouble();
        
        Customer cstmr=new Customer(customerId,customerName,emailId);
        
        SavingsAccount sa=new SavingsAccount(accountNumber,cstmr,balance,minimumBalance);
        
        if(sa.withdraw(amount))
        {
        System.out.println(sa.getBalance());
        }
        
    }
}