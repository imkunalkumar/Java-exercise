import java.util.Scanner;
public class Binary_Addition
{
	public static void main(String [] args)
	{
	Scanner in= new Scanner(System.in);
	int i=0,r=0;
	int []sum=new int [20];
	System.out.println("enter the first binnary no.");
	int b1=in.nextInt();
	System.out.println("enter the second binnary no.");
	int b2=in.nextInt();
	
	while(b1!=0||b2!=0)
	{
	sum[i++]=(int)((b1%10+b2%10+r)%2);
	r=(int)(((b1%10+b2%10+r)/2));
	b1=b1/10;
	b2=b2/10;
	}
	if(r!=0)
	{
	sum[i++]=r;
	}
	 --i;
	System.out.println("Addition of binnary no. is: ");
	while(i>=0)
	{
		System.out.print(sum[i--]);
			
	}
	}
}
 
