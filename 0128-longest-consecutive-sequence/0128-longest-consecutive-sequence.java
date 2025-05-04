class Solution {
    public int longestConsecutive(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int m=0;
        if(nums.length==0)
        {
            return 0;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
            if(nums[i+1]-nums[i]==1)
            {
                c++;
                m=Math.max(m,c);
            }else
            {
                // m=Math.max(m,c);
                c=0;
            }
            }
        }
        return m+1;
    }
}