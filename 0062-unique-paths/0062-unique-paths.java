class Solution {
    public int func(int i,int j,int m,int n,int dp[][])
    {
        if(i >m || j>n)return 0;
        if(i == m && j == n)
        {
            return 1;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        else return dp[i][j]=func(i+1,j,m,n,dp)+func(i,j+1,m,n,dp);
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)Arrays.fill(dp[i],-1);
        int ans=func(0,0,m-1,n-1,dp);
        return ans;
    }
}