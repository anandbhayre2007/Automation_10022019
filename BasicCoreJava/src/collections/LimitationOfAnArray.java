package collections;

public class LimitationOfAnArray {

	public static void main(String[] args) 
	{
		int a=10;
		String str="Anand";
		char gender='M';
		boolean status=true;
		
		Object[] obj= new Object[5];
		obj[0]=a;
		obj[1]=str;
		obj[2]=gender;
		obj[3]=status;
		obj[4]=new LimitationOfAnArray();

	}

}
