package day.problems.hard;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Name: No32 最长有效括号，利用动态规划进行解题
 * 1. 使用栈去解题，首先存储'('的下标，遇到')'首先弹出一个，然后判断是否为空
 * 2. 利用dp算法进行解题
 * @Author: CJN
 * @Date: 2020/7/4 16:46
 * @Description: //TODO
 * @Modified By:
 */
public class No32 {
    public int longestValidParentheses(String s) {
        if ("".equals(s)) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    res = Math.max(res, i - stack.peek());
                }
            }
        }
        return res;
    }

    public int longestValidParentheses2(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        for (int i = 2; i < s.length() + 1; i++) {
            if (s.charAt(i - 1) == ')') {
                if (s.charAt(i - 2) == '(') {
                    dp[i] = dp[i - 2] + 2;
                } else {
                    if (i - dp[i - 1] - 2 >= 0 && s.charAt(i - dp[i - 1] - 2) == '(') {
                        dp[i] = dp[i - 1] + dp[i - dp[i - 1] - 2] + 2;
                    }
                }
            }
        }
        int res = 0;
        for (int temp : dp) {
            res = Math.max(res, temp);
        }
        return res;
    }
}
