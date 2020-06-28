package day.problems.medium;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;

/**
 * @description: 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和
 * 一个目标值 target。找出 nums 中的三个整数，
 * 使得它们的和与 target 最接近。返回这三个数的和。
 * 假定每组输入只存在唯一答案。
 * @author: CJN
 * @time: 2020/6/24 上午11:12
 * @Description:
 * @Modified By:
 */
public class No16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        Arrays.sort(nums);
        int dis = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < dis) {
                    dis = Math.abs(sum - target);
                    ans = sum;
                }
                if (sum > target) {
                    r -= 1;
                } else if (sum < target) {
                    l += 1;
                } else {
                    return target;
                }
            }
        }
        return ans;
    }
}
