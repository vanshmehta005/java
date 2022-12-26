package AlphaCourse.Arrays;
import java.util.*;
public class KadanesAlgorithm {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ms = Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++)
        {
            cs+=arr[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Our max SUBARRAY sum is = "+ms);
    }
}
