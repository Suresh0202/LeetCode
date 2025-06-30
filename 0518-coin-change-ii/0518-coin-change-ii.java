class Solution {
    public int change(int amount, int[] coins) {
        int  dp[][]=new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++)
        {
            dp[i][0]=1;
        }
        dp[0][0]=1;
        for(int i=coins.length -1;i>=0;i--)
        {
            for(int j=1;j<=amount;j++)
            {
                int pick=0;
                int npick=dp[i+1][j];
                if(j >= coins[i])
                {
                    pick=dp[i][j-coins[i]];
                }
                dp[i][j]=(pick+npick);
            }
        }
        // for(int i=0;i<dp.length;i++)
        // {
        // System.out.println(Arrays.toString(dp[i]));
        // }
        return dp[0][amount];
    
    }
}