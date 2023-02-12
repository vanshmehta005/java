package Android.CodingExcercise;
import java.util.Scanner;
public class Exercise09 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[][]= new int[n][n];
        int arr2[][]= new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        add(arr1, arr2);
    }

    public static void add(int x1[][],int x2[][])
    {
        int x3[][]=new int[x1.length][x2.length];
        for(int i=0;i<x3.length;i++)
        {
            for(int j=0;j<x3.length;j++)
            {
                x3[i][j]=x1[i][j]+x2[i][j];
            }
        }

        for(int i=0;i<x3.length;i++)
        {
            for(int j=0;j<x3.length;j++)
            {
                System.out.print(x3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
