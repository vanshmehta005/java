package AlphaCourse.Arrays;
import java.util.*;
public class BinarySearch{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int lim=sc.nextInt();
        int arr[]= new int[lim];
        for(int i=0;i<lim;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        int start=0;
        int end=lim-1;
        int key=sc.nextInt();
        while(start<=end)
        {
            int mid=(start+end)/2;
            //COmparission
            if(key==arr[mid])
            {
                System.out.println(mid);;
            }
            //Right
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    }
}