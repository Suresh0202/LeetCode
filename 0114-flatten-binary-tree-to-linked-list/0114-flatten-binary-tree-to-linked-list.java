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
    public void func(TreeNode root,List<TreeNode>ar)
    {
        if(root == null)
        {
            return;
        }
        ar.add(root);
        func(root.left,ar);
        func(root.right,ar);
    }
    public void flatten(TreeNode root) {
        if(root ==  null)
        {
            return;
        }
        List<TreeNode>ar=new ArrayList<>();
        func(root,ar);
        for(TreeNode r:ar)
        {
            r.left=null;
            r.right=null;
        }
        TreeNode newRoot=ar.get(0);
        for(int i=1;i<ar.size();i++)
        {
            newRoot.right=ar.get(i);
            newRoot=newRoot.right;
        }
    }
}