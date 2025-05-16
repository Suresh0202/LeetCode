class Solution {
    public boolean func(String s1, String s2, String s3,int i,int j,int k,Boolean dp[][][])
    {
        if(k<0 && i<0 && j <0)
        {
            return true;
        }
        if(k<0)
        {
            return false;
        }
        if(i>=0 && j>=0 && k>=0 )
        {
        if(dp[i][j][k] != null)
        {
            return dp[i][j][k];
        }
        }
        boolean left=false;
        boolean right=false;
        if( i>=0 && s1.charAt(i) == s3.charAt(k))
        {
            left=func(s1,s2,s3,i-1,j,k-1,dp);
        }
        if(j>=0 && s2.charAt(j) == s3.charAt(k))
        {
            right=func(s1,s2,s3,i,j-1,k-1,dp);
        }
        if(i>=0 && j>=0 && k>=0)
        {
            dp[i][j][k]=(left || right);
        }
        return (left || right);
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length();
        int m=s2.length();
        int k=s3.length();
        Boolean dp[][][]=new Boolean[n+1][m+1][k+1];
        if((n+m != k))
        {
            return false;
        }
        return func(s1,s2,s3,n-1,m-1,k-1,dp);
    }
}