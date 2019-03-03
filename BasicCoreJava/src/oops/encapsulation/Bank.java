package oops.encapsulation;

public class Bank 
{
	
	private int balance;	
	private String customerName;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int amt) {
		if(amt>1000)
		{
		balance = amt+150;
		}else if(amt<1000)
		{
			balance=amt-500;
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}
