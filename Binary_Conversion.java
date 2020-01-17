import java.util.Scanner;
public class Binary_Conversion
{
	public static void main(String [] args)
	{
	Scanner in= new Scanner(System.in);
	int i=0,r=0;
	int []num=new int [20];
	System.out.println("enter the first binnary no.");
	int d=in.nextInt();
	
	
	while(d!=0)
	{
	num[i++]=(int)(d%2);
	d=d/2;
	}
	 i--;
	System.out.println("binnary no. is: ");
	while(i>=0)
	{
		System.out.print(num[i--]);	
	}
	}
}
 
