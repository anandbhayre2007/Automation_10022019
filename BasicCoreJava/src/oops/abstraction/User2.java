package oops.abstraction;

public class User2 {

	public static void main(String[] args) 
	{
		RBI ref=null;
		String name=bankName();		
		if(name.equals("SBI")) {
			ref= new SBI();
		}else if(name.equals("HDFC"))
		{	
			ref= new HDFC();
		}else if(name.equals("City"))
		{
			ref= new City();
		}
		
		//Bank services - Script
		ref.creditCard();
		ref.debitCard();
		ref.savingsAcc();
		ref.currentAcc();
		
		
	}
	
	public static String bankName()
	{
		return "SBI";
	}

}
