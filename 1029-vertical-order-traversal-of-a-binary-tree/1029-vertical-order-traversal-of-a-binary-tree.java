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
 class Triplet{
    int vertical;
    int level;
    TreeNode root;
    Triplet(TreeNode root,int vertical,int level)
    {
        this.root=root;
        this.vertical=vertical;
        this.level=level;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Triplet>qu=new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        qu.add(new Triplet(root,0,0));
        while(!qu.isEmpty())
        {
            Triplet trip=qu.poll();
            TreeNode node=trip.root;
            int vert=trip.vertical;
            int level=trip.level;
            if(!map.containsKey(vert))
            {
                map.put(vert,new TreeMap<>());
            }
            if(!map.get(vert).containsKey(level))
            {
                map.get(vert).put(level,new PriorityQueue<>());
            }
            map.get(vert).get(level).add(node.val);
            if(node.left!=null)
            {
                qu.add(new Triplet(node.left,vert-1,level+1));
            }
            if(node.right!=null)
            {
                qu.add(new Triplet(node.right,vert+1,level+1));
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>>mp:map.values())
        {
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer>nodes:mp.values())
            {
                while(!nodes.isEmpty())
                {
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
    }
}