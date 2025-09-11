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
    public void func(TreeNode root,HashMap<TreeNode,TreeNode>mp)
    {
        if(root == null)
        {
            return;
        }
        if(root.left != null)
        {
            mp.put(root.left,root);
            func(root.left,mp);
        }
        if(root.right != null)
        {
            mp.put(root.right,root);
            func(root.right,mp);
        }
    
    }
    public TreeNode findStart(TreeNode root,int start)
    {
        if(root == null)
        {
            return root;
        }
        if(root.val == start)
        {
            return root;
        }
        TreeNode left=findStart(root.left,start);
        TreeNode right = findStart(root.right,start);
        if(left != null)return left;
        return right;
    }
    public int amountOfTime(TreeNode root, int start) {
        if(root == null )return 0;
        HashMap<TreeNode,TreeNode>mp=new HashMap<>();
        mp.put(root,null);
        func(root,mp);
        TreeNode st=findStart(root,start);
        HashSet<TreeNode>vis=new HashSet<>();
        Queue<TreeNode>qu=new LinkedList<>();
        qu.add(st);
        int cnt=0;
        vis.add(st);
        while(!qu.isEmpty())
        {
            int len=qu.size();
            cnt++;
            for(int i=0;i<len;i++)
            {
                TreeNode p=qu.poll();
                if( p.left != null && !vis.contains(p.left) )
                {
                    qu.add(p.left);
                    vis.add(p.left);
                }
                if(  p.right != null && !vis.contains(p.right) )
                {
                    qu.add(p.right);
                    vis.add(p.right);
                }
                if(mp.get(p) != null && !vis.contains(mp.get(p)))
                {
                    vis.add(mp.get(p));
                    qu.add(mp.get(p));
                }
            }
                
        }
        return cnt-1;

    }
}