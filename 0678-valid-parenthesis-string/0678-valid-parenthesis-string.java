class Solution {
    public boolean func(String s,int idx,int cnt,int n,Boolean dp[][])
    {
        if(cnt <0)
        {
            return false;
        }
        if(idx == n)
        {
            return cnt==0;
        }
        if(dp[idx][cnt] != null)
        {
            return dp[idx][cnt];
        }
        if(s.charAt(idx) == '(')
        {
            return dp[idx][cnt]=func(s,idx+1,cnt+1,n,dp);
        }
        if(s.charAt(idx) == ')')
        {
            return dp[idx][cnt]=func(s,idx+1,cnt-1,n,dp);
        }
        boolean open=func(s,idx+1,cnt+1,n,dp);
        boolean close=func(s,idx+1,cnt-1,n,dp);
        boolean nul=func(s,idx+1,cnt,n,dp);
        return dp[idx][cnt]=(open || close ||  nul);
    }
    public boolean checkValidString(String s) {
        Boolean dp[][]=new Boolean[s.length()+1][s.length()+1];
        return func(s,0,0,s.length(),dp);
    }
}