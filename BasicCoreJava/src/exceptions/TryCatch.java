package exceptions;

import java.util.Hashtable;

public class TryCatch {

	public static void main(String[] args)
	{
		
		try
		{
			//Arithmetic Exception
			int a=10;
			int b=5;			
			System.out.println(a/b);
			
			//Null pointer Exception
			Hashtable<String, String> table= new Hashtable<String, String>();
			//table.put(null, "anand");			
			//System.out.println(table.get(null));
			
			//StringIndexOutOfBoundException
			String str="A";
			System.out.println(str.charAt(1));
			
			Thread.sleep(5000);
			
			
		}catch(Exception e)
		{
			System.out.println("Fail : Divident is zero");
		}
		System.out.println("Anand");

	}

}
