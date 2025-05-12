class Solution {
    public int func(int arr[][],int i,int j,int n,int m,int dp[][])
    {
        if(i>=n || j>=m || arr[i][j]==1)
        {
            return 0;
        }
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int pick=0;
        int npick=0;
            if( i+1<n && j<m && arr[i+1][j] == 0)
            {
            pick=func(arr,i+1,j,n,m,dp);
            }
            if(i<n && j+1 < m && arr[i][j+1]==0)
            {
            npick=func(arr,i,j+1,n,m,dp);
            }

        return dp[i][j]=pick+npick;
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int dp[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return func(arr,0,0,arr.length,arr[0].length,dp);
    }
}