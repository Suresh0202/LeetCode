class Solution {
    public boolean isNegative(int nums[])
    {
        for(int i:nums)
        {
            if(i>0)
            {
                return false;
            }
        }
        return true;
    }
    public int maxSum(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        int max=-101;
        int sum=0;
        if(isNegative(nums))
        {
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!st.contains(nums[i]))
            {
                if(nums[i]>0)
                {
                sum+=nums[i];
                }
               
                st.add(nums[i]);
            }
            max=Math.max(max,sum);
            if(sum<0)
            {
                sum=0;
            }
        }   
        return max;
    }
}