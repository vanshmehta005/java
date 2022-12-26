package AlphaCourse.Arrays;
import java.util.*;
public class TrappingRainwater {
    public static int trappedRainwater(int height[])
    {
        int n=height.length;
        int waterLevel=0;
        //Calculate Auxillary Arrays i.e
        //calculate left max boundary - array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary - array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        //loop
        for(int i=0;i<n;i++)
        {
            //waterlevel=min(leftmax bound,rightmax bound)
            waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trappedwater = waterlevel-height[i]
            trappedWater+=waterLevel-height[i];
        }

        return trappedWater;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] =new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(trappedRainwater(arr));
    }
}
