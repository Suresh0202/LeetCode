class Solution {
    public int longestConsecutive(int[] nums) {
        // int c=0;
        Arrays.sort(nums);
        int m=1;
        int c=1;
        if(nums.length == 0)return 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]!=nums[i])
            {
                if(nums[i+1]-nums[i] == 1)
                {
                    c++;
                }else
                {
                    c=1;
                }
                m=Math.max(m,c);
            }
        }
        return m;
    }
}