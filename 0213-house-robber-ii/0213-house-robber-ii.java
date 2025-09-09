class Solution {
    public int func(int nums[],int idx,int n,Integer dp[])
    {
        if(idx > n)
        {
            return 0;
        }
        if(dp[idx] != null)
        {
            return dp[idx];
        }
        int pick=nums[idx]+func(nums,idx+2,n,dp);
        int np=func(nums,idx+1,n,dp);
        return dp[idx]=Math.max(pick,np);
    }
    public int rob(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
       
        Integer dp[]=new Integer[nums.length];
        int ans=func(nums,1,nums.length-1,dp);
         Integer dp1[]=new Integer[nums.length];
        int ans2=func(nums,0,nums.length-2,dp1);
        return Math.max(ans,ans2);

    }
}