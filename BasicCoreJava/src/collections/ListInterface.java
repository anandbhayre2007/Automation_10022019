package collections;

import java.util.*;

public class ListInterface {

	public static void main(String[] args) 
	{
		/*ArrayList<String> list= new ArrayList<>();
		list.add("Anand");
		list.add("Bhayre");
		list.add("Pune");
		
		for(String s:list)
		{
			System.out.println(s);
		}*/
		
		//LinkedList
		/*LinkedList<String> list= new LinkedList<>();
		list.add("Anand");
		list.add("Bhayre");
		list.add("Pune");
		
		for(String s:list)
		{
			System.out.println(s);
		}*/
		
		//Vector
		List<String> list= new Vector<>();
		list.add("Anand");
		list.add("Bhayre");
		list.add("Pune");
		list.add("Anand");
		list.add("Bhayre");
		list.add("Pune");
		
		
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
