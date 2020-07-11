package day.problems.easy;

import java.util.Arrays;

/**
 * @description:
 * @author: CJN
 * @time: 2020/6/23 上午11:21
 * @Description:
 * @Modified By:
 */
public class Solution {
    private void testNo718() {
        int[] A = new int[] {1, 2, 3, 2, 1};
        int[] B = new int[] {3, 2, 1, 4, 7};
        System.out.println(new No718().findLength(A, B));
    }

    public static void main(String[] args) {
//        String a = "1010";
//        String b = "1011";
//        System.out.println(new No67().addBinary(a, b));
        new Solution().testNo718();
    }
}
