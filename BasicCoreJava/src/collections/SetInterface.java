package collections;

import java.util.*;

public class SetInterface {

	public static void main(String[] args) 
	{
		
		//HashSet
		/*HashSet<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(20);
		
		for(int a:set)
		{
			System.out.println(a);
		}*/
		
		/*//HashSet
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(20);
		
		for(int a:set)
		{
			System.out.println(a);
		}*/
		
		//TreeSet
		TreeSet<Integer> set=new TreeSet<>();
		set.add(30);
		set.add(20);
		set.add(40);
		set.add(20);
		
		for(int a:set)
		{
			System.out.println(a);
		}

	}

}
