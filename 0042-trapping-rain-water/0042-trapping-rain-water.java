class Solution {
    public int trap(int[] h) {
        int left=0;
        int right=h.length-1;
        int ans=0;
        int lef=0;
        int righ=0;
        while(left < right)
        {
            if(h[left] < h[right])
            {
                lef=Math.max(lef,h[left]);

                ans+=lef-h[left];
                left++;
            }else
            { righ=Math.max(righ,h[right]);

                ans+=righ-h[right];
                right--;
            }
        }
        return ans;
    }
}