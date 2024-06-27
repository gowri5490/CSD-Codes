package CsdMovieTicket;
import java.util.Scanner;
 
public class CinemaTicket
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        double total=0.0;
        
        System.out.print("Enter the no of ticket:\n");
        
        int no_tc=input.nextInt();
        if(no_tc <5 || no_tc>40)
        {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }
        
        
        
        
        System.out.print("Do you want refreshment:\n");
        
        String ref_yn=input.next();
        
        ref_yn=ref_yn.toLowerCase();
        
        System.out.print("Do you have coupon code:\n");
        
        String cou_yn=input.next();
        
        cou_yn=cou_yn.toLowerCase();
        
        System.out.print("Enter the circle:\n");
        
        char Cir_kq=input.next().charAt(0);
        
        
        
        //Cir_kq=Cir_kq.toLowerCase();
        
        //King or Queen otherwise invalid
        
        if(Cir_kq!='k'&&Cir_kq!='q')
        {
            System.out.println("Invalid Input");
            return;
        }
        
        else if(Cir_kq=='k')
        {
        	total=(double)no_tc*75;
        }
        else if(Cir_kq=='q')
        {
        	total=(double)no_tc*150;
        }
        
        
        if(no_tc>20)
        {
        	total=total-total*0.10;
        }
        
        if(cou_yn.equals("y"))
        {
        	total=total-total*0.02;
        }
        
        
        if(ref_yn.equals("y"))
        {
        	total=total+(double)(no_tc*50);
        }
        
        
        
        
        System.out.format("Ticket cost: %.2f",total);
        
    }
}    
        
        
        
    