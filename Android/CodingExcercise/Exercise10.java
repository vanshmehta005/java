package Android.CodingExcercise;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        average(arr);
    }

    public static void average(int x[])
    {
        double sum=0,avg=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=x[i];
        }
        avg=(double)sum/(x.length);
        System.out.println(sum);
        System.out.println(avg);
    }
}
