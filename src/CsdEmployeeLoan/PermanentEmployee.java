//Make this class inherit the Employee class
package CsdEmployeeLoan;

public class PermanentEmployee extends Employee 
{
    private double basicPay;
    
    // Getters and Setters
	
    public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
    
    //1. Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  
    public PermanentEmployee(int employeeId,String employeeName,double basicPay)
    {
        super(employeeId,employeeName);
        this.basicPay=basicPay;
    }
    
    
	
	//2. Implement the  - public void calculateSalary() - method
	@Override
    public void calculateSalary()
    {
        double pfAmount=basicPay * 0.12;
        
        double salary=basicPay-pfAmount;
        
        setSalary(salary);
    }
    
    
}