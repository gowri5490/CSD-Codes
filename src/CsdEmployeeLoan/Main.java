package CsdEmployeeLoan;
import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int e_id=sc.nextInt();
        String e_name=sc.next();
        double b_pay=sc.nextDouble();
        PermanentEmployee perEmp=new PermanentEmployee(e_id,e_name,b_pay);
        
        
        int hrs_wrk=sc.nextInt();
        int hr_wages=sc.nextInt();
        
        TemporaryEmployee tempEmp=new TemporaryEmployee(e_id,e_name,hrs_wrk,hr_wages);
        
       Loan l=new Loan();
       
       double p_empLoan=l.calculateLoanAmount(perEmp);
       double t_empLoan=l.calculateLoanAmount(tempEmp);
       
       
       System.out.println(p_empLoan);
       System.out.println(t_empLoan);
    }
    
}