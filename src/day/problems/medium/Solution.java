package day.problems.medium;

import arrays.medium.No209;
import arrays.medium.No62;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 这是一个专门进行结果查看的类
 * @author: CJN
 * @time: 2020/6/22 下午3:58
 * @Description:
 * @Modified By: chen
 */
public class Solution {
    private void stringIndexOf() {
        String string = "sfbafa";
        System.out.println(string.indexOf('f'));
        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf('c'));
    }

    public void testPatternMatching() {
        String p = "abba";
        String v = "dogcatcatdog";
//        System.out.println(new InterviewProblem().patternMatching(p, v));
//        p = "aaaa";
//        v = "dogcatcatdog";
//        System.out.println(new InterviewProblem().patternMatching(p, v));
        p = "ab";
        v = "";
        System.out.println(new InterviewProblem().patternMatching(p, v));
    }

    private void testNo16() {
        int[] nums = new int[] {-1,0,1,1,55};
        int target = 3;
        System.out.println(new No16().threeSumClosest(nums, target));
    }

    private void testNo139() {
        String s = "bb";
        List<String> wordDict = Arrays.asList("a","b","bbb","bbbb");
        System.out.println(new No139().wordBreak(s, wordDict));
    }

    private void testNo62() {
        int m = 7;
        int n = 3;
        System.out.println(new No62().uniquePaths(m, n));
    }

    private void testNo209() {
        int s = 7;
        int[] nums = new int[]{2,3,1,2,4,3};
        System.out.println(new No209().minSubArrayLen(s, nums));
    }

    private void testNo215() {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(new No215().findKthLargest(nums, k));
        System.out.println(Arrays.toString(nums));
    }

    private void testNo39() {
        int[] nums = new int[]{2, 3, 5};
        int target = 8;
        System.out.println(new No39().combinationSum(nums, target));
    }

    public static void main(String[] args) {
        new Solution().testNo39();
//        new Solution().testPatternMatching();
    }
}
