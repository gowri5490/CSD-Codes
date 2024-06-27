package CSDBankOperaion;

public interface IBankAccountOperation {
	void depositFunds(int amount);
	void withdrawFunds(int amount);
	void showBalance();
 
}