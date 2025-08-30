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
    ListNode newHead=new ListNode(-1);
    ListNode sure=newHead;
    public void findKthNode(ListNode temp,int k)
    {
        ListNode x=temp;
        ListNode newNode=new ListNode(-1);
        ListNode dummy=newNode;
        int cnt=0;
        int k1=k;
        ListNode y=temp;
        while(k-->0 && x != null)
        {   
            dummy.next=new ListNode(x.val);
            dummy=dummy.next;
            x=x.next;
            cnt++;
        }
        if(cnt == k1)
        {
        ListNode rev=reverse(newNode.next);
        while(rev != null)
        {
            sure.next=new ListNode(rev.val);
            rev=rev.next;
            sure=sure.next;
        }
        }else if(cnt < k1)
        {
            while(y != null)
            {
            sure.next=new ListNode(y.val);
            y=y.next;
            sure=sure.next;
            }
        }
        // return rev;
    }
    public ListNode reverse(ListNode temp)
    {
        ListNode prev=null;
        // ListNode 
        while(temp != null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode nHead=new ListNode(-1);
        ListNode dummy=nHead;
        ListNode temp=head;
        while(temp != null)
        {
           findKthNode(temp,k); 
           int k1=k;
           while(k1-->0 && temp != null)
           {
           temp=temp.next;
           } 
        }

    return newHead.next;
    }
}