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
        ListNode prev=null;
        while(temp != null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode L1, ListNode L2) {
        ListNode l1=reverse(L1);
        ListNode l2=reverse(L2);
       ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;

          while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;
        }
         if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }
}