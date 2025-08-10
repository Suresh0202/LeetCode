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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode(-1);
        ListNode dummy=temp;

        while(head != null ){
            if(head.val == val)
            {
                // head=he
            }
            else
            {
                    dummy.next=new ListNode(head.val);
                    dummy=dummy.next;
                
                    // head=haed.next;
            }
            head=head.next;
        }
        return temp.next;
    }
}