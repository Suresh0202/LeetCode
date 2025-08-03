class Solution {
    public int lower(List<Integer>ar,int x)
    {
        int low=0;
        int high=ar.size()-1;
        int ans=0;
        while(low <= high)
        {
            int mid=(low+high)/2;
            if(ar.get(mid) >=x)
            {
                ans=mid;
                high=mid-1;
            }else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public int lengthOfLIS(int[] nums) {
        List<Integer>ar=new ArrayList<>();
        ar.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(ar.get(ar.size()-1) < nums[i])
            {
                ar.add(nums[i]);
            }else
            {
                int pos=lower(ar,nums[i]);
                ar.set(pos,nums[i]);
            }

        }
        return ar.size();
    }
}