class Solution {
    public int func(int idx,int arr[],int tar,int dp[][])
    {
        if(tar == 0)
        {
            return 0;
        }
        if(idx < 0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[idx][tar]!=-1)
        {
            return dp[idx][tar];
        }
        int pick=Integer.MAX_VALUE;
        if(arr[idx]<=tar)
        {
            int x=func(idx,arr,tar-arr[idx],dp);
            if(x != Integer.MAX_VALUE)
            {
                pick=x+1;
            }
        }
        int notpick=func(idx-1,arr,tar,dp);
        return dp[idx][tar]=Math.min(pick,notpick);
        
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int ans=func(n-1,coins,amount,dp);
        if(ans == Integer.MAX_VALUE)
        {
            return -1;
        }
        return ans;
    }
}