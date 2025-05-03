class Solution {
    public int func(int idx,int buy,int []arr,int n,int fee,int dp[][])
    {
        if(idx == n)
        {
            return 0;
        }
        int profit=0;
        if(dp[idx][buy] != -1)
        {
            return dp[idx][buy];
        }
        if(buy == 1)
        {
            int pick=-(arr[idx])+func(idx+1,0,arr,n,fee,dp);
            int notpick=func(idx+1,1,arr,n,fee,dp);
            profit=Math.max(pick,notpick);
        }else
        {
            int pick=arr[idx]-fee+func(idx+1,1,arr,n,fee,dp);
            int notpick=func(idx+1,0,arr,n,fee,dp);
             profit=Math.max(pick,notpick);
        }
        dp[idx][buy]=profit;
        return profit;
    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return func(0,1,prices,n,fee,dp);
    }
}