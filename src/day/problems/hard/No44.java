package day.problems.hard;

/**
 * @Name: No44 通配符匹配
 * 1. 使用dp进行解题
  @Author: CJN
 * @Date: 2020/7/5 8:59
 * @Description: //TODO
 * @Modified By:
 */
public class No44 {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i < p.length() + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int i = 1; i < p.length() + 1; i++) {
            for (int j = 1; j < s.length() + 1; j++) {
                if (p.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - 1] || dp[i][j - 1];
                } else if (p.charAt(i - 1) == '?' || p.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[p.length()][s.length()];
    }
}
