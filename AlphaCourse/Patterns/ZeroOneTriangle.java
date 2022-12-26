package AlphaCourse.Patterns;
public class ZeroOneTriangle{
    public static void main(String args[])
    {
        for(int lines=1;lines <=5;lines++)
        {
            for(int value=1;value<=lines;value++)
            {
                if(lines%2!=0)
                {
                    if(value%2!=0)
                    {
                        System.out.print("1");
                    }
                    else
                    {
                        System.out.print("0");
                    }
                }
                else{
                    if(value%2==0)
                    {
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}