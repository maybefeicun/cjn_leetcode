package day.problems.hard;

/**
 * @description: 41. 缺失的第一个正数
 * @author: CJN
 * @time: 2020/6/27 上午9:22
 * @Description:
 * @Modified By:
 */
public class No41 {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= 0 || nums[i] > nums.length) {
                i += 1;
            }
            else if (nums[i] == i + 1 || nums[i] == nums[nums[i] - 1]) {
                i += 1;
            } else {
                // exchange nums[i] and nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }
}
