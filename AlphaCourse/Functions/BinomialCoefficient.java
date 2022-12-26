package AlphaCourse.Functions;
import java.util.*;
public class BinomialCoefficient{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int r =sc.nextInt();
        double bc = (fact(n)/(fact(r)*fact(n-r)));
        System.out.println(bc);
    }
    public static int fact(int a)
    {
        int factorial=1;
        for(int i=1;i<=a;i++)
        {
            factorial = factorial *i;
        }
        return factorial;
    }
    
}
