//This is a bruteforce technique with worst tc of O(n^3)--- Worst Case
package AlphaCourse.Arrays;
import java.util.*;
public class SumOfSubArraysBF {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //SubArray and Sum
        long max_sum=Integer.MIN_VALUE;
        long curr_sum=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    curr_sum+=arr[k];
                    if(max_sum<curr_sum)
                    {
                        max_sum=curr_sum;
                    }
                }
                curr_sum=0;
            }
        }
        System.out.println(max_sum);
    }
}
