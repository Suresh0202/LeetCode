class Solution {
    public static int func(int i,int j,String a,String b,int dp[][])
    {
        if(i<0)
        {
            return j+1;

        }
        if(j<0)
        {
            return i+1;
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int left=0,right=0;
        if(a.charAt(i) == b.charAt(j))
        {
            return func(i-1,j-1,a,b,dp);
        }
        else
        {
            left=func(i,j-1,a,b,dp);
            right=func(i-1,j,a,b,dp);
        }
        return dp[i][j]=1+Math.min(left,right);
    }
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int dp[][]=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int ans=func(n1-1,n2-1,word1,word2,dp);
        return ans;
    }
}