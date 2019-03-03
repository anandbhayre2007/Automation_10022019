package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		map.put("Anand", 30964);
		map.put("Vikas", 40757);
		map.put("Vishal", 12643);
		map.put(null,4236);
		map.put("Anand", 3094);
		
		Set<String> set=map.keySet();
		
		for(String key:set)
		{
			System.out.println(map.get(key));
		}
		
		/*System.out.println(map.get(null));
		
		Hashtable<String, String> map2= new Hashtable<String, String>();
		
		map2.put("username", "anand123");
		map2.put("password", "passworfd1134");
		map2.put(null,"hghs23");
		System.out.println(map2.get(null));*/
		
		

	}

}
