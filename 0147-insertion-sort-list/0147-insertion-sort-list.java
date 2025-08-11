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
    public ListNode insertionSortList(ListNode head) {
        ListNode h=head;
        ListNode d=new ListNode(-1);
        ListNode temp=d;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        while(h != null)
        {
            pq.add(h.val);
            h=h.next;
        }
        while(!pq.isEmpty())
        {
            temp.next=new ListNode(pq.poll());
            temp=temp.next;
        }
        return d.next;
    }
}