class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>m:mp.entrySet())
        {
            if(m.getValue() >=2)
            {
                return m.getKey();
            }
        }
        return -1;
    }
}