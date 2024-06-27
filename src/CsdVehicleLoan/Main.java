package CsdVehicleLoan;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String v_no=sc.next();
        String m_name=sc.next();
        String v_type=sc.next();
        double price=sc.nextDouble();
        
       Vehicle vh=new Vehicle(v_no,m_name,v_type,price);
       
       System.out.println(vh.issueLoan());
       System.out.println(vh.takeInsurance());
    }
}