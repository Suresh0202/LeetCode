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
    public int func1(TreeNode root,long sum)
    {
        if(root == null)
        {
            return 0;
        }
        int cnt=0;
        if(root.val == sum)
        {
            cnt=1;
        }
        cnt+=func1(root.left,sum-root.val);
        cnt+=func1(root.right,sum-root.val);
        return cnt;
    }
    public int func(TreeNode root,long ts)
    {
        if(root == null)
        {
            return 0;
        }
        int left=func(root.left,ts);
        int right=func(root.right,ts);
        int sum=func1(root,ts);
        return left+right+sum;
    }
    public int pathSum(TreeNode root, int targetSum) {
        int ans=func(root,targetSum);
        return ans;
    }
}