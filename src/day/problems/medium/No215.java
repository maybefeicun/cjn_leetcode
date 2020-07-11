package day.problems.medium;

/*
* 215. 数组中的第K个最大元素
* */

public class No215 {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return -1;
        }
        return nums[helper(nums, 0, nums.length - 1, nums.length - k + 1)];
    }

    public int helper(int[] nums ,int i, int j, int k) {
        int temp = patipation(nums, i, j);
        if (temp == k - 1) {
            return temp;
        } else if (temp < k - 1) {
            return helper(nums, temp + 1, j, k);
        } else {
            return helper(nums, 0, temp - 1, k);
        }
    }

    public int patipation(int[] nums, int i, int j) {
        int temp = nums[i];
        int l = i;
        int r = j;
        while (l < r) {
            while (l < r && nums[r] >= temp) {
                r -= 1;
            }
            nums[l] = nums[r];
            while (l < r && nums[l] <= temp) {
                l += 1;
            }
            nums[r] = nums[l];
        }
        nums[l] = temp;
        return l;
    }

    public void quickSort(int[] nums, int i, int j) {
        if (i < j) {
            int mid = patipation(nums, i, j);
            quickSort(nums, i, mid - 1);
            quickSort(nums, mid + 1, j);
        }
    }
}
