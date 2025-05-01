class Solution {
    public int func(int idx,int buy,int pri[],int n,int cap,int dp[][][])
    {
        if(idx == n)return 0;
        if(cap == 0) return 0;
        if(dp[idx][buy][cap]!=-1)return dp[idx][buy][cap];

        int profit=0;
        if(buy == 1)
        {
            int pick=-(pri[idx])+func(idx+1,0,pri,n,cap,dp);
            int notpick=func(idx+1,1,pri,n,cap,dp);
            profit=Math.max(pick,notpick);
        }
        else
        {
            int pick=(pri[idx])+func(idx+1,1,pri,n,cap-1,dp);
            int notpick=func(idx+1,0,pri,n,cap,dp);
            profit=Math.max(pick,notpick);
        }
        dp[idx][buy][cap]=profit;
        return profit;
        
    }
    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length][2][3];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
             for(int k=0;k<3;k++)
             {
                dp[i][j][k]=-1;
             }
                
            }
        }
        return func(0,1,prices,prices.length,2,dp);
    }
}