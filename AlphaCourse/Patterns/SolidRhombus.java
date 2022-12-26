package AlphaCourse.Patterns;

public class SolidRhombus {

    public static void rhombus(int n){
        for(int lines=n;lines>=1;lines--)
        {
            //Spaces
            for(int spaces=1;spaces<=lines;spaces++)
            {
                System.out.print(" ");
            }
            //Stars
            for(int stars=1;stars<=n;stars++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[])
    {
        rhombus(5);
    }
    
}
