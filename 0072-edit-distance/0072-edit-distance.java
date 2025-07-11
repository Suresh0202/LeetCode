class Solution {
    public int func(String w1,String w2,int i,int j,Integer dp[][])
    {
        if(i == 0)
        {
            return j;
        }
        if(j ==0)
        {
            return i;
        }
        if(dp[i-1][j-1] != null)
        {
            return dp[i-1][j-1];
        }
        int a=0,b=0,c=0;
        if(w1.charAt(i-1) == w2.charAt(j-1))
        {
            return func(w1,w2,i-1,j-1,dp);
        }else{
            a=1+func(w1,w2,i,j-1,dp);
            b=1+func(w1,w2,i-1,j,dp);
            c=1+func(w1,w2,i-1,j-1,dp);
        }
        // int y=Math.mi()
        return dp[i-1][j-1]=Math.min(a,Math.min(b,c));
    }
    public int minDistance(String w1, String w2) {
        int n=w1.length();
        int m=w2.length();
        Integer dp[][]=new Integer[n+1][m+1];
        return func(w1,w2,n,m,dp);
    }
}