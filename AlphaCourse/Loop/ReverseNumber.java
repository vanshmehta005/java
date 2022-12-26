package AlphaCourse.Loop;

import java.util.*;

public class ReverseNumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int no = sc.nextInt();
            while (no > 0) {
                int a = no % 10;
                System.out.print(a);
                no = no / 10;
            }
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }

}
