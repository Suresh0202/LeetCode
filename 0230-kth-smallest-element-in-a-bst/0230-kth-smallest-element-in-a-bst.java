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
    public static void inord(TreeNode root,List<Integer>ar)
    {
        if(root == null)
        {
            return;
        }
        inord(root.left,ar);
        ar.add(root.val);
        inord(root.right,ar);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
        {
            return root.val;
        }
        List<Integer>ar=new ArrayList<>();
        inord(root,ar);
        return ar.get(k-1);
    }
}