package AlphaCourse.Patterns;

public class NumberPyramid {
    public static void main(String args[])
    {
        int count=1;
        for(int lines =1;lines<=5;lines++)
        {
            //Spaces
           for(int spaces=4-lines;spaces>=0;spaces--)
           {
            System.out.print(" ");
           }
           for(int iteration=1;iteration<=lines;iteration++)
           {
            System.out.print(count+" ");
           }
           count++;
           System.out.println();
        }
    }
    
}
