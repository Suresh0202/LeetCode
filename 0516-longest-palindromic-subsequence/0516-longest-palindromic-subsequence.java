class Solution {
    public int func(String s,String t,int i,int j,int dp[][])
    {
        if(i==0 || j==0)
        {
            return 0;
        }
        if(dp[i-1][j-1]!=-1)return dp[i-1][j-1];
        if(s.charAt(i-1) == t.charAt(j-1))
        {
            dp[i-1][j-1]=1+func(s,t,i-1,j-1,dp);
            return dp[i-1][j-1];
        }
        int left=0+func(s,t,i-1,j,dp);
        int right=0+func(s,t,i,j-1,dp);
        dp[i-1][j-1]=Math.max(left,right);
        return dp[i-1][j-1];
    
    }
    public int longestPalindromeSubseq(String s1) {
        StringBuilder sb=new StringBuilder(s1);
        String s2=sb.reverse().toString();
        int n=s1.length();
        int m=n;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<=m;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }else
                {
                int left=dp[i-1][j];
                int right=dp[i][j-1];
                dp[i][j]=Math.max(left,right);
                }
            }
        }
        return dp[n][n];

    }
}