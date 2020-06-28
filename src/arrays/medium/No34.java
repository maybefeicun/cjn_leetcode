package arrays.medium;

/**
 * @description: 34. 在排序数组中查找元素的第一个和最后一个位置
 * @author: CJN
 * @time: 2020/6/28 下午9:17
 * @Description:
 * @Modified By:
 */
public class No34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0 ||
                nums[0] > target || nums[nums.length - 1] < target) {
            return new int[]{-1, -1};
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (nums[l] != target) {
            return new int[]{-1, -1};
        }
        int l1 = 0;
        int r1 = l;
        while (l1 < r1) {
            int mid = l1 + (r1 - l1) / 2;
            if (nums[mid] == target) {
                r1 = mid;
            } else {
                l1 = mid + 1;
            }
        }
        int l2 = l;
        int r2 = nums.length - 1;
        while (l2 < r2) {
            int mid = l2 + (r2 - l2) / 2;
            if (nums[mid] == target) {
                l2 = mid + 1;
            } else {
                r2 = mid;
            }
        }
        if (nums[l2] == target) {
            return new int[]{l1, l2};
        } else {
            return new int[]{l1, l2 - 1};
        }
    }
}
