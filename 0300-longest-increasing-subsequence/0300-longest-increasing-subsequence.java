class Solution {
    public int func(List<Integer>arr,int low,int high,int tar)
    {
        int ans=arr.size()-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr.get(mid) <= tar)
            {
                 low=mid+1;                
            }else
            {
               ans=mid;
               high=mid-1;
            }
        }
        return ans;
    }
    public int lengthOfLIS(int[] nums) {
        List<Integer>arr=new ArrayList<>();
        int n=nums.length;
        arr.add(nums[0]);
        for(int i=0;i<n;i++)
        {
            int ele=nums[i];

                int prev=arr.get(arr.size()-1);
                if(prev < nums[i])
                {
                    arr.add(nums[i]);
                }else
                {
                    if(!arr.contains(nums[i])){
                    int upper=func(arr,0,arr.size()-1,nums[i]);
                    arr.set(upper,nums[i]);
                    }
                }
            
        }
        return arr.size();
    }
}