package AlphaCourse.Arrays;
import java.util.*;

public class chatgpt {
    public static int longestSubsequence(int n, int[] perm) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
    
        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (perm[j] < perm[i] && dp[j]+1 > dp[i]) {
                    dp[i] = dp[j]+1;
                }
            }
        }
    
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        return max+1;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,6,5,3,1};    
        System.out.println(longestSubsequence(6,arr)); // Output: 4
    }
}
