package AlphaCourse.TwoDArray;
import java.util.*;
public class LargestAndSmallest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int m =3,n=3;
        int arr[][]= new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                }
                if(min>arr[i][j])
                {
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Max is "+max);
        System.out.println("Minimum is "+min);
    }
}
