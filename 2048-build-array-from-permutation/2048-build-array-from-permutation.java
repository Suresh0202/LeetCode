class Solution {
    public  void func(int nums[],int idx)
    {
        if(idx < nums.length)
        {
            int temp=nums[idx];
            int res=nums[temp];
            func(nums,idx+1);
            nums[idx]=res;

        }
    }
    public int[] buildArray(int[] nums) {
        // int ans[]=new int[nums.length];
        func(nums,0);
        return nums;
 
 
    }
}