class Solution {
    public int func(StringBuilder sb)
    {
        int c=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='W')
            {
                c++;
            }
        }
        return c;
    }
    public int minimumRecolors(String bl, int k) {
        StringBuilder sb=new StringBuilder();
        int r=0,n=bl.length();
        int ans=Integer.MAX_VALUE;
        int l=0;
        while(r<n)
        {
            sb.append(bl.charAt(r));
            r++;
            if(r-l == k)
            {
                int x=func(sb);
                ans=Math.min(ans,x);
                l++;
                sb.deleteCharAt(0);
            }
        }
        return ans;
    }
}