class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->{
            int diff=nums[b]-nums[a];
            return diff;
        }) ; 
        int n=nums.length;
        int ans[]=new int[n-k+1];
        for(int i=0;i<k;i++)
        {
            p.add(i);
        }
        ans[0]=nums[p.peek()];
        for(int i=k;i<n;i++)
        {
            p.add(i);
            while(p.peek()<=i-k)
            {
                p.poll();
            }
            ans[i-k+1]=nums[p.peek()];
        }
        return ans;

    }
}