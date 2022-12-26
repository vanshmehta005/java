package AlphaCourse.Loop;

import java.util.*;

public class ContinueNumberGame {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int a = 1; a > 0; a++) {
                int b = sc.nextInt();
                if (b % 10 == 0) {
                    continue;
                }
                System.out.println(b);
            }
        }
    }
}
