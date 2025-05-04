/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer>mp=new HashMap<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(mp.containsKey(temp))
            {
                return true;
            }
            mp.put(temp,temp.val);
            temp=temp.next;
        }
        // ListNode temp1=head;
        // while(temp1!=null)
        // {
        //     if(mp.containsKey(temp1))
        //     {
        //         return true;
        //     }
        //     temp1=temp1.next;
        // }
        return false;
    }
}