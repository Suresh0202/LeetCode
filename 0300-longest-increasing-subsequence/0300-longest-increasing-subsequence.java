class Solution {
    public int func(int nums[],int idx,int n,int prev,int dp[][])
    {
        if(idx == n)
        {
            return 0;
        }
        int pick=0;
        if(dp[idx][prev+1]!=-1)
        {
            return dp[idx][prev+1];
        }
        if(prev == -1 || nums[idx] > nums[prev])
        {
            pick=1+func(nums,idx+1,n,idx,dp);
        }
        int notpick=func(nums,idx+1,n,prev,dp);
        return dp[idx][prev+1]=Math.max(pick,notpick);

    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        int ans=func(nums,0,nums.length,-1,dp);
        return ans;
    }
}