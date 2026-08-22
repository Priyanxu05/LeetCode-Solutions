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
    ArrayList<Integer > list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        fuckyou(root);

        return list;
        
    }
    public void fuckyou(TreeNode root){
        if(root == null){
            return ;
        }
        fuckyou(root.left);
        list.add(root.val);
        fuckyou(root.right);

    }
}