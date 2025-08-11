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
    public int find(ListNode temp)
    {
        int x=0;
        while(temp != null)
        {
            temp=temp.next;
            x++;
        }
        return x;

    }
    public ListNode reverse(ListNode temp)
    {
        ListNode prev=null;
        while(temp != null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
            // ct++;
        }
        return prev;
    }
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[find(head)];
        int i=ans.length-1;
        ListNode temp=reverse(head);
        while(temp != null)
        {
            while(!st.isEmpty() && st.peek() <= temp.val)
            {
                st.pop();
            }
            if(i>=0)
            {
            if(st.isEmpty())
            {
                ans[i]=0;
            }else
            {
                ans[i]=st.peek();
            }
            i--;
            }
            st.push(temp.val);
            temp=temp.next;
        }   
        // ct=0;
        return ans;
    }
}