package JavaConceptBuild.GreedyStrategy;
import java.util.*;
public class FractionalKnapsack {
    public static void main(String args[])
    {
        int prof[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        double ratio[][] = new double[prof.length][2];
        for(int i=0;i<prof.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=prof[i]/(double)weight[i];
        }

        //ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=W;
        int finalVal=0;

        for(int i=ratio.length-1;i>=0;i--)
        {
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx])
            {
                finalVal+=prof[idx];
                capacity-=weight[idx];
            }
            else
            {
                finalVal+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }

        System.out.println("Total Units "+finalVal);    
    }
}
