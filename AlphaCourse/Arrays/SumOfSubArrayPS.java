package AlphaCourse.Arrays;
import java.util.*;
public class SumOfSubArrayPS {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[] = new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i]=sc.nextInt();
        }
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];

        //Prefix Array
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }

        //SubArray
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                currsum= i==0?prefix[j] : prefix[j]-prefix[i-1];
                if(maxsum<=currsum)
                {
                    maxsum=currsum;
                }
            }
        }

        System.out.println("max sum = "+ maxsum);
    }
}
