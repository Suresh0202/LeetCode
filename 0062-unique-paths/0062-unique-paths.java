class Solution {
    public int func(int i,int j,int n,int m,int dp[][])
    {
        if(i>n || j>m)
        {
            return 0;
        }
        if(i == n && j == m)
        {
            return 1;
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int left=func(i+1,j,n,m,dp);
        int right=func(i,j+1,n,m,dp);
        return dp[i][j]=left+right;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return func(0,0,m-1,n-1,dp);
    }
}