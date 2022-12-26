package AlphaCourse.Strings;
import java.util.*;
public class Anagrams {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        
        if(s1.length()==s2.length())
        {
            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result=Arrays.equals(ch1, ch2);

            if(result)
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not an Anagram");
            }
        }
        else
        {
            System.out.println("Not an Anagram");
        }
    }
}
