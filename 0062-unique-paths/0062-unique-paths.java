class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        dp[0][0]=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j == 0)
                {

                }else
                {
                    int up=0,dw=0;
                    if(i>0)
                    {
                        up=dp[i-1][j];
                    }
                    if(j>0){
                        dw=dp[i][j-1];
                    }
                    dp[i][j]=up+dw;
                }
            }
        }
        return dp[m-1][n-1];
    }
}