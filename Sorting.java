
import java.util.Arrays;
public class Sorting
{
public static void main(String [] args)
{
int [] number={12,10,98,5,52,101,987};
String [] str_1={"ram","sita","hanuman","ravan"};
System.out.println("array befor sorting is:"+Arrays.toString(number));
Arrays.sort(number);
System.out.println("After sorting:"+Arrays.toString(number));
System.out.println("array befor sorting is:"+Arrays.toString(str_1));
Arrays.sort(str_1);
System.out.println("After sorting:"+Arrays.toString(str_1));
}
}