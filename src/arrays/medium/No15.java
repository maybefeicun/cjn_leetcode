package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 15. 三数之和
 * @author: CJN
 * @time: 2020/6/26 下午4:38
 * @Description:
 * @Modified By:
 */
public class No15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            if (nums[i] == -4) {
                System.out.println(1);
            }
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) {
                        l += 1;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r -= 1;
                    }
                    l += 1;
                    r -= 1;
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r -= 1;
                } else {
                    l += 1;
                }
            }
        }
        return res;
    }
}
