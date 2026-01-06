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
    public int maxLevelSum(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        Queue<TreeNode>qu=new LinkedList<>();
        qu.add(root);
        int lev=1;
        int max=Integer.MIN_VALUE;
        int ans=0;
        while(!qu.isEmpty()){
            int len=qu.size();
            int sum=0;
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
                sum+=qu.poll().val;
            }
            if(max < sum)
            {
                max=sum;
                ans=lev;
            }
            lev++;

        }
        return ans;
    }
}