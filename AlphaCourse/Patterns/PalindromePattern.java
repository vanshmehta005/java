package AlphaCourse.Patterns;

public class PalindromePattern {
    public static void main(String args[])
    {
        for(int lines =1;lines<=5;lines++)
        {
            //Space
            for(int space=1;space<=5-lines;space++)
            {
                System.out.print(" ");
            }
            //Left Numbers
            for(int num=lines;num>=1;num--)
            {
                System.out.print(num);
            }
            //Right Numbers
            for(int num=2;num<=lines;num++)
            {
                System.out.print(num);
            }   
            System.out.println();
        }
    }
    
}
