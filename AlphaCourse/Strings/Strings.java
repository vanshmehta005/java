package AlphaCourse.Strings;
import java.util.*;
public class Strings {
    public static void main(String args[])
    {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");

        //String are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name=sc.next();
        System.out.println(name.length());

        //concatenation
        String lastName="mehta";
        System.out.println(name+" "+lastName);
        System.out.println(name.charAt(3));
    }
}
