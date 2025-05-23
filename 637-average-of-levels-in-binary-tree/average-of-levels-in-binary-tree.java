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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty())
        {
            Double x = 0.0;
            int n = q.size();
            int l = q.size();
            while(n > 0)
            {
                TreeNode temp = q.poll();
                x += temp.val;
                if(temp.left != null) q.add(temp.left); 
                if(temp.right != null) q.add(temp.right);
                n--;
            }
            arr.add(x/l);
        }
        return arr;
    }
}