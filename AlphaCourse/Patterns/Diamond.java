package AlphaCourse.Patterns;

public class Diamond {
    public static void main(String args[])
    {
        for(int lines=1;lines<=4;lines++)
        {
            for(int spaces=4-lines;spaces>=0;spaces--)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=(2*lines)-1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int lines1=4;lines1>=1;lines1--)
        {
            for(int spaces=4-lines1;spaces>=0;spaces--)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=(2*lines1)-1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
