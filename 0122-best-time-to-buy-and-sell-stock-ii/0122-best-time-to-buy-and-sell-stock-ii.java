class Solution {
    public int func(int idx,int buy,int pri[],int n,int dp[][])
    {
        if(idx == n)
        {
            return 0;
        }
        int profit=0;
        if(dp[idx][buy]!=-1)
        {
            return dp[idx][buy];
        }
        if(buy == 1)
        {
            int pick=(-pri[idx]+ func(idx+1,0,pri,n,dp));
            int notpick=(0)+func(idx+1,1,pri,n,dp);
            profit=Math.max(pick,notpick);
        }else
        {
            int pick=(pri[idx]+func(idx+1,1,pri,n,dp));
            int notpick=func(idx+1,0,pri,n,dp);
            profit=Math.max(pick,notpick);
        }
        dp[idx][buy]=profit;
        return profit;
    }
    public int maxProfit(int[] prices) {

        int dp[][]=new int[prices.length][2];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return func(0,1,prices,prices.length,dp);
    }
}