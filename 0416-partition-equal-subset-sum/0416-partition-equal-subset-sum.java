class Solution {
    public boolean help(int idx,int nums[],int tar,Boolean dp[][])
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
             pick=help(idx+1,nums,tar-nums[idx],dp);
        }
         boolean npick=help(idx+1,nums,tar,dp);
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
        boolean dp[][]=new boolean[nums.length][tar+1];
        for(int i=0;i<nums.length;i++)
        {
            dp[i][0]=true;
        }
        if(tar >= nums[0])
        {
            dp[0][nums[0]]=true;
        }
        for(int i=1;i<nums.length;i++)
        {
            for(int j=1;j<=tar;j++)
            {
                boolean np=dp[i-1][j];
                boolean p=false;
                if(j >= nums[i])
                {
                    p=dp[i-1][j-nums[i]];
                }
                dp[i][j]=(p||np);
            }
        }
        return dp[nums.length-1][tar];
    }
}