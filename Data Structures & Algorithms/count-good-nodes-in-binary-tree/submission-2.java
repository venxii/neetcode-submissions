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
    int count = 1;
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        dfs(root, root.val);
        return count;
    }

    private void dfs(TreeNode root, int max){
        if (root == null) return;
        int maxLeft = max, maxRight = max;
        if (root.left != null && root.left.val >= max) {
            count++;
            maxLeft = root.left.val;
        }
        if (root.right != null && root.right.val >= max){
            count++;
            maxRight = root.right.val;
        }
        dfs(root.left, maxLeft);
        dfs(root.right, maxRight);
    }
}
