package day.problems.hard;

/**
 * @description:
 * @author: CJN
 * @time: 2020/6/27 上午9:29
 * @Description:
 * @Modified By:
 */
public class Solution {
    private void testNo41() {
        int[] nums = new int[]{1, 2, 0};
        System.out.println(new No41().firstMissingPositive(nums));
        int[] nums1 = new int[]{3, 4, -1, 1};
        System.out.println(new No41().firstMissingPositive(nums1));
        int[] nums2 = new int[]{7,8,9,11,12};
        System.out.println(new No41().firstMissingPositive(nums2));
    }

    public static void main(String[] args) {
        new Solution().testNo41();
    }
}
