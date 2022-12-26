package AlphaCourse.Recursion;

public class FibonacciSeries {
    public static int printFibo(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }

        return printFibo(n-1)+printFibo(n-2);
    }
    public static void main(String args[])
    {
        int no=6;
        for(int i=0;i<no;i++)
        {
            System.out.print(printFibo(i)+" ");
        }
    }
}
