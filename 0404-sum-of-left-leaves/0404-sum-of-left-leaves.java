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
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode>qu=new LinkedList<>();
        int sum=0;
        qu.add(root);
        while(!qu.isEmpty())
        {
            int len=qu.size();
            List<Integer>ans=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                if(qu.peek().left != null)
                {
                    if(qu.peek().left.left == null && qu.peek().left.right == null)
                    {
                        sum+=qu.peek().left.val;
                    }
                    qu.add(qu.peek().left);
                     
                }

                if(qu.peek().right != null)
                {
                    qu.add(qu.peek().right);
                     ans.add(qu.peek().val);
                }
               ans.add(qu.poll().val);
            }
        System.out.println(ans);
            // qu.poll();

        }
        return sum;
    }
}