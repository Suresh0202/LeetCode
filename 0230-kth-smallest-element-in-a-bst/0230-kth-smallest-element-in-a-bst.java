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
    public void func(TreeNode root,List<Integer>a)
    {
        if(root == null)
        {
            return;
        }
        func(root.left,a);
        a.add(root.val);
        func(root.right,a);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>a=new ArrayList<>();
        func(root,a);
       k= k-1;
        return a.get(k);
    }
}