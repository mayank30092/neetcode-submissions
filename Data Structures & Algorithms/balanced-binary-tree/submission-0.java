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
    public boolean isBalanced(TreeNode root) {
       if(root==null) return true;
       int leftHt = height(root.left);
       int rightHt = height(root.right);

       return Math.abs(leftHt-rightHt)<2  && isBalanced(root.left)
            && isBalanced(root.right);
    }

    public int height(TreeNode root){
        if(root==null) return 0;
        int leftSubtree = height(root.left);
        int rightSubtree = height(root.right);
        return Math.max(leftSubtree, rightSubtree)+1;
    }
}
