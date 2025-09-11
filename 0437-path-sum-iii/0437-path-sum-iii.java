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
    int cnt=0;
    public void func(TreeNode root,List<Integer>ans,int tar)
    {
        if(root == null)
        {
            return ;
        }
        ans.add(root.val);
        func(root.left,ans,tar);
        func(root.right,ans,tar);
        int temp=0;
        for(int i=ans.size()-1;i>=0;i--)
        {
            temp+=ans.get(i);
            if(temp == tar)
            {
                cnt++;
            }
        }
        ans.remove(ans.size()-1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        List<Integer>ans=new ArrayList<>();
        func(root,ans,targetSum);
        return cnt;
    }
}