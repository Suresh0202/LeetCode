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
        List<Integer>ar=new ArrayList<>();
        public void func(TreeNode root)
        {
            if(root == null)
            {
                return ;
            }
            func(root.left);
            ar.add(root.val);
            func(root.right);
        }
    public boolean findTarget(TreeNode root, int k) {
        func(root);
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<ar.size();i++)
        {
            int x=k-ar.get(i);
            if(mp.containsKey(x))
            {
                return true;
            }
            mp.put(ar.get(i),i);
        }
        return false;

    }
}