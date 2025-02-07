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
    public static boolean func(TreeNode root,long min,long max)
    {
        if(root == null)
        {
            return true;
        }
        if(root.val >= max || root.val <=min)
        {
            return false;
        }
        return func(root.left,min,root.val) && func(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
       if(root == null)
       {
        return true;
       }
       long min=Long.MIN_VALUE;
       long max=Long.MAX_VALUE;
       return func(root,min,max);
    }
}