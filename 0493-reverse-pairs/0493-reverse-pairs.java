class Solution {
    public void merge(int nums[],int low,int mid,int high)
    {
        int left=low;
        int right=mid+1;
        List<Integer>ans=new ArrayList<>();
        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                ans.add(nums[left]);
                left++;
            }else
            {
                ans.add(nums[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            ans.add(nums[left]);
            left++;
        }
        while(right<=high)
        {
            ans.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            nums[i]=ans.get(i-low);
        }

    }
    public int countpairs(int nums[],int low,int mid,int high)
    {
        int ct=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && nums[i]>(long)2*nums[right])
            {
                right++;
            }
            ct+=(right-(mid+1));
        }
        return ct;
    }
    public int mergesort(int nums[],int low,int high)
    {
        int ans=0;
        if(low>=high)return ans;
        int mid=(low+high)/2;
        ans+=mergesort(nums,low,mid);
        ans+=mergesort(nums,mid+1,high);
        ans+=countpairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return ans;
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        int ans=mergesort(nums,0,n-1);
        return ans;
    }
}