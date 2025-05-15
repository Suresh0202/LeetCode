class Solution {
    public int func(int i,int j,int dp[][],int arr[][])
    {
        if(i<0 || j<0 || arr[i][j] == 1){
            return 0;
        }
        if(i ==0 && j == 0)
        {
            return 1;
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int left=func(i-1,j,dp,arr);
        int right=func(i,j-1,dp,arr);
        return dp[i][j]=left+right;
    }
    public int uniquePathsWithObstacles(int[][] obs) {
        int n=obs.length;
        int m=obs[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return func(n-1,m-1,dp,obs);
    }
}