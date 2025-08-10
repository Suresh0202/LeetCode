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
         TreeMap<Integer,Integer>mp=new TreeMap<>();
         ListNode temp=head;
         while(temp != null)
         {
            if(!mp.containsKey(temp.val))
            {
                mp.put(temp.val,1);
            }else
            {
                mp.put(temp.val,mp.get(temp.val)+1);
            }
            temp=temp.next;
         }
         System.out.println(mp);
         ListNode temp1=new ListNode(-101);
         ListNode dummy=temp1;
         for(int key:mp.keySet())
         {
            if(mp.get(key) == 1)
            {
                dummy.next=new ListNode(key);
                dummy=dummy.next;
            }
         }
         return temp1.next;

    }
}