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
    void func(TreeNode root,List<Integer>an)
    {
        if(root == null)
        {
            return ;
        }
        func(root.left,an);
        an.add(root.val);
        func(root.right,an);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer>an=new ArrayList<>();
        func(root,an);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<an.size();i++)
        {
            min=Math.min(min,an.get(i)-an.get(i-1));
        }
        return min;
    }
}