class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
            int n=obs.length;
            int m=obs[0].length;
            int dp[][]=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                     if(obs[i][j] == 1)
                    {
                        dp[i][j]=0;
                        // continue;
                    }
                  else  if(i == 0 && j == 0)
                    {
                        dp[i][j]=1;

                    }
                    else{
                    int up=0,dw=0;
                    if(i>0)
                    {
                        up=dp[i-1][j];
                    }
                    if(j>0)
                    {
                        dw=dp[i][j-1];
                    }
                    dp[i][j]=up+dw;
                    }
                }
            }
            return dp[n-1][m-1];
    }
}