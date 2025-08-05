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
        int r=func(root.right,max);
        int l=func(root.left,max);
        max[0]=Math.max(max[0],l+r);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int max[]={0};
        int ans=func(root,max);
        return max[0];
    }
}