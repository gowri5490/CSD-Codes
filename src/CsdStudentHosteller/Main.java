package CsdStudentHosteller;
import java.util.Scanner;
public class Main {
	static Scanner input=new Scanner(System.in);
	public static Hosteller getHostellerDetails()
	{
		
		
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		int stu_id=input.nextInt();
		
		System.out.println("Student Name");
		String stu_name=input.next();
		
		System.out.println("Department Id");
		int dp_id=input.nextInt();
		
		System.out.println("Gender");
		String stu_gen=input.next();
		
		System.out.println("Phone Number");
		String stu_ph=input.next();
		
		System.out.println("Hostel Name");
		String Hstl_name=input.next();
		
		System.out.println("Room Number");
		int r_no=input.nextInt();
		
		
		
		Hosteller obj=new Hosteller();
		
		obj.setStudentId(stu_id);
		obj.setName(stu_name);
		obj.setDepartmentId(dp_id);
		obj.setGender(stu_gen);
		obj.setPhone(stu_ph);
		obj.setHostelName(Hstl_name);
		obj.setRoomNumber(r_no);
		
		return obj;
		
	}
	public static void main(String args[])
	{
		Hosteller hst=getHostellerDetails();
		System.out.println("Modify Room Number(Y/N)");
		String yesNo=input.next();
		
		yesNo=yesNo.toUpperCase();
		
		if(yesNo.equals("Y"))
			{
				System.out.println("New Room Number");
				int newr_no=input.nextInt();
				hst.setRoomNumber(newr_no);
			}

		
		System.out.println("Modify Phone Number(Y/N");
		String noYes=input.next();
		
			noYes=noYes.toUpperCase();
			
			if(noYes.equals("Y"))
			{
				System.out.println("New Phone Number");
				 String newstu_ph=input.next();
				 hst.setPhone(newstu_ph);
			}
		
		
		
		System.out.println("The Student Details");
		System.out.println(hst.getStudentId()+" "+hst.getName()+" "+hst.getDepartmentId()+" "+hst.getGender()+" "+hst.getPhone()+" "+hst.getHostelName()+" "+hst.getRoomNumber());
		
	}

}
