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
    public  boolean func(TreeNode root,int x,int currsum)
    {
        if(root == null)
        {
            return false;
        }
        if(root.left == null && root.right == null)
        {
            return root.val+currsum == x;
        }
        return func(root.left,x,currsum+root.val) || func(root.right,x,currsum+root.val);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null && targetSum == 0)
        {
            return false;
        }
        return func(root,targetSum,0);
    }
}