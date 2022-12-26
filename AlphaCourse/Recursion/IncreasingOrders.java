package AlphaCourse.Recursion;

public class IncreasingOrders {
    public static void printInc(int no)
    {
        if(no==1)
        {
            System.out.print(no+" ");
            return;
        }
        printInc(no-1);
        System.out.print(no+" ");
        
    }

    public static void main(String args[])
    {
        int no=10;
        printInc(no);
    }
}
