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
    public int minDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        Queue<TreeNode>qu=new LinkedList<>();
        qu.add(root);
        int level=1;
        while(!qu.isEmpty())
        {
            int len=qu.size();
            for(int i=0;i<len;i++)
            {
                if(qu.peek().left == null && qu.peek().right == null)
                {
                    return level;
                }
                if(qu.peek().left != null)
                {
                    qu.add(qu.peek().left);
                }
                if(qu.peek().right != null)
                {
                    qu.add(qu.peek().right);
                }
                qu.poll();
            }
            level++;
        }
        return -1;
    }
}