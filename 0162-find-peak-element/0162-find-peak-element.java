class Solution {
    public int findPeakElement(int[] nums) {
        int ans=0;
        int low=0;
        int high=nums.length-1;
        if(nums.length==1)return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[nums.length-1]>nums[nums.length-2])return nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid] < nums[mid+1])
            {
                low=mid+1;
            }else
            {
                high=mid-1;
            }
              
            
        }
        return low;
    }
}