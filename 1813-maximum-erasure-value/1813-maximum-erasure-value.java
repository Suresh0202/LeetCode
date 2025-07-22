class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int r=0;
        int l=0;
        int sum=0;
        int max=0;
        int n=nums.length;
        while(r<n)
        {
            if(mp.containsKey(nums[r]))
            {
                 while (nums[l] != nums[r]) {
                    sum -= nums[l];
                    mp.remove(nums[l]);
                    l++;
                }
                sum -= nums[l];
                mp.remove(nums[l]);
                l++;
            }
            {
                mp.put(nums[r],r);
                sum+=nums[r];

            }
            r++;
            max=Math.max(max,sum);
            
        }
        return max;
    }
}