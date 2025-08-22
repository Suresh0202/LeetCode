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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode>qu=new LinkedList<>();
        qu.add(root);
        int ans=0;
        
        while(!qu.isEmpty())
        {
            int len=qu.size();
            ans=qu.peek().val;
            // List<Integer>a=new ArrayList<>();
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
                qu.poll();
            }
            // ans=a.get(0);
        }
        return ans;
    }
}