package JavaConceptBuild.Patterns;

public class FloydsTriangle {
    public static void main(String args[])
    {
        int m=1,n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(m);
                m++;
            }
            System.out.println();
        }
    }
}
