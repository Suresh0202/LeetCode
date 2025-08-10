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
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer>st=new ArrayList<>();
        ListNode temp=head;
        while(temp != null)
        {
            if(!st.contains(temp.val))
            {
                st.add(temp.val);
            }
        
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        for(int i=0;i<st.size();i++)
        {
            t.next=new ListNode((st.get(i)));
            t=t.next;
        }
        return dummy.next;
    }
}