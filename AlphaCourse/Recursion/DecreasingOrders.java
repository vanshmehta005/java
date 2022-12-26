package AlphaCourse.Recursion;
import java.util.*;
public class DecreasingOrders {
    public static void printDec(int no)
    {
        if(no==1)
        {
            System.out.println(no);
            return;
        }
        System.out.print(no+" ");
        printDec(no-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int upperLimit = sc.nextInt();
        printDec(upperLimit);   
    }
}
