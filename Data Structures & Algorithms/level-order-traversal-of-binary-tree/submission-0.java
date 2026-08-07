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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        if (root == null) return res;
        
        q.offer(new Pair<>(root,0));
        res.add(new ArrayList<>(0));
        
        while (!q.isEmpty()){
            Pair<TreeNode, Integer> cur = q.poll();
            TreeNode temp = cur.getKey();
            int depth = cur.getValue();
            
            if (depth == res.size()) {
                res.add(new ArrayList<>());
            }
            res.get(depth).add(temp.val);
            if (temp.left != null) q.offer(new Pair<>(temp.left, depth + 1));
            if (temp.right != null) q.offer(new Pair<>(temp.right, depth + 1));
        }

        return res;
    }
}
