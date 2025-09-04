class Solution {
    public static int findmax(int arr[])
    {
        int m=-1;
        for(int i:arr)
        {
            m=Math.max(m,i);
        }
        return m;
    }
    public static int func(int k,int arr[])
    {
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=Math.ceil((double)arr[i]/(double)k);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=findmax(piles);
        while(low<=high)
        {
            int mid=(low+high)/2;
            int f=func(mid,piles);
            if(f<=h)
            {
                high=mid-1;
            }else
            {
                low=mid+1;
            }
        }
        return low;
    }
}