class Solution {
    public boolean func(String a,String b,int i,int j,Boolean dp[][])
    {
        if(i<0 && j<0)
        {
            return true;
        }
        if(i<0 && j>=0)
        {
            return false;
        }
        if(i>=0 && j<0)
        {
            for(int k=0;k<=i;k++)
            {
                if(a.charAt(k) != '*' )
                {
                    return false;
                }
            }
            return true;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
            
       }
        if(a.charAt(i) == b.charAt(j) || a.charAt(i) == '?')
        {
            return func(a,b,i-1,j-1,dp);
        }
        if(a.charAt(i) == '*')
        {
            return dp[i][j]=(func(a,b,i-1,j,dp) ||  func(a,b,i,j-1,dp));

        }
        return false;
    }
    public boolean isMatch(String s, String p) {
        Boolean dp[][]=new Boolean[p.length()+1][s.length()+1];
        return func(p,s,p.length()-1,s.length()-1,dp);
    }
}