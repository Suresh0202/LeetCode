class Solution {
    public static int func(int idx,int nums[],int dp[])
    {
        if(idx == 0)
        {
            return nums[idx];
        }
        if(idx<0)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int pick=nums[idx]+func(idx-2,nums,dp);
        int np=func(idx-1,nums,dp);
        return dp[idx]=Math.max(pick,np);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return func(n-1,nums,dp);
    }
}