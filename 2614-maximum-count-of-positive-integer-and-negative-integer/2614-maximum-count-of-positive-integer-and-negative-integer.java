class Solution {
    public int negfunc(int nums[])
    {
        int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<0)
            {
                low=mid+1;
            }else
            {
                high=mid-1;
            }
        }
        return low;
    }
    public int maximumCount(int[] nums) {
        int neg=negfunc(nums);
        int c=0;
        for(int i:nums)if(i==0)c++;
         int pos=nums.length-neg-c;
        return Math.max(neg,pos);
    }
}