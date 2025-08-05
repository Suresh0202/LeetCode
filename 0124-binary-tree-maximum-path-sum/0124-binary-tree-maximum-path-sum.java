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
      public int func(TreeNode root,int max[])
    {
        if(root == null)
        {
            return 0;
        }
        int r=Math.max(0,func(root.right,max));
        int l=Math.max(0,func(root.left,max));
        max[0]=Math.max(max[0],l+r+root.val);
        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
         int max[]={Integer.MIN_VALUE};
        int ans=func(root,max);
        return max[0];
    }
}