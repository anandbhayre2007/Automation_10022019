package arrays;

public class Assignment {

	public static void main(String[] args)
	{
		int[] arr= {1,2,1,3,4,1,2,5,6,3,5,6};
		
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			boolean flag=true;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
				}
			}
			
			for(int k=i-1; k>=0; k--)
			{
				if(arr[k]==arr[i])
					flag=false;
			}
			if(flag)
			System.out.println(arr[i]+" is repeated "+ count+" times");
		}

	}

}
