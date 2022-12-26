package AlphaCourse.Arrays;
import java.util.*;
public class LargestNumberInArray {
    public static int getLargestNumber(int array[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
            }
            if(array[i]<smallest)
            {
                smallest=array[i];
            }
        }
        System.out.println("Smallet is "+smallest);
        return largest;
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,7,-10,44,98};
        int number=getLargestNumber(array);
        System.out.println("Largest is "+number);
    }
}
