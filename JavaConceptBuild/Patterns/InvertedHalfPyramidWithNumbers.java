package JavaConceptBuild.Patterns;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String args[])
    {
        int m=1,n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(m);
                m++;
            }
            System.out.println();
            m=1;
        }
    }
}
