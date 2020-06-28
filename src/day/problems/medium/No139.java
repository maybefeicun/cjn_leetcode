package day.problems.medium;

import java.util.List;

/**
 * @description:
 * @author: CJN
 * @time: 2020/6/25 下午3:12
 * @Description:
 * @Modified By:
 */
public class No139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()];
        int min = Integer.MAX_VALUE;
        for (String word : wordDict) {
            if (word.length() <= s.length() &&
                    s.substring(0, word.length()).equals(word)) {
                dp[word.length() - 1] = true;
            }
            min = Math.min(min, word.length());
        }
        for (int i = min; i < s.length(); i++) {
            for (String word : wordDict) {
                if (i >= word.length() && dp[i - word.length()] &&
                        s.substring(i - word.length() + 1, i + 1).equals(word)) {
                    dp[i] = true;
                }
            }
        }
        return dp[s.length() - 1];
    }
}
