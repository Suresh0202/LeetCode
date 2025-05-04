class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]={-1,-1};
        int n=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=target-nums[i];
            if(mp.containsKey(x))
            {
                ans[0]=i;
                ans[1]=mp.get(x);
                break;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}