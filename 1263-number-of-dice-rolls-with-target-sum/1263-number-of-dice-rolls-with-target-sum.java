class Solution {
    static int mod=(int)(1e9+7);
     public static int func(int n,int k,int tar,Integer dp[][])
    {
        if(n == 0){
            if(tar == 0)
            {
                return 1;
            }
            return 0;
        }
        if(n==0 || tar<0) return 0;
        int cnt=0;
        if(dp[n][tar] != null)
        {
            return dp[n][tar];
        }
        for(int i=1;i<=k;i++)
        {
            cnt = (cnt + func(n-1,k,tar-i,dp))%mod;
        }
        return dp[n][tar]=cnt;
    }
    public int numRollsToTarget(int n, int k, int x) {
         Integer dp[][]=new Integer[n+1][x+1];
        return func(n,k,x,dp);   
    }
}