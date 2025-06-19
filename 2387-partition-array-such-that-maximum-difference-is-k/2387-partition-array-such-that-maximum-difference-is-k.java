class Solution {
    // public int func(int nums[])
    // {
    //     HashSet<Integer>st=new HashSet<>();
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         st.add(nums[i]);
    //     }
    //     return st.size();
    // }
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;
        int min=Integer.MAX_VALUE;
        int ans=0;
        // if(k == 0)
        // {
            // ans=func(nums);
            // return ans;
        // }else
        // {
            // ans=0;
        // }
        for(int i=0;i<nums.length;i++)
        {
            // max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
            if( nums[i]-min >k)
            {
                ans++;
                // max=0;
                min=nums[i];
            }
        }
        return ans+1;
    }
}