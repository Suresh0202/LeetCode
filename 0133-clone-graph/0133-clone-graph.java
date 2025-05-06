/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null)return null;
        HashMap<Node,Node>mp=new HashMap<>();
        mp.put(node,new Node(node.val));
        Queue<Node>qu=new LinkedList<>();
        qu.add(node);
        while(!qu.isEmpty())
        {
            Node curr=qu.poll();
            for(Node c:curr.neighbors)
            {
                if(!mp.containsKey(c))
                {
                    mp.put(c,new Node(c.val));
                    qu.add(c);
                }
                Node cr=mp.get(curr);
                Node cl=mp.get(c);
                cr.neighbors.add(cl);
            }
        }
        return mp.get(node);
    }
}