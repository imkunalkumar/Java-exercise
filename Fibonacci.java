package day1;
public class Fibonacci {

	public static void main(String[] args) {
		int [] arr=new int[50];
		for(int i=0;i<20;i++)
		{
			if(i<=1)
			{
				arr[i]=i;
				
			}
			else
			{
				arr[i]=arr[i-1]+arr[i-2];
				
			}
			System.out.println(arr[i]);
		}

	}

}
