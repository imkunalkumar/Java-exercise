import java.util.Scanner;
public class Average
{
public static void main(String [] args)
{
	double a=0;
	double x=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter,how many no. do you want to calculate average");
int n=in.nextInt();
//calculation of avarage
while(x<n)
{
	System.out.println("enter the"+x+"number");
a+=in.nextInt();
x++;
}
System.out.println("average is:"+a/2);
}
}