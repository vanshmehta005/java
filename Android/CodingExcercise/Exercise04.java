package Android.CodingExcercise;
import java.util.Scanner;
public class Exercise04 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        count(input);
    }

    public static void count(String x)
    {
        char[] ch=x.toCharArray();
        int letter =0,space=0,num=0,others=0;
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetter(ch[i]))
            {
                letter++;
            }
            else if(Character.isSpaceChar(ch[i]))
            {
                space++;
            }
            else if(Character.isDigit(ch[i]))
            {
                num++;
            }
            else
            {
                others++;
            }
        }
        System.out.println(letter+" "+num+" "+space+" "+others);
    }
}
