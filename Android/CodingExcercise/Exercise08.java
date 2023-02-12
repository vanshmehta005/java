package Android.CodingExcercise;
public class Exercise08 {
    public static void main(String args[])
    {
        int lim=4;
        int no=1;
        //Lines
        for(int i=1;i<=lim;i++)
        {
            //Spaces
            for(int j=lim-1;j>=i;j--)
            {
                System.out.print(" ");
            }

            //Values
            for(int k=1;k<=i;k++)
            {
                System.out.print(no+" ");
            }
            no++;
            System.out.println();
        }
    }
}
