package JavaConceptBuild.Patterns;

public class NumberPyramid
{
    public static void main(String args[])
    {
        int n=5,no=1;;
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(no+" ");
            }
            no++;
            System.out.println();
        }
    }
}