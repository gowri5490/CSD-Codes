package CsdUserDefinedException;
import java.util.*;

public class Main {
	public static Scanner input=new Scanner(System.in);
	
	public static Candidate getCandidateDetails() throws InvalidSalaryException
	{
		System.out.println("Enter the candidate Details");
		System.out.println("Name");
		
		String c_name=input.next();
		
		System.out.println("Gender");
		
		String c_gender=input.next();
		
		System.out.println("Expected Salary");
		
		double salary=input.nextDouble();
		
		
		
		if(salary<10000)
		{
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
		}
		else
		{
			Candidate obj=new Candidate();
			
			obj.setName(c_name);
			obj.setGender(c_gender);
			obj.setExpectedSalary(salary);
			
			return obj;
			
		}
		
	}
	public static void main(String args[])
	{
		try
		{
			Candidate obj1=getCandidateDetails();
			
			System.out.println("Registration Successful");
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
