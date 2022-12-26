package AlphaCourse.Recursion;

public class Factorial {
    public static int Fact(int no)
    {
        if(no==1)
        {
            return 1;
        }
        int fn=no*Fact(no-1);
        return fn;
    }
    public static void main(String args[])
    {
        int no=4;
        System.out.println(Fact(no));
    }
}
