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
    public int func(TreeNode root,int ts,HashMap<Long,Integer>mp,long running,List<Integer> path)
    {
        if(root == null)
        {
            return 0;
        }
        path.add(root.val);
         running+=root.val;
         int cnt=0;
         if(mp.containsKey(running-ts))
         {
            cnt=mp.get(running-ts);
        
           
         }
         mp.put(running,mp.getOrDefault(running,0)+1);
         cnt+=func(root.left,ts,mp,running,path);
         cnt+=func(root.right,ts,mp,running,path);
         mp.put(running , mp.get(running)-1);
         path.remove(path.size()-1);
         return cnt;
    }
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer>mp=new HashMap<>();
        mp.put(0L,1);
        return func(root,targetSum,mp,0,new ArrayList<>());
    }
}