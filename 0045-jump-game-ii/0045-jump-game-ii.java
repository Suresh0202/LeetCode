class Solution {
    public int jump(int[] arr) {
        int l=0,r=0,jumps=0;
        int n=arr.length;
        while(r<n)
        {
            int far=0;
            for(int i=l;i<=r;i++)
            {
                far=Math.max(far,i+arr[i]);
            }
            l=r+1;
            jumps++;
            r=far;
        }
        return jumps-1;
    }
}