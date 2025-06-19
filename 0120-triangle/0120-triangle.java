class Solution {
    public int func(List<List<Integer>> tri,int i,int j,int n,int m,int dp[][])
    {
        if(i == n)
        {
            return tri.get(i).get(j);
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int l=tri.get(i).get(j)+func(tri,i+1,j+1,n,m,dp);
        int r=tri.get(i).get(j)+func(tri,i+1,j,n,m,dp);
        return dp[i][j]=Math.min(l,r);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=triangle.get(0).size();
        int dp[][]=new int[n+1][n];
        for(int i=0;i<triangle.size();i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int ans=func(triangle,0,0,triangle.size()-1,triangle.get(0).size()-1,dp);
        return ans;
    }
}