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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!(q.isEmpty())){
            TreeNode r=q.poll();
            TreeNode temp=r.right;
            r.right=r.left;
            r.left=temp;

            if(r.left != null)
                q.add(r.left);

            if(r.right != null)
                q.add(r.right);

        }
        return root;
    }
}