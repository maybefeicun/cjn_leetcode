package day.problems.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class No315 {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            res.add(0);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    res.set(i, res.get(i) + 1);
                }
            }
        }
        return res;
    }
}
