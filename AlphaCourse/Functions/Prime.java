package AlphaCourse.Functions;
import java.util.*;
public class Prime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        prime(a);
    }
    public static void prime(int a)
    {
        int count =0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count>1)
        {
            System.out.println("Not a prime");
        }
        else{
            System.out.println("Prime");
        }
    }
    
}
