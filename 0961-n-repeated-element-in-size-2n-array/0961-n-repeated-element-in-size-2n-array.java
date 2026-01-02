class Solution {
    public int repeatedNTimes(int[] nums) {
        int hash[]=new int[(int)(1e4+1)];
        int x=nums.length;
        x=(x/2);
        System.out.println(x);
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        for(int i=0;i<hash.length;i++)
        {
            if(hash[i] >= (x))
            {
                return i;
            }
        }
        return -1;
    }
}