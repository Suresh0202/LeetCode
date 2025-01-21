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
    int  ans=-1;
    int cnt=0;
    public  void inord(TreeNode root,int k)
    {
        if(root == null)
        {
            return;
        }
        inord(root.left,k);
        cnt++;
        if(cnt ==k)
        {
            ans=root.val;
        }
        // ar.add(root.val);
        inord(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
        {
            return root.val;
        }
        // List<Integer>ar=new ArrayList<>();
        inord(root,k);
        return ans;
    }
}