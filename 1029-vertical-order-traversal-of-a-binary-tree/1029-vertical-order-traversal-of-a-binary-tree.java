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
    TreeNode node;
    int vert;
    int level;
    Triplet(TreeNode node,int vert,int level)
    {
        this.node=node;
        this.vert=vert;
        this.level=level;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        //map<vertical,map<level,values at levev (in sorted);
        Queue<Triplet>qu=new LinkedList<>();
        //triplet -- node,vert,level;
        //move left vert-1,level+1;
        //move right  vert+1,level+1;
        qu.add(new Triplet(root,0,0));
        while(!qu.isEmpty())
        {
            Triplet tp=qu.poll();
            int vertical=tp.vert;
            int value=tp.node.val;
            int level=tp.level;
            if(!map.containsKey(vertical))
            {
                map.put(vertical,new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(level))
            {
                map.get(vertical).put(level, new PriorityQueue<>());
            }
            map.get(vertical).get(level).add(value);

            if(tp.node.left != null)
            {
                qu.add(new Triplet(tp.node.left,vertical-1,level+1));
            }
            if(tp.node.right != null)
            {
                qu.add(new Triplet(tp.node.right,vertical+1,level+1));
            }
        }
        for(int key:map.keySet())
        {
            List<Integer>A=new ArrayList<>();
            for(int level:map.get(key).keySet())
            {
                while(!(map.get(key).get(level)).isEmpty())
                {
                    A.add((map.get(key).get(level)).peek());
                    map.get(key).get(level).poll();
                }
                // A.add(map.get(key).get(level));
                System.out.print(map.get(key).get(level) +" ");
                
            }
            ans.add(A);
            System.out.println();
        }
        return ans;
    }

}