package functions;

public class ReturnArray {

	public static void main(String[] args) 
	{
		String[][] str=test();
		
		for(int r=0; r<str.length; r++)
		{
			for(int c=0; c<str[r].length; c++)
			{
				System.out.println(str[r][c]);
			}
		}
		
		ReturnArray obj3=new ReturnArray();
		
		ReturnArray obj2=test2();
		
		

	}
	
	public static ReturnArray test2()
	{
		ReturnArray obj3=new ReturnArray();
		return obj3;
	}
	
	public static String[][] test()
	{
		
		String[][] str= {{"U1","P1","A1"},{"U2","P2", "A2"}, {"U3","P3","A3"}};
		return str;
	}
	
	public static String test3()
	{
		return "test message";
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}

}
