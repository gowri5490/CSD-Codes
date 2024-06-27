package CsdPhoneZone;
import java.util.*;
public class UserMainCode {
	public static MobileInfo extractDetails(String mobileDetails)
	{
		String[] details=mobileDetails.split(":");
		return new MobileInfo(details[0],details[1],details[2],Double.parseDouble(details[3]));
	}
	
	public static void main(String args[])

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile details");
		String input=sc.next();
		MobileInfo mbl=extractDetails(input);
		
		if(mbl.calculateMobilePriceToBePaid()!=-1)
		{
			System.out.println("Mobile details");
			System.out.println("Mobile Name: "+mbl.getMobileName());
			System.out.println("Mobile IMEI Number: "+mbl.getImeiNumber());
			System.out.println("Mobile Brand: "+mbl.getMobileBrand());
			System.out.println("Mobile Price: "+mbl.getMobilePrice());
			System.out.println("Amount to be paid: "+mbl.calculateMobilePriceToBePaid());
			
		}
		else
		{
			System.out.println("Invalid Mobile Details");	
		}
	}
}
