class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
            int ans[]=new int[n-k+1];
            int ind=0;
            Deque<Integer>qu=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                while(!qu.isEmpty() && qu.peekFirst()< i-k+1)
                {
                    qu.pollFirst();
                }
                while(!qu.isEmpty() && arr[qu.peekLast()]<arr[i])
                {
                    qu.pollLast();
                }
                qu.offerLast(i);
                if(i>=(k-1))
                {
                    ans[ind++]=arr[qu.peekFirst()];
                }
            }
            return ans;
    }
}