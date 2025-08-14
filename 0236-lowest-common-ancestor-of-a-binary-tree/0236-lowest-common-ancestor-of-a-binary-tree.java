/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void func(TreeNode root,TreeNode p,TreeNode q,List<Integer>a,List<List<Integer>>ans)
    {
        if(root == null)
        {
            return;
        }
        if(root == p)
        {
            a.add(root.val);
            ans.add(new ArrayList<>(a));
            a.remove(a.size()-1);
            // return ;
        }
        if(root == q)
        {
            a.add(root.val);
            ans.add(new ArrayList<>(a));
            a.remove(a.size()-1);
            // return;
        }
        if(root.left != null)
        {
        a.add(root.val);
        func(root.left,p,q,a,ans);
        a.remove(a.size()-1);

        }
        if(root . right != null)
        {
          

        a.add(root.val);
        func(root.right,p,q,a,ans);
        a.remove(a.size()-1);

        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        func(root,p,q,a,ans);
        System.out.println(ans);
        List<Integer>p1=ans.get(0);
        List<Integer>p2=ans.get(1);
        int i=0;
        int j=0;
        int f=0;
        while(i<p1.size() && j<p2.size())
        {
            i++;
            j++;
            if(i<p1.size() && j<p2.size() &&!p1.get(i).equals(p2.get(j)))
            {
            //   /
                break;
            }
        }
        if(i == j)
        {
            return new TreeNode(p1.get(i-1));
        }
        if(i == p1.size()-1)
        {
            return new TreeNode(p2.get(j-1));
        }
        if(j == p2.size()-1)
        {
            return new TreeNode(p1.get(i-1));
        }
        return null;
        
        
    }
}