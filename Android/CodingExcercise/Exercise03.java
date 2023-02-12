package Android.CodingExcercise;

public class Exercise03 {
    public static void main(String args[])
    {
        int rem[] = new int[100];
        int no=10;
        int i=0;
        while(no>0)
        {
            rem[i]=no%2;
            no=no/2;
            i++;
        }

        for(int j=i-1;j>=0;j--)
        {
            System.out.print(rem[j]);
        }
    }
}
