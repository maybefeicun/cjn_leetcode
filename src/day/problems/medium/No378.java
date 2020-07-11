package day.problems.medium;

import java.util.PriorityQueue;
import java.util.Queue;

public class No378 {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return -1;
        }
        Queue<Integer> queue = new PriorityQueue<>();
        for (int[] nums : matrix) {
            for (int num : nums) {
                queue.add(num);
            }
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        return queue.remove();
    }
}
