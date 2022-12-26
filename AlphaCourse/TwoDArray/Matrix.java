package AlphaCourse.TwoDArray;
import java.util.*;
public class Matrix {
    public static boolean search(int matrix[][],int key,int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Key found at "+i+" , "+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr[][]= new int[3][3];
        int m=3,n=3;
        Scanner sc = new Scanner (System.in);
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        //Output
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int key=sc.nextInt();
        search(arr, key,m,n);
    }
}
