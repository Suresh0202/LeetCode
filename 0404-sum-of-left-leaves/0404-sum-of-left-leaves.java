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
    public void pre(TreeNode root,int ans[],int Nowleft)
    {
        if(root == null)
        {
            return;
        }
        if(root.left == null && root.right == null && Nowleft==1)
        {
            ans[0]+=root.val;
        }
        pre(root.left,ans,1);
        pre(root.right,ans,0);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int ans[]={0};
        pre(root,ans,0);
        return ans[0];
    }
}