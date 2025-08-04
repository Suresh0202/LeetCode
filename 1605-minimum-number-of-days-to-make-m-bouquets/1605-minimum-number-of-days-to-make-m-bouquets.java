class Solution {
    public boolean func(int vis[],int day,int m,int k)
    {
        // k adjacent flower
        //m bouquets
        int cnt=0;
        int p=0;
        for(int i=0;i<vis.length;i++)
        {
            if( day >= vis[i])
            {
                cnt++;
                if(cnt  == k)
                {
                    p++;
                    cnt=0;
                }
               
            }else
            {
                cnt=0;
            }
           
        }
        
        return p >= m;
    }
    public int find_Min(int arr[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    public int find_Max(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((m*k) > bloomDay.length)
        {
            return -1;
        }
        int min=find_Min(bloomDay);
        int max=find_Max(bloomDay);
        int n=bloomDay.length;
        int ans=-1;
        int low=min;
        int high=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(func(bloomDay,mid,m,k))
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
}