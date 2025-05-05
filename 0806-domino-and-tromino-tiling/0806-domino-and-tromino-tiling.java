class Solution {
    public int numTilings(int n) {
        int dp[]=new int[1001];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=5;
        dp[4]=11;
        dp[5]=24;
        int j=3;
        int mod=(int)(1e9+7);
        for(int i=6;i<=1000;i++)
        {
            int x=(dp[i-1]*dp[2])%mod;
            x=(x+dp[j])%mod;
            j++;
            dp[i]=x;
        }
        return dp[n];
        
    }
}