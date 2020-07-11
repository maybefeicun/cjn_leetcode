package day.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Name: No39
 * @Author: CJN
 * @Date: 2020/7/5 19:57
 * @Description: //TODO
 * @Modified By:
 */
public class No39 {
    private void helper(int[] candidates, List<List<Integer>> res, List<Integer> temp, int target, int i) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
        } else if (target > 0 && i < candidates.length) {
            temp.add(candidates[i]);
            helper(candidates, res, temp, target - candidates[i], i);
            temp.remove(temp.size() - 1);
            helper(candidates, res, temp, target, i + 1);
        }
    }

    private void dfs(int[] candidates, List<List<Integer>> res, List<Integer> temp, int target, int begin) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = begin; i < candidates.length; i++) {
                if (target - candidates[i] < 0) {
                    break;
                }
                temp.add(candidates[i]);
                dfs(candidates, res, temp, target - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(candidates, res, temp, target, 0);
        return res;
    }
}
