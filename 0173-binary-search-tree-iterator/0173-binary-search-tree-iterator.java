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
    List<Integer>arr=new ArrayList<>();
    int i=0;
    public BSTIterator(TreeNode root) {
        inn(root,arr);
    }
    public void inn(TreeNode root,List<Integer>ar)
    {
        if(root == null)
        {
            return;
        }
        inn(root.left,ar);
        ar.add(root.val);
        inn(root.right,ar);
    }
    public int next() {
        // if(i<arr.size())
        {
            int k=arr.get(i);
            i++;
            return k;
        }
    }
    
    public boolean hasNext() {
        if(i>=arr.size())
        {
            return false;
        }
        if(arr.size()==0)
        {
            return false;
        }
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */