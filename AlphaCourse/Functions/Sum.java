package AlphaCourse.Functions;
import java.util.*;
public class Sum {    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int addition=sum(a,b);
        System.out.println(addition);

    }
    public static int sum(int c,int d){
        int add=c+d;
        return add;
    }
    
}
