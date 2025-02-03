class Solution {
    boolean inc(int nums[],int a,int b)
    {
     
        for(int i=a;i<b;i++)
        {
            if(!(nums[i]<nums[i+1]))
            {
                return false;
            }
        }
        return true;
    }
    boolean dec(int nums[],int a,int b)
    {
        for(int i=a;i<b;i++)
        {
            if(!(nums[i]>nums[i+1]))
            {
                return false;
            }
        }
        return true;
    }
    public int longestMonotonicSubarray(int[] nums) {
           int m=0;
        for(int i=0;i<nums.length;i++)
        {
            int ans=0;
            int ans1=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(inc(nums,i,j))
                {
                    ans=j-i+1;
                }
                if(dec(nums,i,j))
                {
                    ans1=j-i+1;
                }
                m=Math.max(m,Math.max(ans,ans1));
            }
        }
        return m==0?1:m;
        
    }
}