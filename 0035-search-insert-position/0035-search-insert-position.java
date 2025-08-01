class Solution {
    public int func(int nums[],int x)
    {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int ans=nums.length;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]>=x)
            {
                ans=mid;
                high=mid-1;
            }else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public int searchInsert(int[] nums, int target) {
        return func(nums,target);
    }
}