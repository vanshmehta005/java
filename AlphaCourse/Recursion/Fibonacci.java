package AlphaCourse.Recursion;

public class Fibonacci {
    public static int printFibo(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }
        int fbm1=printFibo(n-1);
        int fbm2=printFibo(n-2);
        int fibo=fbm1+fbm2;
        return fibo;
    }
    public static void main(String args[])
    {
        int no=5;
        System.out.println(printFibo(no));
    }
}
