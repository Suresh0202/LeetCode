class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int ans=0;
        HashSet<Integer>st=new HashSet<>();
        for(int i:nums)st.add(i);
        int r=0;
        int l=0;
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer>st1=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                st1.add(nums[j]);
                if(st.size() == st1.size())
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}