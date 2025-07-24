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
    public int find_len(ListNode head)
    {
        ListNode temp=head;
        int cnt=0;
        while(temp!= null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode reverse_list(ListNode head)
    {
        ListNode temp=head;
        ListNode prev=null;
        while(temp != null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
            int len=find_len(head);
            ListNode slow=head;
            ListNode fast=head;
            while(fast != null && fast .next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
           ListNode second= reverse_list(slow.next);
           slow.next=null;
            ListNode first = head;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
            
    }
}
