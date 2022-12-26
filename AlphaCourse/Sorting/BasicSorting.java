package AlphaCourse.Sorting;
import java.util.*;
public class BasicSorting {
    public static void bubbleSort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            boolean noSwap=true;
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    noSwap=false;
                }
            }
            if(noSwap)
            {
                break;
            }
        }
        printArr(arr);
        
    }

    public static void selectionSort(int arr[])
    {
        int small=Integer.MAX_VALUE;
        for(int turns=0;turns<arr.length-1;turns++)
        {
            int minPos=turns;
            for(int j=turns+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[turns];
            arr[turns]=temp;
        }
        printArr(arr);
    }

    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
        printArr(arr);
    }
    public static void countingSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        printArr(arr);
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);   
    }
}
