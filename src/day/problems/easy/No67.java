package day.problems.easy;

import java.util.Arrays;

/**
 * @description: 67. 二进制求和
 * @author: CJN
 * @time: 2020/6/23 上午11:13
 * @Description:
 * @Modified By:
 */
public class No67 {
    public String addBinary(String a, String b) {
        /**
         * @Description: 一个简单的二进制数加法
         * @param a
         * @param b
         * @return: java.lang.String
         * @time: 2020/6/23 上午11:19
         */
//        if (a.length() < b.length()) {
//            String temp = a;
//            a = b;
//            b = temp;
//        }
        char[] ans = new char[Integer.max(a.length(), b.length())];
        int i = a.length() - 1;
        int j = b.length() - 1;
        int cnt = 0;
        int k = 0;
        while (i >= 0 || j >= 0) {
            // 这里有一个经典的问题，如果||中第一个成立，就不用判断第二个了
            char chA = i >= 0 ? a.charAt(i) : '0';
            char chB = j >= 0 ? b.charAt(j) : '0';
            if (chA == chB) {
                if (chA == '0') {
                    ans[k++] = cnt == 0 ? '0' : '1';
                    cnt = 0;
                } else {
                    ans[k++] = cnt == 0 ? '0' : '1';
                    cnt = 1;
                }
            } else {
                ans[k++] = cnt == 0 ? '1' : '0';
            }
            i--;
            j--;
        }
        if (cnt == 0) {
            return new StringBuffer(new String(ans)).reverse().toString();
        } else {
            return new StringBuffer(new String(ans) + "1").reverse().toString();
        }
    }
}
