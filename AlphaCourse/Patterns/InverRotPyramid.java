package AlphaCourse.Patterns;

public class InverRotPyramid {
    public static void main(String args[])
    {
        for(int lines=1;lines<=5;lines++)
        {
            for(int space=1;space<=5-lines+1;space++)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=lines;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
