/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Stack<Pair<TreeNode, Integer>> st = new Stack<>();
        st.push(new Pair<>(root, 1));
        int maxDepth = 1;
        while (!st.isEmpty()){
            Pair<TreeNode, Integer> dummy = st.pop();
            TreeNode temp = dummy.getKey();
            int depth = dummy.getValue();
            maxDepth = Math.max(depth, maxDepth);
            if (temp.left!=null) st.push(new Pair<>(temp.left, depth + 1));
            if (temp.right!=null) st.push(new Pair<>(temp.right, depth + 1));
        }
        return maxDepth;
    }
}
