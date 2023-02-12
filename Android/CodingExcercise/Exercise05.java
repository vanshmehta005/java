package Android.CodingExcercise;
import java.util.Scanner;
public class Exercise05 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        reverse(inp);
    }

    public static void reverse(String x)
    {
        char a[]= x.toCharArray();
        String rev="";
        for(int i=a.length-1;i>=0;i--)
        {
            rev+=a[i];
        }
        System.out.println(rev);
    }
}
