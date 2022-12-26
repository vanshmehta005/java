package AlphaCourse.Patterns;
import java.util.*;
public class Butterfly {
    public static void butterfly(int n)
    {
        //First Half
        for(int lines=1;lines<=n;lines++)
        {
            //Stars
            for(int star1=1;star1<=lines;star1++)
            {
                System.out.print("*");
            }

            //Spaces
            for(int space=1;space<=2*(n-lines);space++)
            {
                System.out.print(" ");
            }

            //Stars
            for(int star2=1;star2<=lines;star2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for(int lines1=n;lines1>=1;lines1--)
        {
                        //Stars
            for(int star1=1;star1<=lines1;star1++)
            {
                System.out.print("*");
            }

            //Spaces
            for(int space=1;space<=2*(n-lines1);space++)
            {
                System.out.print(" ");
            }

            //Stars
            for(int star2=1;star2<=lines1;star2++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        butterfly(n);
       
    }
}
