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
    public String convert(List<Integer>a)
    {
        String ss="";
        for(int i=0;i<a.size();i++)
        {
            ss+=""+a.get(i);
            ss+="->";
        }

        return ss.substring(0,ss.length()-2);

    }
 public void func(TreeNode root, List<String> ans, List<Integer> a) {
        if (root.left == null && root.right == null) {
            a.add(root.val);
            ans.add(convert(a));
            a.remove(a.size() - 1);
            return;

        }
        if (root == null) {
            return;
        }

        if (root.left != null) {
            a.add(root.val);
            func(root.left, ans, a);
            a.remove(a.size() - 1);
        }
        if (root.right != null) {
            a.add(root.val);
            func(root.right, ans, a);
            a.remove(a.size() - 1);
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        func(root, ans, a);
        return ans;
    }
}