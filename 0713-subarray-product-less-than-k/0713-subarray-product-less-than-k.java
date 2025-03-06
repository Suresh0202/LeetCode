class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int r=0,l=0,n=nums.length;
        int ans=0;
        int pro=1;
        if(k<=1)return 0;
        while(r<n)
        {
            pro*=nums[r];
            while(pro >=k && l<n)
            {
                pro=pro/nums[l];
                l++;
            }
            ans+=(r-l+1);
            r++;
        }
        if(ans<0)return 0;
        return ans;
    }
}