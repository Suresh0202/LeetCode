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
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            int  curr = temp.val;
            int front = temp.next.val;
            // System.out.println(curr.val + " " +front.val);
            temp.next.val=curr;
            temp.val = front;
            System.out.println(temp.val);
            temp = temp.next.next;
        }
        return head;
    }
}