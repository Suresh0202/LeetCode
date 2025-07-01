class Solution {
    public int func(String s,String t,int i,int j,int dp[][])
    {
        if(i<0 || j<0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i) == t.charAt(j))
        {
            dp[i][j]=1+func(s,t,i-1,j-1,dp);
            return dp[i][j];
        }
        int left=0+func(s,t,i-1,j,dp);
        int right=0+func(s,t,i,j-1,dp);
        dp[i][j]=Math.max(left,right);
        return dp[i][j];
    
    }
    public int minInsertions(String s) {
         StringBuilder sb=new StringBuilder(s);
        String t=sb.reverse().toString();
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int ans=func(s,t,n-1,n-1,dp);
        return n-ans;
    }
}