/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode temp)
    {
        ListNode x=temp;
        ListNode prev=null;
        while( x != null)
        {
            ListNode front=x.next;
            x.next=prev;
            prev=x;
            x=front;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
       
        List<Integer>ans=new ArrayList<>();
        ListNode temp=reverse(head);
        
        ListNode dummy=new ListNode(temp.val);
        ListNode x=dummy;
        int max=temp.val;
        temp=temp.next;
        while(temp != null)
        {
            if(max <= temp.val)
            {
                x.next=new ListNode(temp.val);
                x=x.next;
            }
            max=Math.max(max,temp.val);
            temp=temp.next;

        }
        ListNode nH=reverse(dummy);
        return nH;
    }
}