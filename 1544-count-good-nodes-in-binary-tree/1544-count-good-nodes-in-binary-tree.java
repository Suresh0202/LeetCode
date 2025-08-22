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
    int ans[]={0};
    public void func(TreeNode root,int max)
    {
        if(root == null)
        {
            return ;
        }
        if(max <= root.val)
        {
            ans[0]++;
            max=root.val;
        }
        func(root.left,max);
        func(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        int max=Integer.MIN_VALUE;
        func(root,max);
        return ans[0];

    }
}