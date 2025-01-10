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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode front= head.next;
            head.next=prev;
            prev=head;
            head=front;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
       ListNode temp=head;
    // int len=0;
    // Stack<Integer>st=new Stack<>();
    // while(temp!=null)
    // {
    //     st.push(temp.val);
    //     len++;
    //     temp=temp.next;
    // }
    // int max=-1;
    // ListNode temp1=head;
    // len=len/2;
    // while(len!=0)
    // {
    //     int k=temp1.val;
    //     max=Math.max(max,st.pop()+k);
    //     temp1=temp1.next;
    //     len--;
    // }
    // return max;

        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode ne=slow.next;
        slow.next=null;
        ListNode rev=reverse(ne);
        int ans=0;
        while(rev!=null)
        {
            ans=Math.max(ans,rev.val+temp.val);
            temp=temp.next;
            rev=rev.next;
        }
        return ans;



    }
}