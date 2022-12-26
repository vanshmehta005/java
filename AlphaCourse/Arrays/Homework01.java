package AlphaCourse.Arrays;
import java.util.*;
public class Homework01 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int j=0;j<=size;j++)
        {
            for(int k=0;k<=size;k++)
            {
                if(j==k)
                {
                    count++;
                }
            }
            if(count<=1){
                System.out.println(count);
                count=0;
            }
            else
            {
                System.out.println("false");
                break;
            }
        }
    }
}
