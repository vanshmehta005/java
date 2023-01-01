package JavaConceptBuild.GreedyStrategy;
import java.util.*;
public class ActivitySelectionUnsorted {
    public static void main(String[] args) {
        int start[] = {5,1,4,0,3,7,5,0};
        int end[] = {7,2,6,5,4,10,9,1};
        
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        
        for (int i = 0; i < activities.length; i++)
        {
            // Loop through all elements of current row
            for (int j = 0; j < activities[i].length; j++)
            {
                System.out.print(activities[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> ans= new ArrayList<>();
        int maxAct=1;
        ans.add(activities[0][0]);
        int endTime = activities[0][2];
        
        for(int i=1;i<end.length;i++)
        {
            if(activities[i][1]>=endTime)
            {
                maxAct++;
                ans.add(activities[i][0]);
                endTime=activities[i][2];
            }
        }
        
        System.out.println("Max Activity "+ maxAct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println("A"+ans.get(i));
        }
}
}
