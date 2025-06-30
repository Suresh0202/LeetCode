class Solution {
    public int func(int arr[],int tar,int idx,Integer dp[][])
    {
        if(tar == 0)
        {
            return 1;
        }
        if(idx == arr.length)
        {
            
            return Integer.MAX_VALUE;
        }
        if(dp[idx][tar] != null)
        {
            return dp[idx][tar];
        }
        int npick=func(arr,tar,idx+1,dp);
        int pick=Integer.MAX_VALUE;
        if(tar >= arr[idx])
        {
            
            int x=func(arr,tar-arr[idx],idx,dp);
            if(x != Integer.MAX_VALUE)
            {
                pick=x+1;
            }
        }
        return dp[idx][tar]=Math.min(pick,npick);
    }
    public int coinChange(int[] coins, int amount) {
        Integer dp[][]=new Integer[coins.length][amount+1];
        int ans=func(coins,amount,0,dp);
        if(ans == Integer.MAX_VALUE)return -1;
        return ans-1;   
    }
}