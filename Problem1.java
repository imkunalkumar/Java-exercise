// Java program to find area and parameter of circle using switch case 
import java.util.Scanner;
import java.lang.Math.*;
public class Problem1{
	public static void main(String [] args)
	{
	Scanner a=new Scanner(System.in);
	System.out.println("enter 1 for Area And 2 For Perimeter Of Circle");
	int a1=a.nextInt();
	Scanner io = new Scanner(System.in);
  System.out.println("Input the radius of the circle: ");
  double r = io.nextDouble();
  // switch statement with int data type 
	switch(a1)
	{
		case 1:
		{
			//double area=Math.Pi*r*r;
			System.out.println("Area of circle:"+(Math.PI*r*r));
			break;
		}
		case 2:
		{
			//double perimeter=2*Math.Pi*r;
			System.out.println("Area of circle:"+(2*Math.PI*r));
			break;
		}
		
	}
	}
}
