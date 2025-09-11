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
    public void func(TreeNode root,int ts,int curr,List<Integer>arr,List<List<Integer>>ans)
    {
        if(root == null)
        {
            return;
        }
        if(root.left == null && root.right == null)
        {
            if(curr+root.val == ts)
            {
                arr.add(root.val);
                ans.add(new ArrayList<>(arr));
                arr.remove(arr.size()-1);
                return;
            }
            return;
        }
        arr.add(root.val);
        func(root.left,ts,curr+root.val,arr,ans);
        func(root.right,ts,curr+root.val,arr,ans);
        arr.remove(arr.size()-1);
        return;
    }
    public List<List<Integer>> pathSum(TreeNode root, int ts) {
        List<List<Integer>>ans=new ArrayList<>();
        func(root,ts,0,new ArrayList<>(),ans);
        return ans;
    }
}