package AlphaCourse.Recursion;

public class SumOfNaturalNumbers {
    public static int printSum(int no)
    {
        if(no==1)
        {
            return 1;
        }
        int sum=no+printSum(no-1);
        return sum;
    }
    public static void main(String args[])
    {
        int no = 10;
        System.out.println(printSum(no));
    }
}
