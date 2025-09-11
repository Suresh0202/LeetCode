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
class BSTIterator {
    public void find(TreeNode root,ArrayList<TreeNode>ans)
    {
        if(root == null)
        {
            return;
        }
        find(root.left,ans);
        ans.add(root);
        find(root.right,ans);
    }
    int i;
    ArrayList<TreeNode>ans;
    public BSTIterator(TreeNode root) {
        ans=new ArrayList<>();
        find(root,ans);
        i=0;
    }
    
    public int next() {
        TreeNode val;
        if(i < ans.size())
        {
            val=ans.get(i);
            i++;
            return val.val;
        }
        return -1;
    }
    
    public boolean hasNext() {
        if(i<ans.size())
        {
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */