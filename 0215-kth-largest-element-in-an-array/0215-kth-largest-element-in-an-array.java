class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
         int c=0;
         for(int i=0;i<nums.length;i++)
         {
            p.add(nums[i]);
         }
         int ans=0;
         while(c!=k)
         {
            ans=p.poll();
            c++;
         }
         return ans;
    }
}