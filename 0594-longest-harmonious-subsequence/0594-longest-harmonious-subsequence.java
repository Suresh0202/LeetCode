class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int key:mp.keySet())
        {
            if(mp.containsKey(key+1))
            {
                int k=mp.get(key)+mp.get(key+1);
                ans=Math.max(ans,k);
            }
        }
        return ans;
    }
}