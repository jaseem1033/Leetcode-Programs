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
    int a = 1;
    public void test(TreeNode root, int temp) {
        if(root.left == null && root.right == null) {
            a = Math.max(a, temp);
            return;
        }
        if(root.left != null) test(root.left,temp + 1);
        if(root.right != null) test(root.right,temp + 1);
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        test(root, 1);
        return a;
    }
}