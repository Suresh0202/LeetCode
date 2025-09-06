class Solution {
    int mod=(int)(1e9+7);
    public long func(String s,int idx,Long dp[])
    {
        if(idx >= s.length())
        {
            return 1; // reached end of string , so one way;
        }
        if(s.charAt(idx) == '0')
        {
            return 0;  // if '0' no ways;
        }
        if(dp[idx] != null)
        {
            return dp[idx];
        }
        long one=0; // check for one way
        if(s.charAt(idx) >='1' && s.charAt(idx) <='9')
        {
            one=func(s,idx+1,dp)%mod; // if 1 to 9 then all ways each one way 
        }
        if(s.charAt(idx) == '*')
        {
            one=9*func(s,idx+1,dp)%mod;
        }// done with one digits

        // now for two digits
        long two=0;
        int ways=0;
        if(idx+1 < s.length())
        {
            // if  * and * 
            char ch=s.charAt(idx);
            char nxt=s.charAt(idx+1);
            if(ch == '*' && nxt == '*')
            {
                ways=15;
            }else if(ch =='*')
            {
                if(nxt >='0' && nxt <='6')
                {
                    ways=2;
                }else
                {
                    ways=1;
                }
            }else if(ch == '1')
            {
                if(nxt == '*')
                {
                    ways=9;
                }else
                {
                    ways=1;
                }
            }else if(ch == '2')
            {
                if(nxt == '*')
                {
                    ways=6;
                }else if(nxt >='0' && nxt <='6')
                {
                    ways=1;
                }

            }
        }
            two=ways*func(s,idx+2,dp)%mod;
            return dp[idx]=(one+two)%mod;
        
    }
    public int numDecodings(String s) {
        Long dp[]=new Long[s.length()+1];
        return (int)func(s,0,dp)%mod;
    }
}