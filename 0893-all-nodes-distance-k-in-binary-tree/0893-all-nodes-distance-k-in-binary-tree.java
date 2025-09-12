/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }

 */
 
class Pair{
    TreeNode root;
    int dis;
    Pair(TreeNode root,int dis)
    {
        this.root=root;
        this.dis=dis;
    }
}
class Solution {
    public void func(TreeNode root,HashMap<TreeNode,TreeNode>mp)
    {
        if(root == null)
        {
            return;
        }
        if(root.left != null)
        {
            mp.put(root.left,root);
            func(root.left,mp);
        }
        if(root.right != null)
        {
            mp.put(root.right,root);
            func(root.right,mp);
        }
    }
    public TreeNode findNode(TreeNode root,int target)
    {
        if(root == null)
        {
            return root;
        }
        if(root.val == target)
        {
            return root;
        }
        TreeNode left=findNode(root.left,target);
        TreeNode right=findNode(root.right,target);
        if(left != null)
        {
            return left;
        }
        return right;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode>mp=new HashMap<>();
        mp.put(null,root);
        func(root,mp);
        TreeNode find=findNode(root,target.val);
        Queue<Pair>qu=new LinkedList<>();
        qu.add(new Pair(find,0));
        HashSet<TreeNode>st=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        while(!qu.isEmpty())
        {
            Pair p=qu.poll();
            TreeNode node=p.root;
            int dis=p.dis;
            if(dis == k)
            {
                ans.add(node.val);
                // break;
            }
            if( !st.contains(node.left) && node.left != null)
            {
                qu.add(new Pair(node.left,dis+1));
                st.add(node.left);
            }
            if(!st.contains(node.right) && node.right != null)
            {
                qu.add(new Pair(node.right,dis+1));
                st.add(node.right);
            }
            if(!st.contains(node) && mp.containsKey(node))
            {
                qu.add(new Pair(mp.get(node),dis+1));
                st.add(node);
            }
        }
        return ans;
    }
}