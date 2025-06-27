class Solution {
    public int func(String s,String t,int i,int j,Integer dp[][])
    {
        if(j<0)
        {
            return 1;
        }
        if(i<0)
        {
            return 0;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        int p=0;
        int np=0;
        if(s.charAt(i) == t.charAt(j))
        {
            return dp[i][j]=func(s,t,i-1,j-1,dp)+func(s,t,i-1,j,dp);
        }else
        {
     return dp[i][j]=func(s,t,i-1,j,dp);
        // np=func(s,t,i,j);
        }
     
        
    }
    public int numDistinct(String s, String t) {
        Integer dp[][]=new Integer[s.length()][t.length()];
        int ans=func(s,t,s.length()-1,t.length()-1,dp);
        return ans;
    }
}