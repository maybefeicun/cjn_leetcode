package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No94 {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            Stack<TreeNode> stack = new Stack<>();
            while (stack.isEmpty() || root != null) {
                if (root != null) {
                    stack.push(root);
                    root = root.left;
                    continue;
                }
                root = stack.pop();
                list.add(root.val);
                root = root.left;
            }
            return list;
        }
    }
}
