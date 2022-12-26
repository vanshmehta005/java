package AlphaCourse.Arrays;
import java.util.*;
    
public class SubArray1
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int sum=0;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0; i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            //----------------------------------
            
            for(int j=0;j<size;j++)
            {
                for(int k=j;k<size;k++)
                {
                    for(int l=j;l<=k;l++)
                    {
                        sum+=arr[l];
                    }
                    if(max<=sum)
                    {
                    max=sum;
                    }
                    else if(min>=sum)
                    {
                    min=sum;
                    }
                    else{
                    }
                    sum=0;
                }
                System.out.println(max);
                System.out.println(min);
                System.out.println();
            }
            
            //----------------------------------
        }
}