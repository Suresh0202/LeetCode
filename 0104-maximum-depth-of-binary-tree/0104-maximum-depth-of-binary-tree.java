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
    public int func(TreeNode root,int ans[])
    {
        if(root == null)
        {
            return 0;
        }
        int left=func(root.left,ans);
        int right=func(root.right,ans);
        ans[0]=Math.max(left,right);
        return 1+Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
       int ans[]={0};
       int k=func(root,ans);
       return k;
    }
}