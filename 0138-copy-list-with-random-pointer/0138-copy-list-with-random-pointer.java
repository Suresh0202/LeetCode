/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>mp=new HashMap<>();
        Node temp=head;
        while(temp!=null)
        {
            Node nnode=new Node(temp.val);
            mp.put(temp,nnode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            Node cpy=mp.get(temp);
            cpy.next=mp.get(temp.next);
            cpy.random=mp.get(temp.random);
            temp=temp.next;
        }
        return mp.get(head);
    }
}