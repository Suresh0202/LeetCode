class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum%k ==0 && i>0)
            {
                return true;
            }
            if(mp.containsKey(sum%k) && i-mp.get(sum%k)>=2)
            {
                return true;
            }
            if(!mp.containsKey(sum%k))
            {
                mp.put(sum%k,i);
            }
        }
        return false;
    }
}