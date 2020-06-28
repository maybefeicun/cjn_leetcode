package arrays.medium;

import java.util.Arrays;

/**
 * @description: 1343. 大小为 K 且平均值大于等于阈值的子数组数目
 * @author: CJN
 * @time: 2020/6/22 下午5:11
 * @Description:
 * @Modified By:
 */
public class No1343 {
    public int dfs (int[] arr, int i, int k, int threshold, int[] mask) {
        if (arr[arr.length - 1] * k < threshold || arr.length - i < k) {
            return 0;
        }
        if (k == 0 && threshold <= 0) {
            System.out.println(Arrays.toString(mask));
            return 1;
        }
        int count1 = dfs(arr, i + 1, k, threshold, mask);
        if (i > 0 && arr[i] == arr[i - 1] && mask[i - 1] == 0) {
            return count1;
        }
        mask[i] = 1;
        int count2 = dfs(arr, i + 1, k - 1, threshold - arr[i], mask);
        mask[i] = 0;
        return count1 + count2;
//        return dfs(arr, i + 1, k, threshold) + dfs(arr, i + 1, k - 1, threshold - arr[i]);
    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        /**
         * @Description: 给你一个整数数组 arr 和两个整数 k 和 threshold 。
         * 请你返回长度为 k 且平均值大于等于 threshold 的子数组数目。
         * @param arr
         * @param k
         * @param threshold
         * @return: int
         * @time: 2020/6/22 下午5:111
         */
        if (arr == null || k > arr.length || k == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int[] mask = new int[arr.length];
        return dfs(arr, 0, k, threshold * k, mask);
    }

    public int numOfSubarrays1(int[] arr, int k, int threshold) {
        if (arr.length < k) {
            return 0;
        }
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp += arr[i];
        }
        ans += temp / k >= threshold ? 1 : 0;
        for (int i = k; i < arr.length; i++) {
            temp = temp + arr[i] - arr[i - k];
            ans += temp / k >= threshold ? 1 : 0;
        }
        return ans;
    }
}
