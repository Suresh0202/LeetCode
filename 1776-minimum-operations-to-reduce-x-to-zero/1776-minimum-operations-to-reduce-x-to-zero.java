class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum=0;
        for(int i:nums)totalsum+=i;
        if(totalsum == x)return nums.length;
        int leftsum=totalsum-x;
        int l=0,r=0;
        int n=nums.length;
        int m=0;
        int ss=0;
        while(r<n)
        {
            ss+=nums[r];
            while(ss>leftsum && l<n)
            {
                ss-=nums[l];
                l++;
            }
            if(ss == leftsum)
            {
               m=Math.max(m,r-l+1);
                // break;
            }
            r++;
        }
          System.out.println(totalsum);
           System.out.println(leftsum);
        System.out.println(ss);
        if(m==0)return -1;
        return n-m;
    }
}