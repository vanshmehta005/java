package JavaConceptBuild.Patterns;

public class PalindromicPatternWIthNumbers {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
