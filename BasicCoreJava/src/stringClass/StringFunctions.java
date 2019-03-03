package stringClass;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringFunctions {

	public static void main(String[] args) 
	{
		String name="anand";		
		
		System.out.println((name.length())-(name.replace("n", "").length()));
		
		
		
		
		
		
		
		String name2="Anand";
		String name3= "Anand$Bhayre$Techbodhi$Pune";
		String name4= "AnandVishalBhayreVishalTechbodhiVishalPune";
		
		//Split
		String[] str=name4.split("Vi.*?l",2);
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		
		
		/*
		
		//Replace
		//System.out.println(name.replace('a', 'c'));
		//System.out.println(name3.replace("$", "  "));
		System.out.println(name4.replace("Vishal", "Vikas"));
		
		
		
		//Substring
		System.out.println(name3.substring(6));
		System.out.println(name3.substring(0, 5));
		
		
		
		
		//Trim
		System.out.println(name);
		System.out.println(name.trim());
		
		System.out.println(name.length());
		
		//Equals & EqualsIgnoreCase
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		
		
		//1. Length
		int l=name.length();
		System.out.println(l);
		
		//2. charAt
		char c=name.charAt(0);
		System.out.println(c);
		*/
		
		

	}

}
