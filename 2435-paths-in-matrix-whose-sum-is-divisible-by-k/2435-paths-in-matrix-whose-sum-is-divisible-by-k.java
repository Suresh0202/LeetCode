class Solution {
    static int mod=(int)(1e9+7);
    public static int func(int grid[][],int sr,int sc,int k,int n,int m,int sum,Integer dp[][][])
    {
        if(sr<0 || sc<0 || sr>=n || sc>=m)return 0;
        if(sr == n-1 && sc == m-1){
            sum+=grid[sr][sc];
            if(sum%k == 0)return 1;
            return 0;
        }
        if(dp[sr][sc][sum%k] != null)
        {
            return dp[sr][sc][sum%k];
        }
        int left=func(grid,sr+1,sc,k,n,m,sum+grid[sr][sc],dp);
        int right=func(grid,sr,sc+1,k,n,m,sum+grid[sr][sc],dp);
        return dp[sr][sc][sum%k]=(left%mod+right%mod)%mod;
    }
    public int numberOfPaths(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        Integer dp[][][]=new Integer[n][m][51];
        return func(grid,0,0,k,n,m,0,dp);
    }
}