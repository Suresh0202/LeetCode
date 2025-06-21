class Solution {
    public int findDuplicate(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int hash[]=new int[max+1];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        int ans=0;
        for(int i=0;i<max+1;i++)
        {
            if(hash[i] >=2)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}