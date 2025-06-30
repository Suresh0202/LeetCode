class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int n1=g.length;
        int c=0;
        int n2=s.length;
        while(i<n2 && j < n1)
        {
            if(s[i] >= g[j])
            {
                // i++;
                j++;
                c++;
            }
            i++;
        }
        return j;
    }
}