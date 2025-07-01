class Solution {
    public int func(String a,String b,int i,int j,Integer dp[][])
    {
        if(i == 0)
        {
            return 0;
        }
        if(j == 0)
        {
            return 0;
        }
        if(dp[i-1][j-1] != null)
        {
            return dp[i-1][j-1];
        }
        if(a.charAt(i-1) == b.charAt(j-1))
        {
            return 1+func(a,b,i-1,j-1,dp);
        }
        int left=func(a,b,i-1,j,dp);
        int right=func(a,b,i,j-1,dp);
        dp[i-1][j-1]=Math.max(left,right);
        return Math.max(left,right);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        Integer dp[][]=new Integer[n+1][m+1];
        return func(text1,text2,n,m,dp);
    }
}