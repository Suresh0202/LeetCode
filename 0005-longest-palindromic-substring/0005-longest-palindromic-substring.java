class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            int l=i-1;
            int r=i;
            // even case;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r))
            {
                if(r-l+1 > max)
                {
                    max=r-l+1;
                    start=l;
                }
                l--;
                r++;
            }
            l=i-1;
            r=i+1;
            // odd case;
             while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r))
            {
                if(r-l+1 > max)
                {
                    max=r-l+1;
                    start=l;
                }
                l--;
                r++;
            }
            
        }
        return s.substring(start,start+max);
    }
}