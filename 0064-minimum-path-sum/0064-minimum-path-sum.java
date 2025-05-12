class Solution {
    public int func(int arr[][],int i,int j,int n,int m,int dp[][])
    {
        if(i >= n  || j >= m)
        {
            return Integer.MAX_VALUE;
        }
        if(i == n-1 && j == m-1)
        {
            return arr[i][j];
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int left=func(arr,i+1,j,n,m,dp);
        int right=func(arr,i,j+1,n,m,dp);
        return dp[i][j]=arr[i][j]+Math.min(left,right);
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return func(grid,0,0,n,m,dp);
    }
}