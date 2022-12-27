package JavaConceptBuild.Patterns;

public class ButterflyPattern {
    public static void main(String args[])
    {
        int n=5;
        //Upper Half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=(2*(n-i));k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("*");
            }
            for(int k=0;k<((n*i)-(i*2));k++)
            {
                System.out.print(" ");
            }
            for(int l=n-i;l>=1;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
