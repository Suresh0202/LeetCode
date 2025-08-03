class Solution {
    public int func(int idx,int nums[],int prev,Integer dp[][])
    {
        if(idx == nums.length)
        {
            return 0;
        }
        if(dp[idx][prev+1] != null)
        {
            return dp[idx][prev+1];
        }
        int npick=func(idx+1,nums,prev,dp);
        int pick=0;
        if( prev == -1 || nums[prev] < nums[idx])
        {
            pick=1+func(idx+1,nums,idx,dp);
        }
        return dp[idx][prev+1]=Math.max(pick,npick);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        Integer dp[][]=new Integer[n][n];
        return func(0,nums,-1,dp);
    }
}