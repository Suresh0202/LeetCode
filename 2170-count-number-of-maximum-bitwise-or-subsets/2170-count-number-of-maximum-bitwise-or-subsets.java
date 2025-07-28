class Solution {
    public static int func(List<Integer>a)
    {
        int ans=0;
        for(int i:a)
        {
            ans=ans|i;
        }
        return ans;
    }
     public static int func1(int nums[])
    {
        int ans=0;
        for(int i:nums)
        {
            ans=ans|i;
        }
        return ans;
    }
    public int countMaxOrSubsets(int[] arr) {
        int n=arr.length;
        int m=func1(arr);
    int cnt=0;
        List<Integer>fin=new ArrayList<>();
        int hash[]=new int[m+1];
         for(int i=0;i<(1<<n);i++)
            {
                List<Integer>a=new ArrayList<>();
                for(int j=0;j<n;j++)
                {
                    int k=i&(1<<j);
                    if(k!=0)
                    {
                       a.add(arr[j]);
                    }
                }
                int ans=func(a);
                if(ans==m)
                {
                    cnt++;
                }
            
            }
            
            return cnt;
    }
}