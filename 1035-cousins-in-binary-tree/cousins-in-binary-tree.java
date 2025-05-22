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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> arr = new ArrayList<>();
            int n = q.size();
            boolean A = false;
            boolean B = false;
            while(n>0)
            {
                TreeNode temp = q.poll();
                if(temp.left != null && temp.right != null)
                    if((temp.left.val == x  && temp.right.val == y) || (temp.left.val == y  && 
                    temp.right.val == x)) return false;
                if(temp.val == x) A = true;
                if(temp .val == y) B = true;
                arr.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                n--;
            }
            if(A && B) return true;
            if(A || B) return false;
        }
        return true;
    }
}