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
class Pair{
    TreeNode rot;
    int dist;
    Pair(TreeNode rot,int dist)
    {
        this.rot=rot;
        this.dist=dist;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>qu=new LinkedList<>();
        qu.add(new Pair(root,0));
        int finmax=0;
        while(!qu.isEmpty())
        {
            int len=qu.size();
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<len;i++)
            {
                Pair p = qu.poll();
                int dis=p.dist;
                max=Math.max(max,dis);
                min=Math.min(min,dis);
                if(p.rot.left != null)
                {
                    qu.add(new Pair(p.rot.left,2*dis+1));
                }
                if(p.rot.right != null)
                {
                    qu.add(new Pair(p.rot.right,2*dis+2));
                }
            }
                finmax=Math.max(finmax,max-min+1);
        }
        return finmax;
    }
}