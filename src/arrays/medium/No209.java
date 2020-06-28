package arrays.medium;

/**
 * @description:
 * @author: CJN
 * @time: 2020/6/25 下午6:38
 * @Description:
 * @Modified By:
 */
public class No209 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while (j < nums.length) {
            if (sum < s) {
                sum += nums[j];
                j += 1;
            } else {
                res = Math.min(res, j - i);
                sum -= nums[i];
                i += 1;
            }
        }
        if (i == 0 && sum < s) {
            return 0;
        }
        while (sum >= s) {
            res = Math.min(res, j - i);
            sum -= nums[i];
            i += 1;
        }
        return res;
    }
}
