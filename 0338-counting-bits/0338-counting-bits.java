class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        int j=0;
        for(int i=0;i<n;i++)
        {
            int x=Integer.bitCount(i);
            ans[j++]=x;
        }
        ans[j]=Integer.bitCount(n);
        return ans;
    }
}