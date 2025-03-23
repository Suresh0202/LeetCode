class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int x=target-nums[i];
            if(mp.containsKey(x))
            {
                ans[0]=mp.get(x);
                ans[1]=i;
                break;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}