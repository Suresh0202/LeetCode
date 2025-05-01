class Solution {
    public int func(int idx,int buy,int pri[],int n,int k,int dp[][][])
    {
        if(idx == n || k == 0) return 0;
        // if(k == 0)return 0;
        if(dp[idx][buy][k] != -1)return dp[idx][buy][k];
        int profit=0;
        if(buy == 1)
        {
            int pick=-(pri[idx])+func(idx+1,0,pri,n,k,dp);
            int notpick=func(idx+1,1,pri,n,k,dp);
            profit=Math.max(pick,notpick);
        }
        else
        {
            int pick=pri[idx]+func(idx+1,1,pri,n,k-1,dp);
            int notpick=func(idx+1,0,pri,n,k,dp);
            profit=Math.max(pick,notpick);
        }
        dp[idx][buy][k] = profit;
        return profit;
    }
    public int maxProfit(int k, int[] prices) {
        int dp[][][]=new int[prices.length][2][k+1];
        for(int i=0;i<prices.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int x=0;x<=k;x++)
                {
                    dp[i][j][x]=-1;
                }
            }
        }
        return func(0,1,prices,prices.length,k,dp);

    }
}