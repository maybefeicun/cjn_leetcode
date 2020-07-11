package day.problems.easy;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}


public class No108 {
    private TreeNode help(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }
        if (i == j) {
            return new TreeNode(nums[i]);
        }
        int mid = i + (j - i) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums, i, mid - 1);
        root.right = help(nums, mid + 1, j);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        return help(nums, 0, nums.length - 1);
    }
}
