package arrays.medium;

import java.util.Arrays;

/**
 * @description:
 * @author: CJN
 * @time: 2020/6/22 下午5:46
 * @Description:
 * @Modified By:
 */
public class Solution {
    private void testNo1343() {
        int[] arr = new int[] {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int t = 5;
        System.out.println(new No1343().numOfSubarrays1(arr, k, t));
    }

    private void testNo15() {
        int[] nums = new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        System.out.println(new No15().threeSum(nums));
    }

    private void testNo31() {
        int[] nums = new int[]{1, 3, 2};
        new No31().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void testNo34() {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(new No34().searchRange(nums, target)));
    }

    public static void main(String[] args) {
        new Solution().testNo34();
    }
}
