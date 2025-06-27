class Solution {
    Integer dp[][];
    int func(String s,int i,int j)
    {
        if(i>=j)
        {
            return 0;
        }
        if(dp[i][j] != null)
        {
            return dp[i][j];
        }
        if(isPalin(s,i,j))
        {
            dp[i][j]=0;
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++)
        {
            if(isPalin(s,i,k))
            {
                int p=1+func(s,k+1,j);
                min=Math.min(min,p);
            }
        }
        dp[i][j]=min;
        return dp[i][j];
    }
     boolean isPalin(String s,int i,int j)
    {
        // int i=0;
        // int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int minCut(String s) {
        //  List<List<String>>ans=new ArrayList<>();
        // List<String>path=new ArrayList<>();
        dp=new Integer[s.length()][s.length()];
       int ans= func(s,0,s.length()-1);
        // int as=Integer.MAX_VALUE;
        // for(List<String>s1:ans)
        // {
        //     as=Math.min(as,s1.size());
        // }
        // if(max == 0)return 0;
        return ans;

    }
}