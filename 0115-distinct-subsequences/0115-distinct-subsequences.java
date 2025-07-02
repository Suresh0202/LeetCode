class Solution {
    public int func(String s,String t,int i,int j,Integer dp[][])
    {
        if(j<0)
        {
            return 1;
        }
        if(i<0)
        {
            return 0;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        int p=0;
        int np=0;
        if(s.charAt(i) == t.charAt(j))
        {
            return dp[i][j]=func(s,t,i-1,j-1,dp)+func(s,t,i-1,j,dp);
        }else
        {
     return dp[i][j]=func(s,t,i-1,j,dp);
        // np=func(s,t,i,j);
        }
     
        
    }
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=m;i++)
        {
            dp[0][i]=0;
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
}