package AlphaCourse.Arrays;

public class LinearSearchStrings {
    public static int linearSearchString(String array[],String key)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        String array[]={"PaniPuri","PavVada","CholeBhature","Dhokla"};
        String key="Dhokla";
        int index=linearSearchString(array,key);
        if(index==-1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Found at "+index);
        }
    }
}
