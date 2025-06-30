class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int n1=g.length;
        int n2=s.length;
        while(i<n1 && j < n2)
        {
            if(s[j] >= g[i])
            {
                i++;
                j++;
            }
            j++;
        }
        return i;
    }
}