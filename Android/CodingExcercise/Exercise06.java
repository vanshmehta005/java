package Android.CodingExcercise;
import java.util.Scanner;
public class Exercise06 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        multiply(arr1, arr2);
    }

    public static void multiply(int x1[],int x2[])
    {
        int mul[]=new int[x1.length];
        for(int i=0;i<mul.length;i++)
        {
            mul[i]=x1[i]*x2[i];
        }

        for(int i=0;i<mul.length;i++)
        {
            System.out.print(mul[i]);
        }


    }
}
