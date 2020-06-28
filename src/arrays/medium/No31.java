package arrays.medium;

/**
 * @description: 31. 下一个排列
 * 利用可视化方法进行解题
 * @author: CJN
 * @time: 2020/6/27 上午11:13
 * @Description:
 * @Modified By:
 */
public class No31 {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return ;
        }
        int i = nums.length - 1;
        while (i >= 0) {
            if (i == 0) {
                break;
            }
            if (nums[i] > nums[i - 1]) {
                int l = i;
                int r = nums.length - 1;
                while (l < r) {
                    swap(nums, l++, r--);
                }
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > nums[i - 1]) {
                        swap(nums, i - 1, j);
                        break;
                    }
                }
                break;

            }
            i -= 1;
        }
        if (i == 0) {
            int l = 0;
            int r = nums.length - 1;
            while (l < r) {
                swap(nums, l++, r--);
            }
        }
    }
}
