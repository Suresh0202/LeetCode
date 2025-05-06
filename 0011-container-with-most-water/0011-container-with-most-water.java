class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right=h.length-1;
        int ans=0;
        while(left < right)
        {
            if(h[left] < h[right])
            {
                ans=Math.max(ans,(right-left)*(h[left]));
                left++;
            }else
            {
                  ans=Math.max(ans,(right-left)*(h[right]));
                right--;
            }
        }
        return ans;
    }
}