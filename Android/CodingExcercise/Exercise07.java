package Android.CodingExcercise;
import java.util.Scanner;
public class Exercise07 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        count(arr);
    }

    public static void count(int x[])
    {
        int even=0,odd=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println(even+" "+odd);
    }
}
