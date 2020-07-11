package day.problems.easy;

public class No718 {
    public int findLength(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            return 0;
        }
        int res = 0;
        int[][] dp = new int[A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[0]) {
                dp[i][0] = 1;
                res = 1;
            }
        }
        for (int j = 0; j < B.length; j++) {
            if (B[j] == A[0]) {
                dp[0][j] = 1;
                res = 1;
            }
        }
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < B.length; j++) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res;
    }
}
