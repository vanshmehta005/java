package AlphaCourse.Strings;

public class Palindrome {
    public static boolean palindrome(String str)
    {
        String str1=str.toLowerCase();
        int n=str1.length();
        for(int i=0;i<str1.length()/2;i++)
        {
            if(str1.charAt(i)!=str1.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String str="raCecar";
        System.out.println(palindrome(str));
    }
}
