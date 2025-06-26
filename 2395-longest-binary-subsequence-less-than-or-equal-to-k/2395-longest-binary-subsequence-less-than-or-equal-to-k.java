class Solution {
    public int longestSubsequence(String s, int k) {
        int n=s.length();
        int ans=0;
        int p=0;
        long val=0;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i) == '0')
            {
                ans++;
            }else
            {
                if (p < 31 && val + (1L << p) <= k) {
                    val += (1L << p);
                    ans++;
                }
            }
            p++;
        }
        return ans;
    }
}