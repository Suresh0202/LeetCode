class Solution {
     public static int rightfunc(int arr[],int target,int l,int r)
    {
        int ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                    l=mid+1;
            }else if(arr[mid]<target)
            {
                l=mid+1;
            }else
            {
                r=mid-1;
            }
        }
        // if(l>=arr.length)return -1;
        // if(arr[r]!=target)return -1;
        return ans;
    }
    public static int leftfunc(int arr[],int target,int l,int r)
    {
        int ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==target)
            { 
                    ans=mid;
                    r=mid-1;
            }else if(arr[mid]<target)
            {
                l=mid+1;
            }else
            {
                r=mid-1;
            }
        }
        // if(r<0)return -1;
        // if(arr[l]!=target)return -1;
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        
        int left=leftfunc(nums,target,0,nums.length-1);
        int right=rightfunc(nums,target,0,nums.length-1);
        
        ans[0]=left;
        ans[1]=right;
        return ans;
    }
}