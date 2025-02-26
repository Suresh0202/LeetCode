class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum<0)
            {
                sum=0;
            }
            if(sum > maxSum)
            {
                maxSum=sum;
            }
        }
        int minSum=Integer.MAX_VALUE;
        int sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
            if(sum1>0)
            {
                sum1=0;
            }
            if(sum1 < minSum)
            {
                minSum=sum1;
            }
        }
        return Math.max(Math.abs(maxSum),Math.abs(minSum));
    }
}