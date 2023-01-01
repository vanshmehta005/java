package JavaConceptBuild.DynamicProgramming;
import java.util.*;
public class BinomialCoefficient {
    public static void main(String args[])
    {
        System.out.println(dp());
    }
    public static int dp()
    {
        int n=6;
        int r=2;
        int mod = 1000000007;
        if(r>n)
        {
            return 0;
        }
        if(n-r<r)
        {
            r=n-r;
        } 
        
        int arr[]= new int[r+1];
        arr[0]=1;

        for(int i=0;i<=n;i++)
        {
            for(int j=Math.min(r, i);j>0;j--)
            {
                arr[j]=(arr[j-1]+arr[j])%mod;
            }
        }
        return arr[r];
    }
}
