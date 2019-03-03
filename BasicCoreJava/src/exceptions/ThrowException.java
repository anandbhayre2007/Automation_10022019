package exceptions;

public class ThrowException {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=20;
		
		if(a==b)
		{ 
			System.out.println("Number matched");
		}else
		{
			throw new RuntimeException("Number not matched a="+a+" and b="+b);
		}
		
	}

}
