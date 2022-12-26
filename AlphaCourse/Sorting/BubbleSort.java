package AlphaCourse.Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[])
    {
        for(int turns=0;turns<arr.length-1;turns++)
        {
            boolean swap=false;
            for(int i=0;i<arr.length-1-turns;i++)
            {
                int temp=0;
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swap=true;
                }
            }
            if(swap==false)
            {
                break;
            }
        }
        printArray(arr);
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,3,4,2,1};
        bubbleSort(arr);
    }
}
