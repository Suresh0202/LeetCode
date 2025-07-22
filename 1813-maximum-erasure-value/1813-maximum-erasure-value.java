class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        int r=0;
        int l=0;
        int n=nums.length;
        int max=0;
        int sum=0;
        while(r<n)
        {
            while(st.contains(nums[r]))
            {
                st.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            st.add(nums[r]);
            sum+=nums[r];
            r++;
            max=Math.max(max,sum);
        }
        return max;
    }
}