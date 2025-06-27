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
           for(int i=0;i<hash.length;i++)
           {
            if(hash[i] >1)
            {
                return i;
            }
           }
           return -1;
    }
}