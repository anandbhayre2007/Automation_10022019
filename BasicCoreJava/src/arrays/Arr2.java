package arrays;

public class Arr2 {

	public static void main(String[] args) 
	{
		String[][] str= new String[2][4];
		
		//Row 1
		str[0][0]="Vikas";
		str[0][1]="Indve";
		str[0][2]="VSY";
		str[0][3]="Pune";
		
		//Row 2
		str[1][0]="Vishal";
		str[1][1]="Pandey";
		str[1][2]="Cybage";
		str[1][3]="JBL";
		
		for(int r=0; r<str.length; r++)
		{
			for(int c=0; c<str[r].length; c++)
			{
				System.out.println(str[r][c]);
			}
		}
		

	}

}
