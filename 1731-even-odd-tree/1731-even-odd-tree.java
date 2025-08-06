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
    public boolean isSorted_dec(List<Integer>ar)
    {
        if(ar.get(0) % 2 ==1 )return false;
        for(int i=1;i<ar.size();i++)
        {
            if(ar.get(i) % 2 == 1)
            {
                return false;
            }
            if(ar.get(i) >= ar.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
    public boolean isSorted_inc(List<Integer>ar)
    {
        if(ar.get(0)%2 == 0)return false;
        for(int i=1;i<ar.size();i++)
        {
            if(ar.get(i) % 2 == 0)
            {
                return false;
            }
            if(ar.get(i) <= ar.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>qu=new LinkedList<>();
        qu.add(root);
        int level=0;
        while(!qu.isEmpty())
        {
                int len=qu.size();
                List<Integer>ar=new ArrayList<>();
                for(int i=0;i<len;i++)
                {
                    if(qu.peek().left != null)
                    {
                        qu.add(qu.peek().left);
                    }
                    if(qu.peek().right != null)
                    {
                        qu.add(qu.peek().right);
                    }
                    ar.add(qu.poll().val);
                }
                // System.out.println(ar);
                if(level % 2 == 1)
                {
                    if(isSorted_dec(ar) == false)
                    {
                        return false;
                    }
                }else
                {
                        if(isSorted_inc(ar) == false)
                        {
                            return false;
                        }
                }
                level++;
        }
        return true;
    }
}