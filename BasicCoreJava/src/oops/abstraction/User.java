package oops.abstraction;

public class User {

	public static void main(String[] args) 
	{
		RBI ref;		
		ref=new HDFC();
		ref.creditCard();
		ref.debitCard();
		ref.savingsAcc();
		ref.currentAcc();
		
		ref=new City();
		ref.creditCard();
		ref.debitCard();
		ref.savingsAcc();
		ref.currentAcc();
		
		ref=new SBI();		
		ref.creditCard();
		ref.debitCard();
		ref.savingsAcc();
		ref.currentAcc();
		
	}
	
	

}
