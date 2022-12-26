package AlphaCourse.Patterns;

public class HollowRhombus {
    public static void main(String args[])
    {
        int m=1,n=5;
        for(int i=5;i>=m;i--)
        {
            for(int spaces=1;spaces<=i;spaces++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==5 || j==1 || j==5)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
