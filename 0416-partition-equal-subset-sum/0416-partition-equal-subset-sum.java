class Solution {
    public boolean func(int idx,int nums[],int tar,Boolean dp[][])
    {
        
        if(idx == nums.length)
        {
            if(tar == 0)
            {
                return true;
            }
            return false;
        }
        if(dp[idx][tar] != null)
        {
            return dp[idx][tar];
        }
         boolean pick=false;
        if(tar >= nums[idx])
        {
             pick=func(idx+1,nums,tar-nums[idx],dp);
        }
         boolean npick=func(idx+1,nums,tar,dp);
        return dp[idx][tar]=pick || npick;
    }

    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        int tar=sum/2;
        if(sum%2!=0)
        {
                return false;
        }
        Boolean dp[][]=new Boolean[nums.length][tar+1];
        return func(0,nums,tar,dp);
    }
}