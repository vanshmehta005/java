package AlphaCourse.Loop;

import java.util.*;

public class NumberGame {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i > 0; i++) {
                int a = sc.nextInt();
                if (a % 10 == 0) {
                    break;
                }
            }
        }
    }

}
