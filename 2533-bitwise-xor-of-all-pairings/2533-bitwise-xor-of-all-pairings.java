class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
       int ans=0;
       int n=nums1.length;
       int m=nums2.length;
       if(n%2==0 && m%2==0)
       {
        return 0;
       }
       if(n%2!=0 && m%2!=0)
       {
            for(int i=0;i<nums1.length;i++)
            {
                ans^=nums1[i];
            }
            for(int i=0;i<nums2.length;i++)
            {
                ans^=nums2[i];
            }
       }else if(n%2 ==0 && m%2!=0)
       {
            for(int i=0;i<n;i++)
            {
                ans^=nums1[i];
            }
       }else if(n%2!=0 && m%2==0)
       {
        for(int i=0;i<m;i++)
        {
            ans^=nums2[i];
        }
       }
       return ans;
    }
}