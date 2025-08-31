class Solution {
    public int find(int nums[],int k)
    {
        int l=0;
        int n=nums.length;
        int r=0;
        int cnt=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        while(r<n)
        {
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
           while (mp.size() > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                if (mp.get(nums[l]) == 0) {
                    mp.remove(nums[l]);
                }
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int ans=find(nums,k);
        int ans1=find(nums,k-1);
        return ans-ans1;
    }
}