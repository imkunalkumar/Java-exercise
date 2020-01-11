import java.util.Scanner;
public class Taking_Input {
	public static void main(String[] args) 
	{

//Taking Integer As Input.
Scanner in= new Scanner(System.in);
System.out.println("enter any integer");
int input_integer=in.nextInt();
System.out.println("entered integer is:");
System.out.println(input_integer);

//Taking String As Input.
Scanner in1= new Scanner(System.in);
System.out.println("enter any string");
String input_string= in1.nextLine();
System.out.println("entered string is:\n"+input_string);

//Taking Decimal Value As Input.
Scanner in2=new Scanner(System.in);
System.out.println("Enter any Decimal value");
double input_dec=in2.nextDouble();
System.out.print("Entered Decimal Value is:\n"+input_dec);

	}
}