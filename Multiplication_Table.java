import java.util.Scanner;
public class Multiplication_Table{
	public static void main(String[] args) 
	{

//Taking Integer As Input.
Scanner in= new Scanner(System.in);
System.out.println("enter any integer");
int inp=in.nextInt();

//multiplication table
for(int i=1;i<=10;i++)
{
	int a;
	a=inp*i;
System.out.println(inp+"*"+i+"="+a);
}

	}
}