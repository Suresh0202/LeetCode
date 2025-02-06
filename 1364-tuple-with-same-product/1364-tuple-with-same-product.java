class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int pr=nums[i]*nums[j];
                mp.put(pr,mp.getOrDefault(pr,0)+1);
            }
        }
        int ans=0;
        for(int val:mp.values())
        {
            if(val >1)
            {
                ans+=(val)*(val-1)*4;
            }
        }
        return ans;
    }
}