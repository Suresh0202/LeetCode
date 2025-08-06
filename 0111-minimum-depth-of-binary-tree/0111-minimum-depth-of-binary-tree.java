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
    public int func(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null)
        {
            return func(root.right)+1;
        }
        if(root.right == null)
        {
            return func(root.left)+1;
        }
        return 1+Math.min(func(root.left),func(root.right));
    }
    public int minDepth(TreeNode root) {
        return func(root);
    }
}