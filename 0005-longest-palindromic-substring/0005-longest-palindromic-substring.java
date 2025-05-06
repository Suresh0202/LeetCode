class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        int st=0;
        int n=s.length();
        for(int i=0;i<s.length();i++)
        {
            //even case
            int r=i;
            int l=i-1;
            while(l>=0 && r<n && s.charAt(r) == s.charAt(l))
            {
                if(r-l+1 >= max)
                {
                    max=r-l+1;
                    st=l;
                }
                l--;
                r++;
            }
            // odd case
           int r1=i+1;
            int l1=i-1;
             while(l1>=0 && r1<n && s.charAt(r1) == s.charAt(l1))
            {
                if(r1-l1+1 >= max)
                {
                    max=r1-l1+1;
                    st=l1;
                }
                l1--;
                r1++;
            }
        }
        System.out.println(st+ " " + max + " "+ st);
        return s.substring(st,max+st);
    }
}