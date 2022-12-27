package JavaConceptBuild.Patterns;

public class ZeroOneTrianglePattern {
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==1)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
