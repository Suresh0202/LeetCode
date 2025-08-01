class Solution {
    public int func(int nums[],int low,int high,int x)
    {
        int mid=(low+high)/2;
        if(low>high)
        {
            return -1;
        }
        if(nums[mid] == x)
        {
            return mid;
        }
        if(nums[mid] < x)
        {
            return func(nums,mid+1,high,x);
        }else if(nums[mid] > x)
        {
            return func(nums,low,mid-1,x);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return func(nums,0,nums.length-1,target);
    }
}