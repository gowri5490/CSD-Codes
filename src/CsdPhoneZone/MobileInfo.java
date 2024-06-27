package CsdPhoneZone;
public class MobileInfo
{
	private String mobileName;
	private String imeiNumber;
	private String mobileBrand;
	private double mobilePrice;
	
	public MobileInfo(String mobileName,String imeiNumber,String mobileBrand,double mobilePrice)
	{
		this.mobileName=mobileName;
		this.imeiNumber=imeiNumber;
		this.mobileBrand=mobileBrand;
		this.mobilePrice=mobilePrice;
	}
	
	public String getMobileName()
	{
		return mobileName;
	}
	
	public void setMobileName(String mobileName)
	{
		this.mobileName=mobileName;
	}
	
	public String getImeiNumber()
	{
		return imeiNumber;
	}
	
	public void setImeiNumber(String imeiNumber)
	{
		this.imeiNumber=imeiNumber;
	}
	public String getMobileBrand()
	{
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand)
	{
		this.mobileBrand=mobileBrand;
	}
	
	public double getMobilePrice()
	{
		return mobilePrice;
	}
	
	public void setMobilePrice(double mobilePrice)
	{
		this.mobilePrice=mobilePrice;
	}
	public double calculateMobilePriceToBePaid()
	{
		if(imeiNumber.length()!=15)
			return -1;
		if(mobilePrice<=0)
			return -1;
		double price=0;
		if(mobileBrand.equals("Samsung"))
			price=mobilePrice*0.98;
		else if(mobileBrand.equals("Realme"))
			price=mobilePrice*0.94;
		else if(mobileBrand.equals("OnePlus"))
			price=mobilePrice*0.96;
		else if(mobileBrand.equals("Oppo"))
			price=mobilePrice*0.95;
		else if(mobileBrand.equals("Vivo"))
			price=mobilePrice*0.97;
		else
			return -1;
		return price;
		
	}
}