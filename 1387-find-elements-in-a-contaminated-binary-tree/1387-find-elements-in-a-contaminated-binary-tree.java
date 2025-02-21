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
class FindElements {

    HashSet<Integer>s;
    public FindElements(TreeNode root) {
        s=new HashSet<>();
        func(root,0);
    }
    
    public boolean find(int target) {
        return s.contains(target);
    }
    void func(TreeNode root,int k)
    {
        if(root == null)
        {
            return;
        }
        s.add(k);
        func(root.left,2*k+1);
        func(root.right,2*k+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */