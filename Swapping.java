import java.util.Scanner;
public class Swapping
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Fisrt no.");
int n1=in.nextInt();
System.out.println("Enter Second no.");
int n2=in.nextInt();
System.out.println("before swapping first no.is:"+n1+"\nand second no. is:"+n2);
//swapping
int temp=n1;
n1=n2;
n2=temp;
System.out.println("After swapping first no.is:"+n1+"\nand second no. is:"+n2);
}
}