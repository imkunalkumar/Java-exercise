import java.util.Arrays;
public class Insert
{
public static void main(String [] args)
{
int[] number={12,10,98,5,52,101,987};
int pos=5;
int nvalue=28;
System.out.println("original array is:"+Arrays.toString(number));
for(int i=number.length-1; i > pos; i--){
    number[i] = number[i-1];
   }
  number[pos] = nvalue;
System.out.println("After Inserting the array is:"+Arrays.toString(number));
}
}