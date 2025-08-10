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
    public int findLen(ListNode head)
    {
        int ct=0;
        ListNode temp=head;
        while(temp != null)
        {
            ct++;
            temp=temp.next;
        }
        return ct;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
        {
            return null;
        }
        int size=findLen(head);
        if(k%size == 0 ||  k == 0 || size == 1)
        {
            return head;
        }
        k=k%size;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode t1=head;
        int c=0;
        int split=size-k;

        while(c<split)
        {
          
            c++;
            t1=t1.next;
        }
        // System.out.println(t1.val);
        while(t1 != null)
        {
            temp.next=new ListNode(t1.val);
            t1=t1.next;
            temp=temp.next;
        }
        t1=head;
        c=0;
        while(c<split)
        {
            temp.next=new ListNode(t1.val);
            temp=temp.next;
            t1=t1.next;
            c++;
        }
        return dummy.next;

    }
}