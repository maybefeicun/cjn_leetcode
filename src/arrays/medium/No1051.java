package arrays.medium;

/**
 * @description: 1051. 高度检查器
 * @author: CJN
 * @time: 2020/6/22 下午9:48
 * @Description:
 * @Modified By:
 */
public class No1051 {
    public int heightChecker(int[] heights) {
        /**
         * @Description: 实际上是对数组继续排序，然后判断移动人数的数量
         * 1. 最本的方法就是进行copy然后排序继续比较，O(nlogn),O(n)
         * 2. 模拟交换排序的内容进行交换，并且计算交换元素的个数
         * @param heights
         * @return: int
         * @time: 2020/6/22 下午9:48
         */
        if (heights == null || heights.length == 1) {
            return 0;
        }
        int[] arr = new int[101];
        for (int height : heights) {
            arr[height]++;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                if (heights[j++] != i) {
                    count++;
                }
            }
        }
        return count;
    }
}
