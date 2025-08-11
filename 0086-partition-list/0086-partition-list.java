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
    public ListNode partition(ListNode head, int y) {
        ListNode dummy=new ListNode(-1);
        ListNode x=dummy;
        ListNode temp=head;
        while(temp != null)
        {
            if(temp.val < y)
            {
                x.next=new ListNode(temp.val);
                x=x.next;
            }
            temp=temp.next;
        }
        temp=head;
         while(temp != null)
        {
            if(temp.val >= y)
            {
                x.next=new ListNode(temp.val);
                x=x.next;
            }
            temp=temp.next;
        }
        // temp=head;
        //  while(temp != null)
        // {
        //     if(temp.val > y)
        //     {
        //         x.next=new ListNode(temp.val);
        //         x=x.next;
        //     }
        //     temp=temp.next;
        // }
        // temp=head/
        return dummy.next;

    }
}