class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int l=0;
        int n=s.length();
        int m=0;
        HashSet<Character>st=new HashSet<>();
        while(r<n)
        {
            while(st.contains(s.charAt(r)))
            {
                st.remove(s.charAt(l));
                l++;
            }
            m=Math.max(m,r-l+1);
            st.add(s.charAt(r));
            r++;
        }
        return m;
    }
}