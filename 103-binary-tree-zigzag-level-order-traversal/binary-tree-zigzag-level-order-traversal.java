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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return res;
        q.offer(root);
        boolean flag = false;

        while(!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int n = q.size();

            for(int i = 1; i <= n; i++) {
                TreeNode temp = q.poll();

                if(temp.left != null)  q.offer(temp.left);
                if(temp.right != null)  q.offer(temp.right);

                if(flag) list.add(0,temp.val);
                else list.add(temp.val);
            }
            flag = !flag;
            res.add(list);
        }
        return res;

    }
}