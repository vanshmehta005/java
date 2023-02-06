package AlphaCourse.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SubSequence {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sizeb=sc.nextInt();
        int arrb[]= new int[sizeb];
        for(int i=0;i<sizeb;i++)
        {
            arrb[i]=sc.nextInt();
        }
        int output=arr.length;
        if(arr[size-1]==arrb[sizeb-1])
        {
            System.out.println(output-1);
        }
        else
        {
            System.out.println(output);
        }
        

    }
}
