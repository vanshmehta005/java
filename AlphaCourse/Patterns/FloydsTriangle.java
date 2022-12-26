package AlphaCourse.Patterns;
import java.util.*;
public class FloydsTriangle{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int iterations =sc.nextInt();
        int count =1;
        for(int lines=1;lines<=iterations;lines++)
        {
            for(int value=1;value<=lines;value++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
            
        }
    }
}