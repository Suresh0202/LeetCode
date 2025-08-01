class Solution {
    public int last(int nums[],int target)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid] == target)
            {
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid] > target)
            {
                high=mid-1;
            }else
            {
                // ans=mid;/
                low=mid+1;
            }
        }
        return ans;

    }
     public int first(int nums[],int target)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid] == target)
            {
                ans=mid;
                high=mid-1;
            }
           else  if(nums[mid] < target)
            {
                low=mid+1;
            }else
            {
                // ans=mid;/
                high=mid-1;
            }
        }
        return ans;

    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=first(nums,target);
        ans[1]=last(nums,target);
        return ans;

    }
}